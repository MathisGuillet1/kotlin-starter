plugins {
    id("kotlin-starter.kotlin-conventions")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    val versionCatalog = rootProject.extensions.getByType<VersionCatalogsExtension>().named("libs")

    // Dependencies shared across all modules
    implementation(platform(versionCatalog.findLibrary("spring-boot-dependencies").get()))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // Dependencies versioning for modules
    constraints {
        implementation(versionCatalog.findLibrary("kotlin-logging").get())
    }
}