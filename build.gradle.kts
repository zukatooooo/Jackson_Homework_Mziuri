plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("com.fasterxml.jackson.core:jackson-databind:2.16.1")
    implementation("com.fasterxml.jackson.core:jackson-core:2.16.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.16.1")

    implementation("org.apache.tomcat.embed:tomcat-embed-core:11.0.0-M16")
    implementation("org.apache.tomcat.embed:tomcat-embed-jasper:11.0.0-M16")

    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0-M1")

}

tasks.test {
    useJUnitPlatform()
}