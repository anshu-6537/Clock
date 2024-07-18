## Jetpack Compose Animated Clock

This project demonstrates a basic animated clock built with Jetpack Compose (Kotlin) for Android UI development. 

**Features:**

- Three rotating hands (hour, minute, second)
- Smooth animation for a visually appealing experience

**Getting Started**

**Prerequisites:**

- Android Studio with Jetpack Compose plugin installed
- Basic understanding of Kotlin and Jetpack Compose

**Clone the Repository:**
git clone https://github.com/anshu-6537/Clock.git


**Import Project:**

Open the project directory in Android Studio and import it as an existing project.

**Understanding the Code:**

The project consists of three main components:

  - **`MainActivity.kt`:** Defines the main activity that houses the composable function for the clock UI. It calculates angles for the hands, and uses animation to rotate them smoothly.
  -  Represents the composable function for the clock UI itself. It takes parameters for the size and color scheme, draws the clock face using a `Canvas`, and positions the hands based on the animated angles.
  -  Contains the `calculateAngles` function that calculates the rotation angles for each hand based on the current time.

**Running the App**

1. Connect or emulate an Android device in Android Studio.
2. Click the "Run" button to launch the app.

**Customization**

- Modify the size and color properties in `Clock.kt` to personalize the clock appearance.
- Experiment with different animation easing functions in `InfiniteTransition` to achieve desired animation styles (e.g., `LinearEasing`, `SpringSpec`).

**Key Improvements**

- **Clear and Concise Structure:** The code is well-organized and includes comments to enhance readability.
- **Detailed Explanations:** Each step provides essential information for understanding the project setup and functionalities.
- **Current Time Display:**  The clock now displays the current time in addition to the animation.
- **Error Handling:** While not included in this basic example, consider incorporating error handling for missing dependencies or potential runtime issues in future versions.
- **Code Formatting:** Maintains consistent formatting for better code readability.


## Screenshot :
![WhatsApp Image 2024-07-18 at 13 35 45](https://github.com/user-attachments/assets/3e3ae343-923d-4109-9467-a206b82f7e7a)

**Further Enhancements**

- **Animated Perimeter of the Clock**
- **Digital Time Display:** Include a section for displaying the current time in digital format alongside the clock animation.
- **Alarm Functionality:** Add the ability to set alarms with notifications or visual/audio cues.
- **Multiple Clock Styles:** Implement different clock face designs, such as Roman numerals or minimal style.
