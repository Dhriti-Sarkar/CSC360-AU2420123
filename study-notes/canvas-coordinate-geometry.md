# Canvas Coordinate Geometry & Centered Shapes (explained simply)

## The core problem: why doesn't (W/2, H/2) center a shape?

In graphics programming, coordinates almost always start counting from the **top-left corner** of the screen/window, which is position (0, 0) — not the center, and not the bottom-left like you might expect from math class.

So if you have a canvas of width `W` and height `H`, the exact center point of that canvas is at `(W/2, H/2)`.

**The mistake to avoid:** if you place a square so that its **top-left corner** sits at `(W/2, H/2)`, the square is NOT centered — because now the whole square extends further to the right and further down from that point, making it look shifted off toward the bottom-right instead of centered.

## The fix: calculating where the top-left corner should actually go

To make a square of side length `S` appear truly centered, we need to shift its starting point back by *half its own size* in both directions. The formulas: X = (W-S)/2, Y = (H-S)

**In plain terms:** take the canvas width, subtract the square's width, and split the leftover space evenly on both sides — that leftover-divided-by-2 amount is exactly how far in from the edge the square's top-left corner should start. Same logic applies vertically with height.

**Simple analogy:** imagine centering a picture frame on a wall. You don't just mark the wall's center and slap the frame's corner there — you measure the wall's width, subtract the frame's width, and split what's left evenly on both sides so there's equal empty space to the left and right of the frame. That's exactly what this formula does mathematically.

## Finding all 4 corners of the square

Once you know the top-left corner `(X, Y)` and the side length `S`, the other 3 corners follow directly:

| Corner | Coordinates |
|---|---|
| Top-left (reference point) | `(X, Y)` |
| Top-right | `(X + S, Y)` |
| Bottom-right | `(X + S, Y + S)` |
| Bottom-left | `(X, Y + S)` |

**Why this works:** moving right means increasing the X value by the side length; moving down means increasing the Y value by the side length (remember, Y increases *downward* in graphics coordinates, which is the opposite of a typical math graph).

## Why this matters beyond just squares

This same logic — finding a center point, then working out the top-left starting corner — is the foundation for how bounding boxes work (an invisible rectangle used to track a shape's position/size) and how spatial alignment/centering works generally in rendering systems, not just for simple squares.