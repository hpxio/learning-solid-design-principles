plugins {
    id("java")
    id("com.diffplug.spotless") version "7.0.1"
}

group = "io.appx.codelabs.soliddesign"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "com.diffplug.spotless")

    // auto-linter for *.java & *.gradle.kts files
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        java {
            googleJavaFormat()
            importOrder(
                "java",
                "javax",
                "",
                "org.springframework",
                "org",
                "lombok",
                "io",
                "com",
            )
        }
    }
    spotless {
        kotlinGradle {
            target("*.gradle.kts")
            ktlint()
        }
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
