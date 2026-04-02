plugins {
    java
    id("org.web3j") version "4.5.0"
}

group = "org.web3j"
version = "0.2.0"

java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

configure<org.web3j.gradle.plugin.Web3jExtension> {
    generatedPackageName = "org.web3j.sample.contracts.generated"
    excludedContracts = listOf("Mortal")
}

val web3jVersion = "4.5.0"
val logbackVersion = "1.2.3"
val junitVersion = "4.12"

dependencies {
    implementation("org.web3j:core:$web3jVersion")
    implementation("ch.qos.logback:logback-core:$logbackVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    testImplementation("junit:junit:$junitVersion")
}
