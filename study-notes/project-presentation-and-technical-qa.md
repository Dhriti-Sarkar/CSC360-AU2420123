# Presenting a Project & Surviving the Technical Q&A (explained simply)

Presenting a project is a different skill from building it. This session's format: live demo first, then interview-style questions from the professor. Extends [technical-interviews-and-poc](technical-interviews-and-poc.md) and [functionality-vs-features-and-evaluation](functionality-vs-features-and-evaluation.md).

## Demo, then Q&A

- **No slides:** a live demo of the running app (`mvn javafx:run`, see [maven-and-javafx-setup](maven-and-javafx-setup.md)).
- The professor can interrupt mid-demo.
- Afterwards the questions go past "what does it do?" to "why is it built this way?"

## The kinds of questions

| Type | Example |
|---|---|
| Design decision | Why did you structure it this way? Why this data structure over another? |
| Scale | What would break with a much larger input? |
| Edge case | What happens with duplicates, empty input, or invalid values? |
| Hindsight | What would you do differently? |

## How to answer

1. **Reason out loud.** The goal is to show you understand your own project, not to recite a perfect answer.
2. **Own the gaps.** "We did not handle that case, and here is why we deprioritized it" is stronger than being caught off guard.
3. **Explain the trade-off,** not only the choice: what you gained and what you gave up.
4. **Know the core first.** Functionality is weighted over features.

## Practice questions for the list matching project

Prepare answers to these ([list-matching-project-overview](list-matching-project-overview.md)):

- How do you find the matching elements, and what is the cost as the lists grow?
- What happens with duplicates in a list, or an element that matches several others?
- What happens with empty lists or very long lists (does the layout still work)?
- Why align the lists in two columns and draw arrows rather than just highlighting matches?
- Why scene graph nodes or Canvas for the arrows? ([javafx-shape-abstraction-and-drawing-models](javafx-shape-abstraction-and-drawing-models.md))
- What was left out, and why?

## Shared stack, different projects
Everyone used Java 21, JavaFX, and Maven, where `pom.xml` is the reproducible build contract that makes a project runnable on any machine ([maven-lifecycle](maven-lifecycle.md)). The problem chosen and the visual design make projects feel different, not the stack.

## Simple analogy
A building inspector doesn't ask what rooms the house has; they ask why the wall is there and what holds it up.

## Key takeaway
> Interviews and evaluations probe decisions, not features. Know your project well enough to explain its trade-offs and its gaps out loud.
