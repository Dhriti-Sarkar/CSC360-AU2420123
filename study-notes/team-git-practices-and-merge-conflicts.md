# Team Git Practices & Merge Conflicts (explained simply)

Extends [group-project-git-governance](group-project-git-governance.md) and [git-upstream-sync](git-upstream-sync.md). The mechanics (SSH, commit, push) were covered early; this session was about the **discipline** that makes them work across several contributors.

## Faculty's three rules

1. **Commit often:** small commits are easier to merge and to undo.
2. **Push before pulling:** don't let local work sit unshared while others change the same files. (In practice: commit your work, then pull/rebase, resolve, push.)
3. **Communicate before touching shared files:** say what you are about to change.

## Why conflicts happen

A merge conflict occurs when two branches change the **same lines** (or one deletes what the other edits) and Git cannot decide which version wins. It happens most when people edit the same files without checking what others are doing.

## Prevention

- Give each member **well-defined responsibilities** (e.g. one owns theming, one owns drag-and-drop).
- Keep branches short-lived and sync with the main branch regularly.
- Agree who edits shared files (build config, main controller) before starting.

## Resolving one

Git marks the file with `<<<<<<<`, `=======`, `>>>>>>>`. Open it, keep the right combination of both sides, delete the markers, `git add`, then continue the merge or rebase.

## Simple analogy
Two people editing the same paragraph of a shared essay offline. Whoever saves second has to reconcile both versions; talking first avoids the problem.

## Key takeaway
> Merge conflicts are as much a communication problem as a technical one. Commit often, sync regularly, and talk before touching shared files.
