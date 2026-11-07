# JavaFX Shape Abstraction & the Two Drawing Models (explained simply)

Extends [javafx-shapes-and-properties](javafx-shapes-and-properties.md) and the Java 2D material in [java-graphics-rendering](java-graphics-rendering.md).

## Shape hierarchy

`Shape` is an **abstract** class. `Rectangle`, `Circle`, `Line`, and `Ellipse` extend it and inherit common properties: `fill`, `stroke`, `strokeWidth`, `opacity`. These are **observable properties**, so the UI can react when they change.

```java
List<Shape> shapes = List.of(new Rectangle(50, 30), new Circle(20), new Ellipse(30, 15));
for (Shape s : shapes) {
    s.setFill(Color.TEAL);   // each responds correctly; no need to know the concrete type
    s.setOpacity(0.8);
}
```

This is polymorphism ([java-oop-inheritance](java-oop-inheritance.md)) applied to graphics. The same idea appears in game engines, vector editors, and CAD tools, where every drawable shares a base type so a render loop can iterate over all of them.

## Two separate drawing models

| | Scene graph shapes | `Canvas` + `GraphicsContext` |
|---|---|---|
| Mode | **Retained**: persistent objects in the scene tree | **Immediate**: commands drawn straight to a pixel buffer |
| How you use it | Create objects, set properties, JavaFX renders them | Call `fillRect`, `strokeOval`, etc. |
| After drawing | Objects remain; change a property and it updates | Nothing retained; to change it, clear and redraw |
| Events / hit-testing | Built in per node | You track positions yourself |
| Good for | Interactive UIs with a moderate number of objects | Custom drawing, many items, per-frame rendering |

`GraphicsContext` is conceptually close to the older `Graphics2D` approach (`drawRect`, `fillOval`) from the Java 2D lectures; scene graph shapes flip it into "create objects and let the framework render". That is why both coexist.

## Choosing

- Need clicks, hover, or per-object property changes? Use scene graph shapes.
- Need to draw a lot, or fully custom visuals, redrawn each frame? Use Canvas.
- For the list matching project, arrows could be either: `Line`/`CubicCurve` nodes (easy to style and make interactive) or drawn on a Canvas ([canvas-coordinate-geometry](canvas-coordinate-geometry.md)). This choice is worth revisiting; it was not fully settled in the session.

## Simple analogy
Scene graph = sticking magnets on a fridge (each stays and can be moved). Canvas = painting on the fridge door (once painted, it's just paint; to change it, repaint).

## Key takeaway
> `Shape` is an abstract base with shared observable properties. JavaFX offers retained-mode scene graph shapes and immediate-mode Canvas drawing; pick based on interactivity vs custom/high-volume drawing.
