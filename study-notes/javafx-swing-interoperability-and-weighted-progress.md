# JavaFX + Swing Interoperability & Weighted Progress (explained simply)

Two ideas from the presentations in Lecture 18, both building on concurrency and the GUI frameworks covered earlier.

## 1. Using Swing inside JavaFX (and the reverse)

JavaFX and Swing are not mutually exclusive ([java-gui-frameworks](java-gui-frameworks.md), [java-swing-architecture](java-swing-architecture.md)).

| Direction | Class |
|---|---|
| Swing component inside a JavaFX scene | `SwingNode` |
| JavaFX scene inside a Swing window | `JFXPanel` |

**Threading is the catch.** The two toolkits have separate event systems:

- Swing code must run on the Swing **Event Dispatch Thread**: use `SwingUtilities.invokeLater(...)`.
- JavaFX UI code must run on the **JavaFX Application Thread**: use `Platform.runLater(...)`.

```java
SwingNode node = new SwingNode();
SwingUtilities.invokeLater(() -> node.setContent(new JComboBox<>(items)));

// later, from a Swing callback, update a JavaFX label:
Platform.runLater(() -> label.setText("Selected"));
```

Real-world use: `SwingNode` exists so large enterprise Swing applications can migrate to JavaFX one screen at a time while the legacy parts keep working.

## 2. Weighted progress across jobs

When several background jobs run together, one overall bar should reflect how much **work** is done, not the plain average of the percentages.

```
overall = (sum of workDone_i) / (sum of totalWork_i)
```

Example: Job A has 200 units of work, Job B has 100. If A is 50% (100 done) and B is 100% (100 done):

- Simple average of percentages = (50 + 100) / 2 = 75%
- Weighted = (100 + 100) / (200 + 100) = 66.7%

The weighted value is the honest one: a 10-second task and a 10-minute task must not count equally. CI dashboards and download managers use this logic.

The jobs themselves run on background threads with `Task` objects submitted to an `ExecutorService`, reporting progress with `updateProgress(workDone, max)`, while the UI binds to those properties on the Application Thread ([concurrency-executorservice-and-tasks](concurrency-executorservice-and-tasks.md), [concurrency-and-thread-safety](concurrency-and-thread-safety.md)).

## Simple analogy
Two languages in one meeting need a translator at the door: `invokeLater` and `runLater` are the translators for each side. A weighted progress bar is like measuring a move by boxes carried, not by rooms finished.

## Key takeaway
> Swing and JavaFX can share a window with `SwingNode`/`JFXPanel` as long as each side's updates go through its own thread, and combined progress should be weighted by total work.
