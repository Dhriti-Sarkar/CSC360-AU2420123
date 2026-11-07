# Lecture 08 — Sep 1, 2026

## TODO / Topics covered (revision checklist)

- [ ] Understand the group project Git workflow: protected main branch + feature branches
- [ ] Know why pull requests + peer code review are required before merging
- [ ] Understand what a group-project .gitignore needs to cover for Java/Maven
- [ ] Know how a system of linear equations translates into the matrix form Ax = b
- [ ] Be able to identify the coefficient matrix A, unknown vector x, and constant vector b from a system of equations
- [ ] Understand the difference between a row vector and a column vector
- [ ] Know why vector orientation determines pre-multiplication vs post-multiplication
- [ ] Understand why column vectors (OpenGL/Java) chain transformations right-to-left
- [ ] Understand why row vectors (DirectX) chain transformations left-to-right
- [ ] Know how to calculate a 2×2 determinant
- [ ] Understand what a determinant of zero means geometrically (singular matrix)
- [ ] Understand what a negative determinant means (orientation flip/reflection)
- [ ] Know the 3 Java linear algebra libraries mentioned: Apache Commons Math, EJML, JOML

## Questions discussed in class

- How should a team structure Git branches (main vs feature branches) for a group project?
- Why are pull requests and peer code review required before merging into main?
- What needs to go into a shared .gitignore for a Java/Maven group project?
- How does a system of linear equations get represented as a single matrix equation Ax = b?
- What's the difference between a row vector and a column vector, mathematically?
- Why does vector orientation (row vs column) determine whether you pre-multiply or post-multiply by a transformation matrix?
- Why do column-vector systems (like OpenGL/Java) chain transformations right-to-left, while row-vector systems (like DirectX) chain left-to-right?
- What does a matrix's determinant actually represent geometrically?
- What does it mean if a matrix's determinant is zero?
- What does a negative determinant tell you about a transformation?
- Why use existing Java libraries (Apache Commons Math, EJML, JOML) instead of writing matrix math by hand?

## Key takeaways

- This lecture marks a real shift — from solo assignments to an actual group project, so the Git governance rules here (protected main, feature branches, PRs, code review) are things I'll need to actually follow with teammates, not just know in theory.
- The Ax = b matrix equation is the mathematical backbone behind every transformation I've been doing visually all semester (centering squares, rotating/scaling shapes) — it's the same operations, just expressed formally.
- Row vs column vector convention explains why different graphics APIs (OpenGL vs DirectX) can look like they're doing transformations "backwards" from each other — it's not actually inconsistent, just a different mathematical convention.
- Determinants connect directly to whether a transformation can be "undone" — relevant for anything involving converting between coordinate spaces (world space, camera space, screen space).

