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

  // File patterns and markers
  public static final String ENTRY_PATTERN = "^\\s*-\\s*\\[.*";
  public static final Pattern PROJECT_PATTERN = Pattern.compile("^\\s*-\\s*\\[([^\\]]+)\\]\\(([^)]+)\\)\\s*-\\s*(.+)");
  public static final String INDENTED_LINE_PATTERN = "^\\s+.*";

  // File extensions and names
  public static final String PARSED_PROJECTS_FILE = "parsed-projects.txt";
  public static final String GITHUB_BADGES_FILE = "github-badges.txt";
  public static final String GENERATED_TABLES_FILE = "generated-tables.html";
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

  // HTML and styling
  public static final String TABLE_STYLE = "width:100%;table-layout:fixed;border-collapse:collapse;";
  public static final String NAME_CELL_STYLE = "width:20%;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;";
  public static final String DESC_CELL_STYLE = "width:58%;word-wrap:break-word;";
  public static final String BADGE_CELL_STYLE = "width:12%;text-align:center;vertical-align:middle;min-height:40px;padding:0;";

  // Badge URLs - Updated to remove labels
  public static final String GITHUB_STARS_BADGE_URL = "https://img.shields.io/github/stars/%s?style=for-the-badge&label=";
  public static final String GITHUB_LAST_COMMIT_BADGE_URL = "https://img.shields.io/github/last-commit/%s?style=for-the-badge&label=";

  // Default values
  public static final String NO_DESCRIPTION = "No description available";
  public static final String NO_BADGE = "-";
}
