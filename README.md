# Weather Forecast Application Documentation

## Table of Contents

1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Setup and Installation](#setup-and-installation)
4. [Running the Application](#running-the-application)
5. [Testing the Application](#testing-the-application)
6. [Application Features](#application-features)
7. [Implementation Details](#implementation-details)
8. [Known Issues](#known-issues)
9. [Future Enhancements](#future-enhancements)
10. [Acknowledgments](#acknowledgments)
11. [Conclusion](#conclusion)

## Introduction

The Weather Forecast Application is an Android app that provides weather information based on the user's input (city or zip code). It fetches data from the OpenWeatherMap API and displays relevant weather information such as temperature, humidity, wind speed, and weather conditions.

## Prerequisites

- Android Studio Arctic Fox or later
- Java 8 or higher / Kotlin
- OpenWeatherMap API key (sign up at [OpenWeatherMap](https://openweathermap.org/))

## Setup and Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-repo/weather-forecast-app.git
    cd weather-forecast-app
    ```

2. Open the project in Android Studio:
   - Launch Android Studio.
   - Open the cloned project directory.

3. Configure the API key:
   - Obtain an API key from OpenWeatherMap.
   - Add your API key in the `MainActivity` or create a `local.properties` file in the root of the project and add the following line:
     ```
     OPENWEATHER_API_KEY=your_api_key_here
     ```

4. Sync the project:
   - Click on `File` > `Sync Project with Gradle Files`.

## Running the Application

1. Connect an Android device or start an emulator:
   - Ensure USB debugging is enabled on your device.
   - Alternatively, start an Android Virtual Device (AVD) from the AVD Manager.

2. Run the application:
   - Click on the "Run" button in Android Studio or use the shortcut `Shift + F10`.
   - Select the connected device or AVD.

## Testing the Application

1. Search for a city's weather:
   - Enter a city name in the search bar.
   - Click on the "Search" button.
   - Verify that the weather information is displayed correctly.

2. Check weather for different cities:
   - Repeat the search process for multiple cities to ensure accurate data retrieval.

3. Error handling:
   - Test with invalid city names to verify error messages are displayed correctly.
   - Simulate network errors by disconnecting from the internet and ensuring the app handles these gracefully.

## Application Features

- **Weather Data Retrieval**:
  - Fetches current weather data from the OpenWeatherMap API.
  - Displays temperature, humidity, wind speed, and weather conditions.

- **Search Functionality**:
  - Allows users to search for weather information by city name or zip code.

- **User Interface**:
  - Clean and intuitive UI with appropriate visual elements.
  - Uses RecyclerView to display weather data in a scrollable list.

- **Error Handling**:
  - Displays informative error messages for network errors and invalid inputs.

## Implementation Details

- **Network Requests**:
  - Utilizes Retrofit for making API requests.
  - Parses JSON responses using Gson.

- **UI Components**:
  - Implements RecyclerView for displaying weather information.
  - Uses Glide for loading weather icons.

- **Data Classes**:
  - Defines data classes for handling API responses.

- **Architecture**:
  - Follows MVVM (Model-View-ViewModel) pattern for better code organization.

## Future Enhancements

- **Current Location Weather Update**:
  - Implement functionality to automatically retrieve and display weather information based on the user's current location. This feature will enhance user experience by providing real-time weather updates without the need for manual input.

## Screenshot

![Screenshot_20240515_135452](https://github.com/Xdiad47/QR_College_Student_Attendance_Management_System/assets/52922020/3931a272-13b4-4246-9da0-a2972691f889)


## Acknowledgments

We would like to express our gratitude to the developers and maintainers of the following third-party libraries and resources that have been instrumental in the development of this project:

1. Retrofit and OkHttp by Square, Inc.
   - Retrofit: [GitHub Repository](https://github.com/square/retrofit)
   - OkHttp: [GitHub Repository](https://github.com/square/okhttp)

2. Lifecycle Components by AndroidX team
   - Lifecycle Extensions: [GitHub Repository](https://github.com/androidx/androidx/tree/androidx-lifecycle-2.2.0)
   - Lifecycle Runtime: [GitHub Repository](https://github.com/androidx/androidx/tree/androidx-lifecycle-2.6.2)
   - Lifecycle ViewModel: [GitHub Repository](https://github.com/androidx/androidx/tree/androidx-lifecycle-2.6.2)
   - Lifecycle LiveData: [GitHub Repository](https://github.com/androidx/androidx/tree/androidx-lifecycle-2.6.2)

3. Gson by Google
   - Gson: [GitHub Repository](https://github.com/google/gson)

4. WeatherView by Matteo Battilana
   - WeatherView: [GitHub Repository](https://github.com/MatteoBattilana/WeatherView)

5. BlurView by Dimezis
   - BlurView: [GitHub Repository](https://github.com/Dimezis/BlurView)

6. Glide by bumptech
   - Glide: [GitHub Repository](https://github.com/bumptech/glide)

We appreciate the contributions of these open-source projects, which have significantly enriched our development process and helped us deliver a better experience to our users.

## Conclusion

The Weather Forecast Application demonstrates proficiency in Android development, including UI/UX design, data management, and API integration. The app provides accurate weather information with a clean and user-friendly interface. Further enhancements can be made to improve user experience and add additional features.
