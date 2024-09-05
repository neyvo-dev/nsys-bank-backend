# NSys Bank

Back-end para o sistema do banco NSys Bank.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para construir a aplicação Java.
- **MongoDB**: Banco de dados NoSQL para armazenar dados.
- **Apache Kafka**: Sistema de mensageria para comunicação assíncrona e streaming de dados.
- **Spring Data REST**: Para expor dados via API REST de maneira fácil.

## Pré-requisitos

Antes de começar, você precisará ter as seguintes ferramentas instaladas:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) 
- [Docker](https://docs.docker.com/get-docker/) (para MongoDB e Kafka, se não estiver usando serviços externos)
- [Kafka](https://kafka.apache.org/quickstart) e [MongoDB](https://www.mongodb.com/try/download/community) (se estiver executando localmente)

## Configuração do Ambiente

### Configuração do Docker Compose

Para configurar MongoDB e Kafka usando Docker, crie um arquivo `docker-compose.yml` na raiz do seu projeto com o seguinte conteúdo:

```yaml
version: '3.8'

services:
  mongodb:
    image: mongo:latest
    container_name: mongodb
    ports:
      - "27017:27017"
    volumes:
      - mongodb_data:/data/db

  kafka:
    image: 'bitnami/kafka:latest'
    ports:
      - '9094:9094'
    environment:
      - KAFKA_CFG_NODE_ID=0
      - KAFKA_CFG_PROCESS_ROLES=controller,broker
      - KAFKA_CFG_LISTENERS=PLAINTEXT://:9092,CONTROLLER://:9093,EXTERNAL://:9094
      - KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://kafka:9092,EXTERNAL://localhost:9094
      - KAFKA_CFG_LISTENER_SECURITY_PROTOCOL_MAP=CONTROLLER:PLAINTEXT,EXTERNAL:PLAINTEXT,PLAINTEXT:PLAINTEXT
      - KAFKA_CFG_CONTROLLER_QUORUM_VOTERS=0@kafka:9093
      - KAFKA_CFG_CONTROLLER_LISTENER_NAMES=CONTROLLER

volumes:
  mongodb_data:
