# Contribution Guidelines

## Suggest a Project

Edit [`README_SOURCE.md`](README_SOURCE.md), add one line under the best category,
and open one pull request:

```markdown
- [Project Name](https://github.com/owner/repository) - A concise, neutral description ending with a period.
```

Use the canonical GitHub repository when one exists. The generated `README.md`
handles ordering, counts, stars and activity; contributors do not need to run
the generator.

A project should:

- make Java a primary API, runtime, implementation target or substantial
  first-class integration;
- be noteworthy because it is widely recommended, innovative, unique or fills
  a useful niche;
- provide English documentation and clearly disclose its license;
- disclose restrictive, noncommercial or source-available terms in the entry;
- have clear pricing and a free tier when commercial.

Known GitHub SPDX licenses appear automatically; do not add license or
commercial badges manually. Keep descriptions short, factual and distinctive
from similar entries. Use `Miscellaneous` only when no focused category fits.

Search existing entries and issues before submitting. Self-promotion is
reviewed carefully but is welcome when the project meets the same criteria.
Use one pull request per project.

## Suggest a Resource

Add one resource under the best group in [`README_SOURCE.md`](README_SOURCE.md):

```markdown
- [Resource Name](https://canonical.example)
```

An optional description may follow the link:

```markdown
- [Resource Name](https://canonical.example) - A concise, neutral description ending with punctuation.
```

Resources include books, podcasts, people, communities, related lists and
websites. They must be current, relevant to Java or the JVM, use a canonical
HTTPS link, fit the chosen group and use English where prose is involved.
Search for duplicates and submit one resource per pull request. Contributors
do not need to run the generator.

## Maintainer Notes

Most entries point directly to one GitHub repository. For an umbrella project
whose Java offering genuinely spans several repositories, keep its public
homepage and append maintainer-only metadata:

```markdown
- [Project](https://example.com) - Description. <!-- github: owner/one, owner/two -->
```

Use at least two canonical repositories. A repository may belong to only one
entry. The generator sums their stars, uses their most recent push for activity
and shows a license only when every repository reports the same SPDX license.
It rejects malformed metadata, duplicate repository use and archived
repositories.

## License

Catalog and documentation contributions are licensed under
[CC BY-SA 4.0](LICENSE). Automation code and configuration are licensed under
the [MIT License](LICENSE-CODE). By contributing, you agree that your changes
are available under the applicable license.
