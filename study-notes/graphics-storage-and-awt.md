# Storing Graphics & Why AWT Is "Abstract" (explained simply)

## Where to store images

| Scale | Approach |
|---|---|
| Few, small images | **Relational database**: store the image as binary data (BLOB), or store a *file path* pointing to where it lives on disk |
| Large volumes of high-resolution images | **Object storage**: Amazon S3, Google Cloud Storage |

Object stores keep files as **objects with metadata** (not rows in a table or files on one local disk). They are built for large files at scale, with high availability, redundancy, and cost-effective pricing that a relational database cannot match. A common pattern is to keep the *metadata and URL* in the database and the actual bytes in the object store.

**Gap to close:** I understand the use case but have never configured an S3 bucket. Worth trying a small hands-on bucket upload.

## Why AWT is called the Abstract Window Toolkit

AWT gives Java a programming interface that **abstracts over each operating system's native windowing system**. Creating an AWT button makes AWT delegate to the OS, which renders a native button: a Windows button on Windows, a macOS button on macOS. The "abstract" part is the Java layer that hides these OS-specific details from the programmer.

This is the contrast with Swing and JavaFX covered in [java-gui-frameworks](java-gui-frameworks.md) and [java-swing-architecture](java-swing-architecture.md): AWT uses native "heavyweight" components, while Swing draws its own.

## Key takeaway
> Small image sets can live in a relational DB (binary or file path); large ones belong in object storage like S3. AWT is "abstract" because it hides the OS's native windowing behind one Java API.
