# Row Vectors vs Column Vectors (explained simply)

## What is a vector, structurally?

A vector represents a quantity with both **magnitude** (size/length) and **direction** — like an arrow pointing somewhere in space. But when you write it down as numbers, there are two different layouts you can use.

## Row vector vs column vector

- **Row vector** — numbers laid out **horizontally**, in a single row. A 3D point like (4, -2, 7) written as a row vector looks like a 1×3 matrix (1 row, 3 columns).
- **Column vector** — numbers laid out **vertically**, in a single column. The same point written as a column vector is a 3×1 matrix (3 rows, 1 column).

**They're transposes of each other** — "transpose" just means flipping rows into columns (and vice versa). The exact same point/data, just arranged differently.

## Why the arrangement actually matters: matrix multiplication rules

Matrix multiplication has a strict rule: it's only defined when **the number of columns in the first matrix matches the number of rows in the second matrix**. Because row vectors and column vectors have different shapes, this rule forces you to multiply them in different orders/positions depending on which one you're using.

## Column vectors: post-multiplication (used in OpenGL, Java graphics)

With column vectors, you write the transformation like this:

$$v' = Mv$$

Here, a 3×3 transformation matrix `M` is placed **before** the 3×1 column vector `v` — this is called **post-multiplication** (the vector is "multiplied" by the matrix from the left... the naming can feel a little backwards, but the key thing to remember is the *order they appear in the equation*: matrix first, then vector).

**Chaining multiple transformations (rotate, then scale, then translate) with column vectors reads right-to-left:**

$$v' = T \cdot S \cdot R \cdot v$$

This means the transformation **closest to `v`** (in this case, R) is actually applied **first**, and the transformation furthest away (T) is applied **last** — read the equation from right to left to get the actual order of operations.

## Row vectors: pre-multiplication (used in DirectX)

With row vectors, the transformation is written the other way:

$$v' = vM$$

Here, the row vector `v` comes **before** matrix `M` — called **pre-multiplication**.

**Chaining multiple transformations with row vectors reads left-to-right:**

$$v' = v \cdot R \cdot S \cdot T$$

This time, the first transformation applied (R) appears **first** in the equation, and things read naturally left to right in the actual order they happen.

## Why this distinction is genuinely important, not just academic

Different graphics APIs made different conventions their standard — OpenGL and most math textbooks use column vectors; DirectX uses row vectors. If you mix these up (e.g., write a matrix multiplication in the wrong order for the convention your framework expects), you can get **orientation errors, coordinate transposition bugs, and shader pipeline failures** — because you're implicitly applying transformations in the wrong order, or applying a transformation meant for one convention using the other's math.

## Simple analogy

Think of it like reading instructions written in two different valid formats — one written as "do X, then do Y, then do Z" (left to right, like row vectors), and another written as "Z happens after Y happens after X" (right to left, like column vectors). Both describe the same sequence of steps, but if you mix up which format you're reading, you'll perform the steps in the wrong order.

## Key takeaway
> Row vectors → pre-multiplication (vM), chains left-to-right (DirectX convention). Column vectors → post-multiplication (Mv), chains right-to-left (OpenGL/Java convention). Same math, different notation — mixing conventions causes real bugs.