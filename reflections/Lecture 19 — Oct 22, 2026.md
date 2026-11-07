# Lecture 19 — Oct 22, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand why GitHub is a professional document that is read before the resume
- [ ] Know the five grading criteria: README, folder structure, commit messages, Javadoc, automated testing
- [ ] Know what a good README contains (plain-language purpose, screenshots/GIFs, prerequisites, reproducible build and run steps)
- [ ] Know the standard Maven layout and what `.gitignore` must exclude
- [ ] Know the Conventional Commit prefixes and write messages in the imperative mood
- [ ] Know what good Javadoc documents (`@param`, `@return`, `@throws`) and what it should not restate
- [ ] Understand why tests must be wired into the Maven build so `mvn test` passes or halts the build
- [ ] Know to verify README visuals render for someone outside my own account/device
- [ ] Understand why authorship matters (whose name is on the work)

## Questions discussed in class

- What does a recruiter or interviewer see first when they open a repository?
- Does each README explain what the project does and how to run it?
- Does the folder structure follow the Maven standard so tools work without manual configuration?
- Do commit messages read as an audit trail or a personal diary?
- Is the code documented with meaningful Javadoc?
- Are the tests actually wired into the build?

## Key takeaways

- No presentations this session; it was a review of the GitHub repositories themselves. The professor's framing: your GitHub profile is the document a recruiter or interviewer looks at **before** your resume. A clean, well-maintained GitHub tells a story that a PDF cannot.
- The five criteria answer five questions an evaluator has on opening an unfamiliar repo: **README** (what is this and how do I run it?), **folder structure** (is it maintainable and tool-compatible?), **commit messages** (how was this built?), **Javadoc** (can the code be read and used without decoding the implementation?), **tests** (does it hold up and can it be changed safely?).
- Maven standard layout: `pom.xml`, `.gitignore`, `README.md`, `src/main/java`, `src/main/resources` (FXML, CSS, images, configs), `src/test/java`. Deviating actively breaks build tools, IDEs, and CI. Builds on Lectures 3, 6, and 6.
- Conventional commits (`feat`, `fix`, `docs`, `refactor`, `test`, `chore`) in imperative mood: "fix: handle empty list input in matcher" instead of "fixed bug".
- Javadoc sits below the README and above inline comments: it documents each method's contract, not what the name already says.
- Tests belong to the evaluated artifact, not an add-on; this ties to unit vs integration testing from Lecture 7.
- GitHub activity is cumulative and timestamped; it cannot be manufactured at the last minute, so the best time to build a strong record is while actually working on the project.
- Groups 1–6 were reviewed against all five criteria (Groups 7–12 in the next session). The review showed these criteria are visible to anyone before a line of code is read.
- Several READMEs had GIFs that showed as broken links. Always check what you pushed from a different browser or account.
- Authorship matters: when an AI assistant shows up as a named contributor on a project submitted under your own name, that is a different question from simply using AI help. It is part of what is evaluated, especially in an academic and early-career context.
- For our list matching project, apply the checklist: README with screenshot and run steps, standard layout, conventional commits from now on, Javadoc for the matching and drawing methods, and tests for the matching logic.
