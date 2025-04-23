plugins {
    kotlin("jvm") version "2.0.21"
}

group = "iut.info1"
version = "2025.1.0"

repositories {
    maven {
        url = uri("http://nexus.dep-info.iut-nantes.univ-nantes.prive/repository/public/")
        isAllowInsecureProtocol = true
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:2.0.21")
    implementation("net.sourceforge.plantuml:plantuml:1.2023.5")
    implementation(files("libs/univ.nantes.umlchecker-2.1.jar"))
    //testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()

    //minHeapSize="128m"
    //maxHeapSize="1024m"

    // Use half of available processor to run tests in parallel.
    // The following maxParallelForks config is suggested by gradle itself, https://docs.gradle.org/current/userguide/performance.html#execute_tests_in_parallel

    println("***** AVAILABLE PROCESSORS: ${Runtime.getRuntime().availableProcessors()}")
    //maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2).coerceAtLeast(1)
    reports.html.required = true

}
kotlin {
    jvmToolchain(8)
}