# Lecture 15 — Oct 1, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know what the project evaluation looks like (from the mock presentations) and how to structure a presentation
- [ ] Understand the difference between functionality and features, and why functionality carries more weight
- [ ] Understand generic programming: making the type a parameter so one class or method works for many types
- [ ] Understand why code reuse means keeping logic in one place (fixes and improvements apply everywhere)
- [ ] Know that JavaFX `Shape` is abstract, and which common properties subclasses inherit (fill, stroke, strokeWidth, opacity)
- [ ] Understand how shapes sit in the scene graph and carry observable properties
- [ ] Know the difference between scene graph shapes (retained mode) and `Canvas` + `GraphicsContext` (immediate mode)
- [ ] Know when to use each of the two JavaFX drawing models

## Questions discussed in class

- What will the actual project evaluation look like, and what do groups assume vs what does the faculty expect?
- How should a presentation flow so it communicates the project rather than just demoing features in sequence?
- What is the difference between functionality and features?
- Why shouldn't we write nearly the same class or method twice just because the types differ?
- How do JavaFX graphical objects relate to shape abstraction and the scene graph?
- How does `GraphicsContext` differ from scene graph shapes?

## Key takeaways

- The session opened with mock presentations for a few selected groups, an interactive feedback round with the presenting group, the faculty, and the class. Seeing it live made the evaluation format concrete.
- **Functionality vs features:** functionality is whether the software works correctly and fulfils its core purpose; features are the extras on top. Evaluation weights functionality more, so a focused, reliable project beats a feature-heavy one that breaks during the demo. For our list matching project, the core (matching elements and drawing the arrows correctly) matters more than extras.
- **Generics:** making the type a parameter lets one implementation serve all types, e.g. `List`, `Map`, `Set` from the Collections Framework (Lecture 10). It also keeps fixes in one place.
- Generics and inheritance both come from the instinct to write logic once: inheritance shares behaviour down a class hierarchy, generics share it across unrelated types.
- **Shape hierarchy:** `Shape` is abstract; `Rectangle`, `Circle`, `Line`, `Ellipse` extend it and inherit fill, stroke, strokeWidth, opacity. A `List<Shape>` can be looped over and updated without knowing concrete types: polymorphism applied to graphics.
- **Two drawing models:** scene graph shapes are persistent objects in the node tree (retained mode, property-based); `GraphicsContext` on a `Canvas` is immediate mode (draw commands go to a pixel buffer and nothing is retained). `GraphicsContext` resembles the older Java 2D `Graphics2D` style from earlier lectures.
- Good documentation lets an evaluator understand the project without reading source (ties to Lecture 14).
- Challenging part: why both drawing models exist and when to use which was not fully clear from the session alone.
