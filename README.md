# Compose Multiplatform Application

## Before running!
- check your system with [KDoctor](https://github.com/Kotlin/kdoctor)
- install JDK 17 on your machine
- add `local.properties` file to the project root and set a path to Android SDK there

### Android
To run the application on android device/emulator:
- open project in Android Studio and run imported android run configuration

To build the application bundle:
- run `./gradlew :composeApp:assembleDebug`
- find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`

### iOS
To run the application on iPhone device/simulator:
- Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
- Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio

### Browser
Run the browser application: `./gradlew :composeApp:jsBrowserDevelopmentRun`

[Environment]::SetEnvironmentVariable("Path", [Environment]::GetEnvironmentVariable('Path', [EnvironmentVariableTarget]::Machine) + "$($Env:JAVA_HOME)\bin", [EnvironmentVariableTarget]::Machine)

[System.Environment]::SetEnvironmentVariable("JAVA_HOME", "C:\Program Files\Amazon Corretto\jdk17.0.9_8", [System.EnvironmentVariableTarget]::Machine)
[System.Environment]::GetEnvironmentVariable("JAVA_HOME", [System.EnvironmentVariableTarget]::Machine)
# ADD "bin += path"
[System.Environment]::SetEnvironmentVariable("Path", "%JAVA_HOME%\bin;" + [Environment]::GetEnvironmentVariable('Path', [EnvironmentVariableTarget]::Machine), [System.EnvironmentVariableTarget]::Machine)
[System.Environment]::GetEnvironmentVariable("Path", [System.EnvironmentVariableTarget]::Machine)