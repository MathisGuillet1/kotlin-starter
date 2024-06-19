import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm")
    jacoco
    id("org.jlleitschuh.gradle.ktlint")
}

group = "io.github.mathisguillet"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val versionCatalog = rootProject.extensions.getByType<VersionCatalogsExtension>().named("libs")

    // Dependencies shared across all modules
    implementation(platform(versionCatalog.findLibrary("spring-boot-dependencies").get()))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Dependencies versioning for modules
    constraints {
        implementation(versionCatalog.findLibrary("kotlin-logging").get())
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
        jvmTarget = JvmTarget.JVM_21
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required = true
    }
}