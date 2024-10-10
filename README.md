# CarHeroAndroidPrivate

## Table of Contents
- [Installation](#installation)
- [Running the App](#running-the-app)
- [Updating the Build Version](#updating-the-build-version)
- [Generating APK or AAB](#generating-apk-or-aab)
- [Upload App In Play store](#uploading-a-new-aab-to-an-on-google-play-console)

## Installation

To set up the project on your local machine, follow these steps:

1. **Clone the Repository**
   - Open **Android Studio**.
   - Navigate to `File` > `New` > `Project from Version Control...`.
   - In the URL field, enter the following repository URL:
     ```bash
     git clone https://github.com/himanshugjr57/CarHeroAndroidPrivate.git
     ```
   - Click on "Clone" to download the project files.

2. **Sync Gradle Files**
   - Once the project is cloned, go to `File` > `Sync Project with Gradle Files` to sync the dependencies.

## Running the App

To run the app on an Android device or emulator:

1. Click the **Run** button in Android Studio or use the keyboard shortcut `Shift + F10`.
2. Wait for the app to launch on the connected device or emulator.

## Updating the Build Version

To update the build version before generating a release:

1. Open the project in **Android Studio**.
2. Go to the `build.gradle` file located at `app/build.gradle`.
3. Update the `versionCode` and `versionName` inside the `defaultConfig` block:
   ```kotlin
   android {
       compileSdkVersion 34
       defaultConfig {
           applicationId "com.carhero.carherov2"
           minSdkVersion 24
           targetSdkVersion 34
           versionCode 2       // Increment this value for each release 3
           versionName "2.0"   // Update the version name 3.0
           ...
       }
   }

4. After making these changes, sync the project by clicking "Sync Now".


## Generating APK or AAB

Follow these steps to create an APK or Android App Bundle for your project:

1. **Open Build Menu**
   - In **Android Studio**, go to `Build` > `Generate Signed Bundle/APK`.

2. **Generate Signed Bundle or APK**
   - A dialog box will open as shown below:

     ![Generate Signed Bundle/APK](https://github.com/user-attachments/assets/937a965f-5632-4e4b-90da-515831057eb8)

3. **Choose Build Type**
   - If you need to create an APK, select **Build APK(s)**.
   - If you are preparing to publish the app, choose **Build Android App Bundle**.
   - This will open another dialog box:

     ![Select Build Type](https://github.com/user-attachments/assets/6bb7c02c-0885-4e5d-9400-67a0490e57f0)

4. **Enter Key Store Details**
   - For the Key Store Path, navigate to your cloned project directory and select the file: `app/CarHero.jks`.
   - Enter the following Key Store details:
     - **Key Store Password**: `app@carHero`
     - **Key Alias**: `carHero`
     - **Key Password**: `app@carHero`

5. **Proceed with the Build**
   - Click the `Next` button to proceed.
   - You will see a dialog similar to this:

     ![Key Store Setup](https://github.com/user-attachments/assets/d73c84ea-29e6-4429-a2dc-6569fc5b6b7b)

6. **Select Build Variant**
   - Choose the **Release** build variant and click on the `Finish` button.

7. **Build Process**
   - Android Studio will start building the APK or AAB.
   - Once the build is complete, a notification will appear in the bottom-right corner indicating "APK(s) generated successfully."

     ![Build Success](https://github.com/user-attachments/assets/5ce15cbf-0135-42e4-8fd0-6490b14df327)


## Uploading a New AAB to an on Google Play Console

Follow these steps to update an existing app on the Google Play Console with a new APK or AAB.

## Prerequisites

- A Google Play Developer account.
- The AAB file generated and ready for upload.

## Uploading a New AAB to Google Play Console

### Step 1: Log in to the Google Play Console

1. Open your web browser and go to [Google Play Console](https://play.google.com/console).
2. Log in using your Google Developer account credentials.

### Step 2: Select the Existing App

1. From the **All apps** list, select the **CarHero** app you want to update.

### Step 3: Prepare the New Release

1. Navigate to the **Production** track under the **Release** section.
2. Click on **Create new release**.
3. You will see a screen similar to this:

      ![Create New Release](https://github.com/user-attachments/assets/909c01a5-7bbc-4065-b12e-3e400ac7e595)

4. Click on the **Upload** button, select the AAB file, and upload it.
5. Wait for the upload to complete. Once done, the **Next** button will be enabled; click on **Next**.
6. You will then see a screen similar to this:

      ![Upload Confirmation](https://github.com/user-attachments/assets/e3085f7a-70ec-457b-bc59-b623efea1e34)
   
7. If no errors are encountered, click on **Next**. You will see a dialog similar to this:

   ![Release Notes](https://github.com/user-attachments/assets/942292f5-28d3-495f-950e-570768d91dcb)

8. Click on **Go to Overview**. You will see a screen similar to this:

   ![Overview](https://github.com/user-attachments/assets/388c1b14-8ff6-4f86-8e32-ab701e17315f)

9. Wait for the process to complete. Once done, click on **Send Changes for review**. The Play Console will then add your app for review, and you will need to wait for confirmation.

## Conclusion

Follow these steps to successfully upload a new AAB to the Google Play Console for the CarHero app. Ensure that you monitor the review process for any feedback or required changes.


