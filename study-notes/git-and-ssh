# Git Access: SSH vs HTTPS (explained simply)

## The basic idea

When you want to push your code to GitHub, your computer needs to "prove" to GitHub that it's really you. There are two common ways to do this: **HTTPS** and **SSH**. Think of them as two different doors into the same house — both get you in, but they check your ID differently.

## HTTPS — the "username + password/token" way

- This is the same technology your browser uses when you visit any secure website (the little padlock icon in your browser).
- When you use HTTPS to talk to GitHub, it's like typing in a username and a password (technically a "token") every time you want to push your code — kind of like logging into a website.
- Easier to set up, but a bit more repetitive since you may need to log in more often.

## SSH — the "secret handshake" way

- SSH stands for **Secure Shell**. It's built specifically for securely connecting to remote computers/servers — think of it as a secure tunnel between your laptop and GitHub's servers.
- Instead of typing a password every time, SSH uses something called a **key pair** to recognize you automatically.

## What is a key pair?

Imagine a lock and key system, but a special kind where:

- You generate **two keys** at once, using a tool on your computer (a common one is `ssh-keygen`).
- One is your **public key** — this is safe to share with anyone. You upload this to your GitHub account settings.
- The other is your **private key** — this stays only on your computer and should NEVER be shared with anyone, like a password you never tell anyone.

Here's the clever part: GitHub uses your public key to create a little "challenge" that only your matching private key can solve. So GitHub can confirm it's really you, without your private key ever leaving your computer, and without you typing a password each time.

## Simple analogy

Think of the public key like a padlock you give to a friend (GitHub) — they can lock a box with it. But only your private key (which you keep hidden) can open that box. Since only you have the private key, only you can prove it's really you.

## Practical difference when using Git

- If your GitHub repo URL starts with `https://github.com/...` → you're using HTTPS, and you'll be asked to log in with a username + personal access token.
- If your GitHub repo URL starts with `git@github.com:...` → you're using SSH, and once your key is set up, it just works silently in the background — no login prompt.

## Key takeaway to remember
> SSH = secure remote access using a key pair (no repeated passwords).
> HTTPS = secure web communication (log in each time with a token).
