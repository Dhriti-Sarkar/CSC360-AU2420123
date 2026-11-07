# SVG & XML: Vector Graphics as Text (explained simply)

Connects directly to [raster-vs-vector](raster-vs-vector.md): vectors are stored as mathematical descriptions of shapes, and this session showed what that looks like in a real file.

## XML in one paragraph

XML is a general-purpose markup language for structured data: nested elements with attributes, forming a document tree.

## SVG = XML for graphics

**SVG (Scalable Vector Graphics)** reuses that structure for drawing:

- Shapes become **elements** (`<circle>`, `<rect>`, ...)
- Their properties become **attributes** (position, size, colour)
- The whole drawing is a document tree

```xml
<svg xmlns="http://www.w3.org/2000/svg" width="200" height="100">
  <rect x="10" y="10" width="80" height="80" fill="steelblue" />
  <circle cx="150" cy="50" r="40" fill="tomato" />
</svg>
```

A browser or renderer reads these tags and draws the shapes at any scale without losing sharpness.

## Why plain text matters

Because an SVG is just text, it can be:

- sent over a network like any other file (the server sends XML, the **client's browser does the rendering**)
- stored and diffed in version control (Git)
- indexed by search engines
- edited in a plain text editor

None of this is possible with a raster image. This is why SVG dominates icons, logos, and UI graphics on the web.

## Where it leads
"Who does the rendering, server or client?" is the question behind [ssr-vs-csr-rendering](ssr-vs-csr-rendering.md).

## Key takeaway
> SVG is an XML document describing shapes mathematically. Being plain text makes it lightweight, scalable, transmittable, versionable, and editable.
