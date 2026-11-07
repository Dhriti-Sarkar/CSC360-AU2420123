# Lecture 10 — Sep 8, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know the five prescribed textbooks and which one to use for which topic
- [ ] Know the relevant Core Java Vol. I chapters: Ch. 7 (exceptions, assertions, logging), Ch. 8 (generics), Ch. 9 (Collections Framework)
- [ ] Understand view-only access and Java's unmodifiable wrappers
- [ ] Understand the Java Collections Framework hierarchy (Iterable → Collection → List/Set/Queue, Map separate)
- [ ] Understand how JavaFX events travel through the scene graph in two phases (capturing and bubbling)
- [ ] Know the difference between an event filter (downward phase) and an event handler (upward phase), and what event consumption does
- [ ] Understand why a layout must reorganize itself on window resize (GridPane, VBox, HBox)
- [ ] Know the design intent behind checkboxes, radio buttons, sliders, and dialog boxes
- [ ] Understand the Master-Detail pattern and why it avoids loading everything at once
- [ ] Know what Groups 9–12 are building (Swing + JavaFX mix, Master-Detail, real-time shape styling, WebView/WebEngine DOM control)

## Questions discussed in class

- Which of the five prescribed books should be used for which part of the course?
- What do Chapters 7, 8, and 9 of Core Java Vol. I cover?
- How can code expose data to other parts of a program without allowing them to modify it?
- How do events travel through the JavaFX scene graph, and what is the difference between capturing and bubbling?
- When should you use an event filter versus an event handler?
- How should a layout behave when the window is resized, shrunk, or stretched?
- What is the difference between a checkbox and a radio button, and when is a slider the right control?
- Why do dialog boxes exist, and when should an app force the user to respond?
- Why shouldn't a library website with ten million articles load all of them at once?
- How can a JavaFX button directly modify a browser DOM object (WebView / WebEngine)?

## Key takeaways

- The Collections Framework is a hierarchy: `Iterable` at the root, `Collection` branching into `List`, `Set`, and `Queue`, with `Map` as a separate key-value branch. This gives the context for Lecture 9's Stack vs Queue discussion — Queue is one of the three main branches, and Stack is a legacy class built on `Vector`.
- Unmodifiable wrappers are a concrete Java implementation of separating read access from write access — familiar from DSA, now as a design pattern for keeping shared state safe.
- JavaFX events do not jump straight to their target: they go **down** from root to target (capturing — filters intercept) and then **back up** (bubbling — handlers respond). This is the formal structure behind the mouse listener used to draw arrows between circles in Lecture 9.
- Checkboxes, radio buttons, sliders, and dialog boxes are *affordances*, not just widgets — each signals a different kind of interaction before the user reads a label (ties directly into CSE519 HCI).
- Master-Detail (list on one side, details on the other) is everywhere — Gmail, Outlook, file managers — and builds on the TreeView master-detail idea from Lecture 9.
- Group 12's WebView/WebEngine project is essentially a stripped-down version of how browser extensions work: an external program reaching into the browser's DOM and changing it.
- Course expectations: class participation, attention in sessions, assigned reading, and take-home activities carry equal weight — strong assignment output alone doesn't compensate for disengagement.
- The event hierarchy was the hardest part of this session — likely to only fully click while debugging a real nested UI (filter vs handler, which phase, what happens on consume).
