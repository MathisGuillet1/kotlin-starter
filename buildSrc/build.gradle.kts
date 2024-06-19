plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlin.spring.plugin)
    implementation(libs.spring.boot.plugin)
    implementation(libs.klint.plugin)
}
