// SPDX-License-Identifier: MIT

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

final class GenerateReadme {
  private static final Pattern STARS = Pattern.compile("\"stargazers_count\"\\s*:\\s*(\\d+)");
  private static final Pattern PUSHED_AT = Pattern.compile("\"pushed_at\"\\s*:\\s*(?:\"([^\"]+)\"|null)");
  private static final Pattern ARCHIVED = Pattern.compile("\"archived\"\\s*:\\s*(true|false)");
  private static final Pattern LICENSE = Pattern.compile(
      "\"license\"\\s*:\\s*(?:null|\\{.*?\"spdx_id\"\\s*:\\s*(?:\"([^\"]+)\"|null))",
      Pattern.DOTALL
  );
  private static final Pattern GITHUB_METADATA =
      Pattern.compile("\\s*<!--\\s*github:\\s*([^>]+?)\\s*-->\\s*$");
  private static final Pattern REPOSITORY =
      Pattern.compile("[A-Za-z0-9_.-]+/[A-Za-z0-9_.-]+");
  private static final Comparator<String> TEXT_ORDER =
      Comparator.comparing((String value) -> value.toLowerCase(Locale.ROOT))
          .thenComparing(Comparator.naturalOrder());
  private static final DateTimeFormatter DISPLAY_DATE = DateTimeFormatter.ofPattern("dd/MM/uuuu");

  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      usage();
      System.exit(2);
    }

    switch (args[0]) {
      case "check" -> {
        var sourcePath = Path.of(args.length > 1 ? args[1] : "README_SOURCE.md");
        var source = parseSource(sourcePath);
        validateSource(source);
        printSourceSummary(source);
      }
      case "self-test" -> selfTest();
      case "generate" -> generate(args);
      default -> {
        usage();
        System.exit(2);
      }
    }
  }

  private static void usage() {
    System.err.println("""
        Usage:
          java scripts/GenerateReadme.java check [source]
          java scripts/GenerateReadme.java self-test
          java scripts/GenerateReadme.java generate [source] [output] [cache] [--refresh-all] [--branch name]
        """);
  }

  private static void generate(String[] args) throws Exception {
    var sourcePath = Path.of(args.length > 1 ? args[1] : "README_SOURCE.md");
    var outputPath = Path.of(args.length > 2 ? args[2] : "README.md");
    var cachePath = Path.of(args.length > 3 ? args[3] : ".cache/github-stats.tsv");
    var refreshAll = false;
    var branch = System.getenv().getOrDefault("GITHUB_REF_NAME", "master");

    for (var i = 4; i < args.length; i++) {
      switch (args[i]) {
        case "--refresh-all" -> refreshAll = true;
        case "--branch" -> {
          if (++i >= args.length) {
            throw new IllegalArgumentException("--branch requires a value");
          }
          branch = args[i];
        }
        default -> throw new IllegalArgumentException("Unknown option: " + args[i]);
      }
    }

    var source = parseSource(sourcePath);
    validateSource(source);

    var repositories = source.projects().stream()
        .flatMap(item -> item.repositories().stream())
        .collect(Collectors.toCollection(() -> new TreeSet<>(TEXT_ORDER)));

    var cache = readCache(cachePath);
    var missing = repositories.stream().filter(repo -> !cache.stats().containsKey(repo)).toList();
    var targets = refreshAll ? List.copyOf(repositories) : missing;
    var stats = new HashMap<>(cache.stats());
    var today = LocalDate.now(ZoneOffset.UTC);

    if (!targets.isEmpty()) {
      var token = System.getenv("GITHUB_TOKEN");
      if (token == null || token.isBlank()) {
        throw new IllegalStateException("GITHUB_TOKEN is required to fetch GitHub statistics");
      }
      var client = HttpClient.newBuilder()
          .connectTimeout(Duration.ofSeconds(20))
          .followRedirects(HttpClient.Redirect.NORMAL)
          .build();

      for (var i = 0; i < targets.size(); i++) {
        var repository = targets.get(i);
        stats.put(repository, fetchStats(client, repository, token));
        if ((i + 1) % 25 == 0 || i + 1 == targets.size()) {
          System.out.printf("Fetched %d/%d repositories%n", i + 1, targets.size());
        }
      }
    }

    stats.keySet().retainAll(repositories);
    var refreshed = refreshAll || cache.refreshed() == null ? today : cache.refreshed();
    var updatedCache = new StatsCache(refreshed, stats);
    rejectArchivedProjects(source, updatedCache);
    var rendered = render(source, updatedCache, today, branch);
    validateRendered(source, updatedCache, rendered, today);

    writeCache(cachePath, updatedCache);
    writeAtomically(outputPath, rendered);
    printGeneratedSummary(source, updatedCache, today, outputPath);
  }

  private static Catalog parseSource(Path path) throws IOException {
    var lines = Files.readAllLines(path);
    var title = lines.stream().filter(line -> line.startsWith("# ")).findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Missing title"));
    var titleIndex = lines.indexOf(title);
    var tagline = lines.subList(titleIndex + 1, lines.size()).stream()
        .map(String::trim)
        .filter(line -> !line.isEmpty() && !line.startsWith("<!--"))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Missing tagline"));

    var categories = new LinkedHashMap<String, Category>();
    var resources = new LinkedHashMap<String, ResourceGroup>();
    var section = Section.NONE;
    Category category = null;
    Subcategory subcategory = null;
    ResourceGroup resource = null;

    for (var lineNumber = 0; lineNumber < lines.size(); lineNumber++) {
      var line = lines.get(lineNumber);
      if (line.equals("## Projects")) {
        section = Section.PROJECTS;
        continue;
      }
      if (line.equals("## Resources")) {
        section = Section.RESOURCES;
        category = null;
        subcategory = null;
        continue;
      }
      if (line.startsWith("## ")) {
        section = Section.NONE;
        continue;
      }

      if (section == Section.PROJECTS) {
        if (line.startsWith("### ")) {
          var name = line.substring(4).trim();
          category = new Category(name);
          if (categories.putIfAbsent(name, category) != null) {
            fail(lineNumber + 1, "Duplicate category: " + name);
          }
          subcategory = null;
        } else if (line.startsWith("#### ")) {
          require(category != null, lineNumber + 1, "Nested category without a parent");
          var name = line.substring(5).trim();
          subcategory = new Subcategory(name);
          if (category.subcategories.putIfAbsent(name, subcategory) != null) {
            fail(lineNumber + 1, "Duplicate nested category: " + name);
          }
        } else if (isDescription(line)) {
          require(category != null, lineNumber + 1, "Description without a category");
          if (subcategory == null) {
            category.description = stripItalics(line);
          } else {
            subcategory.description = stripItalics(line);
          }
        } else if (line.startsWith("- [")) {
          require(category != null, lineNumber + 1, "Project without a category");
          var item = parseItem(line, lineNumber + 1, true);
          if (subcategory == null) {
            category.items.add(item);
          } else {
            subcategory.items.add(item);
          }
        } else if (!line.isBlank()) {
          fail(lineNumber + 1, "Unexpected project content");
        }
      } else if (section == Section.RESOURCES) {
        if (line.startsWith("### ")) {
          var name = line.substring(4).trim();
          resource = new ResourceGroup(name);
          if (resources.putIfAbsent(name, resource) != null) {
            fail(lineNumber + 1, "Duplicate resource group: " + name);
          }
        } else if (line.startsWith("#### ")) {
          fail(lineNumber + 1, "Nested resource headings are not supported");
        } else if (isDescription(line)) {
          require(resource != null, lineNumber + 1, "Description without a resource group");
          resource.description = stripItalics(line);
        } else if (line.startsWith("- [")) {
          require(resource != null, lineNumber + 1, "Resource without a group");
          resource.items.add(parseItem(line, lineNumber + 1, false));
        } else if (!line.isBlank()) {
          fail(lineNumber + 1, "Unexpected resource content");
        }
      }
    }

    return new Catalog(title, tagline, List.copyOf(categories.values()), List.copyOf(resources.values()));
  }

  private static Item parseItem(String line, int lineNumber, boolean descriptionRequired) {
    var metadata = GITHUB_METADATA.matcher(line);
    var repositories = new ArrayList<String>();
    if (metadata.find()) {
      require(descriptionRequired, lineNumber, "GitHub metadata is only valid for projects");
      for (var value : metadata.group(1).split(",")) {
        var repository = value.trim();
        require(REPOSITORY.matcher(repository).matches(), lineNumber,
            "Invalid GitHub repository: " + repository);
        require(!repositories.contains(repository), lineNumber,
            "Duplicate GitHub repository: " + repository);
        repositories.add(repository);
      }
      require(repositories.size() >= 2, lineNumber,
          "GitHub metadata must contain at least two repositories");
      line = line.substring(0, metadata.start());
    }

    var linkClose = line.indexOf("](");
    var urlClose = linkClose < 0 ? -1 : line.indexOf(')', linkClose + 2);
    require(linkClose > 3 && urlClose > linkClose + 2, lineNumber, "Invalid entry syntax");

    var name = line.substring(3, linkClose).trim();
    var url = line.substring(linkClose + 2, urlClose).trim();
    var remainder = line.substring(urlClose + 1);
    require(remainder.isEmpty() || remainder.startsWith(" - "), lineNumber,
        "Invalid text after entry link");
    var description = remainder.startsWith(" - ") ? remainder.substring(3).trim() : "";

    require(!name.isEmpty(), lineNumber, "Missing entry name");
    require(!url.isEmpty(), lineNumber, "Missing entry URL");
    validateUrl(url, lineNumber);
    require(!descriptionRequired || !description.isEmpty(), lineNumber, "Missing project description");
    var directRepository = githubRepository(url);
    require(repositories.isEmpty() || directRepository.isEmpty(), lineNumber,
        "GitHub metadata is not allowed on a direct repository link");
    if (descriptionRequired) {
      directRepository.ifPresent(repositories::add);
    }
    return new Item(name, url, description, lineNumber, List.copyOf(repositories));
  }

  private static void validateSource(Catalog source) {
    require(!source.categories().isEmpty(), 0, "No project categories found");
    require(!source.resources().isEmpty(), 0, "No resource groups found");

    var anchors = new HashSet<String>();
    var names = new HashMap<String, Item>();
    var urls = new HashMap<String, Item>();
    var repositories = new HashMap<String, Item>();

    for (var category : source.categories()) {
      require(!category.description.isBlank(), 0, "Missing category description: " + category.name);
      require(!category.items.isEmpty() || !category.subcategories.isEmpty(), 0,
          "Empty project category: " + category.name);
      require(anchors.add(slug(category.name)), 0, "Duplicate anchor: " + slug(category.name));
      validateItems(category.items, names, urls, repositories, true);
      for (var nested : category.subcategories.values()) {
        require(!nested.items.isEmpty(), 0, "Empty nested category: " + nested.name);
        validateItems(nested.items, names, urls, repositories, true);
      }
    }

    for (var resource : source.resources()) {
      require(!resource.description.isBlank(), 0, "Missing resource description: " + resource.name);
      require(!resource.items.isEmpty(), 0, "Empty resource group: " + resource.name);
      require(anchors.add(slug(resource.name)), 0, "Duplicate anchor: " + slug(resource.name));
      validateItems(resource.items, names, urls, repositories, false);
    }
  }

  private static void validateItems(
      List<Item> items,
      Map<String, Item> names,
      Map<String, Item> urls,
      Map<String, Item> repositories,
      boolean project
  ) {
    for (var item : items) {
      var plainName = item.name();
      var normalizedName = plainName.toLowerCase(Locale.ROOT);
      var normalizedUrl = normalizeUrl(item.url());
      var duplicateName = names.putIfAbsent(normalizedName, item);
      var duplicateUrl = urls.putIfAbsent(normalizedUrl, item);
      require(duplicateName == null, item.lineNumber(),
          "Duplicate entry name: " + plainName + " (first at line " + duplicateNameLine(duplicateName) + ")");
      require(duplicateUrl == null, item.lineNumber(),
          "Duplicate entry URL: " + item.url() + " (first at line " + duplicateNameLine(duplicateUrl) + ")");
      if (!item.description().isBlank()) {
        var end = item.description().charAt(item.description().length() - 1);
        require(".!?)".indexOf(end) >= 0, item.lineNumber(),
            "Description must end with punctuation: " + plainName);
      }
      if (project) {
        for (var repository : item.repositories()) {
          var duplicateRepository = repositories.putIfAbsent(
              repository.toLowerCase(Locale.ROOT), item);
          if (duplicateRepository != null) {
            fail(item.lineNumber(), "GitHub repository is already used by "
                + duplicateRepository.name() + ": " + repository);
          }
        }
      }
    }
  }

  private static int duplicateNameLine(Item item) {
    return item == null ? 0 : item.lineNumber();
  }

  private static RepoStats fetchStats(HttpClient client, String repository, String token)
      throws IOException, InterruptedException {
    var request = HttpRequest.newBuilder()
        .uri(URI.create("https://api.github.com/repos/" + repository))
        .header("Accept", "application/vnd.github+json")
        .header("Authorization", "Bearer " + token)
        .header("User-Agent", "awesome-java-readme-generator")
        .header("X-GitHub-Api-Version", "2026-03-10")
        .timeout(Duration.ofSeconds(30))
        .GET()
        .build();
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() != 200) {
      throw new IOException("GitHub API returned " + response.statusCode() + " for " + repository);
    }
    return parseStats(response.body());
  }

  private static RepoStats parseStats(String body) throws IOException {
    var stars = STARS.matcher(body);
    var pushedAt = PUSHED_AT.matcher(body);
    var archived = ARCHIVED.matcher(body);
    var license = LICENSE.matcher(body);
    if (!stars.find() || !pushedAt.find() || !archived.find() || !license.find()) {
      throw new IOException("Incomplete GitHub response");
    }
    var pushed = pushedAt.group(1) == null
        ? null
        : OffsetDateTime.parse(pushedAt.group(1)).withOffsetSameInstant(ZoneOffset.UTC).toLocalDate();
    return new RepoStats(
        Long.parseLong(stars.group(1)),
        pushed,
        Boolean.parseBoolean(archived.group(1)),
        knownLicense(license.group(1))
    );
  }

  private static StatsCache readCache(Path path) throws IOException {
    if (!Files.exists(path)) {
      return new StatsCache(null, new HashMap<>());
    }

    LocalDate refreshed = null;
    var refreshedSeen = false;
    var stats = new HashMap<String, RepoStats>();
    for (var line : Files.readAllLines(path)) {
      if (line.startsWith("# refreshed=")) {
        if (refreshedSeen) {
          throw new IOException("Duplicate refreshed header in statistics cache");
        }
        refreshedSeen = true;
        refreshed = LocalDate.parse(line.substring("# refreshed=".length()));
      } else if (!line.isBlank() && !line.startsWith("#")) {
        var parts = line.split("\\t", -1);
        if (parts.length != 5) {
          throw new IOException("Invalid statistics cache line: " + line);
        }
        if (!parts[3].equals("true") && !parts[3].equals("false")) {
          throw new IOException("Invalid archived value in statistics cache line: " + line);
        }
        var previous = stats.putIfAbsent(parts[0], new RepoStats(
            Long.parseLong(parts[1]),
            parts[2].isBlank() ? null : LocalDate.parse(parts[2]),
            Boolean.parseBoolean(parts[3]),
            parts[4].isBlank() ? null : parts[4]
        ));
        if (previous != null) {
          throw new IOException("Duplicate repository in statistics cache: " + parts[0]);
        }
      }
    }
    return new StatsCache(refreshed, stats);
  }

  private static void writeCache(Path path, StatsCache cache) throws IOException {
    var content = new StringBuilder("# refreshed=").append(cache.refreshed()).append('\n');
    cache.stats().entrySet().stream()
        .sorted(Map.Entry.comparingByKey(TEXT_ORDER))
        .forEach(entry -> content
            .append(entry.getKey()).append('\t')
            .append(entry.getValue().stars()).append('\t')
            .append(entry.getValue().pushed() == null ? "" : entry.getValue().pushed())
            .append('\t').append(entry.getValue().archived())
            .append('\t').append(entry.getValue().license() == null ? "" : entry.getValue().license())
            .append('\n'));
    writeAtomically(path, content.toString());
  }

  private static String render(Catalog source, StatsCache cache, LocalDate today, String branch) {
    var out = new StringBuilder();
    out.append("<!-- Generated from README_SOURCE.md by scripts/GenerateReadme.java. ")
        .append("Do not edit README.md directly. -->\n\n")
        .append(source.title()).append("\n\n")
        .append(source.tagline()).append("\n\n")
        .append("<sub>").append(projectCount(source)).append(" projects · ")
        .append(source.categories().size()).append(" categories · ")
        .append(resourceCount(source)).append(" resources · ")
        .append(DISPLAY_DATE.format(cache.refreshed())).append("</sub>\n\n")
        .append("<sub>Activity: 🟢 pushed within 3 months · 🟠 pushed 3–12 months ago · ")
        .append("🔴 no push for over 12 months</sub>\n\n")
        .append("<sub>License chips use GitHub SPDX metadata when available. Entries spanning ")
        .append("several repositories combine their stars, use the most recent push for activity ")
        .append("and show a license only when all repositories agree.</sub>\n\n")
        .append("Browse a category below, or use your browser's find command to locate a project.\n\n")
        .append("<details>\n")
        .append("<summary><strong>Browse ").append(source.categories().size())
        .append(" project categories and ").append(source.resources().size())
        .append(" resource groups</strong></summary>\n\n")
        .append("**Projects:** ");
    appendNavigation(out, source.categories().stream().map(category -> category.name).sorted(TEXT_ORDER).toList());
    out.append("\n\n**Resources:** ");
    appendNavigation(out, source.resources().stream().map(resource -> resource.name).toList());
    out.append("\n\n</details>\n\n")
        .append("## Projects\n\n");

    source.categories().stream()
        .sorted(Comparator.comparing(category -> category.name, TEXT_ORDER))
        .forEach(category -> renderCategory(out, category, cache, today));

    out.append("## Resources\n\n");
    for (var resource : source.resources()) {
      renderResource(out, resource);
    }

    var editUrl = "https://github.com/akullpp/awesome-java/edit/" + branch + "/README_SOURCE.md";
    out.append("## Contributing\n\n")
        .append("> **[Suggest a project or resource](").append(editUrl).append(")** · ")
        .append("[Contribution guidelines](CONTRIBUTING.md)\n")
        .append(">\n")
        .append("> Add one Markdown entry under the appropriate category and open one pull request. ")
        .append("Ordering, counts and GitHub statistics are generated automatically.\n\n")
        .append("## License\n\n")
        .append("Catalog and documentation: [CC BY-SA 4.0](LICENSE). ")
        .append("Automation code and configuration: [MIT](LICENSE-CODE).\n");
    return out.toString();
  }

  private static void appendNavigation(StringBuilder out, List<String> names) {
    for (var i = 0; i < names.size(); i++) {
      if (i > 0) {
        out.append(" · ");
      }
      var name = names.get(i);
      out.append('[').append(name).append("](#").append(slug(name)).append(')');
    }
  }

  private static void renderCategory(
      StringBuilder out,
      Category category,
      StatsCache cache,
      LocalDate today
  ) {
    var count = category.items.size()
        + category.subcategories.values().stream().mapToInt(sub -> sub.items.size()).sum();
    out.append("<details id=\"").append(slug(category.name)).append("\">\n")
        .append("<summary><strong>").append(category.name).append("</strong> <kbd>")
        .append(count).append(count == 1 ? " project" : " projects").append("</kbd></summary>\n\n")
        .append('_').append(category.description).append("_\n\n");

    category.items.stream()
        .sorted(Comparator.comparing(Item::name, TEXT_ORDER))
        .forEach(item -> renderProject(out, item, cache, today));

    category.subcategories.values().stream()
        .sorted(Comparator.comparing(sub -> sub.name, TEXT_ORDER))
        .forEach(sub -> {
          out.append("#### ").append(sub.name).append(" <kbd>")
              .append(sub.items.size()).append(sub.items.size() == 1 ? " project" : " projects")
              .append("</kbd>\n\n");
          if (!sub.description.isBlank()) {
            out.append('_').append(sub.description).append("_\n\n");
          }
          sub.items.stream()
              .sorted(Comparator.comparing(Item::name, TEXT_ORDER))
              .forEach(item -> renderProject(out, item, cache, today));
        });

    out.append("</details>\n\n");
  }

  private static void renderProject(
      StringBuilder out,
      Item item,
      StatsCache cache,
      LocalDate today
  ) {
    out.append("> **[").append(item.name()).append("](").append(item.url()).append(")**");
    aggregateStats(item, cache).ifPresent(stats -> {
      out.append(" <kbd>★ ").append(formatStars(stats.stars())).append("</kbd>");
      if (stats.license() != null) {
        out.append(" <kbd>").append(stats.license()).append("</kbd>");
      }
      if (stats.pushed() != null) {
        out.append(' ').append(activityDot(stats.pushed(), today));
      }
    });
    out.append("<br>").append(item.description()).append("\n\n");
  }

  private static void renderResource(StringBuilder out, ResourceGroup resource) {
    out.append("<details id=\"").append(slug(resource.name)).append("\">\n")
        .append("<summary><strong>").append(resource.name).append("</strong> <kbd>")
        .append(resource.items.size()).append(resource.items.size() == 1 ? " link" : " links")
        .append("</kbd></summary>\n\n")
        .append('_').append(resource.description).append("_\n\n");

    resource.items.stream()
        .sorted(Comparator.comparing(Item::name, TEXT_ORDER))
        .forEach(item -> {
          out.append("> **[").append(item.name()).append("](").append(item.url()).append(")**");
          if (!item.description().isBlank()) {
            out.append("<br>").append(item.description());
          }
          out.append("\n\n");
        });
    out.append("</details>\n\n");
  }

  private static Optional<RepoStats> aggregateStats(Item item, StatsCache cache) {
    if (item.repositories().isEmpty()) {
      return Optional.empty();
    }

    long stars = 0;
    LocalDate pushed = null;
    String license = null;
    var oneLicense = true;
    for (var repository : item.repositories()) {
      var stats = cache.stats().get(repository);
      require(stats != null, item.lineNumber(),
          "Missing GitHub statistics for " + repository);
      stars += stats.stars();
      if (stats.pushed() != null && (pushed == null || stats.pushed().isAfter(pushed))) {
        pushed = stats.pushed();
      }
      if (stats.license() == null) {
        oneLicense = false;
      } else if (license == null) {
        license = stats.license();
      } else if (!license.equals(stats.license())) {
        oneLicense = false;
      }
    }
    return Optional.of(new RepoStats(stars, pushed, false, oneLicense ? license : null));
  }

  private static void rejectArchivedProjects(Catalog source, StatsCache cache) {
    for (var item : source.projects()) {
      for (var repository : item.repositories()) {
        var stats = cache.stats().get(repository);
        require(stats != null, item.lineNumber(),
            "Missing GitHub statistics for " + repository);
        require(!stats.archived(), item.lineNumber(),
            "Archived GitHub repository: " + repository);
      }
    }
  }

  private static void validateRendered(
      Catalog source,
      StatsCache cache,
      String rendered,
      LocalDate today
  ) {
    require(!rendered.contains("Last push"), 0, "Generated README contains a Last push label");
    require(!rendered.contains("| Name |"), 0, "Generated README contains a table");
    require(!rendered.contains("![c]") && !rendered.contains("[c]:"),
        0, "Generated README contains the retired commercial badge");
    require(!rendered.matches("(?s).*<kbd>\\d{2}/\\d{2}/\\d{4}</kbd>.*"), 0,
        "Generated README contains a per-project date");
    require(countOccurrences(rendered, "](#") == source.categories().size() + source.resources().size(),
        0, "Generated README contains an incomplete navigation index");

    for (var item : source.projects()) {
      require(rendered.contains("**[" + item.name() + "](" + item.url() + ")**"), item.lineNumber(),
          "Generated README is missing project: " + item.name());
      aggregateStats(item, cache).filter(stats -> stats.license() != null).ifPresent(stats ->
          require(rendered.contains("<kbd>★ " + formatStars(stats.stars()) + "</kbd> <kbd>"
                  + stats.license() + "</kbd>"),
              item.lineNumber(), "Generated README is missing license: " + item.name())
      );
    }
    for (var resource : source.resources()) {
      for (var item : resource.items) {
        require(rendered.contains("**[" + item.name() + "](" + item.url() + ")**"), item.lineNumber(),
            "Generated README is missing resource: " + item.name());
      }
    }

    var expectedLicenses = source.projects().stream()
        .map(item -> aggregateStats(item, cache))
        .flatMap(Optional::stream)
        .filter(stats -> stats.license() != null)
        .count();
    var actualLicenses = rendered.lines()
        .filter(line -> line.startsWith("> **[")
            && line.contains("<kbd>★ ")
            && line.contains("</kbd> <kbd>"))
        .count();
    require(actualLicenses == expectedLicenses, 0,
        "Expected " + expectedLicenses + " license chips, found " + actualLicenses);

    var expectedDots = source.projects().stream()
        .map(item -> aggregateStats(item, cache))
        .flatMap(Optional::stream)
        .filter(stats -> stats.pushed() != null)
        .count();
    var actualDots = rendered.codePoints()
        .filter(codePoint -> codePoint == "🟢".codePointAt(0)
            || codePoint == "🟠".codePointAt(0)
            || codePoint == "🔴".codePointAt(0))
        .count();
    require(actualDots == expectedDots + 3, 0,
        "Expected " + expectedDots + " project dots plus the legend, found " + actualDots);
  }

  private static void printSourceSummary(Catalog source) {
    System.out.printf(
        "Valid source: %d projects, %d categories, %d nested groups, %d resources in %d groups%n",
        projectCount(source),
        source.categories().size(),
        source.categories().stream().mapToInt(category -> category.subcategories.size()).sum(),
        resourceCount(source),
        source.resources().size()
    );
  }

  private static void printGeneratedSummary(
      Catalog source,
      StatsCache cache,
      LocalDate today,
      Path output
  ) {
    var projectStats = source.projects().stream()
        .map(item -> aggregateStats(item, cache))
        .flatMap(Optional::stream)
        .toList();
    var green = projectStats.stream()
        .filter(stats -> stats.pushed() != null && activityDot(stats.pushed(), today).equals("🟢")).count();
    var orange = projectStats.stream()
        .filter(stats -> stats.pushed() != null && activityDot(stats.pushed(), today).equals("🟠")).count();
    var red = projectStats.stream()
        .filter(stats -> stats.pushed() != null && activityDot(stats.pushed(), today).equals("🔴")).count();
    printSourceSummary(source);
    System.out.printf(
        "Generated %s with %d scored projects: 🟢 %d, 🟠 %d, 🔴 %d%n",
        output,
        projectStats.size(),
        green,
        orange,
        red
    );
  }

  private static int projectCount(Catalog source) {
    return source.categories().stream().mapToInt(category ->
        category.items.size()
            + category.subcategories.values().stream().mapToInt(sub -> sub.items.size()).sum()
    ).sum();
  }

  private static int resourceCount(Catalog source) {
    return source.resources().stream().mapToInt(resource -> resource.items.size()).sum();
  }

  private static String activityDot(LocalDate pushed, LocalDate today) {
    if (!pushed.isBefore(today.minusMonths(3))) {
      return "🟢";
    }
    if (!pushed.isBefore(today.minusMonths(12))) {
      return "🟠";
    }
    return "🔴";
  }

  private static String formatStars(long stars) {
    return stars < 1_000 ? Long.toString(stars) : String.format(Locale.ROOT, "%.1fk", stars / 1_000.0);
  }

  private static Optional<String> githubRepository(String url) {
    try {
      var uri = URI.create(url);
      if (!"github.com".equalsIgnoreCase(uri.getHost())) {
        return Optional.empty();
      }
      var parts = Arrays.stream(uri.getPath().split("/"))
          .filter(part -> !part.isBlank())
          .toList();
      if (parts.size() < 2) {
        return Optional.empty();
      }
      var repository = parts.get(1).replaceFirst("\\.git$", "");
      return Optional.of(parts.get(0) + "/" + repository);
    } catch (IllegalArgumentException ignored) {
      return Optional.empty();
    }
  }

  private static void validateUrl(String url, int lineNumber) {
    try {
      var uri = URI.create(url);
      require("https".equalsIgnoreCase(uri.getScheme()) && uri.getHost() != null,
          lineNumber, "Entry URL must be an absolute HTTPS URL: " + url);
    } catch (IllegalArgumentException exception) {
      fail(lineNumber, "Entry URL must be an absolute HTTPS URL: " + url);
    }
  }

  private static String slug(String value) {
    return value.toLowerCase(Locale.ROOT)
        .replaceAll("[^a-z0-9\\s-]", "")
        .trim()
        .replaceAll("[\\s-]+", "-");
  }

  private static String normalizeUrl(String url) {
    return url.toLowerCase(Locale.ROOT).replaceAll("/+$", "");
  }

  private static int countOccurrences(String value, String needle) {
    var count = 0;
    for (var index = value.indexOf(needle); index >= 0; index = value.indexOf(needle, index + 1)) {
      count++;
    }
    return count;
  }

  private static String knownLicense(String license) {
    return license == null || license.isBlank()
        || license.equals("NOASSERTION") || license.equals("OTHER")
        ? null
        : license;
  }

  private static boolean isDescription(String line) {
    return line.length() >= 2 && line.startsWith("_") && line.endsWith("_");
  }

  private static String stripItalics(String line) {
    return line.substring(1, line.length() - 1);
  }

  private static void require(boolean condition, int lineNumber, String message) {
    if (!condition) {
      fail(lineNumber, message);
    }
  }

  private static void fail(int zeroBasedLineNumber, String message) {
    var prefix = zeroBasedLineNumber > 0 ? "Line " + zeroBasedLineNumber + ": " : "";
    throw new IllegalArgumentException(prefix + message);
  }

  private static void writeAtomically(Path path, String content) throws IOException {
    var parent = path.toAbsolutePath().getParent();
    Files.createDirectories(parent);
    var temporary = parent.resolve(path.getFileName() + ".tmp");
    Files.writeString(temporary, content);
    try {
      Files.move(temporary, path.toAbsolutePath(), StandardCopyOption.ATOMIC_MOVE,
          StandardCopyOption.REPLACE_EXISTING);
    } catch (AtomicMoveNotSupportedException ignored) {
      Files.move(temporary, path.toAbsolutePath(), StandardCopyOption.REPLACE_EXISTING);
    }
  }

  private static void selfTest() throws Exception {
    var today = LocalDate.of(2026, 7, 26);
    require(activityDot(LocalDate.of(2026, 4, 26), today).equals("🟢"), 0, "Green boundary");
    require(activityDot(LocalDate.of(2026, 4, 25), today).equals("🟠"), 0, "Orange start");
    require(activityDot(LocalDate.of(2025, 7, 26), today).equals("🟠"), 0, "Orange boundary");
    require(activityDot(LocalDate.of(2025, 7, 25), today).equals("🔴"), 0, "Red boundary");
    require(formatStars(999).equals("999"), 0, "Small star formatting");
    require(formatStars(1_000).equals("1.0k"), 0, "Thousand star formatting");
    require(formatStars(12_749).equals("12.7k"), 0, "Large star formatting");
    require(githubRepository("https://github.com/TNG/ArchUnit").orElseThrow().equals("TNG/ArchUnit"),
        0, "Repository parsing");
    require(githubRepository("https://github.com/webforms-core").isEmpty(), 0,
        "Organization URL parsing");
    var umbrella = parseItem(
        "- [Umbrella](https://example.com) - Several modules. "
            + "<!-- github: acme/one, acme/two -->",
        2,
        true
    );
    require(umbrella.repositories().equals(List.of("acme/one", "acme/two")), 0,
        "Umbrella repository parsing");
    var aggregate = aggregateStats(umbrella, new StatsCache(today, Map.of(
        "acme/one", new RepoStats(10, LocalDate.of(2026, 1, 1), false, "Apache-2.0"),
        "acme/two", new RepoStats(20, LocalDate.of(2026, 7, 1), false, "Apache-2.0")
    ))).orElseThrow();
    require(aggregate.stars() == 30, 0, "Umbrella star aggregation");
    require(aggregate.pushed().equals(LocalDate.of(2026, 7, 1)), 0,
        "Umbrella activity aggregation");
    require(aggregate.license().equals("Apache-2.0"), 0, "Umbrella license aggregation");
    var mixedLicense = aggregateStats(umbrella, new StatsCache(today, Map.of(
        "acme/one", new RepoStats(10, today, false, "Apache-2.0"),
        "acme/two", new RepoStats(20, today, false, "MIT")
    ))).orElseThrow();
    require(mixedLicense.license() == null, 0, "Mixed umbrella licenses");
    require(knownLicense("NOASSERTION") == null, 0, "Unknown license handling");
    var licensed = parseStats("""
        {"stargazers_count":1,"pushed_at":"2026-07-01T00:00:00Z","archived":false,
        "license":{"spdx_id":"MIT"}}
        """);
    require("MIT".equals(licensed.license()), 0, "Concrete license parsing");
    var nullLicense = parseStats("""
        {"stargazers_count":1,"pushed_at":null,"archived":false,"license":null}
        """);
    require(nullLicense.license() == null, 0, "Null license parsing");
    var unknownLicense = parseStats("""
        {"stargazers_count":1,"pushed_at":null,"archived":false,
        "license":{"spdx_id":"NOASSERTION"}}
        """);
    require(unknownLicense.license() == null, 0, "Unknown API license parsing");
    var category = new Category("Test");
    category.description = "Test projects.";
    category.items.add(umbrella);
    var catalog = new Catalog("# Test", "Test.", List.of(category), List.of());
    var resources = new ResourceGroup("Links");
    resources.description = "Useful links.";
    resources.items.add(parseItem("- [Link](https://example.com/link)", 2, false));
    var rendered = render(
        new Catalog("# Test", "Test.", List.of(category), List.of(resources)),
        new StatsCache(today, Map.of(
            "acme/one", new RepoStats(10, today, false, "Apache-2.0"),
            "acme/two", new RepoStats(20, today, false, "Apache-2.0")
        )),
        today,
        "test"
    );
    require(rendered.contains("[Test](#test)") && rendered.contains("[Links](#links)"),
        0, "Navigation rendering");
    require(rendered.contains("Suggest a project or resource"), 0, "Contribution CTA");
    require(rendered.contains("CC BY-SA 4.0") && rendered.contains("[MIT](LICENSE-CODE)"),
        0, "License footer");
    expectFailure(
        () -> rejectArchivedProjects(catalog, new StatsCache(today, Map.of(
            "acme/one", new RepoStats(10, today, false, "Apache-2.0"),
            "acme/two", new RepoStats(20, today, true, "Apache-2.0")
        ))),
        "Archived GitHub repository"
    );
    expectFailure(
        () -> parseItem(
            "- [Bad](https://github.com/acme/one) - Direct link. "
                + "<!-- github: acme/one, acme/two -->",
            3,
            true
        ),
        "direct repository link"
    );
    expectFailure(
        () -> parseItem(
            "- [Bad](https://example.com) - One repository. <!-- github: acme/one -->",
            4,
            true
        ),
        "at least two"
    );
    var oldCache = Files.createTempFile("awesome-java-old-cache", ".tsv");
    try {
      Files.writeString(oldCache,
          "# refreshed=2026-07-26\nacme/one\t10\t2026-07-25\tfalse\n");
      expectFailure(() -> readCache(oldCache), "Invalid statistics cache line");
    } finally {
      Files.deleteIfExists(oldCache);
    }
    var duplicateCache = Files.createTempFile("awesome-java-duplicate-cache", ".tsv");
    try {
      Files.writeString(duplicateCache, """
          # refreshed=2026-07-26
          acme/one	10	2026-07-25	false	MIT
          acme/one	11	2026-07-26	false	MIT
          """);
      expectFailure(() -> readCache(duplicateCache), "Duplicate repository");
    } finally {
      Files.deleteIfExists(duplicateCache);
    }
    expectFailure(() -> validateFixture("""
        # Test

        Test.

        ## Projects

        ### Projects

        _Projects._

        - Broken

        ## Resources

        ### Resources

        _Resources._

        - [Resource](https://example.com)
        """), "Unexpected project content");
    expectFailure(() -> validateFixture("""
        # Test

        Test.

        ## Projects

        ### Projects

        _Projects._

        - [Project](not-a-url) - Project.

        ## Resources

        ### Resources

        _Resources._

        - [Resource](https://example.com)
        """), "absolute HTTPS URL");
    expectFailure(() -> validateFixture("""
        # Test

        Test.

        ## Projects

        ### Projects

        _Projects._

        - [Project](https://example.com/project) - Project.

        ## Resources

        ### Resources

        _Resources._

        - [One](https://example.com/resource)
        - [Two](https://example.com/resource)
        """), "Duplicate entry URL");
    expectFailure(() -> validateFixture("""
        # Test

        Test.

        ## Projects

        ### Projects

        _Projects._

        - [Project](https://example.com/project) - Project.

        ## Resources

        ### Resources

        _Resources._
        """), "Empty resource group");
    System.out.println("Self-test passed");
  }

  private static void validateFixture(String content) throws IOException {
    var path = Files.createTempFile("awesome-java-source", ".md");
    try {
      Files.writeString(path, content);
      validateSource(parseSource(path));
    } finally {
      Files.deleteIfExists(path);
    }
  }

  private static void expectFailure(CheckedRunnable action, String message) {
    try {
      action.run();
    } catch (Exception exception) {
      require(exception.getMessage().contains(message), 0,
          "Unexpected failure: " + exception.getMessage());
      return;
    }
    fail(0, "Expected failure containing: " + message);
  }

  @FunctionalInterface
  private interface CheckedRunnable {
    void run() throws Exception;
  }

  private enum Section {
    NONE,
    PROJECTS,
    RESOURCES
  }

  private record Item(
      String name,
      String url,
      String description,
      int lineNumber,
      List<String> repositories
  ) {}

  private static final class Category {
    private final String name;
    private String description = "";
    private final List<Item> items = new ArrayList<>();
    private final Map<String, Subcategory> subcategories = new TreeMap<>(TEXT_ORDER);

    private Category(String name) {
      this.name = name;
    }
  }

  private static final class Subcategory {
    private final String name;
    private String description = "";
    private final List<Item> items = new ArrayList<>();

    private Subcategory(String name) {
      this.name = name;
    }
  }

  private static final class ResourceGroup {
    private final String name;
    private String description = "";
    private final List<Item> items = new ArrayList<>();

    private ResourceGroup(String name) {
      this.name = name;
    }
  }

  private record Catalog(
      String title,
      String tagline,
      List<Category> categories,
      List<ResourceGroup> resources
  ) {
    private List<Item> projects() {
      var projects = new ArrayList<Item>();
      for (var category : categories) {
        projects.addAll(category.items);
        category.subcategories.values().forEach(subcategory -> projects.addAll(subcategory.items));
      }
      return projects;
    }
  }

  private record RepoStats(long stars, LocalDate pushed, boolean archived, String license) {}

  private record StatsCache(LocalDate refreshed, Map<String, RepoStats> stats) {}
}
