# Multi-Job Concurrency: ExecutorService & Task<V> (explained simply)

This builds directly on the concurrency/EDT concepts from Lecture 7 — same core problem, but now applied specifically within JavaFX's own threading tools.

## Recap: why heavy work can't run on the UI thread

Just like Swing has the **Event Dispatch Thread (EDT)**, JavaFX has its own equivalent: the **JavaFX Application Thread**. This single thread is responsible for managing the entire scene graph and dispatching all UI events. If you run something slow/heavy directly on this thread — like a long-running background job — the **entire interface freezes** until that work finishes, since there's no other thread available to keep handling repaints and user input in the meantime.

## The tools JavaFX provides for this: ExecutorService and Task<V>

- **`ExecutorService`** — a general Java concurrency tool (not JavaFX-specific) that manages a **pool of background worker threads** — instead of manually creating and managing individual `Thread` objects yourself, an ExecutorService handles assigning work to available threads efficiently.
- **`Task<V>`** — a JavaFX-specific class designed *specifically* for background work that needs to safely report progress/results back to the UI. The `<V>` just means it's generic — it can return any type of result value once the task completes.

## How progress reporting works safely

Each background `Task` calculates its own progress and reports it back to the UI using a special **thread-safe property**: `task.progressProperty()`. This is important — directly updating a regular UI component's property from a background thread would violate the single-threaded UI rule from Lecture 7, but JavaFX's `Task` framework is specifically built to let this progress value update safely, without manually invoking something like `SwingUtilities.invokeLater()` yourself every time (JavaFX handles that safety internally, when used correctly through Task).

## Building a composite progress bar

The idea in Group 8's project is to track **multiple** background jobs at once, and combine ("aggregate") their individual progress values into a single overall completion percentage — showing the user one unified progress indicator representing the combined status of everything running in the background.

## Safe task cancellation

Allowing a user to cancel a specific running job requires careful handling — you can't just forcibly kill a thread instantly, since it might be in the middle of using some resource (like a file or network connection) that needs to be cleaned up properly first.

**The correct pattern:**
1. The background task periodically checks: `Thread.currentThread().isInterrupted()` — essentially asking itself "has someone requested that I stop?"
2. If interrupted, the task should **release any resources** it was using (close files, network connections, etc.) cleanly.
3. It then terminates gracefully, and the corresponding UI progress indicator updates to show a "cancelled" state — all without destabilizing or crashing the rest of the running application.

## Simple analogy

Think of `ExecutorService` like a manager assigning tasks to a pool of available workers, rather than you personally hiring and directly supervising each individual worker yourself. `Task<V>` is like a specific worker who's been given a walkie-talkie (the thread-safe progress property) that lets them radio back status updates safely, without just barging into the main office (the UI thread) themselves. Cancellation is like calling a worker on that same walkie-talkie and telling them "stop what you're doing, but please put your tools away properly first" rather than just cutting their power without warning.

## Key takeaway
> JavaFX's Task<V> + ExecutorService let you run heavy work on background threads while safely reporting progress back to the UI, using thread-safe properties instead of directly touching UI components from a background thread. Safe cancellation means checking interrupt status periodically and cleaning up resources gracefully, rather than abruptly killing a thread.