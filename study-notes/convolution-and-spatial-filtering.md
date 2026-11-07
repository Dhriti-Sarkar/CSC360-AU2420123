# Convolution & Spatial Filtering (explained simply)

A **filter** is a neighbourhood operation: a pixel's new value comes from its own value and the values around it. The standard mechanism is **convolution**.

## How convolution works

A small matrix called a **kernel** (typically 3×3 or 5×5) slides across the image. At each position:

1. Multiply each kernel value by the pixel value under it (element-wise).
2. Sum the products.
3. That sum is the new pixel value at the kernel's centre.

```
Neighbourhood        Kernel (box blur, /9)     New centre pixel
10 20 30             1 1 1
40 50 60      *      1 1 1               =     (10+20+...+90)/9 = 50
70 80 90             1 1 1
```

The same sliding-window process gives blurring, sharpening, or edge detection depending **entirely on the numbers in the kernel**. Edges of the image need a rule (pad with zeros, replicate the border, or skip the border).

Structurally this is the same "matrix times values, then sum" pattern as the coordinate transformations in [2d-transformations-in-javafx](2d-transformations-in-javafx.md) and [linear-equations-and-matrices](linear-equations-and-matrices.md), applied to a neighbourhood instead of a coordinate.

## Filter types

| Filter | Kernel design | Effect |
|---|---|---|
| **Gaussian** | Weights from a 2D Gaussian (centre weighted most) | Smooth blur, noise reduction |
| **Median** (non-linear) | Sort the neighbourhood, take the middle value | Removes salt-and-pepper noise, preserves edges |
| **Sobel / Laplacian** | Derivative operators (gradient / second derivative) | Edge detection |
| **Sharpening** | High-pass design amplifying differences | Accentuates fine texture and edges |

Example kernels:

```
Gaussian (approx, /16)   Sobel X (horizontal gradient)   Sharpen
1 2 1                    -1 0 1                           0 -1  0
2 4 2                    -2 0 2                          -1  5 -1
1 2 1                    -1 0 1                           0 -1  0
```

## Linear vs non-linear

Gaussian, Sobel, Laplacian, and sharpening are **linear**: they are convolution (weighted sums). The **median** filter is **non-linear**: it sorts rather than sums, so it can't be written as a kernel. It still belongs to the same family of neighbourhood operations, and its advantage is that an extreme noise pixel is simply ignored instead of being averaged into its neighbours.

## Where it fits
Filtering sits after contrast correction ([image-contrast-histograms-and-equalization](image-contrast-histograms-and-equalization.md)) and before edge detection ([edge-detection-and-canny](edge-detection-and-canny.md)): it suppresses noise or enhances structure so later stages work better.

## Simple analogy
A stencil you slide across a photo: the numbers on the stencil decide whether it smears the picture (blur), exaggerates detail (sharpen), or highlights outlines (edges).

## Key takeaway
> Convolution = slide a kernel, multiply, sum. The kernel's values alone decide the effect. The median filter is the non-linear neighbour in the same family.
