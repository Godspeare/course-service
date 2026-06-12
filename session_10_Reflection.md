# Session 10 Reflection: Event-Driven Architecture

### 1. Difference between a Synchronous HTTP call and an Asynchronous Message Queue
* **Synchronous HTTP Calls:** The caller service sends a request and must wait, blocking its execution thread, until the receiver responds. If the receiver is offline, the call crashes instantly. This tightly couples services.
* **Asynchronous Message Queues (e.g., Kafka):** The producer sends a message to a broker (like Kafka) and immediately continues its work. Consumers process the message whenever they are online. This decouples services and keeps the system resilient if one service goes down.

### 2. How the Course Service would track new student creation asynchronously
1. When a student registers, the **Student Service** publishes an event message to a Kafka topic (e.g., `student-created-topic`).
2. The **Course Service** listens to this topic in the background.
3. Upon receiving the message, the Course Service automatically saves a local copy or reference of that student's details in its own database.
4. When a student enrolls, the Course Service checks its own local database instead of making an external network call to the Student Service.
5.