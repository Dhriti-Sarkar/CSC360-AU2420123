# Code Quality: Comments, Formatting & Code as Communication (explained simply)

Seen live while reviewing repositories against the criteria in [github-repository-grading-criteria](github-repository-grading-criteria.md). Javadoc covers the *contract* of a method ([conventional-commits-and-javadoc](conventional-commits-and-javadoc.md)); inline comments cover the *reasoning inside it*.

## 1. Inline comments: WHY, not WHAT

The code already says **what** it does. What disappears when you leave the file is **why**.

```java
// Bad: restates the line
i++; // increment i

// Bad: restates what the code obviously does
for (String item : listB) { // loop over listB
    ...
}

// Good: records the reasoning
// Use a HashSet so each lookup is O(1); comparing every pair would be O(n * m)
Set<String> setA = new HashSet<>(listA);

// Good: explains a magic value
double headLength = 10; // long enough to stay visible on 1px strokes, short enough not to cover the text
```

A comment is a note to your future self and to whoever reads after you. Stale comments are a risk: update them when the code changes, or delete them.

## 2. Consistent formatting

Uniform indentation, spacing, brace style, and naming (`camelCase` methods, `PascalCase` classes, `UPPER_SNAKE` constants) signals that the team coordinated and wrote with a reader in mind. Inconsistency slows reading even when the logic is right. Agree on a style up front, or use the IDE's auto-formatter with shared settings, so merges do not turn into formatting fights ([team-git-practices-and-merge-conflicts](team-git-practices-and-merge-conflicts.md)). See also [java-syntax-review](java-syntax-review.md).

## 3. Code as communication

The best code is written for the **next developer**, not just the compiler. A function that runs but takes twenty minutes to understand is worse than one that takes a little longer to write but reads clearly.

- Use descriptive names so comments are rarely needed for the *what*.
- Keep methods small and single-purpose.
- This extends the idea in [generic-programming-and-code-reuse](generic-programming-and-code-reuse.md): code that communicates its intent is code someone else can actually use.

## Quick self-review checklist
- [ ] Does each comment explain a reason, not a restatement?
- [ ] Is formatting and naming consistent across all files?
- [ ] Could a teammate read this method without asking me?

## Simple analogy
Code is a recipe. The steps say *what* to do; a margin note like "chill the dough, or it spreads" says *why*. The second note is what saves the next cook.

## Key takeaway
> Comment the reasoning, not the line. Keep formatting consistent, and write code for the next reader.
