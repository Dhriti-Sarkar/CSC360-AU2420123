# Lecture 18 — Oct 13, 2026

## TODO / Topics covered (revision checklist)

- [ ] Know that this was the third round of project presentations and that our group presented
- [ ] Be able to explain the list matching project and the reasoning behind its design decisions out loud
- [ ] Know how to answer decision questions about my own project (why this approach, what happens in a failure case)
- [ ] Understand why keeping notes about design decisions while making them helps later
- [ ] Understand how JavaFX `Task` objects and an `ExecutorService` keep the UI responsive during long-running work
- [ ] Understand why overall progress across several jobs should be a weighted aggregate, not a simple average
- [ ] Know that JavaFX and Swing can coexist in one window (`SwingNode`, `JFXPanel`) and that each framework's thread rules must be respected

## Questions discussed in class

- Why did you structure the project this way?
- What happens in a failure or edge case (for example corrupted or unexpected input)?
- Why this approach instead of the alternative?
- How can long-running jobs run without freezing the interface?
- How should the progress of several jobs be combined into one bar?
- Can Swing components be used inside a JavaFX scene?

## Key takeaways

- This was the third round of presentations, and the first where our group was on the other side of the professor's interview-style Q&A: a live demo of the list matching project followed by probing questions about the design decisions behind it, with the class listening.
- Being asked about your own project is different from watching it happen to someone else. The hard part is not knowing the answer; it is turning an implicit decision made weeks earlier into a clear spoken explanation on the spot.
- Keep notes on **why** each choice was made while making it. That is what lets you answer clearly later, whether the decision turned out right or wrong. This ties to Lecture 20's point that comments should explain WHY, not WHAT.
- Watching two other presentations in the same session sharpened comparisons, and two of the ideas shown were technically ambitious and worth knowing:
  - **Concurrency in JavaFX:** long-running work runs on background threads using `Task` objects submitted to an `ExecutorService`, while UI updates stay on the JavaFX Application Thread. This is the GUI single-thread discipline from Lecture 7 (the Event Dispatch Thread) and Lecture 9 (`ExecutorService`/`Task`) applied in practice.
  - **Weighted progress:** a composite progress bar should weight each job by how much total work it represents. A 200-unit job counts twice as much as a 100-unit job; averaging the percentages equally would mislead.
  - **JavaFX + Swing together:** `SwingNode` embeds Swing components in a JavaFX scene (`JFXPanel` does the reverse). Swing updates go through `SwingUtilities.invokeLater`, JavaFX updates through `Platform.runLater`. This connects to the framework comparison in Lecture 1 and Lecture 17.
- Real-world parallels: parallel build/CI dashboards and download managers use weighted aggregation; `SwingNode` exists so large Swing applications can migrate to JavaFX one screen at a time.
- Challenging part: speaking the reasoning behind decisions on the spot, a skill that needs practice separately from building.
