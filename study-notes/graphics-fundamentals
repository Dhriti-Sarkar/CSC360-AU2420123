# Graphics Fundamentals (explained simply)

## Computer Graphics vs Image Processing — what's the actual difference?

These two terms sound similar but mean opposite directions of work:

- **Computer Graphics** = making an image appear out of nothing. You start with an idea or some math/code, and the computer draws it on screen. Example: drawing a triangle, rendering a 3D game character, animating a logo.
- **Image Processing** = you already HAVE an image (like a photo), and you want to do something to it or learn something from it. Example: making a blurry photo sharper, detecting a face in a picture, turning a color photo into black and white.

**Easy way to remember it:** Graphics = creating an image from scratch. Image Processing = working with an image that already exists.

## Geometric primitives — the "LEGO bricks" of drawing

Every complicated picture a computer draws is actually built from a small handful of simple basic shapes. These are called **geometric primitives**, and they are:

1. **Points** — a single dot, just an (x, y) location on the screen.
2. **Lines** — a straight path connecting two points.
3. **Curves** — a bendy path (not straight), often described using math formulas.
4. **Polygons / Areas** — shapes made of connected straight lines, like triangles, rectangles, or more complex outlines, which can be filled in with color.
5. **Circles and other basic shapes** — round shapes defined mathematically by a center point and a radius.

Think of it like building with LEGO — no matter how complex the final picture (a car, a face, a game world), it's built up from these basic building blocks.

## Static vs Interactive graphics

- **Static graphics**: once it's drawn, it just sits there. Nothing changes unless the whole thing gets manually redrawn by the program. Example: a picture in a PDF, or a simple bar chart that just displays numbers.
- **Interactive graphics**: the image actually reacts to what the user does — moving the mouse, clicking, typing, etc. When you do something, the computer notices ("detects the event") and redraws ("repaints") the picture to reflect the change.

**Real-life example:** A boring printed chart is static — it just shows numbers. But if you hover your mouse over a bar in an interactive chart on a website and a little tooltip pops up showing the exact value — that's interactive graphics responding to your mouse movement.

## How calculus connects to curves

You don't need to be a calculus expert, but here's the connection in simple terms:

- **Differentiation** (from calculus) tells you the **slope** of a curve at any point — basically, "how steep is this curve right here, and in which direction is it heading?" This helps graphics software understand the shape and direction of a curve as it's drawn.
- **Integration** (the reverse of differentiation) helps calculate the **area** under a curve or between two curves — useful when the graphics engine needs to know how much space a curved shape covers.

So in short: calculus gives the mathematical tools to precisely describe, bend, and measure smooth curves, instead of just drawing rough straight lines.

## A digital image is really just a big table of numbers

This is one of the most important beginner concepts:

- A digital image is stored as a **2D grid (matrix)** — imagine a giant spreadsheet with rows and columns.
- Each little box in that grid is called a **pixel** (short for "picture element") — the smallest possible unit of an image.
- Each pixel holds a **number (or set of numbers)** that tells the computer what color/brightness to show there. This could be:
  - A single grayscale number (e.g., 0 = black, 255 = white)
  - Or an RGB code (three numbers — how much Red, Green, and Blue to mix)

**Simple analogy:** Picture a classroom seating chart, where every student sits in a grid of rows and columns. Now imagine each student is holding up a card with a number from 1 to 10, where 1 means "very dark" and 10 means "very bright." If you photograph the whole classroom from above, that photo is basically what a digital image is — a grid of numbers that, together, create a picture when you look at the brightness/color of every single cell.
