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

2. then Open below dialog 

![image](https://github.com/user-attachments/assets/937a965f-5632-4e4b-90da-515831057eb8)

3. If you need to create an APK, select Build APK(s). If you're preparing to publish the app, choose Build Android App Bundle instead. Then below Dialog 

![image](https://github.com/user-attachments/assets/6bb7c02c-0885-4e5d-9400-67a0490e57f0)

4. For Key Store Path. You can select from Github Clone File Path -> `app` -> `CarHero.jks` select File. 
5. Key Store Password => app@carHero
6. Key Alias => carHero
7. key Password => app@carHero

8. then click On Next Button then show below Dialog 

![image](https://github.com/user-attachments/assets/d73c84ea-29e6-4429-a2dc-6569fc5b6b7b)

9. please select Released build Variants. and Click on Create Button.

10. Android Studio will start building the APK. Once completed, you will receive a notification in the bottom-right corner saying "APK(s) generated successfully."

![image](https://github.com/user-attachments/assets/5ce15cbf-0135-42e4-8fd0-6490b14df327)



