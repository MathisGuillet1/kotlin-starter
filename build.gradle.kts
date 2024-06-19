plugins {
    id("kotlin-starter.conventions")
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.jib)
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.github.oshai:kotlin-logging-jvm")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

jib {
    from {
        image = "eclipse-temurin:21-jre"
    }
    to {
        image = "kotlin-starter"
    }
}
