# JavaFX Theme Toggle & Drag-and-Drop (explained simply)

The two concrete features planned for the list matching project. Not implemented yet; this note records the approach.

## Dark/light theme toggle

Connects to the CSS styling in JavaFX layouts ([ui-components-and-affordances](ui-components-and-affordances.md)).

- Write **two stylesheets**, e.g. `light.css` and `dark.css`, with the same style classes but different colours.
- At runtime, swap them on the scene:

```java
scene.getStylesheets().clear();
scene.getStylesheets().add(getClass().getResource("/dark.css").toExternalForm());
```

- Use CSS variables / looked-up colours (e.g. `-fx-base`) so one place controls the palette.
- Make sure arrow and highlight colours also come from the stylesheet, so they stay readable in both themes.

## Drag-and-drop to reorder list items

JavaFX drag-and-drop is event-based, an application of the event model in [javafx-event-propagation](javafx-event-propagation.md):

| Stage | Event / handler | Purpose |
|---|---|---|
| Start | `setOnDragDetected` on the source cell | Start `startDragAndDrop(TransferMode.MOVE)` and put data (e.g. the node id) on a `Dragboard` |
| Hover | `setOnDragOver` on the target cell | Call `acceptTransferModes(...)` if dropping here is allowed |
| Drop | `setOnDragDropped` on the target cell | Read the `Dragboard`, move the node in the model, mark `setDropCompleted(true)` |
| End | `setOnDragDone` on the source | Clean up |

For a `ListView`, this is done through a custom **cell factory**, so each `ListCell` gets these handlers. Drop rules must be validated in `setOnDragOver`, and the change must go through the data model so the matches and arrows are recomputed after a reorder.

## Simple analogy
Theme toggle: swapping the lampshade without rebuilding the lamp. Drag-and-drop: picking a card up (drag detected), hovering over slots (drag over), and placing it (drag dropped).

## Key takeaway
> Theming = swap stylesheets on the scene at runtime. Drag-and-drop = a set of events on a custom ListCell, with all changes applied to the data model, not just the view.
