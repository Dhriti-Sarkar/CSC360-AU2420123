# The Three Tiers of Graphics Complexity (explained simply)

Our course is structured as a step-by-step difficulty ramp — each tier builds on the math/skills from the one before it.

## Tier 1: Basic shapes (where we started)

This is the centered-square work from Lecture 4/5 — simple, "orthogonal" (straight, right-angled) shapes like squares and rectangles. Even though this seems basic, it actually teaches the core foundations everything else builds on:
- How screen coordinates work (top-left origin, not center-based)
- How to calculate offsets so a shape appears properly centered
- The basic idea of mapping "real-world" positions onto a pixel grid (this is what "Cartesian-to-raster mapping" means — converting standard x/y math coordinates into actual pixel positions on screen)

## Tier 2: Multi-point polygons (triangles)

This is the next step up — instead of simple 4-sided shapes, we work with triangles built from 3 arbitrary points.

**Why triangles specifically?** Any 3 points that aren't in a straight line (non-collinear — remember this from Lecture 6's collinearity discussion!) always define a single, flat, unambiguous plane. This sounds abstract, but it's *the* reason triangles are used as the standard building block in basically all graphics hardware and 3D rendering — more complex shapes (like a 4+ sided polygon) can sometimes be non-flat or ambiguous in 3D space, but a triangle never has that problem.

This tier also introduces more advanced math:
- **Cross products and determinants** — mathematical tools used to verify that 3 points really aren't collinear, and to calculate things like triangle orientation.
- **Barycentric coordinates** — a way of describing "where" a point is *relative to* a triangle's 3 corners (useful for things like coloring/shading across a triangle's surface).
- **Affine transformations** — operations like rotating, scaling, and shearing a shape at arbitrary angles (beyond just simple up/down/left/right movement).

## Tier 3: Recursive/fractal generation (trees, plants)

The most advanced tier — instead of drawing one fixed shape, you write a **recursive function** (a function that calls itself) that generates branching, tree-like structures automatically.

**How it works conceptually:** you start with one "stem," then at some point it splits into two (or more) smaller sub-branches, each of which can split again, and again, going deeper and deeper (each repeat is called a "recursion depth"). Each new branch level typically gets:
- **Scaled down** slightly (branches get smaller as they go further out — like a real tree).
- **Rotated** by some angle (so branches spread out in different directions, rather than growing straight up).

**L-systems (Lindenmayer systems)** are mentioned as a specific formal technique for this — essentially a set of simple rewrite rules that, when applied repeatedly, generate complex branching patterns from very simple starting instructions.

**Simple analogy:** think of it like a set of instructions "grow a branch, then split into 2 smaller branches at an angle, then repeat this same rule on each new branch" — run that same simple rule over and over, and you end up with something that looks like a realistic tree or plant, purely from a small repeating pattern.

## Why this progression matters

Each tier isn't really a totally separate topic — it's building directly on the previous one. Tier 2's triangle math depends on Tier 1's coordinate system basics. Tier 3's recursive branching depends on being comfortable placing and transforming individual shapes (rotating, scaling) from Tier 2.