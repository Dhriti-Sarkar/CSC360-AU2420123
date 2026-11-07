# Choosing the Right Tool for the Problem: Console vs Swing vs JavaFX/FXML (explained simply)

The second round of presentations showed three different stacks solving different problems. The lesson: **the problem should drive the tool, not the other way around.** Extends [java-gui-frameworks](java-gui-frameworks.md), [java-swing-architecture](java-swing-architecture.md), and [javafx-fxml-and-splash-screens](javafx-fxml-and-splash-screens.md).

## The three choices

| Stack | Best when | Trade-off |
|---|---|---|
| **Pure console (Java, `javac`)** | The core output is structured text, e.g. printing a hierarchy with `├──`, `└──`, `│` connectors | No visuals or interaction; but also no GUI overhead, and works on headless systems ([ascii-vs-graphics-and-headless-systems](ascii-vs-graphics-and-headless-systems.md)) |
| **Swing + Graphics2D** | You want direct custom drawing of curves, arrows, and arbitrary shapes | Older toolkit; you manage painting yourself |
| **JavaFX + FXML** | You want a polished UI with layout declared separately from logic, CSS styling, and scene graph shapes | More setup; FXML adds a file format to learn |

A console app for a graphics course is not a mismatch if a GUI would add nothing to the core functionality. Sophistication is not a goal; fit is.

## FXML in brief

FXML declares the scene graph structure in XML and is loaded with `FXMLLoader`, keeping **layout** (FXML) separate from **logic** (controller class). It suits something like a splash screen: a logo, a progress bar, and a status message declared in markup, with the controller updating the progress. See [javafx-preloader-splash-screen](javafx-preloader-splash-screen.md).

## How to justify a stack in the Q&A

- State what the problem's core output is (text, drawing, interactive UI).
- Say what the alternatives were and what you gave up.
- Tie it to [project-presentation-and-technical-qa](project-presentation-and-technical-qa.md): decisions matter more than features.

## Simple analogy
A hammer, a screwdriver, and a drill aren't ranked; you pick the one that fits the screw. Reaching for the drill every time doesn't make you a better carpenter.

## Key takeaway
> Console, Swing/Graphics2D, and JavaFX/FXML each fit different problems. Pick the simplest tool that serves the core functionality, and be ready to explain why.
