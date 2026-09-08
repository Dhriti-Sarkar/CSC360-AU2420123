# Systems of Linear Equations & Matrices (explained simply)

## Why graphics relies on linear algebra

Nearly everything visual that happens in computer graphics — rotating a shape, scaling it, moving it, or projecting a 3D object onto a flat 2D screen — is mathematically a **linear transformation** applied to points (vectors) in space. Understanding how these transformations are represented mathematically is the foundation for understanding how graphics engines actually compute them.

## What is a system of linear equations?

A "system of linear equations" just means multiple equations, all sharing the same set of unknown variables, that need to be true simultaneously. For example, three equations all involving the same three unknowns `x`, `y`, and `z`.

## Representing it as a single matrix equation: Ax = b

Rather than solving these equations one at a time using substitution (like you might in basic algebra), graphics systems represent the *entire system* as a single compact equation:

$$Ax = b$$

Breaking down what each part means:
- **A (the coefficient matrix)** — a grid containing just the numbers that multiply each unknown, taken directly from the original equations. If you have 3 equations with 3 unknowns, A is a 3×3 matrix.
- **x (the unknown vector)** — a column containing the actual unknowns you're solving for (like x, y, z).
- **b (the constant vector)** — a column containing the constant values from the right-hand side of each original equation.

**Example walkthrough:** given equations like `2x + 3y + 1z = 8`, the numbers `2, 3, 1` become one row of matrix A, and `8` becomes the corresponding entry in vector b. Do this for all 3 equations, and you get the full A matrix and b vector.

## Why bother converting to matrix form?

This isn't just a notational trick — it lets graphics engines use **optimized, general-purpose techniques** (matrix multiplication, Gaussian elimination — a systematic method for solving equations, and matrix decomposition — breaking a matrix into simpler pieces) to solve for unknowns, rather than writing custom, one-off algebra for every different situation.

**Why this matters at scale:** a real 3D model might have thousands of vertices (points) that all need the same transformation applied. Representing this as matrix operations means the *same* efficient computational method can process all those points uniformly, instead of solving each one with separate, manual algebra.

## Simple analogy

Think of Ax = b like a vending machine: A is the fixed internal mechanism (how each button relates to what gets dispensed), x is which buttons you press (the unknowns), and b is what you actually get out. Instead of manually working out "if I press this combination of buttons, what comes out," matrix math gives a systematic, repeatable way to solve "what combination of button presses (x) produces this exact result (b), given how the machine (A) works."