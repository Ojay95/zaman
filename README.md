# **Hijri Calendar & Time of Prayers Web App**

## **Project Overview**

The **Hijri Calendar & Time of Prayers Web App** is a comprehensive application designed to help Muslims keep track of prayer times, and the Hijri calendar, and receive reminders for daily prayers. The app offers the following features:

- **Prayer Times:** Display accurate prayer times based on the user's location.
- **Location-based Prayer Times:** Prayer times are automatically adjusted based on the user's geographic location (latitude and longitude).
- **Notifications:** Customizable prayer time reminders with push notifications.
- **Hadith/Quotes:** Daily Islamic quotes or Hadith with an option to save or share them.
- **Qibla Direction:** Provides the Qibla direction based on the user's location.
- **Adhan Audio:** Call to prayer notifications with optional audio.

## **Tech Stack**

- **Backend:** Java (Spring Boot)
- **Database:** PostgreSQL
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

## **Installation**

### **1. Clone the Repository**

Clone the repository to your local machine:

```bash
git clone https://github.com/Ojay95/zaman.git
cd hijri-prayer-app
```

### **2. Set Up the Database**

- Make sure you have PostgreSQL installed and running locally or use a hosted PostgreSQL service.
- Create a new database called `hijri_prayer_app` in PostgreSQL.

### **3. Configure `application.properties`**

Edit the `src/main/resources/application.properties` file and update the following settings:

```properties
# Database configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/hijri_prayer_app
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

# Firebase configuration
firebase.api.key=your_firebase_api_key
```

### **4. Build the Project**

Use Maven to build the project:

```bash
mvn clean install
```

### **5. Run the Application**

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

The backend server will start running on `http://localhost:8080`.

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

## **Contributing**

We welcome contributions to this project! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Make your changes and commit (`git commit -am 'Add feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Submit a pull request.



## **Acknowledgements**

- **Aladhan API** for providing prayer times.
- **Firebase Cloud Messaging** for push notifications.
- **MySQL** for the database.

---

This README provides a detailed overview of how to set up and use the **Hijri Calendar & Time of Prayers Web App**. Let me know if you'd like to add more details or adjust anything!
