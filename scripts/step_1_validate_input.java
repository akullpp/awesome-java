import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Validates that the input file exists and is readable.
 *
 * Usage: java step_1_validate_input.java [input_file]
 */
void main(String[] args) throws IOException {
  var inputPath = args.length > 0 ? Path.of(args[0]) : Path.of(Constants.CONTRIBUTE_README_FILE);

  System.out.println("Step 1: Validating input file...");
  System.out.printf("Input file: %s%n", inputPath.toAbsolutePath());

  if (!Files.exists(inputPath) || !Files.isReadable(inputPath)) {
    System.err.printf("ERROR: File '%s' does not exist or is not readable.%n", inputPath);
    System.exit(1);
  }
  System.out.println("SUCCESS: Input file validation passed!");

  var attrs = Files.readAttributes(inputPath, BasicFileAttributes.class);
  System.out.printf(
    "File size: %d bytes, Last modified: %s%n",
    attrs.size(),
    attrs.lastModifiedTime()
  );
}
