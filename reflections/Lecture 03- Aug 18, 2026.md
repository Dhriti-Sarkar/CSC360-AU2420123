# Lecture 04 — Aug 18, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand why a shape looks "off-center" if you just place it at (W/2, H/2)
- [ ] Memorize the formula to find a square's top-left starting point so it's truly centered
- [ ] Be able to calculate all 4 corners of a square from its top-left point + side length
- [ ] Know the difference between drawRect() and fillRect() in Java
- [ ] Understand how setColor() affects what gets drawn afterward
- [ ] Know how getWidth()/getHeight() let a shape re-center itself if the window is resized
- [ ] Understand what a .env file is and why it's sensitive
- [ ] Understand what .gitignore does and why every project should have one

## Questions discussed in class

- What is the ideal placement of a square on a canvas, from both a visual and mathematical standpoint?
- Why doesn't placing a square directly at the canvas's center point (W/2, H/2) actually center it?
- How do you calculate the top-left starting coordinate of a square so it's centered on the canvas?
- How do you find the remaining 3 corners of a square once you know the top-left corner and side length?
- What's the difference between drawing an outlined shape vs a filled shape in Java?
- What are .env files and why are they a security risk if exposed?
- What does .gitignore do and why is it important for a repository?

## Key takeaways

- Centering a shape properly means centering its *middle point*, not its corner — this requires a small formula, not just dividing canvas dimensions in half.
- Graphics APIs almost always measure position from the top-left corner (0,0), not the center — this is a recurring theme to keep in mind for any shape positioning.
- Project hygiene (via .gitignore, keeping secrets out of .env files) is just as important as the actual code — this ties back to what I set up for my javafx-square-demo project.

## Open questions (carry to next class)

- (none yet — I wasn't in class, so I'll flag anything unclear once I go through this properly)