# Master-Detail: Selection Listeners & Live Filtering (explained simply)

Extends the Master-Detail overview in [ui-components-and-affordances](ui-components-and-affordances.md) and the TreeView idea in [treeview-and-object-serialization](treeview-and-object-serialization.md). One of the most common UI patterns: mail clients, music libraries, file explorers, e-commerce category pages.

## The idea

- **Master:** a scrollable list of items on one side.
- **Detail:** a panel on the other side showing the full record of the selected item.
- **Search bar:** filters the master list in real time.

It mirrors how people browse a collection: scan the list, pick one, see everything. It also avoids loading everything at once (the library with ten million articles from Lecture 9).

## How it works in JavaFX

The link between the two is a **selection listener** ([javafx-event-propagation](javafx-event-propagation.md) for the event model underneath):

```java
listView.getSelectionModel().selectedItemProperty().addListener((obs, oldItem, newItem) -> {
    if (newItem != null) showDetails(newItem);   // update title, author, price, ...
});
```

The master only publishes "selection changed"; the detail only reacts. They stay **decoupled**, which is the property model working as intended.

## Live filtering

```java
FilteredList<Book> filtered = new FilteredList<>(allBooks, b -> true);
searchField.textProperty().addListener((obs, o, text) ->
    filtered.setPredicate(b -> text.isBlank()
        || b.getTitle().toLowerCase().contains(text.toLowerCase())));
listView.setItems(filtered);
```

`FilteredList` is a view over the original list ([java-collections-framework](java-collections-framework.md)), so the data is untouched and only the display changes.

## Things to handle
- What the detail panel shows when nothing is selected (or the filter removes the selected item)
- Empty search results
- Large lists (virtualized `ListView` only creates visible cells)

## Simple analogy
A restaurant menu index at the door: pick a dish from the list and a card shows its full description and price.

## Key takeaway
> Master-detail = a list, a detail panel, and a selection listener that connects them. Add a `FilteredList` predicate for real-time search while keeping the data separate from the view.
