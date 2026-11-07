# 2D Transformations in JavaFX (explained simply)

The core of the early graphics lectures (translate, rotate, scale) turned into working controls in a shape-styling project. Extends [javafx-shapes-and-properties](javafx-shapes-and-properties.md), [javafx-shape-abstraction-and-drawing-models](javafx-shape-abstraction-and-drawing-models.md), and the geometry in [canvas-coordinate-geometry](canvas-coordinate-geometry.md).

## The transformations

| Transform | What it does | JavaFX |
|---|---|---|
| **Translate** | Moves the object by (dx, dy) | `Translate`, or `setTranslateX/Y` |
| **Rotate** | Turns the object by an angle around a pivot | `Rotate`, or `setRotate` (degrees, 0 to 360) |
| **Scale** | Stretches/shrinks, independently in X and Y (or uniform) | `Scale`, or `setScaleX/Y` |
| **Flip** | Mirror: a scale of -1 on one axis | `setScaleX(-1)` / `setScaleY(-1)` |

Several can be **composed**; the order matters, because rotating then translating is not the same as translating then rotating.

## Pivot point

Rotation and scaling happen around a **pivot**. By default a node's `rotate` and `scale` use the centre of its bounds. Rotating around a corner or the origin gives a very different result, so choose the pivot deliberately (e.g. the object centre).

## Position vs translate

- **Position** (`layoutX/Y`, or `x/y` on shapes) is the node's base location.
- **Translate** is an extra offset applied on top of it.

Both add up, so a "position" slider and a separate "translation" slider are two different layers on the same node. Mixing them without knowing which is which is a common source of "why is it not where I set it?" bugs.

## Property panel with live preview

A pattern used by professional tools (Illustrator's properties panel, Unity's inspector, SVG editors):

- **Sliders** update the shape immediately (live preview, speed).
- **Typed values** commit on Enter or an Apply button (precision).
- **Validation** keeps the object on screen (clamp values to the viewport).
- Controls are bound to the shape's observable properties, so the UI and the shape stay in sync ([javafx-shapes-and-properties](javafx-shapes-and-properties.md)).

## Appearance controls

- **Fill:** solid, `LinearGradient`, `RadialGradient` (set start and end colours)
- **Stroke:** colour, width, and style (solid, dashed via `getStrokeDashArray()`, dotted)
- **Opacity**
- **Effects:** `DropShadow`, `Glow`, which can be combined by chaining

## Link to image processing
These geometric operations on coordinates are the foundation for the second half of the course: resizing, rotating, and warping images use the same transformation maths ([graphics-fundamentals](graphics-fundamentals.md)).

## Simple analogy
A photo on a table: translate slides it, rotate spins it around a pin, scale zooms it. Where you put the pin (the pivot) changes how it spins.

## Key takeaway
> Translate, rotate, and scale compose, and rotation and scale depend on a pivot. Keep position and translate straight, and use live preview with validated, committed input for a usable property panel.
