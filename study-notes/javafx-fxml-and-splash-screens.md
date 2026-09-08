# JavaFX FXML & Splash Screens (explained simply)

## What is FXML, and why does it exist?

**FXML** is an XML-based markup language (similar in spirit to HTML) used specifically for defining a JavaFX UI's **visual structure** — what components exist, how they're laid out, and their basic styling — completely separately from the **Java code** that handles what happens when a user interacts with those components (button clicks, etc.).

**Why separate these?** This is a common software design principle: keeping "what things look like" (presentation/layout) separate from "what things do" (logic/behavior) makes an application easier to maintain. A designer could adjust the FXML layout without needing to touch or understand the underlying Java logic, and a developer can update the logic (the "controller" class) without needing to worry about breaking the visual layout.

**Simple analogy:** think of FXML like a restaurant's floor plan (where tables, the bar, and the kitchen are physically located) versus the actual staff procedures (what a waiter does when a customer orders) — the floor plan and the staff's behavior are separate concerns, even though they work together to run the restaurant.

## Breaking down a splash screen's requirements

A "splash screen" is the temporary branding/loading screen an app shows immediately on startup, before the main application window appears. The lecture breaks this into 3 core engineering components:

**1. Visual identity assets**
The actual branding content — app name, logo (which could be a vector graphic, scalable without quality loss, or a raster/pixel-based image), version number text, and a styled background.

**2. Non-blocking asset preloading**
While the splash screen is showing, the app is often quietly doing real setup work in the background — loading configuration files, initializing a database connection, etc. This needs to happen **asynchronously** (on a separate background thread — connecting directly to the concurrency/EDT concepts from Lecture 6!), so the splash screen's loading indicator (like a progress bar, or an "indeterminate" spinner when you don't know exactly how long something will take) stays smooth and responsive, rather than freezing while the real work happens.

**3. Stage transitions**
Once all the background startup tasks finish, the app needs to automatically close/hide the temporary splash window (referred to as an "undecorated Stage" — meaning a plain window with no title bar or borders, just the splash content) and transition into showing the actual main application window.

## Why this connects back to earlier lectures

The "non-blocking asset preloading" requirement is a direct, practical application of the thread-safety principles from Lecture 6 — you cannot do slow work (like loading a database connection) directly on the JavaFX UI thread without freezing the splash screen's animation/progress indicator.