# Lecture 23 — Nov 3, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know how a pixel is represented: RGB channels, 8 bits (1 byte) each, values 0–255, about 16.7 million colours
- [ ] Know the difference between RGB (3 bytes) and RGBA (4 bytes, with an Alpha transparency channel)
- [ ] Be able to compute the byte index of pixel (i, j): `(i * n + j) * 3` for RGB, `* 4` for RGBA
- [ ] Be able to compute the total storage of an image (m × n × 3 or × 4 bytes, before compression)
- [ ] Know the channel byte orders: RGBA, BGRA, ARGB
- [ ] Know what endianness is and the difference between little-endian and big-endian
- [ ] Know what network byte order is (big-endian)
- [ ] Be able to explain why channel order and endianness are different ideas that both affect interpretation

## Questions discussed in class

- What is a pixel made of, and how many bytes does it take?
- What does the Alpha channel do?
- Where in memory does pixel (i, j) start?
- How much memory does a 1920 × 1080 image take?
- Is the order of the colour channels the same thing as the order of bytes in a number?
- Why do network protocols use big-endian?

## Key takeaways

- Lecture 22 was about what we can do to an image (contrast, filtering, edges); this session went one level lower to what an image is made of as raw bytes. The six topics build in order: pixel → channels → bytes → one long array → byte order decides how it is read back.
- **Pixel:** 8 bits per channel, 0–255. RGB gives 256 × 256 × 256 = 16,777,216 colours.
- **RGB vs RGBA:** RGB = 3 bytes (24 bits); RGBA = 4 bytes (32 bits). Alpha: 0 = fully transparent, 128 ≈ 50% opacity, 255 = fully opaque.
- **Storage:** an m × n image is stored as one 1D byte array, row after row. Pixel (i, j) starts at `(i * n + j) * 3` (RGB) or `* 4` (RGBA). Example: in a 4-pixel-wide RGB image, pixel (1, 2) starts at (1 × 4 + 2) × 3 = 18, so R, G, B are at bytes 18, 19, 20. A 1920 × 1080 image is 6,220,800 bytes as RGB (~6.2 MB) and 8,294,400 bytes as RGBA (~8.3 MB), uncompressed.
- The pixel directly above pixel (i, j) in an RGB image is `n * 3` bytes earlier, which shows where the neighbours used by convolution filters (Lecture 22) sit in memory.
- **Channel byte order:** RGBA, BGRA, and ARGB store the same pixel with the channels in a different order. Software must know which one it is reading.
- **Endianness:** the order of bytes inside one multi-byte value. `0x12345678` is `78 56 34 12` little-endian and `12 34 56 78` big-endian. Intel x86 is traditionally little-endian.
- **Network byte order** is big-endian (IP sends the most significant byte first). Some file formats record byte order in the file: a TIFF starts with `II` (Intel, little-endian) or `MM` (Motorola, big-endian).
- The two ideas meet: an opaque red pixel as the ARGB number `0xFFFF0000` is stored as `FF FF 00 00` on a big-endian machine (ARGB order) but `00 00 FF FF` on a little-endian machine (BGRA order). This is one reason BGRA is so common.
- Mixing them up gives wrong colours (red and blue swapped: faces turn blue, skies turn orange). Web canvas pixel data is RGBA; Java's `BufferedImage` has types like `TYPE_INT_ARGB` and `TYPE_3BYTE_BGR`.
- Related to UTF-16 (Lecture 7): a 2-byte unit can also be stored with either byte first.
- Challenging part: keeping channel ordering and endianness separate in my head, since both are about the order of bytes. Working through an actual pixel value made the difference clear.
