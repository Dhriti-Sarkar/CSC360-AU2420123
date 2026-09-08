# Maven Packaging & CI/CD Pipelines (explained simply)

This builds directly on the Maven lifecycle notes from Lecture 5 — going deeper into exactly *how* pom.xml controls compilation and packaging, and how that plugs into automated CI/CD.

## How pom.xml actually drives compilation

Maven doesn't compile your code by itself in isolation — it reads instructions from `pom.xml` and coordinates other tools (like `javac`) to do the actual work.

- **`maven-compiler-plugin`** — this plugin reads settings in `pom.xml` (like which Java version to target) and tells the underlying `javac` compiler exactly how to process your source code and what kind of bytecode to produce. This is the same `maven.compiler.source` / `maven.compiler.target` properties you already have in your own `pom.xml` from the JavaFX project.

## How pom.xml drives packaging into a runnable JAR

Once your code is compiled into `.class` files, separate plugins handle bundling everything into a JAR:

- **`maven-jar-plugin`** — a standard plugin for packaging compiled classes into a `.jar` file.
- **`maven-shade-plugin`** — a more advanced packaging option, often used when you also need to bundle in your project's *dependencies* directly inside the JAR (so the JAR is fully self-contained and runnable without needing separate dependency files alongside it).

Both of these plugins also handle writing a special file inside the JAR called **`META-INF/MANIFEST.MF`** — this manifest file declares metadata about the JAR, most importantly which class contains the `main()` method that should run when someone executes the JAR directly (e.g., `java -jar yourapp.jar`).

## The full CI/CD pipeline, step by step

This connects the CI/CD concept (from earlier in the semester) directly to the Maven mechanics we've been learning:

1. **Trigger** — a developer pushes code, or opens a pull request.
2. **CI system automatically pulls the latest source code.**
3. **Runs an isolated `mvn clean compile`** — a fresh, clean build environment, so results aren't affected by leftover files from a previous build.
4. **Executes automated test suites** — both unit and integration tests (more on this below) — to catch any regressions (things that used to work but got broken by a new change) immediately.
5. **If everything passes, CD packaging kicks in** — automatically building the final deployable `.jar` artifact.
6. **Containerization** — the application often gets bundled into a container (a self-contained, portable runtime environment — commonly using a tool called Docker, though not covered in detail this lecture).
7. **Release to staging or production** — the packaged, containerized application is deployed to a testing environment first (staging), and eventually to the live environment users actually interact with (production).

## Why automating all of this matters

The core benefit repeated throughout: this ensures builds are **consistent, reproducible, and independent of individual developer machine quirks** — meaning "it works on my machine" problems are eliminated, since the exact same automated, standardized process runs every time, regardless of who pushed the code or what their personal laptop setup looks like.

## Simple analogy

Think of this like a restaurant's standardized food-prep checklist that every kitchen location follows exactly the same way — regardless of which chef is cooking, the same steps, same measurements, and same quality checks happen every time, so the final dish always turns out consistent and reliable.