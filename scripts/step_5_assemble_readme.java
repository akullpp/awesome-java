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
  System.out.printf("  - Stats entries: %d%n", countStats(finalContent));
}

/**
 * Replaces project sections with markdown tables.
 */
String assembleReadme(String originalContent, String tablesContent) {
  var lines = originalContent.lines().toArray(String[]::new);
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
        !line.equals(Constants.PROJECTS_SECTION) &&
        !line.startsWith(Constants.SUBSECTION)
    ) {
      inProjectSection = false;
      // Normalize trailing whitespace
      var current = result.toString();
      // Count trailing newlines
      var trailingCount = 0;
      var temp = current;
      while (temp.endsWith("\n")) {
        trailingCount++;
        temp = temp.substring(0, temp.length() - 1);
      }
      result.setLength(0);
      result.append(temp);
      // Add exactly one blank line
      if (trailingCount < 2) {
        result.append("\n".repeat(2 - trailingCount));
      }
      // Output the section header that caused us to leave Projects section
      result.append(line).append("\n\n");
      continue;
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
    // Handle headers (italic descriptions)
    if (line.startsWith("_") && line.endsWith("_")) {
      // Check if previous non-blank line was a level 4 heading
      var prevNonBlankLine = findPreviousNonBlankLine(lines, i);
      if (prevNonBlankLine != null && prevNonBlankLine.startsWith("####")) {
        // Level 4 heading already has \n\n, so just add one newline after italic
        result.append(line).append("\n");
        // Check if we need to insert a table for this level 4 subsection
        var level4Name = prevNonBlankLine.substring(4).trim();
        var currentSubsection = findCurrentSubsection(lines, i);
        if (currentSubsection != null) {
          var combinedSection = currentSubsection + "/" + level4Name;
          if (sectionToTableMap.containsKey(combinedSection)) {
            // Add blank line before table (italic ends with \n, so add another \n)
            result.append("\n");
            // Insert table after the description
            var tableContent = sectionToTableMap.get(combinedSection);
            result.append(tableContent);
            // Ensure exactly one blank line after table
            var tableEndsWith = tableContent.endsWith("\n\n") ? 2 : (tableContent.endsWith("\n") ? 1 : 0);
            if (tableEndsWith < 2) {
              result.append("\n".repeat(2 - tableEndsWith));
            }
          }
        }
      } else {
        result.append(line).append("\n\n");
      }
      continue;
    }
    // Skip empty lines
    if (line.isBlank()) {
      continue;
    }
    // Replace list items with markdown tables
    if (line.matches(Constants.ENTRY_PATTERN)) {
      // Find the current subsection and level 4 heading (if any)
      var currentSubsection = findCurrentSubsection(lines, i);
      var currentLevel4 = findCurrentLevel4Heading(lines, i);

      // Try combined section name first (level3/level4), then fall back to just level3
      String sectionKey = null;
      if (currentSubsection != null && currentLevel4 != null) {
        var combined = currentSubsection + "/" + currentLevel4;
        if (sectionToTableMap.containsKey(combined)) {
          sectionKey = combined;
        }
      }
      if (sectionKey == null && currentSubsection != null && sectionToTableMap.containsKey(currentSubsection)) {
        sectionKey = currentSubsection;
      }

      if (sectionKey != null) {
        // Check if previous non-blank line was a level 4 heading or italic description
        var prevNonBlankLine = findPreviousNonBlankLine(lines, i);
        var needsBlankBeforeTable = (prevNonBlankLine != null &&
                                     (prevNonBlankLine.startsWith("####") ||
                                      (prevNonBlankLine.startsWith("_") && prevNonBlankLine.endsWith("_"))));

        var tableContent = sectionToTableMap.get(sectionKey);
        var currentResult = result.toString();
        // Add blank line before table if needed
        if (needsBlankBeforeTable) {
          // Ensure we have a blank line (two newlines) before the table
          if (currentResult.endsWith("\n") && !currentResult.endsWith("\n\n")) {
            // Ends with single newline, add another to make blank line
            result.append("\n");
          } else if (!currentResult.endsWith("\n")) {
            // Doesn't end with newline, add two
            result.append("\n\n");
          }
          // If it already ends with \n\n, we don't need to add anything
        }
        // Insert table with proper spacing
        result.append(tableContent);
        // Ensure exactly one blank line after table
        var tableEndsWith = tableContent.endsWith("\n\n") ? 2 : (tableContent.endsWith("\n") ? 1 : 0);
        if (tableEndsWith < 2) {
          result.append("\n".repeat(2 - tableEndsWith));
        }
      }
      // Skip ALL remaining list items in this section until we hit the next subsection, level 4 heading, or end delimiter
      while (i + 1 < lines.length &&
             !lines[i + 1].startsWith(Constants.SUBSECTION) &&
             !lines[i + 1].startsWith("####") &&
             !lines[i + 1].contains(Constants.END_PROJECTS_SECTION_COMMENT)) {
        i++;
        if (lines[i].matches(Constants.ENTRY_PATTERN)) {
          // Skip this list item
          continue;
        }
        if (lines[i].startsWith(Constants.SECTION) &&
            !lines[i].startsWith(Constants.SUBSECTION)
        ) {
          // We've hit the end of the Projects section - output this section header
          inProjectSection = false;
          // Normalize trailing whitespace - ensure we have exactly one blank line before Resources
          var current = result.toString();
          // Remove all trailing newlines
          while (current.endsWith("\n")) {
            current = current.substring(0, current.length() - 1);
          }
          result.setLength(0);
          result.append(current);
          // Add exactly one blank line before Resources section
          result.append("\n\n");
          // Output the section header
          result.append(lines[i]).append("\n");
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
    // Handle level 4 headings (####)
    if (line.startsWith("####")) {
      result.append(line).append("\n\n");
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
 * Counts the number of stats entries in the content.
 */
long countStats(String content) {
  // Count table rows (excluding header and separator rows)
  return content.lines()
      .filter(line -> line.startsWith("|") &&
                     !line.contains("| Name |") &&
                     !line.contains("| :--- |") &&
                     line.contains("|"))
      .count();
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
    var lines = table.lines().toArray(String[]::new);
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
      // Ensure table ends with exactly one newline
      var content = tableContent.toString().trim();
      sectionToTableMap.put(sectionName, content + "\n");
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

/**
 * Finds the previous non-blank line by looking backwards from the given line index.
 */
String findPreviousNonBlankLine(String[] lines, int currentIndex) {
  for (int i = currentIndex - 1; i >= 0; i--) {
    var line = lines[i];
    if (!line.isBlank()) {
      return line;
    }
  }
  return null;
}

/**
 * Finds the current level 4 heading by looking backwards from the given line index.
 */
String findCurrentLevel4Heading(String[] lines, int currentIndex) {
  for (int i = currentIndex; i >= 0; i--) {
    var line = lines[i];
    if (line.startsWith("####")) {
      return line.substring(4).trim();
    }
    // Stop if we hit a level 3 subsection
    if (line.startsWith(Constants.SUBSECTION)) {
      break;
    }
  }
  return null;
}
