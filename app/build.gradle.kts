plugins {
    id("com.android.application")
    id("androidx.navigation.safeargs")
}

android {
    buildFeatures {
        viewBinding = true
    }
    namespace = "com.example.event_invitation"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.event_invitation"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    val nav_version = "2.5.2"
    // val roomVersion = "2.4.0-alpha03"
    val roomVersion = "2.3.0"
    val appCompatVersion = "1.5.1"
    val lifecycleVersion = "2.3.1"
    val coreTestingVersion = "2.1.0"
    val materialVersion = "1.3.0"
    val constraintLayoutVersion = "2.1.4"
    // Java language implementation
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")

    // Feature module Support
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

    // Testing Navigation
    androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")

    // Jetpack Compose Integration
    implementation("androidx.navigation:navigation-compose:$nav_version")

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //add for database
    implementation ("androidx.appcompat:appcompat:$appCompatVersion")

    // Dependencies for working with Architecture components
    // You'll probably have to update the version numbers in build.gradle (Project)

    // Room components
    //implementation ("androidx.room:room-runtime:$rootProject.roomVersion")
    //  annotationProcessor ("androidx.room:room-compiler:$rootProject.roomVersion")
   // implementation ("androidx.room:room-compiler:$rootProject.roomVersion")
    implementation ("androidx.room:room-runtime:$roomVersion") // CHANGED TO ALPHA VERSION FOR MAC M1+ SILI
    annotationProcessor ("androidx.room:room-compiler:$roomVersion")
    androidTestImplementation ("androidx.room:room-testing:$roomVersion")
    //androidTestImplementation ("androidx.room:room-testin:$rootProject.roomVersn")

    // Lifecycle components
    implementation ("androidx.lifecycle:lifecycle-viewmodel:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-livedata:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion")
//  implementation ("androidx.lifecycle:lifecycle-viewmodel:$rootProject.lifecycleVersion")
//  implementation ("androidx.lifecycle:lifecycle-livedata:$rootProject.lifecycleVersion")
//  implementation ("androidx.lifecycle:lifecycle-common-java8:$rootProject.lifecycleVersion")

    // UI
    implementation ("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    implementation ("com.google.android.material:material:$materialVersion")

}
