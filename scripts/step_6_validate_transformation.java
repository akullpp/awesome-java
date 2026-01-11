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

  System.out.printf("Found %d entries in original README%n", originalEntries.size());
  System.out.printf("Found %d entries in transformed README%n", transformedEntries.size());

  var validationResult = validateTransformation(originalEntries, transformedEntries);
  printValidationResults(validationResult);

  if (!validationResult.isValid()) {
    System.err.println("VALIDATION FAILED!");
    System.exit(1);
  }

  System.out.println("SUCCESS: All entries validated successfully!");
}

/**
 * Extracts project entries from the original markdown format.
 */
List<ProjectEntry> extractProjectEntries(String content) {
  var lines = content.lines().toArray(String[]::new);
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
 * Extracts project entries from markdown tables in the transformed README.
 */
List<ProjectEntry> extractProjectEntriesFromTables(String content) {
  var entries = new ArrayList<ProjectEntry>();
  var lines = content.lines().toArray(String[]::new);
  var inProjectSection = false;
  var currentSection = "";
  var currentLevel4Section = "";
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

    // Track subsection changes (level 3 headings) - reset level 4 section
    if (line.startsWith(Constants.SUBSECTION)) {
      currentSection = line.substring(Constants.SUBSECTION.length());
      currentLevel4Section = ""; // Reset level 4 when we hit a new level 3
      continue;
    }
    // Track level 4 headings
    if (line.startsWith("####")) {
      currentLevel4Section = line.substring(4).trim(); // Remove "#### "
      continue;
    }

    // Track table boundaries - look for Markdown table headers
    if (line.startsWith("|") && line.contains("| Name |")) {
      inTable = true;
      // Combine level 3 and level 4 sections like step 2 does
      tableSection = currentLevel4Section.isEmpty()
          ? currentSection
          : currentSection + "/" + currentLevel4Section;
      continue;
    }
    if (inTable && line.startsWith("|") && line.contains("| :--- |")) {
      // Skip the separator row
      continue;
    }
    if (inTable && !line.startsWith("|") && !line.trim().isEmpty() && !line.startsWith("_")) {
      // End of table
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
 * Table format: | Name | Description | Stars | Updated | [License]
 * Supports both 4-column (without License) and 5-column (with License) formats
 */
ProjectEntry extractEntryFromMarkdownTableRow(String line, String section) {
  // Split by | and clean up
  var parts = line.split("\\|");
  // Need at least 5 parts for 4 columns without trailing | (empty, Name, Description, Stars, Updated)
  // or 6 parts for 4 columns with trailing | (empty, Name, Description, Stars, Updated, empty)
  // or 6 parts for 5 columns without trailing | (empty, Name, Description, Stars, Updated, License)
  // or 7 parts for 5 columns with trailing | (empty, Name, Description, Stars, Updated, License, empty)
  if (parts.length < 5) {
    return null;
  }

  // Extract name and URL from [Name](URL) format in first cell
  var nameUrlPart = parts[1].trim();
  var nameUrlMatch = Constants.MARKDOWN_LINK_PATTERN.matcher(nameUrlPart);
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
 * Normalizes URL for comparison (removes trailing slashes, converts to lowercase).
 */
String normalizeUrl(String url) {
  if (url == null || url.isBlank()) {
    return "";
  }
  return url.toLowerCase().replaceAll("/+$", "");
}

/**
 * Detects duplicate entries by name and/or URL.
 */
List<DuplicateEntry> detectDuplicates(List<ProjectEntry> entries) {
  var duplicates = new ArrayList<DuplicateEntry>();

  // Group by name (case-insensitive)
  var byName = entries.stream()
    .collect(Collectors.groupingBy(e -> e.name().toLowerCase()));

  // Group by URL (normalized)
  var byUrl = entries.stream()
    .collect(Collectors.groupingBy(e -> normalizeUrl(e.url())));

  // Track which duplicates we've already reported
  var reportedNames = new HashSet<String>();

  // Find duplicates by name
  for (var entry : byName.entrySet()) {
    if (entry.getValue().size() > 1) {
      var nameKey = entry.getKey();
      reportedNames.add(nameKey);
      var sections = entry.getValue().stream()
        .map(ProjectEntry::section)
        .distinct()
        .sorted()
        .toList();
      duplicates.add(new DuplicateEntry(
        entry.getValue().get(0).name(),
        entry.getValue().get(0).url(),
        sections
      ));
    }
  }

  // Find duplicates by URL (but not already reported by name)
  for (var entry : byUrl.entrySet()) {
    if (entry.getValue().size() > 1) {
      var firstEntry = entry.getValue().get(0);
      var nameKey = firstEntry.name().toLowerCase();
      // Only report if not already reported as a name duplicate
      if (!reportedNames.contains(nameKey)) {
        var sections = entry.getValue().stream()
          .map(ProjectEntry::section)
          .distinct()
          .sorted()
          .toList();
        duplicates.add(new DuplicateEntry(
          firstEntry.name(),
          firstEntry.url(),
          sections
        ));
      }
    }
  }

  return duplicates;
}

/**
 * Validates that all original entries are present in the transformed version.
 */
ValidationResult validateTransformation(List<ProjectEntry> original, List<ProjectEntry> transformed) {
  var missingEntries = new ArrayList<ProjectEntry>();
  var wrongSectionEntries = new ArrayList<SectionMismatch>();
  var extraEntries = new ArrayList<ProjectEntry>();
  var duplicateEntries = new ArrayList<DuplicateEntry>();

  // Check for duplicates in original
  var originalDuplicates = detectDuplicates(original);
  duplicateEntries.addAll(originalDuplicates);

  // Check for duplicates in transformed
  var transformedDuplicates = detectDuplicates(transformed);
  duplicateEntries.addAll(transformedDuplicates);

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
      // Extract base section (before first "/") for comparison
      var originalSection = originalEntry.section();
      var transformedSection = transformedEntry.section();
      var originalBase = originalSection.contains("/")
          ? originalSection.substring(0, originalSection.indexOf("/"))
          : originalSection;
      var transformedBase = transformedSection.contains("/")
          ? transformedSection.substring(0, transformedSection.indexOf("/"))
          : transformedSection;
      // Sections match if they're equal or have the same base section
      var sectionsMatch = originalSection.equals(transformedSection) ||
          originalBase.equals(transformedBase);
      if (!sectionsMatch) {
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
  return new ValidationResult(
    missingEntries,
    wrongSectionEntries,
    extraEntries,
    duplicateEntries
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
      result.duplicateEntries().isEmpty()) {
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

  if (!result.duplicateEntries().isEmpty()) {
    System.out.printf("DUPLICATE ENTRIES (%d):%n", result.duplicateEntries().size());
    for (var duplicate : result.duplicateEntries()) {
      System.out.printf("  - %s (URL: %s)%n", duplicate.name(), duplicate.url());
      System.out.printf("    Found in sections: %s%n", String.join(", ", duplicate.sections()));
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
  List<DuplicateEntry> duplicateEntries
) {
  boolean isValid() {
    return missingEntries.isEmpty() &&
           wrongSectionEntries.isEmpty() &&
           duplicateEntries.isEmpty();
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
 * Represents duplicate entries (same name or URL).
 */
record DuplicateEntry(
  String name,
  String url,
  List<String> sections  // Sections where this duplicate appears
) {}
