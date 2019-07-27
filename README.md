# Spring Cloud Stream

Spring Cloud Stream and RabbitMQ

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

### Docker

```
Go to your docker-compose.yml directory and then execute docker-compose up to create and start services in your docker-compose.yml file
```

```
Run a docker image as a container executing docker run -p 15672:15672 -p 5672:5672 rabbitmq:management
```

### RabbitMQ

```
http://localhost:15672

user:guest
password:guest
```

Publish message

```
{
  "id" : 1,
  "description" : "Computer",
  "total" : 600.00
}
```

