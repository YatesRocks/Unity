plugins {
    id("java")
    application
}

group = "org.yates"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // ui
    implementation("com.miglayout:miglayout:3.7.4")
    implementation("com.formdev:flatlaf:1.6.5")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "org.yates.Main"
}