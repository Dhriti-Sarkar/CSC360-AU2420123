# Lecture 13 — Sep 17, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know the faculty's team Git advice: commit often, push before pulling, communicate before touching shared files
- [ ] Understand why merge conflicts are as much a communication problem as a technical one
- [ ] Understand why cross-platform testing (Windows + Mac) must be repeated, not done once
- [ ] Know the next features agreed for the list matching project: dark/light theme toggle, drag-and-drop reordering of list items, UI refresh
- [ ] Understand how a runtime theme toggle works in JavaFX (swapping stylesheets)
- [ ] Understand the basics of the JavaFX drag-and-drop API
- [ ] Understand where AI-generated UI is strong (conventions) and where humans add value (intentional deviation, creative direction)
- [ ] Know the plan: ideation now, individual take-home tasks, implementation after exams (Sep 19–27)

## Questions discussed in class

- Is the team pushing to GitHub regularly?
- Are people following practices that avoid merge conflicts while working independently on their own branches?
- Does the project run correctly on every team member's machine (three Windows, one Mac)?
- What should the next version of the list matching project include beyond the basic functional version?
- How should the UI move from the plain default look to a cleaner, modern, tech-themed one?

## Key takeaways

- This was a project lab with no new teaching content and no code written or committed. Planning and task distribution were the deliverable.
- Faculty's Git guidance: commit often, push before pulling, and talk before touching shared files. Clearly defined individual responsibilities prevent most conflicts. This builds on the mechanics from Lectures 2–4 and the governance rules from Lecture 8.
- The cross-platform check confirmed the list matching project runs on both Windows and Mac. Risk areas are file path handling, font rendering and canvas drawing differences, and JavaFX behaviour quirks. It needs re-testing whenever the codebase changes significantly.
- Agreed features: dark/light theme toggle (separate stylesheets swapped at runtime), drag-and-drop reordering of list items, and a UI redesign with a brighter, cleaner tech aesthetic.
- Dark mode and drag-and-drop are expected in mature apps (VS Code, Notion, Figma).
- AI produces correct, convention-following but generic UI. Humans supply intentional deviation and creative direction. This matches Jakob's Law from CSE519 HCI: borrow conventions, then add something of your own.
- Exams run Sep 19–27, so the work is split into equal take-home tasks to be picked up afterwards.
- Challenging part: cross-platform behaviour is a recurring check, not a one-time one.
