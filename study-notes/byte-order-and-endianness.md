# Channel Byte Order & Endianness (explained simply)

Two different ideas that both decide how bytes are interpreted. Mixing them up is the hardest part of this topic. Continues [pixel-storage-rgba-and-indexing](pixel-storage-rgba-and-indexing.md).

## 1. Channel order (inside a pixel)

Which **colour** comes first in a pixel's bytes. The pixel is the same; only the order of its channels changes.

| Order | Bytes |
|---|---|
| RGBA | Red, Green, Blue, Alpha |
| BGRA | Blue, Green, Red, Alpha |
| ARGB | Alpha, Red, Green, Blue |

Software must know which one it is reading. If it expects RGBA but receives BGRA, red and blue swap: faces look blue, skies look orange. Web canvas pixel data is RGBA; Java's `BufferedImage` has types such as `TYPE_INT_ARGB` and `TYPE_3BYTE_BGR`.

## 2. Endianness (inside one multi-byte value)

The order of the **bytes** of a single value that takes more than one byte.

- **Little-endian:** least significant byte (LSB) stored first.
- **Big-endian:** most significant byte (MSB) stored first.

```
Value 0x12345678
Little-endian:  78 56 34 12
Big-endian:     12 34 56 78
```

Same number, same four bytes, opposite order. Intel x86 is traditionally little-endian, one reason it is so common.

## Network byte order

Network protocols use **big-endian**: IP sends data from the most significant byte to the least significant. Functions like `htons()` convert between host and network order.

Some file formats record their byte order: a **TIFF** file starts with `II` (Intel, little-endian) or `MM` (Motorola, big-endian) so a reader knows how to decode the rest. The same question applies to UTF-16's 2-byte units ([utf8-vs-utf16](utf8-vs-utf16.md)).

In Java, `java.nio.ByteOrder` has `BIG_ENDIAN`, `LITTLE_ENDIAN`, and `nativeOrder()`; `ByteBuffer.order(...)` sets how multi-byte values are read.

## Where the two ideas meet

An opaque red pixel written as the ARGB number `0xFFFF0000`:

| Machine | Bytes in memory | Looks like |
|---|---|---|
| Big-endian | `FF FF 00 00` | ARGB order |
| Little-endian | `00 00 FF FF` | **BGRA** order |

So the same 32-bit pixel number appears as two different channel orders depending on how the machine stores a 32-bit value. This is likely one reason BGRA is so common. Don't assume the bytes in memory match the order of the number you write in code.

## Quick distinction

| | Channel order | Endianness |
|---|---|---|
| Question | Which colour is first in the pixel? | Which byte of one number is first? |
| Applies to | Pixel layout | Any multi-byte value |
| Wrong choice gives | Wrong colours | Wrong values |

## Simple analogy
Channel order is the order of the ingredients on a recipe card. Endianness is whether you write the number "1234" starting with the thousands digit or the units digit. Both can confuse a reader, but they are different mistakes.

## Key takeaway
> Channel order (RGBA, BGRA, ARGB) is which colour comes first in a pixel; endianness is which byte comes first in a multi-byte number. They are separate ideas that meet when a 32-bit pixel is stored on a little- or big-endian machine.
