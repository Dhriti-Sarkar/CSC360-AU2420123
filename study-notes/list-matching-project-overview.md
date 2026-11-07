# List Matching Project: Overview

Our group project: a JavaFX program that shows **two lists as vertically aligned columns** and draws **arrows between matching elements**. It is the idea from Lecture 8 ([visual-relationship-mapping](visual-relationship-mapping.md), [ascii-vs-graphics-and-headless-systems](ascii-vs-graphics-and-headless-systems.md)): finding the common elements of two lists and connecting them visually, which the eye processes far faster than scanning text.

## Core idea

```
List A        List B
 apple  ───►   apple
 pear          grape
 grape ───►    mango
```

- Matching logic finds the elements common to both lists.
- Each list is a column with empty canvas space between them.
- Arrows (or curved paths) are drawn across that space from each element to its match.

## Timeline

- **Lecture 10 (Sep 10):** group project planning started.
- **Lecture 11 (Sep 15):** first version scaffolded with Claude, reviewed, run on one machine, approved by the faculty, and committed to GitHub.
- **Lecture 12 (Sep 17):** next features planned: dark/light theme, drag-and-drop reordering of list items, UI refresh. See [javafx-theming-and-drag-and-drop](javafx-theming-and-drag-and-drop.md).
- **Lecture 13 (Sep 29):** final feature (splash screen) and project documentation (README and Wiki). See [javafx-preloader-splash-screen](javafx-preloader-splash-screen.md) and [readme-vs-wiki-documentation](readme-vs-wiki-documentation.md).

## Related

- Drawing and event handling: [canvas-coordinate-geometry](canvas-coordinate-geometry.md), [javafx-event-propagation](javafx-event-propagation.md)
- Team workflow: [group-project-git-governance](group-project-git-governance.md), [team-git-practices-and-merge-conflicts](team-git-practices-and-merge-conflicts.md)

## Key takeaway
> The list matching project = two aligned lists + a matching step + arrows between matches, with a theme toggle, drag-and-drop, and a UI refresh planned next.
