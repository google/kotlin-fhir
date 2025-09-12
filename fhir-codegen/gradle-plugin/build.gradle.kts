plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlinx.serialization)
    `java-gradle-plugin`
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlin.poet)
    api(libs.kotlinx.datetime)
}

configure<GradlePluginDevelopmentExtension> {
    plugins {
        create("fhirCodegenPlugin") {
            id = "fhir-codegen"
            implementationClass = "com.google.fhir.codegen.FhirCodegenPlugin"
        }
    }
}
