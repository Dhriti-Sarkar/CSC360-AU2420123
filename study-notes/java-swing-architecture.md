# Java Swing Architecture: JFrame, JPanel, and paintComponent (explained simply)

## The correct structure: frame contains panel (not the other way around)

It's easy to assume a "frame" might go inside a "panel," but it's actually the opposite:

- **JFrame** — this is the actual **application window** itself — the outer container with a title bar, close button, resizing borders, etc. Think of it as the physical window frame around a picture.
- **JPanel** — this is a **custom drawing surface** that goes *inside* the JFrame. This is where your actual shapes, graphics, and custom drawing logic live.

**Simple analogy:** the JFrame is like a picture frame hanging on the wall. The JPanel is like the canvas you slide inside that frame, and it's the canvas — not the frame itself — where you actually paint your picture.

## Setting up the JFrame

Basic lifecycle setup for a JFrame typically involves:
- Setting its **size** — how big the window is.
- Setting **visibility** — making the window actually show up on screen.
- Setting the **close operation** — telling Java what should happen when the user clicks the window's close button (e.g., actually exit the program).

## paintComponent(Graphics g) — the core rendering loop

Inside your custom JPanel class, you override a method called `paintComponent(Graphics g)`. This is where all your actual drawing instructions go (like `fillRect`, `drawPolygon`, etc. from Lecture 4).

**Why `super.paintComponent(g)` is mandatory:** at the very start of your overridden method, you must call `super.paintComponent(g)` first. This tells Java to run the *original* built-in painting behavior of JPanel first (which clears the panel's background properly) before your own custom drawing code runs. If you skip this, old drawings can stick around visually even after they should be gone — these leftover bits are called **visual artifacts**, essentially graphical "ghosts" left behind from previous frames.

**Simple analogy:** think of `super.paintComponent(g)` like wiping a whiteboard clean before you start drawing your next diagram — skip that step, and your new drawing gets messily layered on top of the old one instead of starting fresh.

## Setting colors and stroke before drawing

Using the `Graphics` object, you set the active color (via the `Color` class) and any stroke/style properties **before** you actually call a drawing method — this is the same "state machine" idea from Lecture 4, where `setColor()` sets what "marker" is currently selected before you draw with it.

## Adding interactive controls

To add something interactive like a button, you create a `JButton` object and add it directly onto the `JFrame` container — this is a basic example of an **event-driven layout**, where the UI is waiting to respond to user actions (like clicking that button) rather than just displaying static content.