# Lecture 01 — Aug 4, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know that CSC360 is two courses in one: computer graphics and digital image processing
- [ ] Explain how graphics differs from image processing (they run in opposite directions)
- [ ] Explain how lines and curves differ using rate of change (derivatives)
- [ ] Know the three Java graphical frameworks (AWT, Swing, JavaFX) and which one this course uses
- [ ] Know that design patterns exist for building user interfaces, and how they connect to HCI (Jakob's Law)
- [ ] Know the difference between SSH and HTTPS for connecting to a remote Git repository
- [ ] Know how the course runs: project-based, group work tied to lectures, journal reflections submitted as Markdown on GitHub

## Questions discussed in class

- What is the difference between computer graphics and digital image processing?
- How is a line different from a curve at a fundamental level?
- What does the derivative of a line vs a curve tell us?
- What are the graphical frameworks in Java, and how do they relate?
- Is there a design pattern for building user interfaces?
- What is the difference between SSH and HTTPS for Git?
- How will reflections and projects be submitted?

## Key takeaways

- CSC360 is really two courses stitched together. **Computer graphics** creates images from mathematical models; **image processing** takes an image that already exists and works out what is in it or improves it. Seeing them as opposites made the combination make sense. (The image processing half begins properly in Lecture 11 and Lecture 22.)
- **Lines vs curves:** a line changes at a constant rate, so its derivative is always the same value; a curve's rate of change keeps varying along it, so its derivative changes from point to point. This is calculus applied to drawing, and the starting point for how a computer draws curves.
- **Java frameworks:** AWT came first and is limited; Swing fixed many of its issues and is still bundled with the Java runtime; JavaFX is the modern one, with proper support for animation and styled components, and is what the course uses. Nobody recommends AWT or Swing for new work, but they are still shipped with Java.
- **UI design patterns** exist because of how users behave, not just to keep code clean. Jakob's Law (from HCI): users spend most of their time on other sites, so they arrive with expectations, and following conventions respects what they already know.
- **SSH vs HTTPS:** both connect to a remote repository; SSH uses key-based authentication, HTTPS uses tokens or passwords. Worth knowing before pushing files regularly.
- Course format: project-based, with group work tied closely to the lectures. GitHub was set up on day one and reflections are submitted as Markdown files, which made it feel like a real workflow.
- Nearly every way we use a computer goes through a graphical interface, and the same idea underlies desktop apps, mobile apps, game engines, and browser rendering: turn a mathematical description of a shape into pixels.
- Challenging part: the Java frameworks overview. Hearing AWT, Swing, and JavaFX back to back with no code left gaps; I expect to understand the differences once we write real UI code.
