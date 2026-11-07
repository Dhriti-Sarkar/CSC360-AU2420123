# Statistics: Mean, Median, Mode, Variance & Streaming Quality (explained simply)

Introduced this session through one question: why does a video buffer even when the internet is "fast"?

## Download vs streaming

- **Download:** the whole file arrives first, then playback starts. Quality is consistent because you have everything.
- **Streaming:** content arrives in chunks and playback starts almost immediately, so the experience depends on how *reliably* chunks arrive.

## The five measures

| Measure | What it is |
|---|---|
| **Mean** | The average |
| **Median** | The middle value in sorted order |
| **Mode** | The most frequent value |
| **Variance** | How spread out values are around the mean |
| **Standard deviation** | Square root of variance, back in the data's original units |

```
Population mean:     mu = (x1 + ... + xN) / N
Sample mean:         x  = (x1 + ... + xn) / n

Median (n odd):      value at position (n + 1) / 2
Median (n even):     average of values at positions n/2 and n/2 + 1

Population variance: sigma^2 = sum((xi - mu)^2) / N
Sample variance:     s^2     = sum((xi - x)^2) / (n - 1)

Population SD:       sigma = sqrt(sigma^2)
Sample SD:           s     = sqrt(s^2)
```

- **Mode:** a dataset can be unimodal, multimodal, or have no mode.
- **Median example:** [3, 7, 7, 9, 12] → 7; [3, 7, 9, 12] → (7 + 9) / 2 = 8. The median resists outliers, while the mean gets dragged by them.
- **Why n − 1 (Bessel's correction)?** Sample values sit closer to the *sample* mean than to the true population mean, so dividing by n slightly underestimates the real spread. Dividing by n − 1 corrects for that.

## Variance and streaming

- **Low variance** in packet arrival times → buffer stays full → smooth playback.
- **High variance** → buffer empties before the next chunk arrives → buffering or a quality drop.

Bad streaming is often about *inconsistent* delivery, not slow average speed. Standard deviation of delivery times is the number that captures it.

**Gaming parallel:** "ping" is average round-trip time; **jitter** is the variance of that ping. A steady 60 ms feels smoother than a connection that averages 30 ms but randomly spikes to 80 ms.

## Simple analogy
Two buses both average a 10-minute wait. One comes exactly every 10 minutes; the other sometimes comes in 1 minute and sometimes in 25. Same mean, very different experience — the difference is variance.

## Key takeaway
> The mean tells you the typical value; variance and standard deviation tell you how consistent it is. Streaming quality depends on consistency, so variance matters more than average speed.
