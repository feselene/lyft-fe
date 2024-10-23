allprojects {
    repositories {
        google() // Google's Maven repository
        mavenCentral() // Central repository for libraries
    }
}

dependencies {
    implementation("org.hibernate:hibernate-core:3.6.7.Final")
}

plugins {
    `java-library`

    // Plugin for Android applications
    id("com.android.application") version "8.1.1" apply false

    // Plugin for Android library modules (if needed in the future)
    id("com.android.library") version "8.1.1" apply false

    // Kotlin plugin for Android apps
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false

    // Kotlin Kapt (for annotation processing, if you use libraries like Dagger, Hilt, etc.)
    id("org.jetbrains.kotlin.kapt") version "1.9.10" apply false
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

version = "1.2.1"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}