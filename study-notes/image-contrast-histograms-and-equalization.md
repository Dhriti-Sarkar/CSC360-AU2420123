# Contrast, Histograms, Equalization & Otsu's Method (explained simply)

The start of the image processing block: reading and fixing an image's tonal structure. This is the shift from generating images from code (graphics) to working with images that already exist ([graphics-fundamentals](graphics-fundamentals.md)).

## Contrast

Contrast is the range between the lightest and darkest pixel values; it is what makes objects distinguishable from their background.

- **High contrast:** wide dynamic range, bright highlights, deep shadows, sharp boundaries.
- **Low contrast:** intensities clustered in a narrow band (often midtones), a flat, washed-out look where foreground blends into background.

It matters beyond looks: detection, boundary tracking, and segmentation work much better when contrast along boundaries is strong.

## Histogram

For an 8-bit grayscale image, intensity runs from **0 (black) to 255 (white)**. The histogram plots intensity on the x-axis against the **number of pixels** with that value on the y-axis. These are the same 8-bit values used for RGB components in Java 2D ([java-graphics-rendering](java-graphics-rendering.md)).

| Histogram shape | Diagnosis |
|---|---|
| Bunched near 0 | Underexposed (too dark) |
| Bunched near 255 | Overexposed (too bright) |
| Narrow hump in the middle | Low contrast |
| Spread across the full range | Well exposed |
| Two distinct peaks | Two separable regions (e.g. object and background) |

You can diagnose an image without looking at it, which is why cameras show a live histogram and Lightroom/Photoshop update it as you edit.

## Histogram equalization

Remaps a concentrated distribution across the full 0–255 range so the output histogram is as flat as possible, boosting **global contrast**.

**Mechanism:** use the **cumulative distribution function (CDF)** of the histogram as the remapping function.

```
cdf(v)   = (number of pixels with intensity <= v) / total pixels
new(v)   = round( cdf(v) * 255 )
```

Why the CDF works: it maps the most crowded intensity ranges to the widest output ranges (the CDF rises steeply where many pixels sit), spreading them out; sparse ranges get squeezed together. The result is roughly uniform.

Tiny example, 4 intensity levels (0–3) with counts [6, 2, 0, 0] out of 8 pixels:

```
cdf = [0.75, 1.0, 1.0, 1.0]
new = round(cdf * 3) = [2, 3, 3, 3]
```

The two crowded dark levels are pushed apart toward the bright end. (A general version uses `(cdf(v) - cdf_min) / (1 - cdf_min)`.)

## Otsu's method

When a histogram is **bimodal** (two peaks), Otsu's method finds the threshold that best separates the two groups (it minimizes the variance within each group, see [statistics-variance-and-streaming](statistics-variance-and-streaming.md)). That automatically divides foreground from background without a manual threshold. Document scanners use it to binarize pages: black ink vs white paper.

## Simple analogy
A crowded elevator lobby: equalization opens up more lanes where the crowd is thickest so people spread evenly. Otsu draws the line between two clusters of people.

## Key takeaway
> A histogram diagnoses exposure and contrast; equalization fixes it using the CDF as the remapping function; Otsu uses a bimodal histogram to threshold automatically.
