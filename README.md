# Spring Kafka Micro‑services Demo 🚀

A hands‑on reference project that demonstrates **event‑driven micro‑services** with **Spring Boot** and **Apache Kafka**.

The repository is organised as a Maven multi‑module workspace:
SpringKafka/
├── base-domains/     # Shared DTOs / event payloads
├── order-service/    # Publishes “order‑placed” events
├── stock-service/    # Consumes order events → updates inventory
└── email-service/    # Consumes order events → sends confirmation email

---

## 🖥️ Quick start

### 1. Prerequisites
| Tool | Minimum version |
|------|-----------------|
| JDK 17 | `java -version` |
| Maven 3.9 | `mvn -v` |
| Docker + Docker Compose | `docker compose version` |
| Kafka 4.0.0 | `kafka-topics.sh --version` |

