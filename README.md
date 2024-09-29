# CarHeroAndroidPrivate

## Installation
To run this project, follow the steps below:


### Steps to Clone the Project from GitHub

### Clone the repository:
1. Open the project in Android Studio.
2. File > New > Project from Version Control...
3. In the **URL** field, paste the following repository URL:
   ```bash
    git clone https://github.com/himanshugjr57/CarHeroAndroidPrivate.git
    ```
4. Sync the Gradle project by selecting `File` -> `Sync Project with Gradle Files`. 



## How to Run Apps in Android device or emulator

1. After done setup you can click on run button or `Shift + F10`. 

2. Wait for Lunching Appsin device.

## How to Increase Build Version and Create an APK in Android Studio (Kotlin)

Follow these steps to increase the build version and generate an APK for your Android project:

### 1. **Increase the Build Version**

You can increase the version code and version name in your `build.gradle` file to reflect a new release:

1. Open your Android project in **Android Studio**.
   
2. Navigate to the `build.gradle` file for your **app module** (usually located under `app/build.gradle`).

3. Inside the `android` block, you'll find `versionCode` and `versionName`. Update them as follows:

   ```kotlin
   android {
       compileSdkVersion 34
       defaultConfig {
           applicationId "com.carhero.carherov2"
           minSdkVersion 24
           targetSdkVersion 34
           versionCode 1     // Increment this value for each release
           versionName "1.6"  // Update the version name
           ...
       }
   }

4. After making these changes, sync the project by clicking "Sync Now".


### 2. **Create APK and aab**

1. select `Build` -> `Genreate Signed Bundle/APK`. 

2. 
