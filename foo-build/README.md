## Learning sbt
- prefixing ~ to any command makes it automatically re executes the command whenever one of the source files are modified.
  - like `~compile` or `~quickTest`

- when I run `sbt` command, it creates a **project** and a **target** folder
  - **project/**: is the meta-build, it holds sbt's own build definition:
    - `project/build.properties`, `project/plugins/sbt` and any `.scala` files that define the build.
    - `project/target/` is for its complied classes.
  - **target**: the build output of the project itself. Each submodule has its own `target/`.
    - It contains compiled classes, test outputs, packaged artifacts, incremental compile data and generated sources/resources.
    - 