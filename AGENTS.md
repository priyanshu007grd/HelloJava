## Cursor Cloud specific instructions

This is a minimal Java "Hello World" project with no build tool (no Maven/Gradle), no external dependencies, and no test framework.

### Build and Run

```bash
javac -d out src/Main.java
java -cp out Main
```

### Notes

- JDK 21 is installed on the VM; the IntelliJ project config targets JDK 19 but compiles fine with 21.
- There is no `pom.xml` or `build.gradle` — compile directly with `javac`.
- The `Jenkinsfile` references a `simple-java-maven-app` directory that does not exist; it is non-functional.
- There are no automated tests, no linter, and no external services required.
