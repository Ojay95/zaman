# **Zaman (Hijri Calendar & Time of Prayers Web App)**

## **Project Overview**

The ** Zaman (The Hijri Calendar & Time of Prayers Web App)** is a comprehensive application designed to help Muslims keep track of prayer times, and the Hijri calendar, and receive reminders for daily prayers. The app offers the following features:

- **Prayer Times:** Display accurate prayer times based on the user's location.
- **Location-based Prayer Times:** Prayer times are automatically adjusted based on the user's geographic location (latitude and longitude).
- **Notifications:** Customizable prayer time reminders with push notifications.
- **Hadith/Quotes:** Daily Islamic quotes or Hadith with an option to save or share them.
- **Qibla Direction:** Provides the Qibla direction based on the user's location.
- **Adhan Audio:** Call to prayer notifications with optional audio.

## **Tech Stack**

- **Backend:** Java (Spring Boot)
- **Database:** MySQL
- **Notification Service:** Firebase Cloud Messaging (FCM)
- **External APIs:** Aladhan API (for prayer times), Islamic quote APIs (for Hadiths)
- **Version Control:** Git/GitHub
- **Build Tool:** Maven

## **Features**

- **Prayer Times API Integration:** Fetch prayer times for any location based on latitude and longitude.
- **Qibla Direction:** Use geolocation data to calculate and show the Qibla direction.
- **Customizable Push Notifications:** Set reminders for prayer times with options for reminder lead time (e.g., 10 minutes before).
- **Daily Hadith/Quote:** Display a daily Islamic quote/Hadith with the ability to save or share.
- **Adhan Audio:** Play the Adhan (call to prayer) audio when prayer time arrives.
- **Hijri Calendar:** View the Islamic (Hijri) calendar alongside the Gregorian calendar.
- **User Preferences:** Users can save their preferences for notifications and favorite quotes.

## **System Architecture**

The backend of the app follows a **microservices architecture** and is composed of the following modules:

1. **Controllers:** Expose REST APIs to handle user requests for prayer times, quotes, notifications, and more.
2. **Services:** Contain business logic for fetching prayer times, calculating Qibla direction, handling notifications, etc.
3. **Repositories:** Manage the persistence layer, interfacing with the PostgreSQL database.
4. **Models:** Define the structure of the database entities like `User`, `PrayerTime`, `Quote`, and `UserNotificationSettings`.
5. **Configuration:** Setup Firebase for push notifications and configure external APIs.
6. **Scheduled Jobs:** Handle automated tasks like sending notifications based on prayer times.

## **API Endpoints**

The following are the key API endpoints available:

- **GET /api/v1/prayer-times?location={latitude},{longitude}**  
  Fetch prayer times for a specific location.
  
- **GET /api/v1/qibla?location={latitude},{longitude}**  
  Get the Qibla direction based on the user’s location.

- **GET /api/v1/daily-quote**  
  Get the daily Islamic Hadith/quote.

- **POST /api/v1/user/preferences**  
  Set or update user preferences for notifications.

- **POST /api/v1/notifications/subscribe**  
  Subscribe the user to push notifications for prayer reminders.

- **POST /api/v1/notifications/send**  
  Trigger prayer notifications manually (for testing purposes).

## **Acknowledgements**

- **Aladhan API** for providing prayer times.
- **Firebase Cloud Messaging** for push notifications.
- **MySQL** for the database.

---
