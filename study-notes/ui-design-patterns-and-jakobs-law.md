# UI Design Patterns & Jakob's Law (explained simply)

The professor mentioned that there are design patterns specifically for building user interfaces, which links graphics to the HCI course (CSE519). Related: [java-gui-frameworks](java-gui-frameworks.md), [ui-components-and-affordances](ui-components-and-affordances.md).

## Why UI patterns exist

They are not only about keeping code tidy; they exist because of **how users behave**. Common examples you will meet in this course:

- **Event listener / observer:** the interface reacts when the user does something ([javafx-event-propagation](javafx-event-propagation.md)).
- **Master-Detail:** a list on one side, the selected item's details on the other ([master-detail-selection-and-live-filtering](master-detail-selection-and-live-filtering.md)).
- **Model-View separation** (for example FXML for layout, a controller for logic): [javafx-fxml-and-splash-screens](javafx-fxml-and-splash-screens.md).

## Jakob's Law

> Users spend most of their time on *other* sites, so they expect yours to work like those.

People arrive with expectations. Following design conventions is not laziness; it respects what users already know, so they can focus on their task instead of learning your interface.

## Convention vs creativity

Conventions give you a familiar base. The interfaces people remember borrow the conventions and add something of their own ([cross-platform-testing-and-ai-vs-human-ui](cross-platform-testing-and-ai-vs-human-ui.md)).

## Why it matters in graphics

Nearly every interaction with a computer goes through a graphical interface, so graphics and usability are closely linked. The underlying idea is always the same: turn a mathematical description of a shape into pixels, then present it in a way users already understand.

## Key takeaway
> UI design patterns exist because of user behaviour. Jakob's Law says to follow conventions because users bring expectations from everywhere else.
