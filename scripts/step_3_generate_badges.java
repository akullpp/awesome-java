import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Generates GitHub badges idempotently for repositories and creates a badge mapping file.
 *
 * Usage: step_3_generate_badges.java [parsed_projects_file] [badges_file]
 */
void main(String[] args) throws IOException {
  var inputPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE);
  var tmpDir = FileUtils.ensureTmpDirectory();
  var outputPath = args.length > 1 ? Path.of(args[1]) : tmpDir.resolve(Constants.GITHUB_BADGES_FILE);

  System.out.println("Step 3: Generating GitHub badges...");
  System.out.printf("Input: %s%n", inputPath.toAbsolutePath());
  System.out.printf("Output: %s%n", outputPath.toAbsolutePath());

  // Validate input
  FileUtils.validateInputFile(inputPath);

  // Read parsed entries
  var entries = readParsedEntries(inputPath);

  // Generate badges
  var badgeMappings = generateBadgeMappings(entries);

  // Write badge mappings
  writeBadgeMappings(outputPath, badgeMappings);

  System.out.printf(
    "SUCCESS: Successfully generated badges for %d repositories!%n",
    badgeMappings.size()
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
 * Generates badge mappings for GitHub repositories.
 */
List<BadgeMapping> generateBadgeMappings(List<ProjectEntry> entries) {
  var mappings = new ArrayList<BadgeMapping>();

  for (var entry : entries) {
    if (!entry.isGitHubRepo()) {
      continue;
    }

    var repo = entry.getGitHubRepo();
    if (repo == null) {
      continue;
    }

    var starsBadge = String.format("<img src=\"%s\" alt=\"GitHub stars\" style=\"width:100%%;height:auto;display:block;\">", Constants.GITHUB_STARS_BADGE_URL.formatted(repo));

    var lastCommitBadge = String.format("<img src=\"%s\" alt=\"Last commit\" style=\"width:100%%;height:40px;display:block;object-fit:cover;\">", Constants.GITHUB_LAST_COMMIT_BADGE_URL.formatted(repo));

    mappings.add(new BadgeMapping(
      entry.name(),
      repo,
      starsBadge,
      lastCommitBadge
    ));
  }

  return mappings;
}

/**
 * Writes badge mappings to a file.
 */
void writeBadgeMappings(Path outputPath, List<BadgeMapping> mappings) throws IOException {
  var content = mappings.stream()
      .map(m -> String.format(
          "%s%s\n%s%s\n%s%s\n%s%s",
          Constants.REPO_PREFIX, m.repo(),
          Constants.NAME_PREFIX, m.name(),
          Constants.STARS_PREFIX, m.starsBadge(),
          Constants.COMMIT_PREFIX, m.lastCommitBadge()
        ))
      .collect(Collectors.joining("\n\n"));

  FileUtils.writeOutputFile(outputPath, content);
}

/**
 * Badge mapping.
 */
record BadgeMapping(
  String name,
  String repo,
  String starsBadge,
  String lastCommitBadge
) {}
