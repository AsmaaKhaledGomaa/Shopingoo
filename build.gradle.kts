// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // AGP
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    // Google services
    id("com.google.gms.google-services") version "4.4.2" apply false
    // Crashlytics
    id("com.google.firebase.crashlytics") version "3.0.2" apply false
}