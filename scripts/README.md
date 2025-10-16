# README Processing Scripts

This directory contains a modular workflow for processing the `CONTRIBUTE_README.md` file into a formatted `README.md` with HTML tables and GitHub badges.

## Workflow Steps

The processing is split into 6 logical steps, each with its own script:

### 1. Input Validation (`1-validate-input.java`)
- Validates that `CONTRIBUTE_README.md` exists and is readable
- Provides file statistics
- **Output**: Validation status

### 2. Project Parsing (`2-parse-projects.java`)
- Parses markdown content to extract project entries
- Handles multi-line descriptions
- **Input**: `CONTRIBUTE_README.md`
- **Output**: `parsed-projects.txt`

### 3. Badge Generation (`3-generate-badges.java`)
- Generates GitHub badges for repositories
- Creates stars and last-commit badges
- **Input**: `parsed-projects.txt`
- **Output**: `github-badges.txt`

### 4. Table Generation (`4-generate-tables.java`)
- Combines parsed projects with badges
- Generates HTML tables with proper styling
- **Input**: `parsed-projects.txt`, `github-badges.txt`
- **Output**: `generated-tables.html`

### 5. Final Assembly (`5-assemble-readme.java`)
- Combines original content with generated tables
- Produces the final `README.md`
- **Input**: `CONTRIBUTE_README.md`, `generated-tables.html`
- **Output**: `README.md`

### 6. Validation (`6-validate-transformation.java`)
- Validates that all entries from original README are present in transformed README
- Ensures entries are in the correct sections
- Reports missing entries, wrong sections, and extra entries
- **Input**: `CONTRIBUTE_README.md`, `README.md`
- **Output**: Validation report

## Usage

### Run Complete Workflow
```bash
java --enable-preview --source 25 scripts/run_workflow.java
```

### Run Individual Steps
```bash
# Run step 1 (validation)
java --enable-preview --source 25 scripts/run_workflow.java 1

# Run step 2 (parsing) with custom input
java --enable-preview --source 25 scripts/run_workflow.java 2 custom-input.md

# Run step 3 (badge generation)
java --enable-preview --source 25 scripts/run_workflow.java 3

# Run step 6 (validation)
java --enable-preview --source 25 scripts/run_workflow.java 6
```

### Run Steps Directly
```bash
# Validate input
java --enable-preview --source 25 scripts/step_1_validate_input.java

# Parse projects
java --enable-preview --source 25 scripts/step_2_parse_projects.java CONTRIBUTE_README.md .tmp/parsed-projects.txt

# Generate badges
java --enable-preview --source 25 scripts/step_3_generate_badges.java .tmp/parsed-projects.txt .tmp/github-badges.txt

# Generate tables
java --enable-preview --source 25 scripts/step_4_generate_tables.java .tmp/parsed-projects.txt .tmp/github-badges.txt .tmp/generated-tables.html

# Assemble final README
java --enable-preview --source 25 scripts/step_5_assemble_readme.java CONTRIBUTE_README.md .tmp/generated-tables.html README.md

# Validate transformation
java --enable-preview --source 25 scripts/step_6_validate_transformation.java CONTRIBUTE_README.md README.md
```

## Benefits of Modular Approach

1. **Easy Debugging**: Each step can be run independently to identify where issues occur
2. **Incremental Processing**: Can re-run specific steps without re-processing everything
3. **Clear Separation**: Each script has a single responsibility
4. **Better Error Handling**: Failures are isolated to specific steps
5. **Maintainability**: Easier to modify individual steps without affecting others

## Temporary Files

The workflow creates several temporary files in the `.tmp/` directory:
- `.tmp/parsed-projects.txt` - Parsed project entries
- `.tmp/github-badges.txt` - Badge mappings
- `.tmp/generated-tables.html` - Generated HTML tables

These files are intermediate outputs and can be safely deleted after processing. The `.tmp/` directory is automatically created if it doesn't exist.

## Dependencies

- Java 25+ (uses modern Java features like records and switch expressions)
- No external dependencies required

## GitHub Actions Integration

The workflow is now integrated with GitHub Actions and runs as separate steps:

1. **Step 1 - Validate Input**: Ensures CONTRIBUTE_README.md exists
2. **Step 2 - Parse Projects**: Extracts project entries from markdown
3. **Step 3 - Generate Badges**: Creates GitHub badges for repositories
4. **Step 4 - Generate Tables**: Combines projects with badges into HTML tables
5. **Step 5 - Assemble README**: Produces the final README.md
6. **Step 6 - Validate Transformation**: Ensures all entries are present and in correct sections

Each step runs independently in the GitHub Actions workflow, making it easy to identify where issues occur if the workflow fails.
