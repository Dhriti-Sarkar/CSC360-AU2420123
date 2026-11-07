# Maven Build Lifecycle (explained simply)

This builds directly on the Maven/pom.xml basics from Lecture 3 — going a bit deeper into what pom.xml actually manages, and the standard sequence of build steps.

## pom.xml is more than just a dependency list

Beyond listing which libraries your project needs, pom.xml also:
- Coordinates general **project metadata** (name, version, etc.)
- Specifies which **Java Virtual Machine bytecode level** to target (basically, which Java version your compiled code should be compatible with)
- Configures **build plugins** — extra tools for things like running tests, packaging your code, or even specialized tasks like shader compilation (relevant for graphics-heavy projects)

## How dependencies are actually specified

Rather than manually downloading a library's files and dragging them into your project folder (which is fragile and hard to keep updated), Maven uses **declarative** dependency coordinates — meaning you just describe *what* you need, and Maven figures out *how* to get it. Each dependency is identified using three pieces of information:
- **GroupId** — identifies who/what organization made the library.
- **ArtifactId** — the specific library/project name itself.
- **Version** — which exact version you want.

Maven then automatically:
- Searches known repositories (central public ones, or custom private ones) for that exact library.
- Resolves the **transitive dependency tree** — meaning if the library you want *itself* depends on other libraries, Maven automatically fetches those too, without you needing to track them manually.
- Detects **classpath version collisions** — catching cases where two different dependencies might need conflicting versions of the same underlying library.
- **Caches** everything locally on your machine, so it doesn't need to re-download the same files every single time you build.

## The standard Maven lifecycle phases

These are the sequential steps Maven runs through when building a project — you've already used some of these yourself (`mvn clean javafx:run` combines two of them):

| Phase | What it does |
|---|---|
| `clean` | Deletes previously compiled files/output (the `target/` folder), giving you a totally fresh starting point |
| `compile` | Converts your raw `.java` source files into compiled `.class` bytecode files |
| `test` | Runs your automated unit tests (like the unit test example from earlier — checking individual pieces of code work correctly) |
| `package` | Bundles all your compiled code into a single deployable `.jar` file |
| `install` | Copies/publishes that packaged artifact into your local Maven cache, so other projects on your machine could reference it if needed |

**Why this standardized sequence matters:** it means the exact same build process works identically across different developers' machines — everyone gets the same predictable, repeatable steps, rather than everyone building their project slightly differently by hand.

## Using this inside IntelliJ

Rather than typing these phase names into a terminal every time, IntelliJ's Maven side panel lets you just double-click through these lifecycle phases directly — this is literally "Option A" from when we fixed your `mvn: command not found` error earlier this semester.