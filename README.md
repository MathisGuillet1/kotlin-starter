# Kotlin starter

This project provides a template to bootstrap projects built with Spring Boot and Kotlin with multi module structure.

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

## Structure

Version management is handled in [gradle version catalog](gradle/libs.versions.toml).

Two gradle convention plugins are defined in the `buildSrc` folder to share versions, repositories, configurations...
across all the submodules.

In any submodule you can add the convention plugin to inherit all configurations related to kotlin or spring and
kotlin.

```
plugins {
    id("kotlin-starter.spring-conventions")
    // OR
    id("kotlin-starter.kotlin-conventions")
}
```