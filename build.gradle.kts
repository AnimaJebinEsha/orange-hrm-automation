plugins {
    id("java")
}

group = "com.sheba"
version = "1.0-SNAPSHOT"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.15.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.7.0")
}