# Pixel Storage: RGB, RGBA & Indexing (explained simply)

Lecture 21 covered what we can do with an image ([image-contrast-histograms-and-equalization](image-contrast-histograms-and-equalization.md)). This note goes one level lower: what an image is made of as raw bytes. Builds on [raster-vs-vector](raster-vs-vector.md) (raster = a grid of pixels).

## The pixel

- Each pixel is described by colour **channel** values.
- In RGB: Red, Green, Blue, each **8 bits = 1 byte**, range 0–255.
- Possible colours: 256 × 256 × 256 = **16,777,216** (about 16.7 million).

## RGB vs RGBA

| | Channels | Bytes | Bits |
|---|---|---|---|
| RGB | R, G, B | 3 | 24 |
| RGBA | R, G, B, **Alpha** | 4 | 32 |

**Alpha** controls transparency (also 0–255): 0 = fully transparent, 128 ≈ 50% opacity, 255 = fully opaque. A red pixel with alpha 128 lets about half of the background show through.

## One long 1D array

An image with **m rows** and **n columns** has m × n pixels. In memory it is one flat byte array, row after row (row-major order):

```
row 0: P(0,0) P(0,1) ... P(0,n-1) | row 1: P(1,0) ... | row 2: ...
```

**Start index of pixel (i, j)**, counting from 0:

```
RGB:   index = (i * n + j) * 3     -> bytes index, index+1, index+2 = R, G, B
RGBA:  index = (i * n + j) * 4     -> bytes index ... index+3
```

`i * n` counts the pixels in the full rows above; `+ j` the extra pixels in this row; the multiplier is bytes per pixel.

**Worked example:** 4 pixels wide, RGB, pixel (1, 2):
`(1 * 4 + 2) * 3 = 18`, so R, G, B are at bytes 18, 19, 20.

```java
int idx = (i * width + j) * 3;
int r = data[idx] & 0xFF;       // & 0xFF because Java bytes are signed
int g = data[idx + 1] & 0xFF;
int b = data[idx + 2] & 0xFF;
```

**Neighbours:** the pixel directly above (i, j) is `n * 3` bytes earlier; the one to the left is 3 bytes earlier. This is where the neighbourhood used by convolution filters sits in memory ([convolution-and-spatial-filtering](convolution-and-spatial-filtering.md)).

## Total size (uncompressed)

```
RGB:   m * n * 3 bytes
RGBA:  m * n * 4 bytes

1920 x 1080 RGB  = 6,220,800 bytes  (~6.2 MB)
1920 x 1080 RGBA = 8,294,400 bytes  (~8.3 MB)
```

File formats like PNG and JPEG compress this ([utf8-vs-utf16](utf8-vs-utf16.md) is the text analogue of "how data becomes bytes").

## Simple analogy
A very long egg carton read left to right: each cell holds one pixel (3 or 4 eggs). To find the cell for row i, column j, skip i full rows, then j more cells, then multiply by eggs per cell.

## Key takeaway
> A pixel is 3 (RGB) or 4 (RGBA) bytes; an image is one flat array where pixel (i, j) starts at `(i * n + j) * bytesPerPixel`.
