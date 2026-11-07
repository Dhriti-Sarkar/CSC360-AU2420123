# Set Intersection & Drawing Arrows Between Matches (explained simply)

The technique behind visually matching two lists, the idea in [visual-relationship-mapping](visual-relationship-mapping.md) and the [list-matching-project-overview](list-matching-project-overview.md). Two parts: **find the matches**, then **draw the arrows**.

## Part 1: finding the common elements

Use a `HashSet`: put one list's items in a set, then check the other list against it.

```java
Set<String> setA = new HashSet<>(listA);
List<String> common = new ArrayList<>();
for (String item : listB) {
    if (setA.contains(item)) common.add(item);
}
// or: setA.retainAll(new HashSet<>(listB));
```

- `contains` on a `HashSet` is about O(1), so the whole match is O(n + m), versus O(n x m) for comparing every pair.
- Decide how to handle **duplicates** and **case/whitespace** ("Apple" vs "apple "): a set removes duplicates, so you may need to track the original positions separately.
- Edge cases to be ready for: empty lists, no matches, very long lists.

## Part 2: drawing the arrows

Lay the two lists out as **vertically aligned columns** with empty space between, then for each match connect the item in column A to its partner in column B. In Java 2D / Graphics2D ([java-graphics-rendering](java-graphics-rendering.md), [canvas-coordinate-geometry](canvas-coordinate-geometry.md)):

- **Curve:** a `QuadCurve2D` (or cubic curve) from the start point to the end point with a control point to bend the line.
- **Arrowhead angle:** with start (x1, y1) and end (x2, y2):

```
angle = atan2(y2 - y1, x2 - x1)
```

`atan2` returns the direction of the line in the correct quadrant. Place the arrowhead at the end point by rotating two short lines (or a small triangle) around it at `angle ± ~30 degrees`.

```java
double angle = Math.atan2(y2 - y1, x2 - x1);
double len = 10;
Line2D.Double a = new Line2D.Double(x2, y2,
    x2 - len * Math.cos(angle - Math.PI / 6), y2 - len * Math.sin(angle - Math.PI / 6));
Line2D.Double b = new Line2D.Double(x2, y2,
    x2 - len * Math.cos(angle + Math.PI / 6), y2 - len * Math.sin(angle + Math.PI / 6));
```

For a curved arrow, compute the angle from the curve's **end tangent** (from the control point to the end point) so the arrowhead points along the curve.

## Real-world uses
Data reconciliation, schema mapping in database migration, plagiarism detection, inventory reconciliation, and comparative genomics: any time two collections must be compared and the matches shown visually instead of listed in text.

## Simple analogy
Two guest lists at a party check-in: the set lookup is the clerk who instantly knows who is on both lists; the arrows are the string you tie between the two names.

## Key takeaway
> Find matches with a `HashSet` (fast lookup, mind duplicates and edge cases), then draw them with curves and `atan2`-based arrowheads between aligned columns.
