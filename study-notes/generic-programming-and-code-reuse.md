# Generic Programming & Reusable Code (explained simply)

If you write nearly the same class or method twice just because the types differ, something is wrong. Generics are Java's solution: make the **type itself a parameter**, write one version, and the compiler adapts it for whatever type is used. (Core Java Vol. I, Chapter 8; the `<String>` in `ArrayList<String>` was introduced in [java-collections-framework](java-collections-framework.md).)

## Before and after

Without generics, a container for integers and another for strings are two near-identical classes.

```java
// One generic version replaces both
public class Box<T> {
    private T value;
    public Box(T value) { this.value = value; }
    public T get() { return value; }
    public void set(T value) { this.value = value; }
}

Box<Integer> a = new Box<>(42);
Box<String>  b = new Box<>("hello");
```

A generic method:

```java
public static <T> void swap(T[] arr, int i, int j) {
    T tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
```

## Why it matters

- **One place for the logic:** a fix or improvement applies everywhere the code is used.
- **Compile-time type safety:** no casting, and wrong types are caught by the compiler.
- **Easier to maintain and test** than several near-identical copies.

The Collections Framework is the best example: `List`, `Map`, and `Set` do the same adding, removing, and traversing regardless of the element type.

## Generics vs inheritance

Both come from the instinct to write logic once, but they solve different problems:

- **Inheritance / polymorphism** ([java-oop-inheritance](java-oop-inheritance.md)): share behaviour down a class hierarchy.
- **Generics:** share behaviour across unrelated types through parameterisation.

## Real-world use
Collections, Spring's dependency injection and data access layers, and any library that must work across data types without forcing casts. A sorting algorithm written once as a generic method beats ten type-specific versions.

## Simple analogy
A cookie cutter with an interchangeable dough: one tool, any flavour. You don't buy a new cutter for each flavour.

## Key takeaway
> Generics make the type a parameter, so one implementation covers all types, keeping logic in one place and checked at compile time.
