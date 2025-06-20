# 📱 ONGC Logger App

An internal Android application for ONGC employees to efficiently log daily field activities, manage operations, and track reports — all from their mobile devices.

---

## 🚀 Features

- 📝 Log field activities with automatic timestamps  
- 📍 Tag entries with location, section, and employee details  
- 🔎 Search and filter logs by date, location, or designation  
- 📤 Export logs as PDF/CSV (offline & online)  
- 🔒 Secure authentication and role-based access  
- ☁️ Optional cloud sync and offline mode

---

## 🏗️ Tech Stack
- **Language:** Kotlin, Java  
- **Architecture:** MVVM + Jetpack  
- **UI:** Jetpack Compose, XML layouts
- **Network:** Retrofit + REST APIs (if needed)  
- **Authentication:** Firebase, custom loginß  
- **Version Control:** Git & GitHub

---

## 📂 Project Structure

```plaintext
ongc-logger-app/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/ongc/logger/       # App source code
│   │   │   ├── res/                        # Layouts, drawables, etc.
│   │   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── .gitignore
└── README.md
