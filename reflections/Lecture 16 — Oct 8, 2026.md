# Lecture 16 — Oct 8, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know the format of the second round of presentations (live demos + interview-style Q&A, no new content from the faculty)
- [ ] Understand that the three groups chose different stacks: a pure console app, Java Swing with Graphics2D, and JavaFX with FXML
- [ ] Understand why the problem should drive the choice of tool, not the most sophisticated option available
- [ ] Know what FXML is and how it keeps UI layout separate from application logic
- [ ] Know how the matching elements of two lists can be found with `HashSet` operations
- [ ] Know how arrowheads can be drawn with `atan2` and curved arrows with `QuadCurve2D` in Graphics2D
- [ ] Know the real-world uses of tools that visually match two collections (data reconciliation, schema mapping, plagiarism detection)
- [ ] Be able to explain not just what my code does, but why it is structured that way

## Questions discussed in class

- Why did you choose this stack for this problem?
- Does the project need a GUI, or does it work better without one?
- How do you find the elements common to both lists?
- How are arrow direction and arrowhead angle calculated?
- How does a splash screen show loading progress?

## Key takeaways

- This was the second round of peer presentations, with the same interview-style Q&A as Lecture 15: probing decisions and edge cases after each demo.
- Technology choices varied a lot this round: a pure Java console application with no GUI, Java Swing with Graphics2D, and JavaFX structured with FXML. Each choice reflected how the group had thought about its problem before writing code.
- A console application is a valid deliverable when a GUI adds nothing to the core functionality. The right tool is the one that fits the problem, not the most sophisticated one available.
- Graphics2D (Java 2D) is genuinely versatile: it can draw curved relationship arrows, not just simple shapes. This connects to the Java 2D and Swing lectures from earlier (Lectures 4 and 5).
- Set intersection with `HashSet` plus custom 2D rendering brings together a data structure operation and drawing, two things the course covered separately. This is the same idea as our list matching project and the Lecture 8 arrow-mapping discussion.
- FXML is a declarative XML-based layout format that loads with `FXMLLoader` and separates layout from logic (Lecture 8). It is a good reference for the splash screen added in Lecture 13.
- The groups that answered the Q&A most confidently could explain why their code is structured the way it is, not just what it does.
- Observation session: nothing to implement or debug, so no personal technical challenge this time.
