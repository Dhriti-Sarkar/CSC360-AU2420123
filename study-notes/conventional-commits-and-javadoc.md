# Conventional Commits & Javadoc (explained simply)

Two criteria that make a repository readable: the **history** (commits) and the **code** (Javadoc). Part of [github-repository-grading-criteria](github-repository-grading-criteria.md).

## Conventional commits

Format: `type(optional scope): description`, in the **imperative mood** ("add", not "added"), so the log reads as an audit trail instead of a personal diary.

| Type | Use for |
|---|---|
| `feat` | A new feature |
| `fix` | A bug fix |
| `docs` | Documentation only |
| `refactor` | Restructuring without changing behaviour |
| `test` | Adding or fixing tests |
| `chore` | Build, tooling, housekeeping |

| Poor | Good (Conventional Commit) |
|---|---|
| fixed bug | fix: handle null input in list matcher |
| update readme | docs: add screenshots and Maven build steps |
| more tests | test: add edge case coverage for empty lists |
| changes | refactor: extract arrow drawing into separate utility class |

Benefits: readable history, easy changelogs, and a link to semantic versioning. Keep each commit to one logical change (builds on [team-git-practices-and-merge-conflicts](team-git-practices-and-merge-conflicts.md)).

## Javadoc

The second level of documentation: below the README, above inline comments. It is for a developer reading or using the code. Document the **contract** of each method:

```java
/**
 * Finds the elements present in both lists.
 *
 * @param listA the first list; must not be null
 * @param listB the second list; must not be null
 * @return the common elements, in the order they appear in listA
 * @throws IllegalArgumentException if either list is null
 */
public List<String> findCommon(List<String> listA, List<String> listB) { ... }
```

- `@param`: what each argument accepts (constraints, null rules)
- `@return`: what comes back
- `@throws`: what can go wrong
- **Do not restate the method name.** "Gets the name" on `getName()` adds nothing. Say what a reader can't see from the signature.

Generate the HTML with `mvn javadoc:javadoc` ([maven-lifecycle](maven-lifecycle.md)).

## Simple analogy
Commits are a ship's log (what happened and why). Javadoc is the instruction label on each tool (what it takes, what it gives, when it fails).

## Key takeaway
> Use conventional, imperative commit messages so history tells the story, and write Javadoc that documents each method's contract rather than repeating its name.
