# Lecture 20 — Oct 29, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand that the course has now moved into digital image processing, the second major block of CSC360
- [ ] Know what image contrast is and why algorithms depend on strong contrast at boundaries
- [ ] Know what an image histogram plots (intensity 0–255 on x, pixel count on y) and how to read it
- [ ] Diagnose underexposed, overexposed, and well-exposed images from a histogram
- [ ] Understand histogram equalization and why the cumulative distribution function (CDF) is the remapping function
- [ ] Know what Otsu's method does with a bimodal histogram
- [ ] Understand convolution: a kernel slides across the image, multiplying and summing the neighbourhood
- [ ] Know the filter types: Gaussian, median (non-linear), Sobel/Laplacian, sharpening
- [ ] Understand edge detection with Sobel/Prewitt and the stages of the Canny detector
- [ ] Understand how the five topics form a processing pipeline toward segmentation

## Questions discussed in class

- What makes objects distinguishable from their backgrounds, and how is that measured?
- What does a histogram tell you about an image without looking at the image?
- How do you correct an underexposed or low-contrast image computationally?
- How can an algorithm separate foreground from background automatically?
- How does a small kernel produce blurring, sharpening, or edge detection depending on its values?
- Why does the Canny detector blur the image before computing gradients?

## Key takeaways

- The five topics build on each other: contrast sets the condition; the histogram measures and diagnoses it; equalization corrects it; filtering prepares the image (suppress noise or enhance structure); edge detection extracts structure for segmentation and recognition.
- **Contrast** is the range between the lightest and darkest pixel values. High contrast = wide dynamic range and sharp boundaries; low contrast = intensities clustered in a narrow band, a flat, washed-out look.
- **Histogram:** for 8-bit grayscale, intensity runs from 0 (black) to 255 (white). Bunched near 0 = underexposed; bunched near 255 = overexposed; spread across the range = well exposed. It is a complete tonal summary in one graph.
- **Histogram equalization** remaps a concentrated distribution across the full 0–255 range using the CDF, aiming for a flat output histogram and better global contrast.
- **Otsu's method** finds the threshold that best separates the two peaks of a bimodal histogram, automatically splitting foreground from background (used in document scanners for binarization).
- **Convolution:** a small kernel (3×3, 5×5) slides over the image; each position gets the sum of element-wise products. The kernel values alone decide the effect: Gaussian weights blur, derivative kernels (Sobel, Laplacian) detect edges, high-pass kernels sharpen. The **median** filter is non-linear (sort the neighbourhood, take the middle) and removes salt-and-pepper noise while preserving edges.
- **Edges** are sharp intensity changes at object boundaries. Sobel/Prewitt compute horizontal and vertical gradients. **Canny:** Gaussian blur → gradient magnitude and direction → non-maximum suppression (thin to 1 px) → hysteresis thresholding. Skipping a stage (e.g. the blur) degrades output predictably.
- Connections: pixel values 0–255 are the same 8-bit colour components from the Java 2D lectures; the kernel (a small matrix applied to values and summed) has the same structure as the matrix transformations of coordinates (Lecture 17).
- Real-world uses: camera histograms and Lightroom/Photoshop, lane and pedestrian detection in autonomous vehicles, tumour boundaries in CT/MRI scans, document scanners.
- Challenging parts: why the CDF is the right remapping function is not self-evident the first time; and the median filter belongs to the same neighbourhood-operation family but is not a convolution.
