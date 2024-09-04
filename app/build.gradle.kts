plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.carhero.carherov2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.carhero.carherov2"
        minSdk = 24
        targetSdk = 34
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    // ==============Logging==============
    implementation ("com.jakewharton.timber:timber:5.0.1")

    //Responsive size of text, width, height
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
    implementation ("com.intuit.ssp:ssp-android:1.1.0")



    //==============Dagger==============
    implementation ("com.google.dagger:dagger:2.43.2")
    kapt ("com.google.dagger:dagger-compiler:2.43.2")
    kapt ("com.google.dagger:dagger-android-processor:2.43.2")

    //==============RxJava==============
    implementation ("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation ("io.reactivex.rxjava2:rxjava:2.2.20")



    //=============Rounded imageview==================
    implementation ("com.makeramen:roundedimageview:2.3.0")

    //==============RxViewBinding==============
    implementation ("com.jakewharton.rxbinding3:rxbinding:3.1.0")
    implementation ("com.jakewharton.rxbinding3:rxbinding-swiperefreshlayout:3.1.0")
    implementation ("com.jakewharton.rxbinding3:rxbinding-material:3.1.0")
    implementation ("com.jakewharton.rxbinding3:rxbinding-drawerlayout:3.1.0")

}