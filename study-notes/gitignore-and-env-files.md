# .env Files & .gitignore (explained simply)

## What is a .env file?

A `.env` file is a plain text file used to store **local configuration values** that a program needs to run — things like:
- API keys (secret codes that let your program talk to some external service)
- Database passwords/credentials
- File paths or settings specific to your own machine

**Why it's risky:** if you accidentally push a `.env` file to a public GitHub repo, anyone in the world can see those secrets — potentially letting strangers access your database, rack up charges on an API key tied to your account, or worse. This is a very common real-world security mistake.

## What is .gitignore, and how does it help?

`.gitignore` is a special file you put in your repository that tells Git: "never track or upload these specific files/folders, even if they exist in the project folder."

You already used this concept when setting up your JavaFX project — telling Git to ignore the `target/` folder (Maven's build output) and `.idea/` (IntelliJ's personal settings).

## What typically goes in a .gitignore file

- **Build artifacts / compiled files** — like `.class` files or a `target/` folder — since these get regenerated automatically every time the project is built, there's no reason to store them in Git.
- **IDE configuration folders** — like `.idea/` (IntelliJ) — since these are personal to your own editor setup, not something that needs sharing.
- **Local environment files** — like `.env` — specifically to prevent secrets from ever being accidentally pushed.

## Simple analogy

Think of `.gitignore` like a "do not pack" list when preparing a suitcase (your Git commit) for a trip (pushing to GitHub). Some things — like your passport's photocopy backup (`.env` secrets) or half-eaten snacks (build artifacts) — just shouldn't go in the shared suitcase that other people (collaborators, the public) will also be looking through.

## Key takeaway
> .env = where sensitive local secrets live. .gitignore = the list of files/folders Git should never track or upload, which should always include your .env file and machine-specific build/IDE clutter.