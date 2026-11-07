# Collaborative Git Governance for Group Projects (explained simply)

This lecture marks a shift from working solo to working with a team on a shared codebase — so the rules here matter in practice, not just theory.

## Why group projects need stricter Git discipline

When you're the only person touching a repo, messy habits are forgivable — worst case, you only inconvenience yourself. With multiple developers pushing to the same repository, sloppy habits cause real problems: merge conflicts, inconsistent code style, and diverged branches (remember the divergent branch issue from Lecture 6? That gets far more likely with more people involved).

## The protected main branch

The **main branch** should always represent **stable, production-ready code** — meaning code that's been checked and is safe/working, not experimental or half-finished.

**Why "protected"?** This typically means the repository is configured so nobody can push directly to `main` without going through a review process first — preventing untested or broken code from landing directly in the branch everyone relies on.

## Feature branches

Instead of everyone editing `main` directly, each individual contribution (a new feature, a bug fix, etc.) gets its own **separate branch**, often named descriptively (like `feature/arrow-drawing` or `fix/square-centering-bug`). This isolates each person's in-progress work from everyone else's, until it's ready to be reviewed and merged in.

## Pull requests + peer code review

Once work on a feature branch is ready, the developer opens a **pull request (PR)** — essentially a formal request saying "here's my finished branch, please review it before merging it into main."

- **Peer code review** means a teammate actually reads through the proposed changes before approving the merge — checking for bugs, style issues, or things that might conflict with other parts of the project.
- **Why this matters:** catches mistakes before they land in the shared stable branch, and spreads knowledge of the codebase across the team (since everyone reviews everyone else's code at some point).

## Shared .gitignore for a Java/Maven group project

Since multiple people are contributing, everyone needs to agree on (and use) the same `.gitignore` rules, so nobody accidentally commits things that shouldn't be shared — this connects directly to the .gitignore work from Lecture 4/5 and Lecture 7:

- **Local workspace configurations** — IDE-specific settings folders like `.idea/`, since these are personal to each developer's own editor setup.
- **Compiled bytecode directories** — Maven's `target/` folder, since this is regenerated automatically by anyone who builds the project.
- **Environment variables** — `.env` files, since these can contain sensitive secrets (API keys, credentials) that should never be shared in a public or even semi-private repo.

## Standardizing the workflow further

Beyond branches and PRs, well-run group projects also typically agree on:
- **Commit message conventions** — a consistent style/format for writing commit messages, making the project history easier to read and understand.
- **Automated CI builds on push** — connecting the repo to a CI system (like GitHub Actions, mentioned back in the CI/CD notes) so that every push automatically triggers a build + test run, catching problems immediately rather than relying on someone remembering to test manually.

## Simple analogy

Think of `main` like the final, official draft of a group essay that everyone's grade depends on — you wouldn't let just anyone scribble directly into that final copy. Instead, each person drafts their section separately (feature branch), someone else proofreads it (code review) before it gets added to the final document (merged via PR) — keeping the shared final version clean and reliable.

## Key takeaway
> Group projects need: a protected main branch, individual feature branches, mandatory pull requests + code review before merging, a shared .gitignore, and ideally automated CI builds — this mirrors how real industry engineering teams operate.