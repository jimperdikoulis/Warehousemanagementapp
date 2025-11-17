// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Define the versions for the core plugins here.
    // 'apply false' means the plugin is available to sub-projects but not applied here.
    id("com.android.application") version "8.12.3" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
}