# Building Shapes from Coordinate Points (explained simply)

This builds directly on the centering-math from Lecture 4 — same core idea of turning simple point data into the actual parameters a drawing method needs.

## Building a rectangle from two diagonal corner points

Instead of directly being given a rectangle's top-left corner + width + height (like we used in Lecture 4), sometimes you're only given **two opposite corner points**: `(x1, y1)` and `(x2, y2)` — imagine clicking two opposite corners of a rectangle with your mouse.

To turn these two points into an actual drawable rectangle, you need to figure out the true top-left corner and the width/height:

- **Origin (top-left corner) X:** `min(x1, x2)` — take whichever X value is smaller.
- **Origin (top-left corner) Y:** `min(y1, y2)` — take whichever Y value is smaller.
- **Width:** `|x2 - x1|` — the absolute difference between the two X values (absolute value means always positive, regardless of which point came "first").
- **Height:** `|y2 - y1|` — the absolute difference between the two Y values.

**Why we need `min()` and absolute value:** the two points could be given in *any* order — the first point clicked might be the bottom-right corner instead of the top-left. Using `min()` for the origin and absolute difference for the size makes the math work correctly regardless of which corner was "point 1" vs "point 2."

**Simple analogy:** imagine dragging a selection box with your mouse, sometimes from top-left to bottom-right, sometimes the opposite direction. No matter which way you drag, the selection box should still end up looking correct — that's exactly what `min()` and absolute value handle for us mathematically.

## Building a triangle from three points

Java provides `drawPolygon` (outline only) and `fillPolygon` (solid fill) to draw shapes from a list of coordinate points — in this case, three pairs: `(x1, y1)`, `(x2, y2)`, `(x3, y3)`.

## Why collinearity matters

**Collinear points** are points that all sit on the exact same straight line. If all three of your triangle's points happen to be collinear, you don't actually get a triangle at all — you just get a flat line, since there's no "third direction" to form an actual enclosed shape. This is called a **degenerate** shape — technically defined, but not a valid, visually meaningful polygon.

**The approach discussed:** you can randomly generate two of the three points within some coordinate range, but the **third point must be deliberately checked** to make sure it doesn't fall on the same line as the first two — ensuring you always end up with a proper, "non-degenerate" triangle that actually looks like a triangle instead of collapsing into a flat line.

**Simple analogy:** think of three friends trying to stand in a triangle formation for a photo. If all three accidentally line up in a single row, you don't get a triangle shape in the photo — you just get a straight line of people. Collinearity checking is just making sure that doesn't happen.