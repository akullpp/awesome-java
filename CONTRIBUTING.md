# Contribution Guidelines

First and most importantly of all: Thank you for your interest in contributing to the Awesome Java list!

## Automated Workflow

This repository uses an automated workflow to maintain the main `README.md` file. Here's how it works:

### For Contributors

1. **Edit `CONTRIBUTE_README.md`** - Make all your changes to this file, not `README.md`
2. **Submit a Pull Request** - Create a PR with your changes to `CONTRIBUTE_README.md`
3. **GitHub Actions will automatically**:
   - Convert the list format to HTML tables
   - Add GitHub stars and last commit badges
   - Update `README.md` with the converted content
   - Commit and push the changes

### What NOT to do

- **Don't edit `README.md` directly** - It will be overwritten by the automated workflow
- **Don't edit the scripts** unless you're improving the conversion process
- **Don't manually run the conversion scripts** - GitHub Actions handles this

## How to Contribute

### Adding a New Project

1. **Find the appropriate section** in `CONTRIBUTE_README.md`
2. **Add your entry** using this format:
   ```markdown
   - [Project Name](https://github.com/user/repo) - Brief description of what the project does.
   ```
3. **Follow the existing style**
4. **Submit a Pull Request**

### Updating an Existing Project

1. **Find the project** in `CONTRIBUTE_README.md`
2. **Update the description** or URL as needed
3. **Submit a Pull Request** with your changes

### Adding a New Category

1. **Add the category** to the Contents section
2. **Create a new section** with the appropriate heading
3. **Add projects** to the new section
4. **Submit a Pull Request** with your changes

## Guidelines

### Project Requirements

- **Must be Java-related** - The project should be primarily for Java development
- **Must be actively maintained** - Recent commits and releases
- **Must be useful** - Provide value to Java developers

### Description Guidelines

- **Be concise** - Keep descriptions on point
- **Be descriptive** - Explain what the project does and why it's useful
- **Be accurate** - Ensure the description matches the current project state
- **Use proper grammar** - Write in clear, professional English

### Format Guidelines

- **Use consistent formatting** - Follow the existing style
- **Maintain alphabetical order** - Within each section
- **Use proper markdown** - Follow the established patterns
- **Include relevant links** - Link to GitHub repositories when possible

## Workflow Details

### GitHub Actions Workflow

The automated workflow (`update-readme.yml`) runs when:

- **Push to master** - When `CONTRIBUTE_README.md` or scripts are updated
- **Pull Request** - When `CONTRIBUTE_README.md` or scripts are modified
- **Manual trigger** - Can be triggered manually from the Actions tab

### File Structure

```
├── CONTRIBUTE_README.md    # Source file (edit this)
├── README.md              # Generated file (don't edit)
├── scripts/
│   ├── run_workflow.java           # Main workflow orchestrator
│   ├── step_1_validate_input.java  # Input validation
│   ├── step_2_parse_projects.java  # Project parsing
│   ├── step_3_generate_badges.java # Badge generation
│   ├── step_4_generate_tables.java # HTML table generation
│   ├── step_5_assemble_readme.java # Final assembly
│   ├── step_6_validate_transformation.java # Data integrity validation
│   ├── ProjectEntry.java           # Data model
│   ├── FileUtils.java              # Utility functions
│   ├── Constants.java              # Shared constants
│   └── README.md                   # Script documentation
├── .tmp/                          # Temporary files (auto-generated)
│   ├── parsed-projects.txt
│   ├── github-badges.txt
│   └── generated-tables.html
└── .github/workflows/
    └── update-readme.yml           # GitHub Actions workflow
```

### Workflow Process

The README generation follows a 6-step modular process:

1. **Step 1 - Input Validation** (`step_1_validate_input.java`)
   - Validates that `CONTRIBUTE_README.md` exists and is readable
   - Provides file statistics

2. **Step 2 - Project Parsing** (`step_2_parse_projects.java`)
   - Parses markdown content to extract project entries
   - Handles multi-line descriptions
   - Outputs: `parsed-projects.txt`

3. **Step 3 - Badge Generation** (`step_3_generate_badges.java`)
   - Generates GitHub badges for repositories
   - Creates stars and last-commit badges
   - Outputs: `github-badges.txt`

4. **Step 4 - Table Generation** (`step_4_generate_tables.java`)
   - Combines parsed projects with badges
   - Generates HTML tables with proper styling
   - Outputs: `generated-tables.html`

5. **Step 5 - Final Assembly** (`step_5_assemble_readme.java`)
   - Combines original content with generated tables
   - Produces the final `README.md`

6. **Step 6 - Validation** (`step_6_validate_transformation.java`)
   - Validates that all entries from original are present in transformed README
   - Ensures entries are in the correct sections
   - Reports missing entries, wrong sections, and extra entries

### Running the Workflow

**Complete Workflow:**
```bash
java --enable-preview --source 25 scripts/run_workflow.java
```

**Individual Steps:**
```bash
java --enable-preview --source 25 scripts/run_workflow.java [step_number]
```

**Direct Step Execution:**
```bash
java --enable-preview --source 25 scripts/step_1_validate_input.java
java --enable-preview --source 25 scripts/step_2_parse_projects.java
# ... etc
```

## 🐛 Troubleshooting

### Common Issues

1. **Workflow fails** - Check the Actions tab for error details
2. **Badges not showing** - Ensure the repository URL is correct
3. **Formatting issues** - Check that your markdown is valid
4. **Validation fails** - Step 6 validates data integrity:
   - Missing entries: Projects in original but not in final README
   - Wrong sections: Projects in different sections than expected
   - Extra entries: Projects in final README but not in original
5. **Section mapping issues** - Ensure projects are in the correct sections

### Getting Help

- **Open an issue** - For questions or problems
- **Check existing issues** - Your question might already be answered
- **Review the workflow logs** - In the Actions tab

## 📄 License

By contributing to this project, you agree that your contributions will be licensed under the same license as the project.

---

**Remember**: Always edit `CONTRIBUTE_README.md`, never `README.md` directly!
