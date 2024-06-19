plugins {
    id("kotlin-starter.spring-conventions")
    alias(libs.plugins.jib)
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.github.oshai:kotlin-logging-jvm")
}

jib {
    from {
        image = "eclipse-temurin:21-jre"
    }
    to {
        image = "kotlin-starter"
    }
}
