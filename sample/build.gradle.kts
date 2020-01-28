import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(ProjectSettings.targetSdk)

    defaultConfig {
        applicationId = ProjectSettings.applicationId
        minSdkVersion(ProjectSettings.minSdk)
        targetSdkVersion(ProjectSettings.targetSdk)
    }

    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
    }
}

dependencies {
    implementation(kotlin(Deps.Kotlin.stdlib, KotlinCompilerVersion.VERSION))
    implementation(project(":library"))
    implementation(project(":libraryCompose"))

    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.constraintLayout)

    implementation(Deps.JetpackCompose.framework)
    implementation(Deps.JetpackCompose.foundation)
    implementation(Deps.JetpackCompose.layout)
    implementation(Deps.JetpackCompose.material)
    implementation(Deps.JetpackCompose.animation)
    implementation(Deps.JetpackCompose.tooling)
}
