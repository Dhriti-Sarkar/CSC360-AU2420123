# Unit Testing vs Integration Testing (explained simply)

This builds directly on the unit vs acceptance testing comparison from earlier — integration testing sits as a distinct middle tier between those two.

## Why testing matters, especially for new engineers

The lecture makes a notable practical point: **entry-level engineers joining a company are frequently assigned to writing and expanding automated tests** as one of their first real responsibilities. This makes sense once you consider that large, real-world software systems are built up gradually over many stages, by many different people — at that scale, you genuinely can't just manually click through and check that everything still works correctly every time something changes. Automated tests take over that verification job.

## Unit Testing (recap + more detail)

Unit tests isolate the **smallest testable pieces** of a program — individual methods, small helper functions, or specific algorithms/transformations — and verify that piece works correctly entirely on its own.

**New detail from this lecture: test doubles and mocks.** Since a unit test is supposed to check *only* one small piece in isolation, what happens if that piece of code normally depends on something else — like a database, a network call, or another complex class? The answer is **test doubles** (sometimes specifically called **mocks**) — these are simplified, fake stand-ins for those dependencies, used *only* during testing, so the test can focus purely on verifying the actual logic of the piece being tested, without needing a real database or network connection to actually exist.

**What good unit tests check:**
- Valid, expected inputs → correct expected outputs
- Edge cases (unusual but valid inputs, like an empty list or a very large number)
- Error states (what happens when something goes wrong, like invalid input)

## Integration Testing (new this lecture)

Integration tests verify that **multiple different modules/pieces work correctly together**, as a connected system — rather than checking any single piece in isolation.

**What integration tests typically check:**
- **Cross-module boundaries** — does data pass correctly between two different parts of the system that were built somewhat independently?
- **Database transactions** — does the application correctly read/write real data to an actual (often test) database?
- **Network payload serialization** — when data gets converted into a format for sending over a network (like JSON) and then converted back, does it arrive correctly and intact?
- **Event-driven component workflows** — do different components correctly trigger and respond to each other's events, working together as intended?

**The key difference:** unit tests intentionally isolate one small piece using fakes/mocks for everything around it. Integration tests intentionally do the *opposite* — they let real pieces interact together, specifically to catch problems that only show up when things are actually connected (which a unit test, by design, would never catch, since it fakes away all those connections).

## Simple analogy

Think of building a car again: **unit tests** check that individual parts work correctly on their own — does the fuel injector spray the correct amount of fuel when tested by itself on a bench? **Integration tests** check that connected systems work correctly together — when the fuel injector, the engine, and the ignition system are all actually hooked up together, does the car's engine actually start and run smoothly? Neither test alone tells the whole story — you need both.

## Why automate both inside the Maven build lifecycle

Remember the `test` phase from Maven's build lifecycle (Lecture 6)? Running both unit and integration test suites automatically as part of that standard build process means **every incremental change gets continuously verified** — catching regressions (something that used to work, but broke due to a new change) immediately, before that broken code ever gets merged into the main/production codebase.

## Quick comparison table

| | Unit Test | Integration Test |
|---|---|---|
| Scope | One small isolated piece | Multiple modules working together |
| Dependencies | Faked/mocked away | Real (or realistic test versions) |
| Catches | Logic bugs in individual functions | Problems that only appear when components connect |
| Speed | Very fast | Slower (more moving parts involved) |