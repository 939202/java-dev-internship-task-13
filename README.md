# JDBC MySQL CRUD Application

## 📌 Internship Task

**Java Developer Internship – Task 13: JDBC (Java Database Connectivity) with MySQL**

---

## 👤 Author

**Pavan Teja**

---

## 📖 Project Overview

This project demonstrates a **Java-based JDBC application** that connects to a **MySQL database** and performs full **CRUD operations** (Create, Read, Update, Delete).
The application uses **PreparedStatement** to ensure secure database interactions and prevent SQL injection.

The project follows a **standard Maven project structure** and is implemented as part of the **Java Developer Internship** to gain hands-on experience with database connectivity in Java.

---

## 🛠 Technologies Used

* **Java (JDK 17+)**
* **JDBC (Java Database Connectivity)**
* **MySQL**
* **MySQL Connector/J**
* **Maven**
* **VS Code**

---

## ✨ Features

* Establishes a secure JDBC connection with MySQL
* Performs CRUD operations:

  * Insert records
  * Retrieve records
  * Update records
  * Delete records
* Uses `PreparedStatement` to prevent SQL Injection
* Handles database connections properly
* Includes SQL script for easy database setup
* Follows clean and organized Maven project structure

---

## 📂 Project Structure

```
JDBC-MySQL-CRUD/
│
├── pom.xml
├── database.sql
├── README.md
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── jdbc/
│                   ├── DBConnection.java
│                   ├── DAO.java
│                   └── Main.java
│
└── screenshots/
```

---

## 🗄 Database Details

* **Database Name:** `jdbc_task`
* **Table Name:** `students`

### Table Structure

| Column | Type                              |
| ------ | --------------------------------- |
| id     | INT (Primary Key, Auto Increment) |
| name   | VARCHAR(50)                       |
| email  | VARCHAR(50)                       |

---

## ▶️ How to Run the Project

### 1️⃣ Set up the Database

* Open **MySQL Workbench** or MySQL CLI
* Execute the SQL script:

```sql
SOURCE database.sql;
```

---

### 2️⃣ Configure Database Credentials

Update the following fields in `DBConnection.java`:

```java
private static final String USER = "root";
private static final String PASSWORD = "your_mysql_password";
```

---

### 3️⃣ Run the Application

* Open the project folder in **VS Code**
* Open `Main.java`
* Click **▶ Run**

---

## 🧪 Sample Output

```
Student inserted successfully
Student inserted successfully
---- Student Records ----
1 | Ravi | ravi@gmail.com
2 | Anu | anu@gmail.com
Student updated successfully
Student deleted successfully
---- Student Records ----
1 | Ravi Kumar | ravi@gmail.com
```

---

## 📸 Screenshots

Screenshots demonstrating:

* Database table creation
* Successful JDBC connection
* CRUD operations output

are available in the **`screenshots/`** folder.

---

## 🔐 Security Notes

* `PreparedStatement` is used to prevent SQL Injection.
* Database credentials are kept configurable.
* Real passwords should not be committed to public repositories.

---

## 🧠 Key Learnings

* JDBC architecture and workflow
* MySQL database connectivity in Java
* Secure query execution using PreparedStatement
* Maven project structuring
* Handling database exceptions effectively

---

## ✅ Internship Completion Statement

This project was completed as part of the **Java Developer Internship** to demonstrate practical understanding of **JDBC and MySQL integration** in Java applications.

---

## 📬 Contact

**Pavan Teja**
Java Developer Intern
