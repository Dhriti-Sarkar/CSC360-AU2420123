# Maven & JavaFX Setup (explained simply)

## What is Maven?

Maven is a **build tool** for Java projects. In plain terms, it does two main jobs:

1. **Dependency management** — instead of manually downloading library files (like JavaFX) from the internet and dragging them into your project, you just tell Maven "I need this library" in a config file, and Maven fetches it automatically.
2. **Build automation** — it handles compiling your code, packaging it, and running it, all through simple standard commands, instead of you manually clicking through steps every time.

## What is `pom.xml`?

This is Maven's main configuration file — short for "Project Object Model." It's basically a shopping list + instruction sheet:
- It lists which libraries (dependencies) your project needs — in our case, JavaFX.
- It tells Maven which Java version to use.
- It can configure plugins — extra tools that add capabilities, like the `javafx-maven-plugin` we used, which lets us run a JavaFX app with one simple command instead of manually configuring complicated JavaFX settings.

## Why JavaFX needs Maven (or something like it)

In older Java versions, JavaFX used to come bundled with Java itself. In modern Java, JavaFX was pulled out and made a separate add-on. That means we now need a tool like Maven to fetch the JavaFX library for us and correctly wire it into the project — which is exactly what our `pom.xml` dependency + plugin setup does.

## Installing Maven

Two ways:

1. **Use IntelliJ's built-in Maven** — IntelliJ already ships with its own copy, accessible through the Maven side panel (Lifecycle → clean/install, or Plugins → javafx → javafx:run). No installation needed.
2. **Install it system-wide** (so the `mvn` command works in any terminal) — on Mac, this is done via Homebrew: `brew install maven`. This is useful if you want to run Maven commands directly in the terminal rather than clicking through IntelliJ's UI.

## Common Maven commands

- `mvn clean` — deletes old compiled files so you get a fresh build.
- `mvn javafx:run` — builds and runs the JavaFX application (specific to the JavaFX Maven plugin).
- `mvn clean javafx:run` — does both: clean first, then run. This is the one we used most.