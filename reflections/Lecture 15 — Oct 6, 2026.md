# Lecture 15 — Oct 6, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know the format of the peer presentation session (live demos, no slides, no new content from the faculty)
- [ ] Understand how the Q&A works: interview-style questions about decisions, not features
- [ ] Be able to explain why my own project was structured the way it was
- [ ] Be able to say what would break at scale and how edge cases are handled
- [ ] Know how to talk about incomplete or imperfect parts of a project
- [ ] Know that presenting a project is a different skill from building it
- [ ] Know the shared stack: Java 21, JavaFX, Maven (`pom.xml` as the reproducible build contract, run with `mvn javafx:run`)

## Questions discussed in class

- Why did you structure it this way?
- What would break at scale?
- How does your code handle this edge case?
- Why did you use one data structure instead of another?
- What happens if the user enters duplicate or unexpected values?

## Key takeaways

- This was a peer presentation session: three groups ran live demos of their JavaFX apps while the professor observed, interrupted with questions, and kept the audience engaged. There were no slides.
- After each demo, the professor ran an interview-style Q&A. The questions were about **decisions and trade-offs**, not about what the app does. This is deliberate: in a professional setting, a technical interviewer probes the reasoning behind a project, including what you would do differently.
- The right answer is not always the perfect solution; it is knowing your own project well enough to reason about it out loud. Saying "we did not handle that case and here is why we deprioritized it" lands better than being caught off guard.
- All three groups used the same stack (Java 21, JavaFX, Maven) and still produced completely different-feeling projects, because the problem and the visual design differ. This confirms the Maven setup from Lecture 6 is the standard approach.
- This connects to Lecture 14: evaluation rewards functionality over features, and to Lecture 6: technical interviews probe your decisions.
- For our list matching project, I should be ready to explain: how matching is done, why the lists are laid out as aligned columns, how arrows are drawn, what happens with duplicate elements or empty lists, and what happens with very large lists.
- Observation session: nothing to implement or debug, so no personal technical challenge this time.
