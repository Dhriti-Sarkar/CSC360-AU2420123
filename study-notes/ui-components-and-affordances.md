# UI Components, Affordances, Layouts & Master-Detail (explained simply)

Connects this session's UI discussion to CSE519 Human Computer Interaction: widgets are not decoration, they are **affordances** — each signals a type of interaction before the user reads a label.

## Choosing the right component

| Component | Intended use | Why |
|---|---|---|
| **Checkbox** | Independent binary choices (several can be on) | Each option stands alone |
| **Radio button** | Mutually exclusive choice within a group | Picking one deselects the others |
| **Slider** | When approximation matters more than precision | You want volume to *sound right*, not to be exactly 67% |
| **Dialog box** | Blocks attention and forces a response before something significant happens | e.g. confirm before deleting an account |

Real-world: YouTube / Prime Video use sliders for volume and seeking, and dialog boxes for cancel-subscription confirmations.

## Layouts that respond to resizing

A good layout **reorganizes itself** when the window is resized, shrunk, or stretched, instead of overflowing or breaking. JavaFX layout containers — `GridPane`, `VBox`, `HBox` — control how children are arranged and adapt to available space dynamically (styled via CSS).

## Master-Detail pattern

Clicking an item in a list fires a **listener** that shows that item's details in a separate panel. The professor's analogy: a library website with ten million articles should not load them all at once — show a few, let search reach the rest. Real examples: Gmail's inbox/email view, Outlook, most file managers. (Same idea as the TreeView + property panel in Lecture 9's [treeview-and-object-serialization](treeview-and-object-serialization.md).)

## Group projects this session (9–12)

- **Group 9:** a UI mixing Swing and JavaFX components
- **Group 10:** a Master-Detail Layout
- **Group 11:** a UI to style one geometric object in real time (sliders, color pickers)
- **Group 12:** a JavaFX button that modifies a browser DOM object via `WebView` / `WebEngine`, which embeds a real browser in the app. This is essentially how browser extensions (e.g. uBlock Origin, dark-mode tools) work — an external program reaching into the DOM and changing it.

## Key takeaway
> Pick components by design intent: checkbox = independent choices, radio = exclusive choice, slider = approximate adjustment, dialog = forced attention. Layouts must adapt to resizing, and Master-Detail avoids loading everything at once.
