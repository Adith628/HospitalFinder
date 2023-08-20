plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}

android {
    compileSdk = 33
    compileSdkPreview = "UpsideDownCake"
    namespace = "com.nativemobilebits.loginflow"

    defaultConfig {
        applicationId = "com.nativemobilebits.loginflow"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    flavorDimensions += "environment"
    productFlavors {
        create("dev")
        create("staging")
        create("prod")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.5"
    }
}


dependencies {
    implementation("androidx.test:monitor:1.6.1")
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    androidTestImplementation("junit:junit:4.12")
    val composeVersion = "1.4.2"
    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.activity:activity-compose:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("com.squareup.picasso:picasso:2.71828")

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

    implementation(platform("com.google.firebase:firebase-bom:32.0.0"))

    implementation("com.google.firebase:firebase-auth-ktx")
    androidTestImplementation("androidx.activity:activity-compose:1.4.2")
    val composeBom = platform("androidx.compose:compose-bom:2023.08.00")
    implementation(composeBom)

    debugImplementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("com.github.bumptech.glide:glide:4.15.1")

}

kapt {
    correctErrorTypes = true
}
