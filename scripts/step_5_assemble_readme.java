import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Assembles the final README.md by combining the original content with generated HTML tables.
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
 * Replaces project sections with HTML tables.
 */
String assembleReadme(String originalContent, String tablesContent) {
  var lines = originalContent.split("\n");
  var result = new StringBuilder();
  var inProjectSection = false;
  var allTables = tablesContent.split("</table>");
  // Filter out empty tables
  var tables = java.util.Arrays.stream(allTables)
    .filter(t -> t.trim().length() > 0)
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
    // Handle sub-subsection headers (####)
    if (line.startsWith("#### ")) {
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
    // Replace list items with HTML tables
    if (line.matches(Constants.ENTRY_PATTERN)) {
      // Find the current subsection
      var currentSubsection = findCurrentSubsection(lines, i);
      if (currentSubsection != null && sectionToTableMap.containsKey(currentSubsection)) {
        result.append(sectionToTableMap.get(currentSubsection)).append("</table>\n\n");
      }
      // Skip remaining list items in this subsection until we hit the next subsection or end delimiter
      while (i + 1 < lines.length &&
             !lines[i + 1].startsWith(Constants.SUBSECTION) &&
             !lines[i + 1].startsWith("#### ") &&
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
      .filter(line -> line.contains("img.shields.io"))
      .count();
}

/**
 * Creates a mapping of section names to their corresponding HTML tables.
 */
Map<String, String> createSectionToTableMap(String[] tables) {
  var sectionToTableMap = new HashMap<String, String>();

  for (var table : tables) {
    // Extract section name from the comment
    var lines = table.split("\n");
    for (var line : lines) {
      if (line.contains(Constants.SECTION_COMMENT_PREFIX)) {
        var sectionName = line.replace(Constants.SECTION_COMMENT_PREFIX, "").replace(" -->", "").trim();
        sectionToTableMap.put(sectionName, table);
        break;
      }
    }
  }

  return sectionToTableMap;
}

/**
 * Finds the current subsection by looking backwards from the given line index.
 * Handles both flat sections (###) and hierarchical sections (####).
 */
String findCurrentSubsection(String[] lines, int currentIndex) {
  String currentMainSection = null;
  String currentSubsection = null;

  for (int i = currentIndex; i >= 0; i--) {
    var line = lines[i];

    // Check for subsection (####) first
    if (line.startsWith("#### ") && currentSubsection == null) {
      currentSubsection = line.substring(5).trim();
    }

    // Check for main section (###)
    if (line.startsWith(Constants.SUBSECTION)) {
      currentMainSection = line.substring(Constants.SUBSECTION.length());
      break; // Stop when we find the main section
    }
  }

  // If we found both main section and subsection, return hierarchical name
  if (currentMainSection != null && currentSubsection != null) {
    return currentMainSection + " > " + currentSubsection;
  }

  // Otherwise return just the main section
  return currentMainSection;
}

