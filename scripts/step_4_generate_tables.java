import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Generates markdown tables from parsed project entries and stats mappings.
 *
 * Usage: java step_4_generate_tables.java [parsed_projects_file] [stats_file] [output_file]
 */
void main(String[] args) throws IOException {
  var projectsPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE);
  var statsPath = args.length > 1 ? Path.of(args[1]) : Path.of(Constants.TMP_DIR + "/" + Constants.GITHUB_STATS_FILE);
  var tmpDir = FileUtils.ensureTmpDirectory();
  var outputPath = args.length > 2 ? Path.of(args[2]) : tmpDir.resolve(Constants.GENERATED_TABLES_FILE);

  System.out.println("Step 4: Generating markdown tables...");
  System.out.printf("Projects: %s%n", projectsPath.toAbsolutePath());
  System.out.printf("Stats: %s%n", statsPath.toAbsolutePath());
  System.out.printf("Output: %s%n", outputPath.toAbsolutePath());

  FileUtils.validateInputFile(projectsPath);
  FileUtils.validateInputFile(statsPath);

  var projectEntries = readParsedEntries(projectsPath);
  var statsMappings = readStatsMappings(statsPath);

  var tables = generateMarkdownTables(projectEntries, statsMappings);
  FileUtils.writeOutputFile(outputPath, tables);

  System.out.println("SUCCESS: Successfully generated markdown tables!");
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
 * Reads stats mappings.
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
        starsText,
        lastCommitText
      ));
    }
  }
  return mappings;
}

/**
 * Generates markdown tables from project entries and stats mappings.
 */
String generateMarkdownTables(List<ProjectEntry> entries, Map<String, StatsMapping> statsMappings) {
  var tables = new StringBuilder();
  var current = new ArrayList<ProjectEntry>();
  var currentSection = "";

  for (var entry : entries) {
    // Check if we're starting a new section
    if (!currentSection.equals(entry.section())) {
      // Finish current table if we have entries
      if (!current.isEmpty()) {
        tables.append(createMarkdownTable(current, statsMappings));
        current.clear();
      }
      currentSection = entry.section();
    }

    current.add(entry);
  }
  // Finish any remaining entries
  if (!current.isEmpty()) {
    tables.append(createMarkdownTable(current, statsMappings));
  }
  return tables.toString();
}

/**
 * Creates a single markdown table from project entries.
 */
String createMarkdownTable(List<ProjectEntry> entries, Map<String, StatsMapping> statsMappings) {
  if (entries.isEmpty()) {
    return "";
  }
  var sectionName = entries.get(0).section();
  var table = new StringBuilder();
  table.append(Constants.SECTION_COMMENT_PREFIX).append(sectionName).append(" -->\n\n");
  // Don't add section header here - it's already in the original file
  table.append("| Name | Description | Stars | Updated |\n");
  table.append("| :--- | :---------- | :---: | :-----: |\n");

  for (var entry : entries) {
    var desc = entry.description().isEmpty() ? Constants.NO_DESCRIPTION : entry.description();
    var stats = statsMappings.get(entry.name());
    var stars = stats != null ? stats.starsText() : Constants.NO_STATS;
    var commit = stats != null ? stats.lastCommitText() : Constants.NO_STATS;

    // Escape pipe characters in description for markdown
    desc = desc.replace("|", "\\|");

    table.append("| [").append(entry.name()).append("](").append(entry.url()).append(") | ");
    table.append(desc).append(" | ");
    table.append(stars).append(" | ");
    table.append(commit).append(" |\n");
  }
  table.append("\n");
  return table.toString();
}

/**
 * Counts the number of tables in the generated content.
 */
int countTables(String content) {
  return (int) content.lines().filter(l -> l.startsWith("| Name |")).count();
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
