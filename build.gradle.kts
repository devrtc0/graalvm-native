import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "org.example"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.inject:guice:5.0.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

project.setProperty("mainClassName", "org.example.Main")

tasks {
    named<ShadowJar>("shadowJar") {
        manifest {
            attributes(mapOf("Main-Class" to "org.example.Main"))
        }
    }
}