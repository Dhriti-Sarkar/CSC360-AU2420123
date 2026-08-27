# Java OOP: Inheritance & Anonymous Classes (explained simply)

## What is inheritance?

Inheritance is when one class (called the **subclass**) is built on top of another class (called the **base/parent class**), automatically getting access to that parent's existing state (variables) and behavior (methods) — and then adding or customizing things on top of that.

**The example from class:** `class SweetApple extends Apple` — here, `SweetApple` is the subclass, and `Apple` is the base class. `SweetApple` automatically gets everything `Apple` already has, and can then add extra features specific to being "sweet" without rewriting everything `Apple` already does.

**Simple analogy:** think of a base class like a general blueprint for "a vehicle" — it has wheels, an engine, the ability to move. A subclass like "car" or "motorcycle" inherits all of that basic vehicle behavior automatically, and then just adds its own specific extra details (like a car having 4 doors), instead of having to redefine "how to have wheels" from scratch every time.

## Why this matters for Java graphics frameworks

This connects directly to how JavaFX/Swing work — when you write `public class App extends Application` (which you've already done in your square demo project!), you're using inheritance. Your `App` class automatically inherits all the built-in behavior of JavaFX's `Application` class, and you just override/add the specific parts you need (like the `start()` method).

## What is an anonymous inner class?

Normally, if you want to define a class, you write it out formally with its own name, in its own place. An **anonymous inner class** is a shortcut: you define a small, one-off class **inline**, right where you need it, without giving it a formal standalone name at all.

**Why it's used:** this is especially handy for event handling — instead of writing an entire separate named class just to handle, say, a button click one time, you can define the response code right on the spot, inline, saving you from cluttering your project with lots of tiny single-use class files.

**Simple analogy:** think of it like writing a quick sticky note with instructions for one specific task, versus writing and filing away an entire formal document for something you'll only ever do once. Both get the job done, but the sticky note (anonymous class) is faster when you don't need it to be reused elsewhere.