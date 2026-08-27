# Markdown Standards for Reflection Notes (explained simply)

## What makes a good reflection note vs a shallow one

The lecture stressed that reflection notes shouldn't just restate what happened in class ("we learned about rectangles today"). Instead, good notes should capture:
- **Personal learning breakthroughs** — the specific moment something clicked or made sense.
- **Algorithmic logic** — actually explaining the "how" behind a method or formula, not just naming it.
- **Conceptual connections** — linking a new topic back to something learned earlier (e.g., noticing that centering a square and centering a rectangle rely on the same underlying idea).

**Simple way to think about it:** a shallow note answers "what did we do?" A good note answers "why does this work, and how does it connect to what I already know?"

## Markdown formatting techniques worth using

- **Headers** (`#`, `##`, `###`) — organize notes into clear sections, so a long document is easy to scan and jump around in.
- **Tables** — great for comparing things side by side (like the Windows vs Linux table from Lecture 1), instead of writing it all out as prose.
- **Code blocks** (using triple backticks ``` ) — used to show actual code or formulas clearly, separated visually from regular explanation text.
- **Blockquotes** (using `>`) — useful for calling out a key takeaway or important summary line, making it visually stand out from the rest of the note.

## Tools to preview Markdown without opening a full IDE

Since `.md` files are just plain text with formatting symbols, you don't actually need IntelliJ open to see how they'll look once rendered. Some lighter-weight options:
- **Standalone Markdown viewer apps** — small desktop programs dedicated to just previewing Markdown files.
- **Browser extensions** — let you open a `.md` file directly in your browser and see it rendered, rather than as raw text.
- **Command-line tools like `grip`** — `grip` specifically renders Markdown exactly the way GitHub would display it (this is called "GitHub-flavored Markdown"), which is especially useful since your notes are going straight to a GitHub repo anyway.

**Why this matters:** it lets you quickly check that your formatting (tables, headers, etc.) actually looks right before pushing it, without needing to open a heavy program just to preview a text file.