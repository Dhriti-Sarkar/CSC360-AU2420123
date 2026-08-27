# Java Graphics Rendering — drawRect, fillRect, and Dynamic Resizing (explained simply)

## Outline vs filled shapes

Java's graphics tools (`Graphics` / `Graphics2D` classes) give you two related but different methods for drawing a rectangle/square:

- **`drawRect(x, y, side, side)`** — draws just the **outline/border** of the shape. Nothing inside gets colored in.
- **`fillRect(x, y, side, side)`** — draws a **solid, filled-in** shape, coloring the entire inside.

This is the same fill-vs-stroke idea from JavaFX (`setFill` vs `setStroke`) — just implemented with different method names in this older Java graphics API.

## setColor() — how coloring actually works here

Before you call `fillRect()` or `drawRect()`, you first call `setColor()` to set what color should be used. Think of this like picking up a colored marker before you start drawing — whatever color you "pick up" with `setColor()` is what gets used for the next drawing operation, until you call `setColor()` again with a different color.

This is described as a **state machine** behavior — meaning the graphics system remembers "the currently selected color" as an ongoing state, rather than you specifying a color fresh every single time you draw something.

## Making shapes resize/recenter automatically

- `getWidth()` and `getHeight()` let your code ask, in real time, "how big is the panel/window right now?"
- Calling these **inside** `paintComponent` (the method responsible for actually drawing things on screen) means that every time the panel gets repainted — including right after a window resize — the code re-fetches the current width/height and recalculates the centering formulas (`X = (W - S) / 2`, etc.) fresh.
- **Why this matters:** if you had just hardcoded fixed X/Y numbers instead, the square would stay in the same spot even if you resized the window, and it would no longer look centered. By recalculating dynamically using `getWidth()`/`getHeight()`, the square stays perfectly centered no matter what size the window becomes.

## Simple analogy

Think of `getWidth()`/`getHeight()` like re-measuring a room every time before hanging a picture in the center — rather than measuring once and assuming the room will always stay the same size. If the "room" (window) changes size, re-measuring ensures the picture (square) still ends up centered instead of looking off.