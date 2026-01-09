import java.io.*;
import java.net.http.*;
import java.net.URI;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Fetches GitHub stars and last commit data for repositories and creates a mapping file.
 *
 * Usage: step_3_generate_badges.java [parsed_projects_file] [stats_file]
 */
void main(String[] args) throws IOException, InterruptedException {
  var inputPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE);
  var tmpDir = FileUtils.ensureTmpDirectory();
  var outputPath = args.length > 1 ? Path.of(args[1]) : tmpDir.resolve(Constants.GITHUB_STATS_FILE);

  System.out.println("Step 3: Fetching GitHub stars and last commit data...");
  System.out.printf("Input: %s%n", inputPath.toAbsolutePath());
  System.out.printf("Output: %s%n", outputPath.toAbsolutePath());

  // Validate input
  FileUtils.validateInputFile(inputPath);

  // Read parsed entries
  var entries = readParsedEntries(inputPath);

  // Try to load existing stats mappings if available
  Map<String, StatsMapping> existingMappings = new HashMap<>();
  if (Files.exists(outputPath)) {
    try {
      System.out.println("Loading existing stats data...");
      existingMappings = readStatsMappings(outputPath);
      System.out.printf("Found %d existing stats entries%n", existingMappings.size());
    } catch (Exception e) {
      System.out.println("Could not load existing stats data, will fetch all new data");
    }
  }

  // Generate stats mappings with actual GitHub data (only fetch missing ones)
  var statsMappings = generateStatsMappings(entries, existingMappings);

  // Write stats mappings
  writeStatsMappings(outputPath, statsMappings);

  System.out.printf(
    "SUCCESS: Successfully fetched data for %d repositories!%n",
    statsMappings.size()
  );
}

/**
 * Reads parsed entries from the temporary file.
 */
List<ProjectEntry> readParsedEntries(Path inputPath) throws IOException {
  var content = FileUtils.readFileContent(inputPath);
  var entries = new ArrayList<ProjectEntry>();
  var sections = content.split(Constants.SECTION_SEPARATOR);

  for (var section : sections) {
    if (section.isBlank()) {
      continue;
    }

    String name = null, url = null, description = null;
    int linesToSkip = 0;

    for (var line : section.split("\n")) {
      if (line.startsWith(Constants.NAME_PREFIX)) {
        name = line.substring(Constants.NAME_PREFIX.length());
      } else if (line.startsWith(Constants.URL_PREFIX)) {
        url = line.substring(Constants.URL_PREFIX.length());
      } else if (line.startsWith(Constants.DESC_PREFIX)) {
        description = line.substring(Constants.DESC_PREFIX.length());
      } else if (line.startsWith(Constants.SKIP_PREFIX)) {
        linesToSkip = Integer.parseInt(line.substring(Constants.SKIP_PREFIX.length()));
      }
    }
    if (name != null && url != null) {
      entries.add(new ProjectEntry(
        name,
        url,
        description != null ? description : "",
        linesToSkip,
        ""
      ));
    }
  }
  return entries;
}

/**
 * Reads existing stats mappings from file.
 */
Map<String, StatsMapping> readStatsMappings(Path statsPath) throws IOException {
  var content = FileUtils.readFileContent(statsPath);
  var mappings = new HashMap<String, StatsMapping>();

  for (var section : content.split("\n\n")) {
    if (section.isBlank()) {
      continue;
    }
    String repo = null, name = null, starsText = null, lastCommitText = null;

    for (var line : section.split("\n")) {
      if (line.trim().isEmpty()) {
        continue;
      }
      if (line.startsWith(Constants.REPO_PREFIX)) {
        repo = line.substring(Constants.REPO_PREFIX.length());
      } else if (line.startsWith(Constants.NAME_PREFIX)) {
        name = line.substring(Constants.NAME_PREFIX.length());
      } else if (line.startsWith(Constants.STARS_PREFIX)) {
        starsText = line.substring(Constants.STARS_PREFIX.length());
      } else if (line.startsWith(Constants.COMMIT_PREFIX)) {
        lastCommitText = line.substring(Constants.COMMIT_PREFIX.length());
      }
    }
    if (repo != null && name != null) {
      mappings.put(name, new StatsMapping(
        name,
        repo,
        starsText != null ? starsText : Constants.NO_STATS,
        lastCommitText != null ? lastCommitText : Constants.NO_STATS
      ));
    }
  }
  return mappings;
}

/**
 * Generates stats mappings for GitHub repositories by fetching data from GitHub API.
 * Reuses existing mappings when available.
 */
List<StatsMapping> generateStatsMappings(List<ProjectEntry> entries, Map<String, StatsMapping> existingMappings) throws IOException, InterruptedException {
  var mappings = new ArrayList<StatsMapping>();

  // Check for GitHub Personal Access Token from environment variable
  var githubToken = System.getenv("GITHUB_TOKEN");

  if (githubToken == null || githubToken.isBlank()) {
    System.err.println("ERROR: GITHUB_TOKEN environment variable is required!");
    System.err.println("  Without a PAT, the rate limit is only 60 requests/hour (not enough for all repositories)");
    System.err.println("  Please set GITHUB_TOKEN environment variable:");
    System.err.println("    export GITHUB_TOKEN=your_token_here");
    System.exit(1);
  }

  System.out.println("Using GitHub PAT");
  var clientBuilder = HttpClient.newBuilder();
  var client = clientBuilder.build();
  var total = entries.stream().filter(ProjectEntry::isGitHubRepo).count();
  var processed = 0;

  for (var entry : entries) {
    if (!entry.isGitHubRepo()) {
      // Non-GitHub repos get NO_STATS for both stars and commit
      mappings.add(new StatsMapping(
        entry.name(),
        "",
        Constants.NO_STATS,
        Constants.NO_STATS
      ));
      continue;
    }

    var repo = entry.getGitHubRepo();
    if (repo == null) {
      mappings.add(new StatsMapping(
        entry.name(),
        "",
        Constants.NO_STATS,
        Constants.NO_STATS
      ));
      continue;
    }

    processed++;

    // Check if we already have data for this repository
    var existing = existingMappings.get(entry.name());
    if (existing != null && existing.repo().equals(repo) &&
        !existing.starsText().equals(Constants.NO_STATS) &&
        !existing.lastCommitText().equals(Constants.NO_STATS) &&
        !existing.starsText().equals(Constants.INVALID_REPO) &&
        !existing.lastCommitText().equals(Constants.INVALID_REPO)) {
      // Reuse existing data
      mappings.add(existing);
      if (processed % 50 == 0) {
        System.out.printf("Processing %d/%d repositories... (using cached data)%n", processed, total);
      }
      continue;
    }

    // Need to fetch new data
    if (processed % 10 == 0) {
      System.out.printf("Processing %d/%d repositories... (fetching from API)%n", processed, total);
    }

    var starsText = fetchStars(client, repo, processed);
    var lastCommitText = fetchLastCommit(client, repo, processed);

    mappings.add(new StatsMapping(
      entry.name(),
      repo,
      starsText,
      lastCommitText
    ));

    // Rate limiting: GitHub API allows 60 requests per hour without auth
    // We make 2 requests per repo (stars + commit), so we can process ~30 repos/hour
    // Add a delay to avoid hitting the limit too quickly
    Thread.sleep(1000); // 1 second delay between repositories (2 requests per repo = 2 seconds total)
  }

  return mappings;
}

/**
 * Fetches the number of stars for a GitHub repository.
 */
String fetchStars(HttpClient client, String repo, int requestNumber) {
  try {
    var githubToken = System.getenv("GITHUB_TOKEN");
    var requestBuilder = HttpRequest.newBuilder()
        .uri(URI.create("https://api.github.com/repos/" + repo))
        .header("Accept", "application/vnd.github.v3+json");

    // Add authentication header if token is available
    if (githubToken != null && !githubToken.isBlank()) {
      requestBuilder.header("Authorization", "Bearer " + githubToken);
    }

    var request = requestBuilder.GET().build();

    var response = client.send(request, HttpResponse.BodyHandlers.ofString());

    // Check rate limit headers
    var rateLimitRemaining = response.headers().firstValue("X-RateLimit-Remaining");
    if (rateLimitRemaining.isPresent()) {
      var remaining = Integer.parseInt(rateLimitRemaining.get());
      if (requestNumber % 10 == 0) {
        System.out.printf("  API requests remaining: %d%n", remaining);
      }
      if (remaining <= 0) {
        var rateLimitReset = response.headers().firstValue("X-RateLimit-Reset");
        if (rateLimitReset.isPresent()) {
          var resetTime = Instant.ofEpochSecond(Long.parseLong(rateLimitReset.get()));
          var waitSeconds = Duration.between(Instant.now(), resetTime).getSeconds() + 5; // Add 5 second buffer
          System.err.printf("ERROR: Rate limit exceeded! Waiting %d seconds until reset...%n", waitSeconds);
          Thread.sleep(Math.min(waitSeconds * 1000L, 3600000)); // Wait up to 1 hour
          // Retry once
          return fetchStars(client, repo, requestNumber);
        }
      }
    }

    if (response.statusCode() == 200) {
      var body = response.body();
      // Simple JSON parsing - extract stargazers_count
      var pattern = java.util.regex.Pattern.compile("\"stargazers_count\"\\s*:\\s*(\\d+)");
      var matcher = pattern.matcher(body);
      if (matcher.find()) {
        var stars = Long.parseLong(matcher.group(1));
        return formatStars(stars);
      }
    } else if (response.statusCode() == 404) {
      // Repository not found - mark as invalid
      System.err.printf("WARNING: Repository %s not found (may have been deleted or moved)%n", repo);
      return Constants.INVALID_REPO;
    } else if (response.statusCode() == 403) {
      System.err.printf("WARNING: Access forbidden for %s (may be private or rate limited)%n", repo);
      return Constants.NO_STATS;
    }
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return Constants.NO_STATS;
  } catch (Exception e) {
    // Log error for debugging
    System.err.printf("ERROR fetching stars for %s: %s%n", repo, e.getMessage());
  }
  return Constants.NO_STATS;
}

/**
 * Formats stars count as text.
 */
String formatStars(long stars) {
  if (stars >= 1000) {
    return "%.1fk".formatted(stars / 1000.0);
  }
  return String.valueOf(stars);
}

/**
 * Fetches the last commit date for a GitHub repository.
 */
String fetchLastCommit(HttpClient client, String repo, int requestNumber) {
  try {
    var githubToken = System.getenv("GITHUB_TOKEN");
    var requestBuilder = HttpRequest.newBuilder()
        .uri(URI.create("https://api.github.com/repos/" + repo + "/commits?per_page=1"))
        .header("Accept", "application/vnd.github.v3+json");

    // Add authentication header if token is available
    if (githubToken != null && !githubToken.isBlank()) {
      requestBuilder.header("Authorization", "Bearer " + githubToken);
    }

    var request = requestBuilder.GET().build();

    var response = client.send(request, HttpResponse.BodyHandlers.ofString());

    // Check rate limit headers
    var rateLimitRemaining = response.headers().firstValue("X-RateLimit-Remaining");
    if (rateLimitRemaining.isPresent()) {
      var remaining = Integer.parseInt(rateLimitRemaining.get());
      if (remaining <= 0) {
        var rateLimitReset = response.headers().firstValue("X-RateLimit-Reset");
        if (rateLimitReset.isPresent()) {
          var resetTime = Instant.ofEpochSecond(Long.parseLong(rateLimitReset.get()));
          var waitSeconds = Duration.between(Instant.now(), resetTime).getSeconds() + 5; // Add 5 second buffer
          System.err.printf("ERROR: Rate limit exceeded! Waiting %d seconds until reset...%n", waitSeconds);
          Thread.sleep(Math.min(waitSeconds * 1000L, 3600000)); // Wait up to 1 hour
          // Retry once
          return fetchLastCommit(client, repo, requestNumber);
        }
      }
    }

    if (response.statusCode() == 200) {
      var body = response.body();
      // Extract commit date from JSON - look for "committer" -> "date"
      var pattern = java.util.regex.Pattern.compile("\"committer\"\\s*:\\s*\\{[^}]*\"date\"\\s*:\\s*\"([^\"]+)\"");
      var matcher = pattern.matcher(body);
      if (matcher.find()) {
        var dateStr = matcher.group(1);
        return formatDate(dateStr);
      }
    } else if (response.statusCode() == 404) {
      // Repository not found - mark as invalid
      return Constants.INVALID_REPO;
    } else if (response.statusCode() == 403) {
      System.err.printf("WARNING: Access forbidden for %s (may be private or rate limited)%n", repo);
      return Constants.NO_STATS;
    }
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return Constants.NO_STATS;
  } catch (Exception e) {
    // Log error for debugging
    System.err.printf("ERROR fetching last commit for %s: %s%n", repo, e.getMessage());
  }
  return Constants.NO_STATS;
}

/**
 * Formats date as relative time (e.g., "2d", "1mo") or absolute date.
 */
String formatDate(String dateStr) {
  try {
    var formatter = DateTimeFormatter.ISO_DATE_TIME;
    var dateTime = ZonedDateTime.parse(dateStr, formatter);
    var now = ZonedDateTime.now();
    var duration = Duration.between(dateTime, now);

    var days = duration.toDays();
    if (days == 0) {
      var hours = duration.toHours();
      if (hours == 0) {
        var minutes = duration.toMinutes();
        return minutes <= 1 ? "now" : minutes + "m";
      }
      return hours + "h";
    } else if (days < 30) {
      return days + "d";
    } else if (days < 365) {
      var months = days / 30;
      return months + "mo";
    } else {
      var years = days / 365;
      return years + "y";
    }
  } catch (Exception e) {
    // If parsing fails, try to extract just the date part
    try {
      var datePart = dateStr.substring(0, 10); // YYYY-MM-DD
      return datePart;
    } catch (Exception e2) {
      return Constants.NO_STATS;
    }
  }
}

/**
 * Writes stats mappings to a file.
 */
void writeStatsMappings(Path outputPath, List<StatsMapping> mappings) throws IOException {
  var content = mappings.stream()
      .map(m -> String.format(
          "%s%s\n%s%s\n%s%s\n%s%s",
          Constants.REPO_PREFIX, m.repo(),
          Constants.NAME_PREFIX, m.name(),
          Constants.STARS_PREFIX, m.starsText(),
          Constants.COMMIT_PREFIX, m.lastCommitText()
        ))
      .collect(Collectors.joining("\n\n"));

  FileUtils.writeOutputFile(outputPath, content);
}

/**
 * Stats mapping for GitHub repository data.
 */
record StatsMapping(
  String name,
  String repo,
  String starsText,
  String lastCommitText
) {}
