# Web Authentication: Sessions vs JWT (explained simply)

## Why this matters

When building a backend web application (using something like Node.js), one of the most important responsibilities is **authentication** — reliably verifying "who is this user, and are they allowed to do this action?" Getting this wrong opens the door to serious security problems, so it's treated as a foundational pillar of any real web service, not an afterthought.

## Approach 1: Session-based authentication (the traditional/stateful way)

1. The user logs in, sending their credentials (username/password) to the server.
2. The server checks the credentials, and if correct, creates a **session record** — essentially a note saying "this user is logged in" — stored centrally, either in a database or a fast in-memory cache.
3. The server sends back a **session identifier** (a random unique ID) stored in a cookie on the user's browser.
4. On every future request, the browser automatically sends that cookie back, and the server looks up the matching session record to confirm who the user is.

**Why it's called "stateful":** the server has to actively keep track of ("remember the state of") every logged-in user's session somewhere centrally.

## Approach 2: JWT (JSON Web Tokens) — the modern/stateless way

1. The user logs in, and instead of creating a stored session record, the server generates a **JWT** — a digitally signed token that directly contains encoded information about the user (called "claims," e.g., user ID, role, expiration time).
2. This token is sent back to the client, who then includes it in the **authorization header** of every subsequent request.
3. The server can verify the token is genuine (using its digital signature) and read the user info directly from the token itself — **without needing to look anything up in a central database**, since all the necessary info already lives inside the token.

**Why it's called "stateless":** the server doesn't need to remember/store anything about who's logged in — each request carries all the proof and info it needs, independently.

## Why statelessness (JWT) matters for distributed systems

If your application is spread across multiple servers (common in larger, scaled systems), a stateful session approach means every server needs access to the same central session database to check "is this user logged in?" — creating a shared dependency and potential bottleneck. JWTs avoid this entirely, since any server can independently verify a token's signature and read its contents, without needing to check back with a central authority every time.

## Security concerns this protects against

- **Unauthorized access** — someone getting into parts of the system they shouldn't.
- **Credential stuffing** — attackers trying large numbers of leaked username/password combinations (often from other data breaches) to try to break into accounts.
- **Session hijacking** — an attacker stealing a valid session ID/token and using it to impersonate a real logged-in user.

## Simple analogy

**Session-based auth** is like getting a coat-check ticket at an event — the actual coat (your session data) stays with the coat-check counter (the server's central session store), and you just hold onto a numbered ticket that lets you claim it. **JWT** is like getting a wristband with your entry details already printed directly on it — any staff member (any server) can just glance at your wristband and immediately know you're allowed in, without needing to radio back to a central desk to check.

## Quick comparison table

| | Session-based | JWT |
|---|---|---|
| State | Stateful (server stores session data) | Stateless (token carries its own data) |
| Storage needed | Central session database/cache | None — token is self-contained |
| Good for | Simpler, single-server setups | Distributed, multi-server systems |
| Revoking access early | Easy (just delete the session record) | Harder (token stays valid until it expires, unless extra mechanisms are added) |