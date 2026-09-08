# Lecture 06 — Aug 27, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand the full javac compilation path: .java → .class → .jar
- [ ] Know why compiled/binary files should never be committed to Git
- [ ] Understand how pom.xml drives compilation via maven-compiler-plugin
- [ ] Know what maven-jar-plugin / maven-shade-plugin actually do
- [ ] Understand what MANIFEST.MF is and why it matters for a runnable JAR
- [ ] Understand the standard CI/CD pipeline flow, step by step
- [ ] Know why UTF-8 is backwards-compatible with ASCII and UTF-16 is not
- [ ] Understand endianness and Byte Order Marks (BOM) in UTF-16
- [ ] Know the difference between unit testing and integration testing
- [ ] Understand session-based auth vs JWT (stateful vs stateless)
- [ ] Know what a Proof of Concept (POC) is and why it matters in interviews
- [ ] Learn the strategy for handling ambiguous interview questions

## Questions discussed in class

- What exactly does javac do to a .java file, and what's inside a .class file?
- Why should compiled/binary files never be committed to a Git repository?
- How does pom.xml actually control the compilation and packaging process?
- What's inside a JAR's MANIFEST.MF file, and why does it matter?
- What does a full CI/CD pipeline look like, step by step, from push to deployment?
- Why not just use UTF-16 everywhere, since it can represent all of Unicode too?
- Why is UTF-8 backwards-compatible with ASCII but UTF-16 isn't?
- What is endianness, and why does UTF-16 need a Byte Order Mark (BOM) but UTF-8 doesn't?
- What's the actual difference between unit tests and integration tests?
- What's the difference between session-based authentication and JWT-based authentication?
- What is a Proof of Concept (POC), and why should it come before optimization?
- How should you handle a technical interview question you're unsure about?

## Key takeaways

- The .java → .class → .jar pipeline finally explains exactly what my `mvn package` command has been doing behind the scenes this whole semester.
- The Git hygiene rule here (never commit compiled binaries) is the same principle behind the .gitignore setup I already did for target/ and .idea/ back in Lecture 3/4 — this lecture explains the deeper "why."
- UTF-8 vs UTF-16 connects directly back to the character set notes from earlier — UTF-8/UTF-16 are specific *encodings* of the Unicode character set I already learned about.
- Unit vs integration testing builds directly on the unit vs acceptance testing distinction I already asked about — integration testing sits somewhere in between those two.

