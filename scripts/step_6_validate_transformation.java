import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Validates that all entries from the original README are present in the transformed README
 * and are in the correct sections.
 *
 * Usage: java step_6_validate_transformation.java [original_file] [transformed_file]
 */
void main(String[] args) throws IOException {
  var originalPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.CONTRIBUTE_README_FILE);
  var transformedPath = args.length > 1 ? Path.of(args[1]) : Path.of(Constants.README_FILE);

  System.out.println("Step 6: Validating transformation...");
  System.out.printf("Original: %s%n", originalPath.toAbsolutePath());
  System.out.printf("Transformed: %s%n", transformedPath.toAbsolutePath());

  FileUtils.validateInputFile(originalPath);
  FileUtils.validateInputFile(transformedPath);

  var originalContent = FileUtils.readFileContent(originalPath);
  var transformedContent = FileUtils.readFileContent(transformedPath);

  var originalEntries = extractProjectEntries(originalContent);
  var transformedEntries = extractProjectEntriesFromTables(transformedContent);
  var originalSections = extractSections(originalContent);
  var transformedSections = extractSections(transformedContent);

  System.out.printf("Found %d entries in original README%n", originalEntries.size());
  System.out.printf("Found %d entries in transformed README%n", transformedEntries.size());
  System.out.printf("Found %d sections in original README%n", originalSections.size());
  System.out.printf("Found %d sections in transformed README%n", transformedSections.size());

  var validationResult = validateTransformation(originalEntries, transformedEntries, originalSections, transformedSections);
  printValidationResults(validationResult);

  if (!validationResult.isValid()) {
    System.err.println("VALIDATION FAILED!");
    System.exit(1);
  }

  System.out.println("SUCCESS: All entries validated successfully!");
}

/**
 * Extracts all sections (including subsections and arbitrary multi-level sections) from markdown content.
 */
List<SectionInfo> extractSections(String content) {
  var sections = new ArrayList<SectionInfo>();
  var lines = content.split("\n");

  for (int i = 0; i < lines.length; i++) {
    var line = lines[i];

    // Extract all sections and subsections throughout the document
    if (line.startsWith(Constants.SUBSECTION)) {
      var sectionName = line.substring(Constants.SUBSECTION.length()).trim();
      var level = 1; // Subsection level
      sections.add(new SectionInfo(sectionName, level, i));
    } else {
      // Handle arbitrary multi-level sections (####, #####, ######, etc.)
      var level = getSectionLevel(line);
      if (level > 1) {
        var sectionName = line.substring(level + 1).trim(); // Remove the # symbols and space
        sections.add(new SectionInfo(sectionName, level, i));
      }
    }
  }

  return sections;
}

/**
 * Determines the section level based on the number of # symbols.
 * Returns 0 if the line is not a section header.
 */
int getSectionLevel(String line) {
  if (!line.startsWith("#")) {
    return 0;
  }

  int level = 0;
  for (int i = 0; i < line.length() && line.charAt(i) == '#'; i++) {
    level++;
  }

  // Must have at least 3 # symbols and a space after them
  return (level >= 3 && line.length() > level && line.charAt(level) == ' ') ? level : 0;
}

/**
 * Extracts project entries from the original markdown format.
 */
List<ProjectEntry> extractProjectEntries(String content) {
  var lines = content.split("\n");
  var projectEntries = new ArrayList<ProjectEntry>();
  var inProjectSection = false;
  var currentSection = "";

  for (int i = 0; i < lines.length; i++) {
    var line = lines[i];
    var isSubsection = line.startsWith(Constants.SUBSECTION);

    // Check if we're entering the Projects section
    if (line.startsWith(Constants.PROJECTS_SECTION)) {
      inProjectSection = true;
      continue;
    }
    // Check if we're leaving the Projects section
    if (inProjectSection &&
        line.startsWith(Constants.SECTION) &&
        !isSubsection &&
        !line.equals(Constants.PROJECTS_SECTION)
    ) {
      inProjectSection = false;
    }
    if (!inProjectSection) {
      continue;
    }
    // Track current subsection
    if (isSubsection) {
      currentSection = line.substring(Constants.SUBSECTION.length());
      continue;
    }
    // Skip headers and empty lines
    var isHeader = (line.startsWith("_") && line.endsWith("_"));
    if (isHeader || line.isBlank()) {
      continue;
    }
    // List entries
    if (line.matches(Constants.ENTRY_PATTERN)) {
      var projectEntry = parseProjectEntry(lines, i, currentSection);
      if (projectEntry != null) {
        projectEntries.add(projectEntry);
        i += projectEntry.linesToSkip() - 1;
      }
    }
  }
  return projectEntries;
}

/**
 * Extracts project entries from HTML tables in the transformed README.
 */
List<ProjectEntry> extractProjectEntriesFromTables(String content) {
  var entries = new ArrayList<ProjectEntry>();
  var lines = content.split("\n");
  var inProjectSection = false;
  var currentSection = "";
  var inTable = false;
  var tableSection = "";

  for (int i = 0; i < lines.length; i++) {
    var line = lines[i];

    // Track section changes
    if (line.startsWith(Constants.PROJECTS_SECTION)) {
      inProjectSection = true;
      continue;
    }
    if (inProjectSection &&
        line.startsWith(Constants.SECTION) &&
        !line.startsWith(Constants.SUBSECTION)
    ) {
      inProjectSection = false;
      continue;
    }
    if (!inProjectSection) {
      continue;
    }

    // Track section changes (both main sections and subsections)
    if (line.startsWith(Constants.SUBSECTION)) {
      currentSection = line.substring(Constants.SUBSECTION.length());
      continue;
    }
    if (line.startsWith(Constants.SECTION) && !line.equals(Constants.PROJECTS_SECTION)) {
      currentSection = line.substring(Constants.SECTION.length());
      continue;
    }

    // Track table boundaries - look for Markdown table headers
    if (line.startsWith("|") && line.contains("| Name |")) {
      inTable = true;
      tableSection = currentSection;
      continue;
    }
    if (inTable && line.startsWith("|") && line.contains("| :--- |")) {
      // Skip the separator row
      continue;
    }
    if (inTable && !line.startsWith("|") && !line.trim().isEmpty()) {
      inTable = false;
      continue;
    }

    // Extract entries from Markdown table rows
    if (inTable && line.startsWith("|") && !line.contains("| Name |") && !line.contains("| :--- |")) {
      var entry = extractEntryFromMarkdownTableRow(line, tableSection);
      if (entry != null) {
        entries.add(entry);
      }
    }
  }
  return entries;
}

/**
 * Extracts a project entry from a Markdown table row.
 */
ProjectEntry extractEntryFromMarkdownTableRow(String line, String section) {
  // Split by | and clean up
  var parts = line.split("\\|");
  if (parts.length < 5) {
    return null;
  }

  // Extract name and URL from [Name](URL) format
  var nameUrlPart = parts[1].trim();
  var nameUrlMatch = Pattern.compile("\\[([^\\]]+)\\]\\(([^)]+)\\)").matcher(nameUrlPart);
  if (!nameUrlMatch.find()) {
    return null;
  }

  var name = nameUrlMatch.group(1);
  var url = nameUrlMatch.group(2);
  var description = parts[2].trim();

  if (!name.isEmpty() && !url.isEmpty()) {
    return new ProjectEntry(
      name,
      url,
      description,
      1,
      section
    );
  }
  return null;
}

/**
 * Extracts a project entry from a table row.
 */
ProjectEntry extractEntryFromTableRow(String[] lines, int startIndex, String section) {
  var name = "";
  var url = "";
  var description = "";

  // Look for the next few lines to find name, URL, and description
  for (int i = startIndex; i < Math.min(startIndex + 10, lines.length); i++) {
    var line = lines[i];

    // Extract name and URL from <a href="...">Name</a>
    if (line.contains("<a href=")) {
      var hrefMatch = Pattern.compile("<a href=\"([^\"]+)\">([^<]+)</a>").matcher(line);
      if (hrefMatch.find()) {
        url = hrefMatch.group(1);
        name = hrefMatch.group(2);
      }
    }

    // Extract description from the second <td> cell
    if (line.contains("</td>") && !line.contains("<a href=") && !line.contains("<img src=")) {
      var descMatch = Pattern.compile(">([^<]+)</td>").matcher(line);
      if (descMatch.find()) {
        description = descMatch.group(1).trim();
        break;
      }
    }
  }

  if (!name.isEmpty() && !url.isEmpty()) {
    return new ProjectEntry(
      name,
      url,
      description,
      1,
      section
    );
  }
  return null;
}

/**
 * Parses a single project entry from the original markdown format.
 */
ProjectEntry parseProjectEntry(String[] lines, int startIndex, String section) {
  var matcher = Constants.PROJECT_PATTERN.matcher(lines[startIndex]);

  if (matcher.find()) {
    var name = matcher.group(1);
    var url = matcher.group(2);
    var description = new StringBuilder(matcher.group(3));
    var linesToSkip = 1;

    // Handle multi-line descriptions
    for (int i = startIndex + 1; i < lines.length; i++) {
      var nextLine = lines[i];

      if (nextLine.isBlank() ||
          nextLine.startsWith(Constants.SECTION) ||
          nextLine.startsWith(Constants.SUBSECTION) ||
          nextLine.matches(Constants.ENTRY_PATTERN)
      ) {
        break;
      }

      if (nextLine.matches(Constants.INDENTED_LINE_PATTERN)) {
        description.append(" ").append(nextLine.trim());
        linesToSkip++;
      } else if (!nextLine.trim().isEmpty()) {
        description.append(" ").append(nextLine.trim());
        linesToSkip++;
      }
    }
    return new ProjectEntry(
      name,
      url,
      description.toString(),
      linesToSkip,
      section
    );
  }

  return null;
}

/**
 * Validates that all original entries and sections are present in the transformed version.
 */
ValidationResult validateTransformation(List<ProjectEntry> original, List<ProjectEntry> transformed,
                                       List<SectionInfo> originalSections, List<SectionInfo> transformedSections) {
  var missingEntries = new ArrayList<ProjectEntry>();
  var wrongSectionEntries = new ArrayList<SectionMismatch>();
  var extraEntries = new ArrayList<ProjectEntry>();
  var missingSections = new ArrayList<SectionInfo>();
  var extraSections = new ArrayList<SectionInfo>();

  // Create maps for easier lookup
  var originalMap = original.stream()
    .collect(Collectors.toMap(
      e -> e.name().toLowerCase(),
      e -> e,
      (e1, e2) -> e1
    ));

  var transformedMap = transformed.stream()
    .collect(Collectors.toMap(
      e -> e.name().toLowerCase(),
      e -> e,
      (e1, e2) -> e1
    ));

  // Check for missing entries
  for (var originalEntry : original) {
    var key = originalEntry.name().toLowerCase();
    if (!transformedMap.containsKey(key)) {
      missingEntries.add(originalEntry);
    } else {
      var transformedEntry = transformedMap.get(key);
      // Compare base section names (before " > ") for hierarchical sections
      var originalBaseSection = originalEntry.section();
      var transformedBaseSection = transformedEntry.section().split(" > ")[0];
      if (!originalBaseSection.equals(transformedBaseSection)) {
        wrongSectionEntries.add(new SectionMismatch(
          originalEntry,
          transformedEntry
        ));
      }
    }
  }

  // Check for extra entries (entries in transformed but not in original)
  for (var transformedEntry : transformed) {
    var key = transformedEntry.name().toLowerCase();
    if (!originalMap.containsKey(key)) {
      extraEntries.add(transformedEntry);
    }
  }

  // Create section maps for easier lookup
  var originalSectionMap = originalSections.stream()
    .collect(Collectors.toMap(
      s -> s.name().toLowerCase(),
      s -> s,
      (s1, s2) -> s1
    ));

  var transformedSectionMap = transformedSections.stream()
    .collect(Collectors.toMap(
      s -> s.name().toLowerCase(),
      s -> s,
      (s1, s2) -> s1
    ));

  // Check for missing sections - only check main sections (### level) that have entries
  var sectionsWithEntries = original.stream()
    .map(ProjectEntry::section)
    .distinct()
    .collect(Collectors.toSet());

  for (var originalSection : originalSections) {
    var key = originalSection.name().toLowerCase();
    // Only check main sections (### level) that have entries and are missing from transformed
    if (originalSection.level() == 3 &&
        sectionsWithEntries.contains(originalSection.name())) {
      // Check if any transformed section starts with this base section name
      var hasMatchingSection = transformedSections.stream()
        .anyMatch(s -> s.name().toLowerCase().startsWith(key));
      if (!hasMatchingSection) {
        missingSections.add(originalSection);
      }
    }
  }

  // Check for extra sections (sections in transformed but not in original)
  for (var transformedSection : transformedSections) {
    var key = transformedSection.name().toLowerCase();
    var isSubsection = key.contains(" > ");

    if (!originalSectionMap.containsKey(key)) {
      // For subsections, check if the parent section exists
      if (isSubsection) {
        var parentSection = key.split(" > ")[0];
        if (!originalSectionMap.containsKey(parentSection)) {
          extraSections.add(transformedSection);
        }
        // Skip subsections as they are valid if parent exists
      } else {
        extraSections.add(transformedSection);
      }
    }
  }

  return new ValidationResult(
    missingEntries,
    wrongSectionEntries,
    extraEntries,
    missingSections,
    extraSections
  );
}

/**
 * Prints validation results in a readable format.
 */
void printValidationResults(ValidationResult result) {
  System.out.printf("%n%s%n", "=".repeat(60));
  System.out.println("VALIDATION RESULTS");
  System.out.printf("%s%n", "=".repeat(60));

  if (result.missingEntries().isEmpty() &&
      result.wrongSectionEntries().isEmpty() &&
      result.extraEntries().isEmpty() &&
      result.missingSections().isEmpty() &&
      result.extraSections().isEmpty()) {
    System.out.println("All validations passed!");
    return;
  }

  if (!result.missingEntries().isEmpty()) {
    System.out.printf("MISSING ENTRIES (%d):%n", result.missingEntries().size());
    for (var entry : result.missingEntries()) {
      System.out.printf("  - %s (Section: %s)%n", entry.name(), entry.section());
    }
    System.out.println();
  }

  if (!result.wrongSectionEntries().isEmpty()) {
    System.out.printf("WRONG SECTIONS (%d):%n", result.wrongSectionEntries().size());
    for (var mismatch : result.wrongSectionEntries()) {
      System.out.printf("  - %s: Expected '%s', Found '%s'%n",
        mismatch.original().name(),
        mismatch.original().section(),
        mismatch.transformed().section());
    }
    System.out.println();
  }

  if (!result.extraEntries().isEmpty()) {
    System.out.printf("EXTRA ENTRIES (%d):%n", result.extraEntries().size());
    for (var entry : result.extraEntries()) {
      System.out.printf("  - %s (Section: %s)%n", entry.name(), entry.section());
    }
    System.out.println();
  }

  if (!result.missingSections().isEmpty()) {
    System.out.printf("MISSING SECTIONS (%d):%n", result.missingSections().size());
    for (var section : result.missingSections()) {
      System.out.printf("  - %s (Level: %d, Line: %d)%n", section.name(), section.level(), section.lineNumber());
    }
    System.out.println();
  }

  if (!result.extraSections().isEmpty()) {
    System.out.printf("EXTRA SECTIONS (%d):%n", result.extraSections().size());
    for (var section : result.extraSections()) {
      System.out.printf("  - %s (Level: %d, Line: %d)%n", section.name(), section.level(), section.lineNumber());
    }
    System.out.println();
  }
}

/**
 * Represents the result of validation.
 */
record ValidationResult(
  List<ProjectEntry> missingEntries,
  List<SectionMismatch> wrongSectionEntries,
  List<ProjectEntry> extraEntries,
  List<SectionInfo> missingSections,
  List<SectionInfo> extraSections
) {
  boolean isValid() {
    return missingEntries.isEmpty() &&
           wrongSectionEntries.isEmpty() &&
           missingSections.isEmpty() &&
           extraSections.isEmpty();
  }
}

/**
 * Represents a section mismatch between original and transformed entries.
 */
record SectionMismatch(
  ProjectEntry original,
  ProjectEntry transformed
) {}

/**
 * Represents section information including name, level, and line number.
 */
record SectionInfo(
  String name,
  int level,
  int lineNumber
) {}
