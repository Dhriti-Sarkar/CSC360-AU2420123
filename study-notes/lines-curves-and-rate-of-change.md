# Lines vs Curves: Rate of Change (explained simply)

The first lecture's key link between maths and drawing. Extends the calculus section of [graphics-fundamentals](graphics-fundamentals.md).

## The idea

- A **line** changes at a **constant rate**. Its slope, and so its derivative, is the same everywhere.
- A **curve** changes at a rate that **keeps changing**. Its derivative depends on where you are on it.

| | Line | Curve |
|---|---|---|
| Example | y = 2x + 1 | y = x² |
| Derivative | dy/dx = 2 (constant) | dy/dx = 2x (varies with x) |
| At x = 1 | slope 2 | slope 2 |
| At x = 3 | slope 2 | slope 6 |
| Direction of travel | never changes | keeps turning |

## Why a computer cares

Drawing software needs to know which way a path is heading at each point (the **tangent**) and how fast it is bending:

- The derivative gives the tangent direction, which is what you need to place an arrowhead at the end of a curve ([set-intersection-and-arrow-drawing](set-intersection-and-arrow-drawing.md)) or to render smooth shading.
- A straight line only needs two endpoints. A curve needs more information (control points, a formula) to describe how its slope changes ([geometric-shape-algorithms](geometric-shape-algorithms.md)).
- **Integration** (the reverse of differentiation) gives the area under or between curves, useful when a shape's filled area matters.

## Simple analogy
Driving on a straight road, the steering wheel never moves (constant rate of change). On a winding road, the wheel angle keeps changing (a changing derivative). A curve is the winding road.

## Key takeaway
> A line has a constant derivative; a curve's derivative keeps changing. That changing slope is exactly what a computer uses to describe, draw, and shade curves.
