# Taskwood: Project Overview (Group 7)

The group's answer to the assignment: *a JavaFX program with a tree of objects where each object is editable.*

## What it is
A **local-first JavaFX desktop app** that organises personal and academic work into a three-level tree:

```
Workspace
└── Project
    └── Task
```

## How it maps to the requirements

| Requirement | Taskwood feature |
|---|---|
| Tree of objects | Workspaces → Projects → Tasks, shown in a `TreeView` on the left |
| Each object editable | Selecting any node opens a form panel on the right with its properties |
| Saving | Changes auto-save to a local JSON file; reloaded on next launch |

This is the Master-Detail pattern from [ui-components-and-affordances](ui-components-and-affordances.md) combined with the TreeView and serialization ideas from [treeview-and-object-serialization](treeview-and-object-serialization.md).

## Timeline
- **Lecture 10 (Sep 10):** concept, name, and structure decided.
- **Lecture 11 (Sep 15):** first version scaffolded with Claude, reviewed, run on one machine, approved by the faculty, and committed to GitHub.

## Next steps
Each member clones the shared base and works from it, following the team's Git rules ([group-project-git-governance](group-project-git-governance.md)).

## Key takeaway
> Taskwood = TreeView (navigate) + form panel (edit) + JSON file (persist), built on a three-level Workspace/Project/Task model.
