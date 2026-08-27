# Core Java Syntax Review (explained simply)

## Import declarations

Lines like `import javax.swing.*;` and `import java.awt.*;` at the top of a Java file tell your program "I want to use tools/classes that live in this external package/library." The `*` means "import everything available in this package," rather than listing out each individual class you need one by one.

- `javax.swing.*` — gives access to Swing's windowing/GUI toolkit (JFrame, JPanel, JButton, etc.)
- `java.awt.*` — gives access to AWT's graphics tools (Graphics, Color, and other lower-level drawing utilities)

## Class declarations & access modifiers

An **access modifier** (like `public`, `private`) controls *who else* is allowed to see or use a class/method/variable. `public` means it's accessible from anywhere in the program; more restrictive modifiers limit that visibility.

## The main method — where every program starts

```java
public static void main(String[] args) {
    // program starts running here
}
```

Breaking this down piece by piece:
- `public` — accessible from anywhere, so Java's runtime environment can actually find and call it to start your program.
- `static` — means this method belongs to the class itself, not to any specific instance/object of that class, so it can run without needing to first create an object.
- `void` — means this method doesn't return any value back.
- `main` — the special, required name Java looks for as the starting point of execution.
- `String[] args` — allows optional command-line arguments to be passed in when the program is run.

## Naming conventions

- **CamelCase** (capital first letter of each word, including the very first word) — used for **class names**. Example: `SweetApple`, `App`.
- **camelCase** (lowercase first letter, capital for each word after) — used for **method names** and variable names. Example: `drawLine`, `setLayoutX`.

**Simple way to remember:** classes get a capital letter right at the start (like a proper noun); methods/variables start lowercase.

## Drawing method arguments

Methods like `drawLine`, `drawRect`, `fillOval`, and `drawPolygon` all take specific parameters that define exactly what to draw and where — following the same idea we've seen throughout: it's not just "draw a shape," but "draw a shape at these exact coordinates, with this exact size."