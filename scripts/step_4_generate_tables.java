import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Generates HTML tables from parsed project entries and badge mappings.
 *
 * Usage: java step_4_generate_tables.java [parsed_projects_file] [badges_file] [output_file]
 */
void main(String[] args) throws IOException {
  var projectsPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE);
  var badgesPath = args.length > 1 ? Path.of(args[1]) : Path.of(Constants.TMP_DIR + "/" + Constants.GITHUB_BADGES_FILE);
  var tmpDir = FileUtils.ensureTmpDirectory();
  var outputPath = args.length > 2 ? Path.of(args[2]) : tmpDir.resolve(Constants.GENERATED_TABLES_FILE);

  System.out.println("Step 4: Generating HTML tables...");
  System.out.printf("Projects: %s%n", projectsPath.toAbsolutePath());
  System.out.printf("Badges: %s%n", badgesPath.toAbsolutePath());
  System.out.printf("Output: %s%n", outputPath.toAbsolutePath());

  FileUtils.validateInputFile(projectsPath);
  FileUtils.validateInputFile(badgesPath);

  var projectEntries = readParsedEntries(projectsPath);
  var badgeMappings = readBadgeMappings(badgesPath);

  var tables = generateHtmlTables(projectEntries, badgeMappings);
  FileUtils.writeOutputFile(outputPath, tables);

  System.out.println("SUCCESS: Successfully generated HTML tables!");
  System.out.printf("Tables created: %d%n", countTables(tables));
  System.out.printf("Total entries: %d%n", projectEntries.size());
}

/**
 * Reads parsed entries.
 */
List<ProjectEntry> readParsedEntries(Path inputPath) throws IOException {
  var content = FileUtils.readFileContent(inputPath);
  var entries = new ArrayList<ProjectEntry>();

  for (var section : content.split(Constants.SECTION_SEPARATOR)) {
    if (section.isBlank()) {
      continue;
    }
    String name = null, url = null, description = null, sectionName = null;
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
      } else if (line.startsWith(Constants.SECTION_PREFIX)) {
        sectionName = line.substring(Constants.SECTION_PREFIX.length());
      }
    }
    if (name != null && url != null) {
      entries.add(new ProjectEntry(
        name,
        url,
        description != null ? description : "",
        linesToSkip,
        sectionName != null ? sectionName : ""
      ));
    }
  }
  return entries;
}

/**
 * Reads badge mappings.
 */
Map<String, BadgeMapping> readBadgeMappings(Path badgesPath) throws IOException {
  var content = FileUtils.readFileContent(badgesPath);
  var mappings = new HashMap<String, BadgeMapping>();

  for (var section : content.split("\n\n")) {
    if (section.isBlank()) {
      continue;
    }
    String repo = null, name = null, starsBadge = null, lastCommitBadge = null;

    for (var line : section.split("\n")) {
      if (line.trim().isEmpty()) {
        continue;
      }
      if (line.startsWith(Constants.REPO_PREFIX)) {
        repo = line.substring(Constants.REPO_PREFIX.length());
      } else if (line.startsWith(Constants.NAME_PREFIX)) {
        name = line.substring(Constants.NAME_PREFIX.length());
      } else if (line.startsWith(Constants.STARS_PREFIX)) {
        starsBadge = line.substring(Constants.STARS_PREFIX.length());
      } else if (line.startsWith(Constants.COMMIT_PREFIX)) {
        lastCommitBadge = line.substring(Constants.COMMIT_PREFIX.length());
      }
    }
    if (repo != null && name != null) {
      mappings.put(name, new BadgeMapping(
        name,
        repo,
        starsBadge,
        lastCommitBadge
      ));
    }
  }
  return mappings;
}

/**
 * Generates HTML tables from project entries and badge mappings.
 */
String generateHtmlTables(List<ProjectEntry> entries, Map<String, BadgeMapping> badgeMappings) {
  var tables = new StringBuilder();
  var current = new ArrayList<ProjectEntry>();
  var currentSection = "";

  for (var entry : entries) {
    // Check if we're starting a new section
    if (!currentSection.equals(entry.section())) {
      // Finish current table if we have entries
      if (!current.isEmpty()) {
        tables.append(createHtmlTable(current, badgeMappings));
        current.clear();
      }
      currentSection = entry.section();
    }

    current.add(entry);
  }
  // Finish any remaining entries
  if (!current.isEmpty()) {
    tables.append(createHtmlTable(current, badgeMappings));
  }
  return tables.toString();
}

/**
 * Creates a single HTML table from project entries.
 */
String createHtmlTable(List<ProjectEntry> entries, Map<String, BadgeMapping> badgeMappings) {
  if (entries.isEmpty()) {
    return "";
  }
  var sectionName = entries.get(0).section();
  var table = new StringBuilder();
  table.append(Constants.SECTION_COMMENT_PREFIX).append(sectionName).append(" -->\n\n");
  table.append("### ").append(sectionName).append("\n\n");
  table.append("<table style=\"table-layout: fixed; width: 850px;\">\n");
  table.append("<thead>\n");
  table.append("<tr>\n");
  table.append("<th style=\"width: 200px;\">Name</th>\n");
  table.append("<th style=\"width: 400px;\">Description</th>\n");
  table.append("<th style=\"width: 125px;\">Stars</th>\n");
  table.append("<th style=\"width: 125px;\">Updated</th>\n");
  table.append("</tr>\n");
  table.append("</thead>\n");
  table.append("<tbody>\n");

  for (var entry : entries) {
    var desc = entry.description().isEmpty() ? Constants.NO_DESCRIPTION : entry.description();
    var badge = badgeMappings.get(entry.name());
    var stars = badge != null ? badge.starsBadge() : Constants.NO_BADGE;
    var commit = badge != null ? badge.lastCommitBadge() : Constants.NO_BADGE;

    table.append("<tr>\n");
    table.append("<td><a href=\"").append(entry.url()).append("\">").append(entry.name()).append("</a></td>\n");
    table.append("<td>").append(desc).append("</td>\n");
    table.append("<td>").append(stars).append("</td>\n");
    table.append("<td>").append(commit).append("</td>\n");
    table.append("</tr>\n");
  }

  table.append("""
</tbody>
</table>

""");
  return table.toString();
}

/**
 * Counts the number of tables in the generated content.
 */
int countTables(String content) {
  return (int) content.lines().filter(l -> l.contains("<table")).count();
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
