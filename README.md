# Spring Kafka Micro‑services Demo 🚀

A hands‑on reference project that demonstrates **event‑driven micro‑services** with **Spring Boot** and **Apache Kafka**.

The repository is organised as a Maven multi‑module workspace:<br>
SpringKafka/<br>
├── base-domains/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Shared DTOs / event payloads<br>
├── order-service/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Publishes “order‑placed” events<br>
├── stock-service/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Consumes order events → updates inventory<br>
└── email-service/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Consumes order events → sends confirmation email<br>

---

## 🖥️ Quick start

### 1. Prerequisites
| Tool | Minimum version |
|------|-----------------|
| JDK 17 | `java -version` |
| Maven 3.9 | `mvn -v` |
| Docker + Docker Compose | `docker compose version` |
| Kafka 4.0.0 | `kafka-topics.sh --version` |

You should see:<br>
	•	order-service logs: ✅ published topic=order_events<br>
	•	stock-service logs: ✅ inventory updated<br>
	•	email-service logs: ✅ confirmation email sent to demo@xyz.com<br>
