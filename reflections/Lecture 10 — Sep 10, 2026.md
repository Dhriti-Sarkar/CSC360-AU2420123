# Lecture 10 — Sep 10, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand the course transition: graphics (generating images from code) → image processing (working with images that already exist)
- [ ] Know what Core Java Vol. II covers (streams, networking, database connectivity, concurrency)
- [ ] Know the difference between downloading and streaming a video
- [ ] Know mean, mode, median, variance, and standard deviation, and the population vs sample versions
- [ ] Understand why variance (not just average speed) determines streaming quality
- [ ] Understand why SVG is an XML-based vector format and what that makes possible (plain text, transmittable, editable)
- [ ] Know the difference between Server-Side Rendering (SSR) and Client-Side Rendering (CSR) and the trade-offs of each
- [ ] Know how graphics are stored: relational DB (binary / file path) vs object storage (Amazon S3, Google Cloud Storage)
- [ ] Understand why AWT is called the "Abstract Window Toolkit"
- [ ] Know what our list matching project is and what was planned for it this session

## Questions discussed in class

- What is changing as the course moves from computer graphics to image processing?
- What does Core Java Vol. II cover, and how does it extend Vol. I?
- What is the difference between downloading and streaming a video?
- Why does inconsistent packet delivery (high variance) cause buffering even when average speed is fast?
- What are the mean, mode, median, variance, and standard deviation, and why does sample variance divide by n − 1?
- How is an SVG file related to XML, and why does that make vector graphics easy to transmit and edit?
- Who does the rendering work in SSR vs CSR, and when should each be used?
- How should a large collection of high-resolution images be stored — in a relational database or elsewhere?
- Why is AWT called the "Abstract" Window Toolkit?
- What should our group build for the group project?

## Key takeaways

- The course is pivoting: the first half was *generating* images from code, the second half is *processing* images that already exist to extract meaning or improve them.
- Streaming quality depends on **variance** of packet arrival times, not just average speed. Low variance keeps the buffer full; high variance empties it unpredictably. This is the same maths behind "jitter" vs "ping" in online games.
- SVG is just an XML document: shapes are elements, properties are attributes. It is the Lecture 2 idea of "vectors are mathematical descriptions" written out as a real file format, and because it is plain text it can be sent over a network, versioned in Git, and edited in a text editor.
- SSR vs CSR is a question of *where the work happens*: SSR gives a faster first load and better SEO; CSR gives faster subsequent interactions and cheaper servers. SSR is the software-side view of Lecture 8's headless-server idea.
- For large-scale image storage, object stores (S3, Google Cloud Storage) beat relational databases on scale, redundancy, and cost; a relational DB is fine for a few small images (binary data or a file path).
- AWT delegates to the OS's native widgets (a Windows button on Windows, a macOS button on macOS); the "abstract" part is the Java layer hiding OS differences.
- Our group project is the **list matching project**: two lists shown as aligned columns, with arrows drawn between matching elements (the idea from Lecture 8). This session was planning only; it draws on canvas drawing, event listeners, and layouts.
- Challenging part: object storage (S3) — understood the use case but never configured a bucket.
- CSE330 (Computer Networks) connection: packet delivery variance, server/client work split, and remote storage are all networking concepts landing in a graphics context.
