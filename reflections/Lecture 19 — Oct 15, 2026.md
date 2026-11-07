# Lecture 19 — Oct 15, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know that this was the final round of group presentations, completing the project evaluation block
- [ ] Understand the master-detail pattern as driven by selection listeners (select in the list → detail panel updates)
- [ ] Know how a live search filter works on a master list
- [ ] Know the 2D transformations: translate, rotate, scale (and flip), and how they compose
- [ ] Understand why the pivot point matters for rotation and scaling
- [ ] Understand the difference between a node's position and its translate transform
- [ ] Understand the property-panel + live-preview pattern (sliders update immediately; typed values commit on Enter/Apply)
- [ ] Know the appearance controls for a shape: gradient fills (linear, radial), stroke styles, opacity, drop shadow, glow
- [ ] Understand why an empty README makes a project harder to follow, including in the Q&A

## Questions discussed in class

- Why did you structure it this way, and what would you do differently? (same interview-style Q&A as the earlier rounds)
- How does selecting an item in a list update a detail view?
- How are rotation and scaling applied around an object's centre?
- How should input validation keep an object on screen?
- How does the project's documentation help or hinder someone understanding it from outside?

## Key takeaways

- This was the fourth and final round of presentations. Across Lectures 16–19, all twelve groups presented, which concluded the evaluation block for the project work. The range of tools and problem domains was wider than I expected going in.
- The master-detail layout (list on one side, full record on the other, search bar filtering the list live) is one of the most common UI patterns in software: mail clients, music libraries, file explorers, e-commerce category pages. It follows how users browse a collection: scan, pick one, see everything. This builds on the pattern from Lecture 10 and the TreeView idea from Lecture 9.
- Master-detail is the JavaFX property/event model working as intended: a selection-changed listener on the master updates the detail panel, so the two stay decoupled.
- The most directly course-relevant project applied translate, rotate, scale, gradient fills, and effects to a shape through live controls. It showed the 2D transformation theory from the early Java 2D lectures turned into a working interface, which is why that material was taught.
- Professional tools (Illustrator's properties panel, Unity's inspector, SVG editors) work the same way: select an object and a panel exposes its transformable properties. Live preview for sliders with commit-on-Enter for typed values balances speed and precision.
- Image processing, the second half of the course (Lecture 11), builds on the same foundations: filters, thresholding, histogram analysis.
- An empty README is a real cost: without documentation context, the Q&A for that project was harder to follow. This ties to Lecture 14: documentation is part of the project.
- Groups that made the strongest impression were the ones that could explain why their project was built the way it was. For our list matching project, that means being ready to defend the design decisions.
- Observation session: nothing to implement or debug, so no personal technical challenge this time.
