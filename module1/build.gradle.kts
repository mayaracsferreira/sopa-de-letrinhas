plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

group = "me.mayaraferreira.sopadeletrinhas.module1"
version = "1.0.0"

repositories {
    google()
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(BOTH) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
    android()
    iosX64 {
        binaries {
            framework {
                baseName = "library"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
        val androidMain by getting
        val androidTest by getting {
            dependencies {
                implementation("junit:junit:4.13")
            }
        }
        val iosX64Main by getting
        val iosX64Test by getting
    }
}

android {
    compileSdk=31
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk=24
        targetSdk=29
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}