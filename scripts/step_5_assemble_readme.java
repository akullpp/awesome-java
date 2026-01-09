import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Assembles the final README.md by combining the original content with generated markdown tables.
 *
 * Usage: step_5_assemble_readme.java [input_file] [tables_file] [output_file]
 */
void main(String[] args) throws IOException {
  var inputPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.CONTRIBUTE_README_FILE);
  var tablesPath = args.length > 1 ? Path.of(args[1]) : Path.of(Constants.TMP_DIR + "/" + Constants.GENERATED_TABLES_FILE);
  var outputPath = args.length > 2 ? Path.of(args[2]) : Path.of(Constants.README_FILE);

  System.out.println("Step 5: Assembling final README...");
  System.out.printf("Input: %s%n", inputPath.toAbsolutePath());
  System.out.printf("Tables: %s%n", tablesPath.toAbsolutePath());
  System.out.printf("Output: %s%n", outputPath.toAbsolutePath());

  FileUtils.validateInputFile(inputPath);
  FileUtils.validateInputFile(tablesPath);

  var originalContent = FileUtils.readFileContent(inputPath);
  var tablesContent = FileUtils.readFileContent(tablesPath);
  var finalContent = assembleReadme(originalContent, tablesContent);
  FileUtils.writeOutputFile(outputPath, finalContent);

  System.out.println("SUCCESS: Successfully assembled final README!");
  System.out.println("Statistics:");
  System.out.printf("  - %s%n", FileUtils.getFileStats(outputPath));
  System.out.printf("  - Badges: %d%n", countBadges(finalContent));
}

/**
 * Replaces project sections with markdown tables.
 */
String assembleReadme(String originalContent, String tablesContent) {
  var lines = originalContent.split("\n");
  var result = new StringBuilder();
  var inProjectSection = false;

  // Split tables by section comments (markdown format)
  var allTables = tablesContent.split(Constants.SECTION_COMMENT_PREFIX);
  // Filter out empty tables and process each table
  var tables = java.util.Arrays.stream(allTables)
    .filter(t -> t.trim().length() > 0 && t.contains("-->"))
    .toArray(String[]::new);

  // Create a mapping of sections to their tables
  var sectionToTableMap = createSectionToTableMap(tables);

  for (int i = 0; i < lines.length; i++) {
    var line = lines[i];

    if (line.startsWith(Constants.PROJECTS_SECTION)) {
      inProjectSection = true;
      result.append(line).append("\n\n");
      continue;
    }
    // Check for the hidden delimiter that marks the end of Projects section
    if (inProjectSection && line.contains(Constants.END_PROJECTS_SECTION_COMMENT)) {
      System.out.printf(
        "FOUND %s delimiter at line %d%n", Constants.END_PROJECTS_SECTION_COMMENT,
        i
      );
      inProjectSection = false;
    }
    // Check if we're leaving the Projects section
    if (inProjectSection &&
        line.startsWith(Constants.SECTION) &&
        !line.equals(Constants.PROJECTS_SECTION)
    ) {
      inProjectSection = false;
    }
    if (!inProjectSection) {
      result.append(line).append("\n");
      continue;
    }
    // Handle subsection headers
    if (line.startsWith(Constants.SUBSECTION)) {
      result.append(line).append("\n\n");
      continue;
    }
    // Handle headers
    if (line.startsWith("_") && line.endsWith("_")) {
      result.append(line).append("\n\n");
      continue;
    }
    // Skip empty lines
    if (line.isBlank()) {
      continue;
    }
    // Replace list items with markdown tables
    if (line.matches(Constants.ENTRY_PATTERN)) {
      // Find the current subsection
      var currentSubsection = findCurrentSubsection(lines, i);
      if (currentSubsection != null && sectionToTableMap.containsKey(currentSubsection)) {
        var tableContent = sectionToTableMap.get(currentSubsection);
        result.append(tableContent);
        if (!tableContent.endsWith("\n")) {
          result.append("\n");
        }
      }
      // Skip ALL remaining list items in this section until we hit the next subsection or end delimiter
      while (i + 1 < lines.length &&
             !lines[i + 1].startsWith(Constants.SUBSECTION) &&
             !lines[i + 1].contains(Constants.END_PROJECTS_SECTION_COMMENT)) {
        i++;
        if (lines[i].matches(Constants.ENTRY_PATTERN)) {
          // Skip this list item
          continue;
        }
        if (lines[i].startsWith(Constants.SECTION) &&
            !lines[i].startsWith(Constants.SUBSECTION)
        ) {
          // We've hit the end of the Projects section
          inProjectSection = false;
          break;
        }
        if (lines[i].contains(Constants.END_PROJECTS_SECTION_COMMENT)) {
          // We've hit the end delimiter
          inProjectSection = false;
          break;
        }
      }
      continue;
    }
    // Handle other content
    if (line.isBlank() || line.startsWith(Constants.HTML_COMMENT_PREFIX)) {
      result.append(line).append("\n");
      continue;
    }
    result.append(line).append("\n");
  }
  return result.toString();
}

/**
 * Counts the number of badges in the content.
 */
long countBadges(String content) {
  return content.lines()
      .filter(line -> line.contains("|") && (line.contains("Stars") || line.contains("Updated")))
      .count() / 2; // Approximate count based on table rows
}

/**
 * Creates a mapping of section names to their corresponding markdown tables.
 */
Map<String, String> createSectionToTableMap(String[] tables) {
  var sectionToTableMap = new HashMap<String, String>();

  for (var table : tables) {
    if (table.trim().isEmpty()) {
      continue;
    }

    // Extract section name from the comment (format: SectionName --> or <!-- SECTION:SectionName -->)
    var lines = table.split("\n");
    String sectionName = null;

    for (var line : lines) {
      if (line.contains(Constants.SECTION_COMMENT_PREFIX)) {
        // Format: <!-- SECTION:SectionName -->
        var startIdx = line.indexOf(Constants.SECTION_COMMENT_PREFIX) + Constants.SECTION_COMMENT_PREFIX.length();
        var endIdx = line.indexOf(" -->");
        if (endIdx > startIdx) {
          sectionName = line.substring(startIdx, endIdx).trim();
          break;
        }
      } else if (line.contains("-->") && !line.contains(Constants.HTML_COMMENT_PREFIX)) {
        // Format: SectionName -->
        var endIdx = line.indexOf(" -->");
        if (endIdx > 0) {
          sectionName = line.substring(0, endIdx).trim();
          break;
        }
      }
    }

    if (sectionName != null) {
      // Remove the comment line(s) and keep the rest of the table
      var tableContent = new StringBuilder();
      var skipComment = true;
      for (var line : lines) {
        if (skipComment && (line.contains("-->") || line.trim().isEmpty())) {
          if (line.contains("-->")) {
            skipComment = false;
          }
          continue;
        }
        skipComment = false;
        tableContent.append(line).append("\n");
      }
      sectionToTableMap.put(sectionName, tableContent.toString().trim());
    }
  }

  return sectionToTableMap;
}

/**
 * Finds the current subsection by looking backwards from the given line index.
 */
String findCurrentSubsection(String[] lines, int currentIndex) {
  for (int i = currentIndex; i >= 0; i--) {
    var line = lines[i];
    if (line.startsWith(Constants.SUBSECTION)) {
      return line.substring(Constants.SUBSECTION.length());
    }
  }
  return null;
}
