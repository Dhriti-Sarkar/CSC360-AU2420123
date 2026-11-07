# GitHub Repository Standards: The Five Criteria (explained simply)

A repository is a "silent resume": a recruiter or interviewer sees it, and your contribution graph, before they read a CV. The professor graded repositories on five criteria, each answering a question an evaluator asks when opening an unfamiliar project.

| # | Criterion | The question it answers |
|---|---|---|
| 1 | **README** | What is this, and how do I run it? |
| 2 | **Folder structure** | Is it maintainable and compatible with tools? |
| 3 | **Commit messages** | How was this built, and did the authors understand each step? |
| 4 | **Javadoc** | Can the code be read and used without decoding every detail? |
| 5 | **Automated tests** | Does it hold up on edge cases, and can it be changed safely? |

## 1. README
Plain-language purpose, a screenshot or GIF of it working, prerequisites and system requirements, and reproducible build and run steps (see [readme-vs-wiki-documentation](readme-vs-wiki-documentation.md) and [markdown-standards](markdown-standards.md)). **Check the visuals render for an outside viewer**: a broken GIF is worse than none. Open the repo in a private window or another account.

## 2. Folder structure (Maven standard)

```
project-root/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    ├── main/
    │   ├── java/          ← production source code
    │   └── resources/     ← FXML, CSS, images, configs
    └── test/
        └── java/          ← unit and integration tests
```

Build tools, IDEs, and CI pipelines rely on this ([maven-lifecycle](maven-lifecycle.md), [maven-and-javafx-setup](maven-and-javafx-setup.md)). `.gitignore` must exclude build output (`target/`) and IDE metadata ([gitignore-and-env-files](gitignore-and-env-files.md)).

## 3. Commit messages
Conventional prefixes, imperative mood. See [conventional-commits-and-javadoc](conventional-commits-and-javadoc.md).

## 4. Javadoc
The second level of documentation, below the README and above inline comments. See [conventional-commits-and-javadoc](conventional-commits-and-javadoc.md).

## 5. Automated testing
Unit and integration tests ([unit-vs-integration-testing](unit-vs-integration-testing.md)) wired into the Maven lifecycle so `mvn test` either passes or halts the build, which is also how CI (Jenkins, GitHub Actions) blocks bad merges ([maven-ci-cd-pipeline](maven-ci-cd-pipeline.md)). Tests are part of the evaluated artifact.

## Why it matters
- Activity is **cumulative and timestamped**: it can't be faked before a job application. Build the history while working.
- Recruiters use GitHub as a complement to, or replacement for, a portfolio.
- Clients check the repository directly before signing off a deliverable.
- **Authorship:** the contributors list is part of the record. An AI assistant listed as a named contributor on work submitted under your name raises a question about whose work it is.

## Applying it to the list matching project
README with screenshot and run steps, standard Maven layout, conventional commits, Javadoc on the matching and drawing methods, and unit tests for the matching logic (empty lists, duplicates, no matches). See [list-matching-project-overview](list-matching-project-overview.md).

## Key takeaway
> README, folder structure, commits, Javadoc, and tests each answer a question an evaluator asks. Together they decide whether a repo reads as professional work or a student submission.
