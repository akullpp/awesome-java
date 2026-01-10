import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Common file operations used across multiple processing scripts.
 */
public class FileUtils {

  /**
   * Validates that a file exists and is readable.
   */
  public static void validateInputFile(Path inputPath) throws IOException {
    if (!Files.exists(inputPath)) {
      throw new IOException("ERROR: Input file not found at: %s".formatted(inputPath.toAbsolutePath()));
    }
    if (!Files.isReadable(inputPath)) {
      throw new IOException("ERROR: Input file is not readable: %s".formatted(inputPath.toAbsolutePath()));
    }
  }

  /**
   * Safely writes content to a file.
   */
  public static void writeOutputFile(Path outputPath, String content) throws IOException {
    try {
      Files.writeString(outputPath, content);
    } catch (IOException e) {
      throw new IOException("ERROR: Failed to write output file: %s".formatted(e.getMessage()), e);
    }
  }

  /**
   * Reads file content as string.
   */
  public static String readFileContent(Path inputPath) throws IOException {
    try {
      return Files.readString(inputPath);
    } catch (IOException e) {
      throw new IOException("ERROR: Failed to read input file: %s".formatted(e.getMessage()), e);
    }
  }

  /**
   * Gets file statistics.
   */
  public static String getFileStats(Path filePath) throws IOException {
    var lines = Files.lines(filePath).count();
    var size = Files.size(filePath);
    return "Lines: %d, Size: %d bytes".formatted(lines, size);
  }

  /**
   * Ensures the temporary directory exists.
   */
  public static Path ensureTmpDirectory() throws IOException {
    var tmpDir = Path.of(".tmp");
    if (!Files.exists(tmpDir)) {
      Files.createDirectories(tmpDir);
    }
    return tmpDir;
  }
}
