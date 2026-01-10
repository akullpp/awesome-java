/**
 * Represents a parsed project entry from the markdown file.
 */
public record ProjectEntry(
  String name,
  String url,
  String description,
  int linesToSkip,
  String section
) {
  /**
   * Checks if this is a GitHub repository.
   */
  public boolean isGitHubRepo() {
    return url != null && url.contains("github.com");
  }

  /**
   * Extracts GitHub repository name from URL.
   */
  public String getGitHubRepo() {
    if (!isGitHubRepo()) {
      return null;
    }
    var matcher = Constants.GITHUB_REPO_PATTERN.matcher(url);
    return matcher.find() ? matcher.group(1) : null;
  }
}
