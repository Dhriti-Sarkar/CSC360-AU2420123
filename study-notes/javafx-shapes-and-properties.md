# JavaFX Shapes & Properties (explained simply)

While building the square demo project, I explored several shape properties beyond just drawing something on screen.

## Fill vs Stroke — "inside color" vs "outline color"

Every JavaFX shape (like `Rectangle` or `Polygon`) has two separate color settings:

- **Fill** — the color that paints the *inside* of the shape. Setting this to `Color.TRANSPARENT` means nothing is painted inside, so the shape appears hollow/see-through.
- **Stroke** — the color of the shape's *outline/border*. This is separate from fill — you can have a colored border with a transparent inside, a colored inside with no border, or both at once.

**Simple analogy:** think of coloring inside a shape in a coloring book (fill) versus tracing just the outline with a marker (stroke) — they're two independent choices.

## Stroke width — how thick the border is

`setStrokeWidth(n)` controls the outline's thickness in pixels. A higher number makes the border chunkier. If it's too high relative to the shape's size, it starts to visually eat into the "hollow" middle space.

## Shape size — width and height

For a `Rectangle`, size is set directly when creating it: `new Rectangle(width, height)`. Equal width and height makes a square; different values make a rectangle. Increasing both numbers makes the shape bigger overall.

## Position — layoutX and layoutY

`setLayoutX()` and `setLayoutY()` control *where* the shape sits in the window, based on its top-left corner (for a `Rectangle`). To center a shape in a window, the formula is:
layoutX = (window width - shape width)/2
layoutY = (window height - shape height)/2
So resizing a shape often means its position needs recalculating too, if you want it to stay centered.

## Static vs interactive positioning

- Setting `layoutX`/`layoutY` once, directly in the `start()` method, makes the shape stay fixed in place — nothing moves it after that.
- Attaching a handler like `scene.setOnMouseMoved(...)` and updating `layoutX`/`layoutY` inside it makes the shape *dynamically* follow user input instead — this ties back to the Event Listener Model from Lecture 01, where the mouse movement is the event, and the handler is the listener reacting to it.

## Key takeaway
> Fill = inside color. Stroke = outline color + thickness. Width/Height = size. LayoutX/LayoutY = fixed position (or dynamically updated position, if driven by an event listener).