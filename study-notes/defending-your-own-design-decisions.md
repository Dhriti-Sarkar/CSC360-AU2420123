# Defending Your Own Design Decisions (explained simply)

Lecture 18 was our group's turn to present the list matching project under the professor's Q&A. Extends [project-presentation-and-technical-qa](project-presentation-and-technical-qa.md), which covered the format from the audience side.

## Watching vs presenting

When watching, the question lands on someone else. When presenting, you must turn a decision you acted on weeks ago, without writing down the reasoning, into a clear spoken answer in real time. Knowing the project is not the same as being able to explain it quickly.

## Keep a decision log as you build

For each significant choice, write two or three lines at the time:

```
Decision: <what we chose>
Why: <the reason at the time>
Alternatives: <what we rejected and why>
Known weakness: <what breaks or what we left out>
```

This is the same habit as comments that explain **why** ([code-comments-and-formatting](code-comments-and-formatting.md)) and the Wiki's "architecture decisions" section ([readme-vs-wiki-documentation](readme-vs-wiki-documentation.md)). Whether a decision turns out right or wrong, you need to be able to explain it.

## Decisions worth logging for the list matching project

([list-matching-project-overview](list-matching-project-overview.md))

- How matches are found and why ([set-intersection-and-arrow-drawing](set-intersection-and-arrow-drawing.md))
- How arrows are drawn: scene graph nodes vs Canvas ([javafx-shape-abstraction-and-drawing-models](javafx-shape-abstraction-and-drawing-models.md))
- Which GUI toolkit and why ([choosing-the-right-tool-for-the-problem](choosing-the-right-tool-for-the-problem.md))
- What happens with duplicates, empty lists, or invalid input
- What was left out and why (functionality over features, see [functionality-vs-features-and-evaluation](functionality-vs-features-and-evaluation.md))

## Answering well

1. Restate the question to buy a moment.
2. Give the decision, then the reason, then the trade-off.
3. If you hit a gap, say so and explain why it was deprioritized.
4. Never bluff: say what you would do differently.

## Key takeaway
> Write down why you chose something at the moment you choose it. It is what lets you defend the decision out loud later.
