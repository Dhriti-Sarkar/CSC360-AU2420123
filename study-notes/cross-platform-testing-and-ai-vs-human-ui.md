# Cross-Platform Testing & AI vs Human UI Design (explained simply)

## Cross-platform testing

Our team runs three Windows machines and one Mac. Code that works on one OS can break on another:

- **File paths** and resource loading (separators, user directories)
- **Font rendering** and canvas drawing differences, which affect where arrows land
- **JavaFX quirks** in window behaviour and native integration

Confirming that everyone can run it once is not enough: **re-test whenever the codebase changes significantly**. Professional releases don't ship until verified on every target OS. (Related: [windows-vs-linux](windows-vs-linux.md) and [java-compilation-pipeline](java-compilation-pipeline.md) on why Java can run everywhere in principle.)

## AI-generated vs human-refined UI

| | AI | Human |
|---|---|---|
| Strength | Technically correct, convention-following, HCI-compliant | Intentional deviation and creative direction |
| Weakness | Polished but generic ("averaged" UI) | Slower, needs taste and decisions |
| Example | Standard layout, standard contrast | A colour that bends contrast guidelines but fits the brand |

This is **Jakob's Law** (CSE519 HCI): follow conventions so users feel at home, but memorable interfaces borrow conventions and add something of their own. For the list matching project: AI wrote the functional structure ([ai-assisted-development-and-vibe-coding](ai-assisted-development-and-vibe-coding.md)); the group now sets what it should *feel* like. Overview of the project: [list-matching-project-overview](list-matching-project-overview.md).

## Key takeaway
> Test on every target OS repeatedly, not once. AI gives you a correct generic UI; the human provides the creative direction that makes it distinct.
