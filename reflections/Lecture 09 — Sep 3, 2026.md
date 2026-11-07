# Lecture 09 — Sep 3, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand the tradeoffs between printing an ASCII tree vs drawing a graphical one (revisit my earlier notes on this)
- [ ] Know what a "headless" system is and why text is essential for it
- [ ] Understand why CLI tools are more composable/scriptable than GUI tools
- [ ] Understand why visual arrow-mapping between lists is easier for humans than scanning text (directly relevant to my own project!)
- [ ] Know what FXML is and how it separates layout from logic in JavaFX
- [ ] Understand the standard components of a splash screen (branding, async preloading, stage transition)
- [ ] Understand TreeView and the master-detail UI pattern
- [ ] Know what object serialization/deserialization means, and the two formats mentioned (JSON, ObjectOutputStream)
- [ ] Understand why heavy background work can't run on the JavaFX Application Thread
- [ ] Know what ExecutorService and Task<V> are used for
- [ ] Understand how safe task cancellation works (checking interrupt status)

## Questions discussed in class

- What are the practical tradeoffs between printing an ASCII tree and drawing a graphical tree?
- What is a "headless" system, and why does text remain essential for it?
- Why do command-line interfaces offer more composability and scripting power than GUIs?
- Why is visually mapping arrows between two lists easier for humans than manually scanning text for matches?
- What is FXML, and how does it separate UI layout from business logic in JavaFX?
- What are the core components needed to build a proper splash screen?
- What is a master-detail UI pattern, and how does TreeView fit into it?
- What is object serialization, and what formats can it use in Java?
- Why can't heavy background work run directly on the JavaFX Application Thread?
- What are ExecutorService and Task<V>, and how do they relate to the EDT concept from Lecture 7?
- How do you safely cancel a running background task without destabilizing the app?

## Key takeaways

- The ASCII-tree-vs-graphics-tree discussion is literally the same topic I already worked through with Claude a few weeks ago — good to see it reinforced in class with more formal vocabulary (headless systems, remote accessibility via SSH).
- Group 5's "dynamic arrow mapping" project is essentially the exact same concept as my own list-arrows project — visualizing common elements between two lists using arrows. Worth comparing notes with that group.
- The Task<V> + ExecutorService pattern is the JavaFX-specific version of the same EDT/background-thread safety rule from Lecture 7 — same core idea (don't block the UI thread), just with JavaFX's specific tools instead of Swing's SwingUtilities.invokeLater().

