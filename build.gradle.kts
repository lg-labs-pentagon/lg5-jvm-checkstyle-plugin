plugins {
    kotlin("jvm") version "1.9.23"
    id("java-gradle-plugin")
    id("com.gradle.plugin-publish") version "1.2.1"
}

gradlePlugin {

    website.set("https://github.com/lg-labs-pentagon/lg5-jvm-checkstyle-plugin")
    vcsUrl.set("https://github.com/lg-labs-pentagon/lg5-jvm-checkstyle-plugin")
    plugins {
        create("gradleCodeStylePluginExample") {
            id = "io.github.lg5.jvm.checkstyle.code"
            displayName = "Gradle Plugin Code Style"
            description = "Predefined Checkstyle and PMD rules"
            implementationClass = "io.github.lg5.jvm.checkstyle.code.CodingRulesGradlePlugin"
            tags.set(listOf("codestyle", "checkstyle", "pmd"))
        }
    }
}

dependencies {
    testImplementation(libs.jupiter.root)
    testRuntimeOnly(libs.jupiter.launcher)
}

tasks.test {
    useJUnitPlatform()
}



repositories {
    mavenCentral()
}


repositories {
    mavenCentral()
}



tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}