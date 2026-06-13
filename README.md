Course Service Microservice 
A robust, enterprise-grade Java backend microservice built using
 *Spring Boot
*Spring Data JPA and 
*MySQL. This project demonstrates an isolated enterprise architecture utilizing the database-per-service pattern, custom distributed exception handling, and seamless multi-layered validation logic for handling course registries and student enrollments asynchronously.

 **Key Architectural Features.* 
 **Database-Per-Service Design:*
* Fully isolated domain layer operating independently with a localized MySQL architecture to prevent cross-service database locks.
* **Decoupled Multi-Layer Routing: 
* *Clean separation of concerns between Controller mappings, business Service layers, and Data JPA Repositories.
* **Global Error Handling Framework:** Structured JSON error response formatting with automatic HTTP status overrides for clean, centralized client-side integration.
* **Robust Data Validations:* *Stringent entity constraint checks safeguarding API inputs against dirty data entries.

 _🛠️ Tech Stack & Environment_ 

* **Backend Framework:** Spring Boot 3.x / Java (JDK 17+)
* **Data Layer:
* ** Spring Data JPA / Hibernate Core
* **Database Engine:** MySQL Server
* **Build Tooling:** Maven Wrapper
* **Development IDE:** IntelliJ IDEA Ultimate

 _📂 Project Repository Tree_ 

`text
course-service/
├── .mvn/
├── screenshoots/
│   ├── project tree.png
│   ├── reflec doc.png
│   └── successful boot log. png.png
├── src/
│   ├── main/
│   │   ├── java/com/aptech/courseservice/
│   │   │   ├── controller/          # REST Endpoint Mappings
│   │   │   │   ├── CourseController.java
│   │   │   │   └── EnrollmentController.java
│   │   │   ├── model/               # JPA Database Entities
│   │   │   │   └── Course.java
│   │   │   ├── repository/          # Spring Data Data Access Objects
│   │   │   │   └── CourseRepository.java
│   │   │   └── CourseServiceApplication.java
│   │   └── resources/
│   │       └── application.properties # Database Connection Configs
│   └── test/                        # Mock MVC & Unit Test Suites
├── pom.xml                          # Project Dependencies Config
└── session_10_Reflection.md        # Session Review Document


## 📸 Technical Proof & System Verification

### 1. Unified Project Structure
A complete view of the decoupled packaging strategy and file placement inside the workspace ecosystem:
![Project Tree](screenshoots/project%20tree.png)

### 2. Microservice Terminal Verification
Live output tracking a flawless application context startup initialization and runtime environment spin-up:
![Successful Boot Log](screenshoots/successful%20boot%20log.%20png.png)

### 3. Session Reflection Breakdown
An inside look at the structural documentation assessing microservice connectivity workflows:
![Reflection Document](screenshoots/reflec%20doc.png)
