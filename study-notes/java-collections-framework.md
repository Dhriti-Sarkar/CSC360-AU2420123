# Java Collections Framework & View-Only Access (explained simply)

This session placed the data structures from Lecture 8 (Stack vs Queue) inside the bigger picture of Java's built-in toolbox. Covered in Core Java Vol. I, Chapter 9 (with generics in Chapter 8 — the `<String>` in `ArrayList<String>` is generics at work, giving compile-time type safety).

## The hierarchy

- **`Iterable`** — the root. Anything iterable can be used in a for-each loop.
- **`Collection`** — extends `Iterable`, and branches into three main interfaces:
  - **`List`** — ordered, allows duplicates (e.g. `ArrayList`, `LinkedList`)
  - **`Set`** — no duplicates (e.g. `HashSet`, `TreeSet`)
  - **`Queue`** — items processed in order, typically first-in-first-out (e.g. `LinkedList`, `PriorityQueue`)
- **`Map`** — a **separate** branch for key-value storage (e.g. `HashMap`, `TreeMap`). It does *not* extend `Collection`.

**Where Stack fits:** `Stack` is a legacy class built on `Vector`, which is itself a legacy `List` implementation. Queue, by contrast, is one of the three main branches.

## View-only access

Sometimes you want to let other parts of the code **see** your data but not **change** it. Java supports this through **unmodifiable wrappers** (e.g. `Collections.unmodifiableList(list)`): the wrapper is a *view* over the underlying data, and any attempt to modify it throws an `UnsupportedOperationException`.

This is the same read-vs-write separation that comes up constantly in DSA — here it's a design pattern for keeping shared state safe.

**Note:** a view reflects the underlying collection. If the original owner changes the list, the view shows the change; only the *holder of the view* is blocked from modifying.

## Related chapters (for later)

- **Ch. 7 — Exceptions, assertions, logging:** how Java signals runtime problems — you throw, catch, and handle them before they crash the program.
- **Ch. 8 — Generic programming:** writing code that works across types while keeping compile-time safety.

## Simple analogy
A `List` is a numbered shelf, a `Set` is a bag that rejects duplicates, a `Queue` is a ticket line, and a `Map` is a dictionary. An unmodifiable wrapper is a glass display case: people can look, but not touch.

## Key takeaway
> The Collections Framework is a hierarchy (Iterable → Collection → List/Set/Queue, with Map separate). Unmodifiable wrappers give read-only views of data, enforcing read/write separation by throwing an exception on modification.
