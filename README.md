# Kotlin starter

This project provides a template to bootstrap projects built with Spring Boot and Kotlin.

## Code style

The code style follows the [Kotlin official code conventions](https://kotlinlang.org/docs/coding-conventions.html) and 
are enforced by plugin [Klint](https://pinterest.github.io/ktlint/latest/).

You can configure your IDE as described in the official coding conventions to enforce the rules when coding.

## Build the project

To build the project, you can run:

```shell
./gradlew build
```

To launch application, you can run:

```shell
./gradlew bootRun
```

You can build a docker image locally (or push to a registry) with jib:

```shell
./gradlew jibDockerBuild
```