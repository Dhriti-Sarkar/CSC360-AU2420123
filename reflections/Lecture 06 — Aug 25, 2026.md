# Lecture 06 — Aug 25, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand the 3 tiers of graphics complexity: primitives → polygons → fractals
- [ ] Know why triangles specifically are the universal building block in graphics hardware
- [ ] Understand what recursive/fractal generation means for drawing trees/plants
- [ ] Always run `git pull` before starting new local work (non-negotiable habit)
- [ ] Understand what pom.xml actually coordinates beyond just dependencies
- [ ] Know the Maven lifecycle phases: clean → compile → test → package → install
- [ ] Understand the difference between a process and a thread
- [ ] Understand why GUI frameworks are NOT thread-safe
- [ ] Know what the Event Dispatch Thread (EDT) is and why it exists
- [ ] Know when/how to use SwingUtilities.invokeLater()
- [ ] Understand why Java has a slower "cold start" compared to Python/Bash/Ruby
- [ ] Understand what JIT compilation (C1/C2) actually does

## Questions discussed in class

- What are the three tiers of visual complexity our coursework is structured around?
- Why are triangles the universal geometric primitive in graphics rendering?
- What role does recursion play in generating fractal trees/branching structures?
- Why is it critical to always pull upstream changes before starting new local work?
- What does pom.xml actually control, beyond just listing dependencies?
- What are the standard Maven build lifecycle phases, and what does each one do?
- What's the difference between a process and a thread at the OS level?
- Why are Swing/JavaFX/native GUI frameworks not thread-safe?
- What is the Event Dispatch Thread (EDT), and why does Swing rely on a single thread for UI?
- How do you safely update the UI after finishing work on a background thread?
- Why does Java have a noticeable startup delay compared to scripting languages like Python?
- What is JIT compilation, and what do Tier 1 (C1) and Tier 2 (C2) actually do?

## Key takeaways

- Our whole course is basically structured as a difficulty ramp: squares/rectangles → triangles/polygons → recursive fractals. Useful to know where we are on that ramp.
- The Git pull-before-work habit connects directly to the divergent branches issue I actually ran into myself when pushing Lecture 5 notes — this lecture explains exactly *why* that happened.
- The EDT concept explains why all my paintComponent() drawing code has been running "automatically" without me manually managing threads so far — Swing has been handling that single-threaded execution for me the whole time.

