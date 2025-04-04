import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig
import java.io.FileOutputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.maven.publish)
    id("fhir-codegen")
    `maven-publish`
}

group = "com.google.fhir"
version = "1.0.0-alpha01"
val codegenTaskR4 = fhirCodegenExtension.newTask("r4") {
    this.definitionFiles.from(
        File(project.rootDir, "third_party/hl7.fhir.r4.core/package").listFiles()
    )
    this.packageName.set("com.google.fhir.r4")
}

val codegenTaskR4B = fhirCodegenExtension.newTask("r4b") {
    this.definitionFiles.from(
        File(project.rootDir, "third_party/hl7.fhir.r4b.core/package").listFiles()
    )
    this.packageName.set("com.google.fhir.r4b")
}

val codegenTaskR5 = fhirCodegenExtension.newTask("r5") {
    this.definitionFiles.from(
        File(project.rootDir, "third_party/hl7.fhir.r5.core/package").listFiles()
    )
    this.packageName.set("com.google.fhir.r5")
}

kotlin {
    jvm()
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
        }
    }
    @OptIn(ExperimentalWasmDsl::class) wasmJs {
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
    }
    js() {
        browser()
        binaries.executable()
    }
    iosX64 {
        binaries {
            framework {
                baseName = "KmpFhir" // Set the name of your framework

                // EXPORT DEPENDENCIES FOR OBJC INTEROP
                // If you are using other Kotlin modules as dependencies, you may need
                // to export them to make them visible to Objective-C/Swift:
                // export(project(":another-module"))

                // (OPTIONAL) EMBED BITCODE FOR RELEASE BUILDS (usually for iOS)
                // embedBitcode("release") // This usually goes in a separate release config
            }
        }
    }
    iosArm64()
    iosSimulatorArm64()
    linuxX64()

    sourceSets {
        val commonMain by getting {
            kotlin.srcDirs(codegenTaskR4.map { it.outputDirectory })
            kotlin.srcDirs(codegenTaskR4B.map { it.outputDirectory })
            kotlin.srcDirs(codegenTaskR5.map { it.outputDirectory })
            dependencies {
                implementation(libs.kotlinx.datetime)
                implementation(libs.kotlinx.serialization.json)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
                implementation(libs.kotlinx.serialization.json)
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}

android {
    namespace = "com.google.fhir"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

tasks.withType<Test>().configureEach {
    // Allow tests to access third_party
    systemProperty("projectRootDir", project.rootDir.absolutePath)
}

// publishing prep
val localRepo = project.layout.buildDirectory.get().dir("repo")
publishing {
    repositories {
        maven {
            url = localRepo.asFile.toURI()
        }
    }
}

tasks.register("prepareX20Zips", PrepareForX20::class) {
    this.outputDir.set(project.layout.buildDirectory.dir("x20zips"))
    this.publishOutputDir.set(tasks.named("publish").map { _ ->
        // mapping from publish task to establish dependency.
        localRepo
    })
}

/**
 * Creates a separate zip file for each artifact that we want to publish.
 */
@DisableCachingByDefault(because = "zip tasks are not worth caching")
abstract class PrepareForX20: DefaultTask() {
    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty
    @get:InputDirectory
    abstract val publishOutputDir: DirectoryProperty

    @TaskAction
    fun createZips() {
        outputDir.get().asFile.run {
            mkdirs()
            // delete everything inside
            listFiles().forEach {
                it.deleteRecursively()
            }
        }
        publishOutputDir.get().asFile.walkTopDown().filter { file ->
            file.isFile && file.extension == "pom"
        }.map { pomFile ->
            pomFile.parentFile.parentFile
        }.forEach { artifact ->
            zipArtifact(artifact)
        }
    }

    private fun zipArtifact(input: File) {
        val output = outputDir.get().asFile.resolve("${input.name}.zip")
        check(!output.exists()) {
            "$output already exists"
        }
        ZipOutputStream(FileOutputStream(output)).use { zipOut ->
            input.walkTopDown().forEach { fileOrDir ->
                val relativePath = fileOrDir.relativeTo(input).invariantSeparatorsPath
                val entryName =
                    relativePath + if (fileOrDir.isDirectory) "/" else ""

                zipOut.putNextEntry(
                    ZipEntry(entryName)
                )
                if (fileOrDir.isFile) {
                    fileOrDir.inputStream().use { it.copyTo(zipOut) }
                }
                zipOut.closeEntry()
            }
        }
    }
}
