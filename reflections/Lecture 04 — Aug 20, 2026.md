# Lecture 04 — Aug 20, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand what makes a "good" reflection note vs a superficial one
- [ ] Learn proper Markdown formatting: headers, tables, code blocks, blockquotes
- [ ] Know tools that let you preview Markdown without opening a full IDE
- [ ] Understand inheritance: what it means for one class to extend another
- [ ] Understand anonymous inner classes and why they're used for event handling
- [ ] Know the correct Java Swing architecture: JFrame vs JPanel, and how they nest
- [ ] Understand why paintComponent() needs super.paintComponent(g) at the start
- [ ] Know how to build a rectangle from two diagonal points
- [ ] Know how to build a triangle from three points, and why collinearity matters
- [ ] Review core Java syntax: imports, main method, naming conventions

## Questions discussed in class

- What separates a genuinely useful reflection note from a shallow summary?
- What Markdown formatting techniques make technical notes clearer (headers, tables, code blocks, blockquotes)?
- What tools can preview Markdown files without needing a full IDE?
- What does it mean for one class to "extend" another in Java?
- What is an anonymous inner class, and when is it useful?
- What is the correct architectural pattern for building a Java Swing GUI app — does a frame go inside a panel, or a panel inside a frame?
- Why is calling super.paintComponent(g) mandatory inside a custom paintComponent() override?
- How do you mathematically construct a rectangle from two diagonal corner points?
- How do you construct a triangle from three points, and why can't the points be collinear?
- What are Java's naming conventions for classes vs methods?

## Key takeaways

- Good reflection notes should capture actual understanding and connections between topics — not just restate what was said. Directly relevant to how I should be writing these files.
- Swing's structure is frame-contains-panel, not the other way around — easy to get backwards if you're new to it.
- The rectangle-from-two-points and triangle-from-three-points logic connects directly back to the centered-square math from Lecture 4 — both are about deriving a shape's actual drawing parameters from a simpler starting description.

## Open questions (carry to next class)

- (none yet — I wasn't in class, so I'll flag anything unclear once I go through this properly)