# Lecture 13 — Sep 29, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know that this was the last in-class project session (no lecture, group-by-group design reviews)
- [ ] Know the final feature agreed for the list matching project: a splash screen
- [ ] Understand the JavaFX `Preloader` approach to splash screens, and the simpler alternative (a separate `Stage` with a fade transition)
- [ ] Understand the difference between a README (elevator pitch) and a Wiki (depth)
- [ ] Understand why documentation is part of the product, not an add-on
- [ ] Understand writing documentation "outside-in" vs building "inside-out"
- [ ] Know when a feature is "good enough to ship" close to a deadline

## Questions discussed in class

- How is each group's visual interface coming along?
- Is anything still unclear before the final submission?
- Is there anything still worth adding to the project?
- Does a splash screen need more than the project name and a loading indicator?
- What should go in the README and what in the Wiki on the GitHub repository?

## Key takeaways

- This was the last dedicated in-class project session. Our project was almost done, so the conversation with the professor was short, and the group agreed on one final feature: a splash screen.
- A splash screen appears briefly at launch before the main window. In JavaFX the standard way is a `Preloader`, a separate class run before the main `Application`. A simpler option is a separate `Stage` with a short fade transition that closes before the main `Scene` appears. Builds on the splash screen components from Lecture 8.
- For our project it is mainly a branding moment: the project name and a brief loading state before the list matching UI appears. It gives the app a proper entry point so it feels finished rather than a prototype.
- The UI rework planned in Lecture 12 is now visible. The earlier version was flat, white, and utilitarian; the redesign is cleaner and better proportioned, and makes the project feel finished.
- Work split: part of the group implemented the splash screen, the rest started the README and the Wiki on GitHub.
- README = a couple-of-minutes pitch (what it is, what it does, how to run it). Wiki = depth (architecture decisions, feature explanations, known limitations, contribution steps). Mixing them gives a README that is too long and a Wiki that repeats it.
- Writing documentation forces an outside-in view of the project and surfaces parts that are still unclear even to the builders.
- Challenging part: judging when a feature is good enough to ship this close to submission.
