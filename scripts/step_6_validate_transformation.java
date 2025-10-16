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

    // Track subsection changes
    if (line.startsWith(Constants.SUBSECTION)) {
      currentSection = line.substring(Constants.SUBSECTION.length());
      continue;
    }

    // Track table boundaries
    if (line.contains("<table")) {
      inTable = true;
      tableSection = currentSection;
      continue;
    }
    if (line.contains("</table>")) {
      inTable = false;
      continue;
    }

    // Extract entries from table rows
    if (inTable && line.contains("<tr>")) {
      var entry = extractEntryFromTableRow(lines, i, tableSection);
      if (entry != null) {
        entries.add(entry);
      }
    }
  }
  return entries;
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

    // Extract description from the next cell
    if (line.contains("word-wrap:break-word;")) {
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
 * Validates that all original entries are present in the transformed version.
 */
ValidationResult validateTransformation(List<ProjectEntry> original, List<ProjectEntry> transformed) {
  var missingEntries = new ArrayList<ProjectEntry>();
  var wrongSectionEntries = new ArrayList<SectionMismatch>();
  var extraEntries = new ArrayList<ProjectEntry>();

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
      if (!originalEntry.section().equals(transformedEntry.section())) {
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
    extraEntries
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
      result.extraEntries().isEmpty()) {
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
}

/**
 * Represents the result of validation.
 */
record ValidationResult(
  List<ProjectEntry> missingEntries,
  List<SectionMismatch> wrongSectionEntries,
  List<ProjectEntry> extraEntries
) {
  boolean isValid() {
    return missingEntries.isEmpty() && wrongSectionEntries.isEmpty();
  }
}

/**
 * Represents a section mismatch between original and transformed entries.
 */
record SectionMismatch(
  ProjectEntry original,
  ProjectEntry transformed
) {}
