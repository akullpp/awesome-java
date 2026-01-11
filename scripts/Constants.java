import java.util.regex.Pattern;

/**
 * Constants used across all processing scripts.
 */
public final class Constants {

  private Constants() {}

  // Markdown section markers
  public static final String SECTION = "## ";
  public static final String SUBSECTION = "### ";
  public static final String PROJECTS_SECTION = "## Projects";

  // Regex patterns
  public static final Pattern PROJECT_PATTERN = Pattern.compile("^\\s*-\\s*\\[([^\\]]+)\\]\\(([^)]+)\\)\\s*-\\s*(.+)");
  public static final Pattern GITHUB_REPO_PATTERN = Pattern.compile("https://github\\.com/([^)/\\s]+/[^)\\s#]+)");
  public static final Pattern MARKDOWN_LINK_PATTERN = Pattern.compile("\\[([^\\]]+)\\]\\(([^)]+)\\)");
  public static final Pattern STARS_PATTERN = Pattern.compile("\"stargazers_count\"\\s*:\\s*(\\d+)");
  public static final Pattern PUSHED_AT_PATTERN = Pattern.compile("\"pushed_at\"\\s*:\\s*\"([^\"]+)\"");
  public static final Pattern LICENSE_PATTERN = Pattern.compile("\"license\"\\s*:\\s*(?:null|\\{[^}]*\"spdx_id\"\\s*:\\s*\"([^\"]+)\"[^}]*\\})", Pattern.DOTALL);
  public static final String ENTRY_PATTERN = "^\\s*-\\s*\\[.*";
  public static final String INDENTED_LINE_PATTERN = "^\\s+.*";

  // File extensions and names
  public static final String PARSED_PROJECTS_FILE = "parsed-projects.txt";
  public static final String GITHUB_STATS_FILE = "github-stats.txt";
  public static final String GENERATED_TABLES_FILE = "generated-tables.md";
  public static final String CONTRIBUTE_README_FILE = "CONTRIBUTE_README.md";
  public static final String README_FILE = "README.md";

  // Temporary directory
  public static final String TMP_DIR = ".tmp";

  // File content markers
  public static final String SECTION_SEPARATOR = "---";
  public static final String HTML_COMMENT_PREFIX = "<!--";
  public static final String SECTION_COMMENT_PREFIX = "<!-- SECTION:";
  public static final String END_PROJECTS_SECTION_COMMENT = "<!-- END_PROJECTS_SECTION -->";
  public static final String NAME_PREFIX = "NAME:";
  public static final String URL_PREFIX = "URL:";
  public static final String DESC_PREFIX = "DESC:";
  public static final String SKIP_PREFIX = "SKIP:";
  public static final String SECTION_PREFIX = "SECTION:";
  public static final String REPO_PREFIX = "REPO:";
  public static final String STARS_PREFIX = "STARS:";
  public static final String COMMIT_PREFIX = "COMMIT:";
  public static final String LICENSE_PREFIX = "LICENSE:";

  // Default values
  public static final String NO_DESCRIPTION = "No description available";
  public static final String NO_STATS = "-";
  public static final String INVALID_REPO = "N/A";
}
