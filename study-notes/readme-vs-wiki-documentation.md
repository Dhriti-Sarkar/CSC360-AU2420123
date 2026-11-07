# README vs Wiki: Documentation as Part of the Product (explained simply)

Documentation was the second half of the last in-class sprint. It is a deliverable, not an afterthought. Related: [markdown-standards](markdown-standards.md).

## Two documents, two jobs

| | README | Wiki |
|---|---|---|
| Role | Elevator pitch | Depth |
| Reader | Someone landing on the repo for the first time | Someone who wants to understand or contribute |
| Read time | A couple of minutes | As needed |
| Contents | What it is, what it does, how to run it | Architecture decisions, feature explanations, known limitations, contribution steps |

Without this boundary you get a README that is too long and a Wiki that just repeats it. Each should do its job without the other compensating.

## For the list matching project

- **README:** what the project is (two lists, matching elements connected by arrows), a screenshot, how to build and run it with Maven ([maven-and-javafx-setup](maven-and-javafx-setup.md)).
- **Wiki:** how matching and arrow drawing work, the layout and theming approach, the splash screen, cross-platform notes, and how to contribute under the team's Git rules ([team-git-practices-and-merge-conflicts](team-git-practices-and-merge-conflicts.md)).

## Outside-in vs inside-out

Building is **inside-out**: you know the system, so decisions come from within. Documentation is **outside-in**: ask "what would someone who has never seen this need to know first?" Doing it also reveals what is still unclear to the authors.

## Why it matters in practice

On GitHub, the README is the first thing a developer reads. Projects with poor or missing documentation get ignored even when the code is solid. Companies ship READMEs and setup guides with internal tools and SDKs because onboarding without them is too expensive.

## Key takeaway
> README = quick pitch and how to run; Wiki = depth. Writing them forces an outside-in view that makes the project legible to people beyond the team.
