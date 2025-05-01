Here’s a complete README.md file for Spring Boot + Dockerized Kafka project:

⸻
# Spring Boot + Kafka (Docker) Integration

This project demonstrates how to integrate a
**Spring Boot REST API** with **Apache Kafka running in Docker**.
The API allows you to send messages to a Kafka topic using a simple HTTP POST request using Postman.

---

##  Technologies Used in this project

- Spring Boot
- Apache Kafka
- Docker & Docker Compose
- Postman for testing
- Java 17+


## Project Structure

.
├── docker-compose.yml         # Kafka + Zookeeper Docker setup
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/
│       │       ├── controller/MessageController.java
│       │       ├── dto/MessageRequest.java
│       │       ├── service/KafkaMessageService.java
│       │       └── DockerKafkaApplication.java
│       └── resources/
│           └── application.yml


---

## Kafka Setup Using Docker

### 1. Start Kafka with Docker Compose

```bash
docker-compose up -d

This launches:
	•	Zookeeper on port 2181
	•	Kafka Broker on port 9092

Kafka is accessible at: localhost:9092

⸻

- > Spring Boot application will be run on server port : 8081



Send Message to Kafka

API Endpoint
	•	URL: POST http://localhost:8081/kafka/send
⸻

Notes
	•	Make sure Docker is running before you run docker-compose up.
	•	If you change the topic name, update it in KafkaMessageService.java.
	•	Kafka topic name used: test-topic
⸻

Troubleshooting
	•	Connection refused: Ensure Kafka container is up and port 9092 is mapped.
⸻
