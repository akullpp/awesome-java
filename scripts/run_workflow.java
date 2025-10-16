import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Orchestrates the entire README processing workflow by running each step in sequence.
 *
 * Usage:
 *   java run-workflow.java                    # Run complete workflow
 *   java run-workflow.java [step]             # Run specific step (1-5)
 *   java run-workflow.java [step] [input]     # Run step with custom input
 */
void main(String[] args) {
  try {
    var startTime = System.currentTimeMillis();

    if (args.length == 0) {
      // Run complete workflow
      runCompleteWorkflow();
    } else {
      // Run specific step
      var step = Integer.parseInt(args[0]);
      var input = args.length > 1 ? args[1] : null;
      runStep(step, input);
    }
    var duration = System.currentTimeMillis() - startTime;
    System.out.printf("Total execution time: %dms%n", duration);
  } catch (Exception e) {
    var errorMessage = e.getMessage();
    System.err.printf("ERROR: Workflow failed: %s%n", errorMessage);
    e.printStackTrace();
    System.exit(1);
  }
}

/**
 * Runs the complete workflow
 */
void runCompleteWorkflow() throws IOException, InterruptedException {
    System.out.println("Starting complete README processing workflow...\n");

    // Step 1: Validate input
    System.out.println("=".repeat(50));
    runStep(1, null);

    // Step 2: Parse projects
    System.out.println("=".repeat(50));
    runStep(2, null);

    // Step 3: Generate badges
    System.out.println("=".repeat(50));
    runStep(3, null);

    // Step 4: Generate tables
    System.out.println("=".repeat(50));
    runStep(4, null);

    // Step 5: Assemble final README
    System.out.println("=".repeat(50));
    runStep(5, null);

    // Step 6: Validate transformation
    System.out.println("=".repeat(50));
    runStep(6, null);

    System.out.println("=".repeat(50));
    System.out.println("Workflow completed successfully!");
}

/**
 * Runs a specific step
 */
void runStep(int step, String input) throws IOException, InterruptedException {
  var command = switch (step) {
    case 1 -> buildCommand(
      "step_1_validate_input.java",
      input != null ? input : Constants.CONTRIBUTE_README_FILE
    );
    case 2 -> buildCommand(
      "step_2_parse_projects.java",
      input != null ? input : Constants.CONTRIBUTE_README_FILE,
      Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE
    );
    case 3 -> buildCommand(
      "step_3_generate_badges.java",
      Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE,
      Constants.TMP_DIR + "/" + Constants.GITHUB_BADGES_FILE
    );
    case 4 -> buildCommand(
      "step_4_generate_tables.java",
      Constants.TMP_DIR + "/" + Constants.PARSED_PROJECTS_FILE,
      Constants.TMP_DIR + "/" + Constants.GITHUB_BADGES_FILE,
      Constants.TMP_DIR + "/" + Constants.GENERATED_TABLES_FILE
    );
    case 5 -> buildCommand(
      "step_5_assemble_readme.java",
      input != null ? input : Constants.CONTRIBUTE_README_FILE,
      Constants.TMP_DIR + "/" + Constants.GENERATED_TABLES_FILE,
      Constants.README_FILE
    );
    case 6 -> buildCommand(
      "step_6_validate_transformation.java",
      input != null ? input : Constants.CONTRIBUTE_README_FILE,
      Constants.README_FILE
    );
    default -> throw new IllegalArgumentException("Invalid step: %d. Must be 1-6.".formatted(step));
  };
  System.out.printf("Running Step %d...%n", step);

  var processBuilder = new ProcessBuilder(command);
  processBuilder.directory(Path.of(".").toFile());

  var process = processBuilder.start();
  var exitCode = process.waitFor();

  if (exitCode != 0) {
    throw new RuntimeException("Step %d failed with exit code: %d".formatted(step, exitCode));
  }
  System.out.printf("Step %d completed successfully!%n", step);
}

/**
 * Builds a command array for running a script.
 */
String[] buildCommand(String scriptName, String... args) {
  var baseCommand = List.of(
    "java",
    "--enable-preview",
    "--source",
    "25",
    "scripts/" + scriptName
  );
  var allArgs = List.of(args);

  return Stream.concat(baseCommand.stream(), allArgs.stream())
               .toArray(String[]::new);
}
