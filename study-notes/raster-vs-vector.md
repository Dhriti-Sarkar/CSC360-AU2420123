# Raster vs Vector Graphics (explained simply)

## Raster Graphics — images made of tiny colored squares (pixels)

- A raster image is basically a big grid of tiny colored squares (pixels), just like we discussed with digital images being a grid of numbers.
- Each pixel has its own stored color.
- The quality of the image entirely depends on how many pixels it has — this is called **resolution**. More pixels = sharper image, but also = bigger file size.
- **The big weakness:** if you zoom in or enlarge a raster image too much, you start to see the individual square pixels — the image gets blurry and "blocky" (this is called pixelation). Think of zooming way into a photo on your phone until it looks like a mosaic of squares.
- Common raster file types: JPG, PNG, BMP.

## Vector Graphics — images made of math instructions, not pixels

- A vector image doesn't store individual colored dots at all. Instead, it stores **mathematical instructions/formulas** describing shapes — like "draw a circle here, with this radius" or "draw a line from point A to point B."
- Because it's just math instructions, the computer **redraws the shape fresh every time**, calculating exactly how it should look at whatever size you need.
- **The big advantage:** you can scale a vector image up to any size — even huge — and it will always look perfectly crisp, because the computer is recalculating the shape at that new size rather than stretching pixels.
- Common vector file types: SVG files, Adobe Illustrator files (.ai), vector PDFs.

## Simple analogy

Raster is like a mosaic made of tiny tiles — zoom in enough and you'll start seeing individual tiles instead of a smooth picture.
Vector is like a recipe/instruction sheet for drawing a shape — no matter how big or small you want the final drawing, the "recipe" just gets recalculated, so it always comes out smooth.

## Key difference to remember

| | Raster | Vector |
|---|---|---|
| Made of | Tiny colored pixels | Math formulas/drawing instructions |
| Enlarging it | Gets blurry/pixelated | Always stays sharp |
| Good for | Photos, detailed images | Logos, icons, illustrations that need resizing |

## Pixels and lines (quick preview of Chapter 3)

- A **pixel** (short for "picture element") is the single smallest dot that makes up a digital image on screen — like one tiny square in a huge grid.
- When a computer needs to draw a **line** on screen, since pixels are arranged in a fixed grid, the computer has to figure out and "light up" the specific pixels that best approximate that line's path — because a perfectly diagonal mathematical line doesn't perfectly match up with square pixels.
