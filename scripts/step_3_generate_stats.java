import java.io.*;
import java.net.http.*;
import java.net.URI;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Fetches GitHub stars and last commit data for repositories and creates a mapping file.
 *
 * Usage: step_3_generate_stats.java [parsed_projects_file] [stats_file]
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

  // Generate stats mappings with actual GitHub data
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

    for (var line : section.lines().toArray(String[]::new)) {
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
    String repo = null, name = null, starsText = null, lastCommitText = null, licenseText = null;

    for (var line : section.lines().toArray(String[]::new)) {
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
      } else if (line.startsWith(Constants.LICENSE_PREFIX)) {
        licenseText = line.substring(Constants.LICENSE_PREFIX.length());
      }
    }
    if (repo != null && name != null) {
      mappings.put(name, new StatsMapping(
        name,
        repo,
        starsText != null ? starsText : Constants.NO_STATS,
        lastCommitText != null ? lastCommitText : Constants.NO_STATS,
        licenseText != null ? licenseText : Constants.NO_STATS
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
  var githubToken = System.getenv("PAT");

  if (githubToken == null || githubToken.isBlank()) {
    System.err.println("ERROR: PAT environment variable is required!");
    System.err.println("  Without a PAT, the rate limit is only 60 requests/hour (not enough for all repositories)");
    System.err.println("  Please set PAT environment variable:");
    System.err.println("    export PAT=your_token_here");
    System.exit(1);
  }

  System.out.println("Using GitHub PAT");
  var client = HttpClient.newHttpClient();
  var total = entries.stream().filter(ProjectEntry::isGitHubRepo).count();
  var processed = 0;

  for (var entry : entries) {
    if (!entry.isGitHubRepo()) {
      mappings.add(new StatsMapping(
        entry.name(),
        "",
        Constants.NO_STATS,
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
        Constants.NO_STATS,
        Constants.NO_STATS
      ));
      continue;
    }

    processed++;

    // Check if we already have complete data for this repository (including license)
    var existing = existingMappings.get(entry.name());
    if (existing != null && existing.repo().equals(repo) &&
        !existing.starsText().equals(Constants.NO_STATS) &&
        !existing.lastCommitText().equals(Constants.NO_STATS) &&
        !existing.starsText().equals(Constants.INVALID_REPO) &&
        !existing.lastCommitText().equals(Constants.INVALID_REPO) &&
        existing.licenseText() != null &&
        !existing.licenseText().equals(Constants.NO_STATS)) {
      mappings.add(existing);
      if (processed % 50 == 0) {
        System.out.printf("Processing %d/%d repositories... (using cached data)%n", processed, total);
      }
      continue;
    }

    if (processed % 10 == 0) {
      System.out.printf("Processing %d/%d repositories... (fetching from API)%n", processed, total);
    }

    var stats = fetchRepoStats(client, repo, githubToken, processed);

    mappings.add(new StatsMapping(
      entry.name(),
      repo,
      stats.starsText(),
      stats.lastCommitText(),
      stats.licenseText()
    ));

    // Rate limiting: Add a 0.5 second delay to avoid hitting the limit too quickly
    Thread.sleep(500);
  }

  return mappings;
}

/**
 * Builds an authenticated HTTP request for GitHub API.
 */
HttpRequest buildGitHubRequest(String uri, String githubToken) {
  var builder = HttpRequest.newBuilder()
      .uri(URI.create(uri))
      .header("Accept", "application/vnd.github.v3+json");

  if (githubToken != null && !githubToken.isBlank()) {
    builder.header("Authorization", "Bearer %s".formatted(githubToken));
  }

  return builder.GET().build();
}

/**
 * Fetches stars, last commit date, and license in a single API request.
 */
record RepoStats(String starsText, String lastCommitText, String licenseText) {}

RepoStats fetchRepoStats(HttpClient client, String repo, String githubToken, int requestNumber) {
  try {
    var request = buildGitHubRequest("https://api.github.com/repos/" + repo, githubToken);
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());

    return switch (response.statusCode()) {
      case 200 -> {
        var body = response.body();
        var starsMatcher = Constants.STARS_PATTERN.matcher(body);
        var pushedAtMatcher = Constants.PUSHED_AT_PATTERN.matcher(body);
        var licenseMatcher = Constants.LICENSE_PATTERN.matcher(body);

        var starsText = starsMatcher.find()
          ? formatStars(Long.parseLong(starsMatcher.group(1)))
          : Constants.NO_STATS;

        var lastCommitText = pushedAtMatcher.find()
          ? formatDate(pushedAtMatcher.group(1))
          : Constants.NO_STATS;

        var licenseText = licenseMatcher.find() && licenseMatcher.group(1) != null
          ? formatLicense(licenseMatcher.group(1))
          : Constants.NO_STATS;

        yield new RepoStats(starsText, lastCommitText, licenseText);
      }
      case 404 -> {
        System.err.printf("ERROR: Repository %s not found%n", repo);
        yield new RepoStats(Constants.INVALID_REPO, Constants.INVALID_REPO, Constants.NO_STATS);
      }
      case 403 -> {
        System.err.printf("ERROR: Access forbidden for %s%n", repo);
        yield new RepoStats(Constants.NO_STATS, Constants.NO_STATS, Constants.NO_STATS);
      }
      default -> new RepoStats(Constants.NO_STATS, Constants.NO_STATS, Constants.NO_STATS);
    };
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return new RepoStats(Constants.NO_STATS, Constants.NO_STATS, Constants.NO_STATS);
  } catch (Exception e) {
    System.err.printf("ERROR fetching stats for %s: %s%n", repo, e.getMessage());
    return new RepoStats(Constants.NO_STATS, Constants.NO_STATS, Constants.NO_STATS);
  }
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
 * Formats license SPDX ID for display.
 */
String formatLicense(String spdxId) {
  if (spdxId == null || spdxId.isBlank() || spdxId.equals("NOASSERTION")) {
    return Constants.NO_STATS;
  }
  return spdxId;
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
      .map(m -> """
          %s%s
          %s%s
          %s%s
          %s%s
          %s%s
          """.formatted(
            Constants.REPO_PREFIX, m.repo(),
            Constants.NAME_PREFIX, m.name(),
            Constants.STARS_PREFIX, m.starsText(),
            Constants.COMMIT_PREFIX, m.lastCommitText(),
            Constants.LICENSE_PREFIX, m.licenseText()
          ).trim())
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
  String lastCommitText,
  String licenseText
) {}
