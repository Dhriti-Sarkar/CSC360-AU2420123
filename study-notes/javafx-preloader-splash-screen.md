# JavaFX Splash Screen with Preloader (explained simply)

Builds on the splash screen components in [javafx-fxml-and-splash-screens](javafx-fxml-and-splash-screens.md) (branding, async preloading, stage transition). This session chose it as the final feature of the list matching project ([list-matching-project-overview](list-matching-project-overview.md)).

## Why bother

Without one, the app opens abruptly. A splash screen greets the user immediately, shows the project name, and gives a loading state while the real work happens. It is a small feature with a large effect on how finished the app feels.

## Approach 1: `Preloader`

`Preloader` is a separate JavaFX class that runs **before** the main `Application`:

1. JavaFX starts the Preloader and shows its lightweight window (name, logo, progress bar).
2. The main `Application`'s `init()` runs in the background and can report progress via `notifyPreloader(...)`.
3. When the app is ready, the Preloader receives a state-change notification and hides itself; the main window is shown.

This keeps splash logic **out of the main application code**.

## Approach 2: separate `Stage` + fade

For simple cases:

1. Open an undecorated `Stage` with the splash content.
2. Run a short `FadeTransition` (or a background `Task`, see [concurrency-executorservice-and-tasks](concurrency-executorservice-and-tasks.md)).
3. Close the splash `Stage`, then show the main `Stage`.

Heavy loading must stay off the JavaFX Application Thread or the splash will freeze.

## Scope check

Name plus a loading indicator is enough. More elaborate branding was discussed and judged not worth the time close to submission.

## Simple analogy
A restaurant host who greets you and shows you to your table while the kitchen finishes preparing: the greeting is not the meal, but it makes the wait feel intentional.

## Key takeaway
> A splash screen gives the app a proper entry point. Use `Preloader` to keep it separate from main logic, or a temporary `Stage` with a fade for simple cases, and never block the Application Thread.
