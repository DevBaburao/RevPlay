\# 🎵 RevPlay – Console-Based Music Streaming Application



RevPlay is a console-based music streaming application developed using Core Java and JDBC with Oracle Database integration.

The application follows a layered architecture (Controller → Service → DAO → Model) to maintain clean separation of concerns and scalable design.



---



\## 🚀 Features



\### 👤 User Management

\- Listener registration and login

\- Artist registration and login

\- Secure authentication handling

\- Password hint and validation



\### 🎶 Music Management

\- Browse songs by genre

\- Create and manage playlists

\- Add songs to playlists

\- Mark favorite songs

\- Listening history tracking



\### 🎙 Podcast Management

\- Add and manage podcasts

\- Manage podcast episodes

\- Browse and interact with podcast content



\### 📊 Database Integration

\- Oracle Database connectivity using JDBC

\- Structured relational schema

\- Foreign key constraints and relationships

\- SQL-based CRUD operations



---



\## 🏗️ Architecture



The application follows a layered architecture:



Controller → Service → DAO → Database

                         ↕

                        Model



\### Layers:



\- \*\*Controller Layer\*\* – Handles user interaction and input

\- \*\*Service Layer\*\* – Contains business logic

\- \*\*DAO Layer\*\* – Manages database operations

\- \*\*Model Layer\*\* – Represents entity classes



---



\## 🛠️ Technologies Used



\- Core Java (JDK 17)

\- JDBC

\- Oracle Database

\- IntelliJ IDEA

\- Git \& GitHub



---



\## ⚙️ Setup Instructions



\### 1️⃣ Clone the Repository



```bash

git clone https://github.com/DevBaburao/RevPlay.git

```



---



\### 2️⃣ Add Oracle JDBC Driver



Due to licensing restrictions, the Oracle JDBC driver is not included in this repository.



Download `ojdbc11.jar` and place it inside a `lib` folder:



```

RevPlay/lib/ojdbc11.jar

```



Then add it to the project dependencies in IntelliJ IDEA.



---



\### 3️⃣ Configure Database



Create a file:



```

src/db.properties

```



Add your database configuration:



```properties

db.driver=oracle.jdbc.driver.OracleDriver

db.url=jdbc:oracle:thin:@//localhost:1522/XEPDB1

db.username=your\\\_username

db.password=your\\\_password

```



---



\### 4️⃣ Execute Database Schema



Run the provided:



```

schema.sql

```



in your Oracle database to create the required tables.



---



\### 5️⃣ Run the Application



Run the main class:



```

com.revplay.main.Main

```



from IntelliJ IDEA.



---



\## 📂 Project Structure



```

src/

\&nbsp;└── com.revplay

\&nbsp;     ├── controller

\&nbsp;     ├── service

\&nbsp;     ├── dao

\&nbsp;     ├── model

\&nbsp;     ├── util

\&nbsp;     └── main

schema.sql

```



---



\## 🔒 Notes



\- Log files and compiled files are excluded using `.gitignore`

\- Database credentials are not included in the repository

\- Oracle JDBC driver must be added manually



---



\## 👨‍💻 Author



DevBaburao

GitHub: https://github.com/DevBaburao

