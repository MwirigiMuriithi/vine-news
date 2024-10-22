//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.jetbrains.kotlin.android)
//    id("com.google.devtools.ksp")
//    id("androidx.navigation.safeargs.kotlin")
//}
//
//android {
//    namespace = "com.example.newsapp"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.newsapp"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//    buildFeatures{
//        viewBinding = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//}
//
//dependencies {
//
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//    // Architectural Components
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
//    // Room
//    implementation ("androidx.room:room-runtime:2.6.0")
//    ksp ("androidx.room:room-compiler:2.6.0")
//    // Kotlin Extensions and Coroutines support for Room
//    implementation ("androidx.room:room-ktx:2.6.0")
//    // Coroutines
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
//    // Coroutine Lifecycle Scopes
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
//    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
//    // Retrofit
//    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
//    // Navigation Components
//    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.5")
//    implementation ("androidx.navigation:navigation-ui-ktx:2.7.5")
//    // Glide
//    implementation ("com.github.bumptech.glide:glide:4.12.0")
//    ksp ("com.github.bumptech.glide:compiler:4.12.0")
//}

//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    repositories {
//        google()
//    }
//    dependencies {
//        val navVersion = "2.7.5"
//        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
//    }
//}
//
//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.jetbrains.kotlin.android)
//    id("com.google.devtools.ksp")
//    id("androidx.navigation.safeargs.kotlin")
//}
//
//android {
//    namespace = "com.example.newsapp"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.newsapp"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//        debug {
//            // Add specific debug configurations here if needed
//        }
//    }
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//
//    buildFeatures {
//        viewBinding = true
//    }
//
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }
//
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//}
//
//dependencies {
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//
//    // Architectural Components
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
//
//    // Room
//    implementation("androidx.room:room-runtime:2.6.0")
//    ksp("androidx.room:room-compiler:2.6.0")
//    implementation("androidx.room:room-ktx:2.6.0")
//
//    // Coroutines
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
//
//    // Retrofit
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:4.5.0")
//
//    // Navigation Components
//    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
//    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")
//
//    // Glide
//    implementation("com.github.bumptech.glide:glide:4.12.0")
//    ksp("com.github.bumptech.glide:compiler:4.12.0")
//}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.newsprojectpractice"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsprojectpractice"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Architectural Components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    // Room
    implementation ("androidx.room:room-runtime:2.6.0")
    ksp ("androidx.room:room-compiler:2.6.0")

    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.6.0")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    // Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")

    // Navigation Components
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.5")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    ksp ("com.github.bumptech.glide:compiler:4.12.0")
}