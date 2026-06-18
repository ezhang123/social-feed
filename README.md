# SocialFeed
A RESTful backend API that simulates core social media functionality inspired by 
Twitter/Instagram. Built to demonstrate backend development skills using Java and 
the Spring Boot ecosystem.

## Tech Stack

* Java 21
* Spring Boot
* PostgreSQL
* Spring Data JPA / Hibernate
* Bean Validation
* Maven
* Postman
* Git & GitHub

## Features

* Create, retrieve, update, and delete posts
* Create and manage user accounts
* Persistent PostgreSQL database integration
* Many-to-One relationship between Posts and Accounts using JPA/Hibernate
* DTO-based request handling to separate API models from persistence models
* Input validation using Bean Validation
* Centralized exception handling
* Layered architecture (Controller → Service → Repository)
* RESTful API tested with Postman

## Running Locally

### Prerequisites

* Java 21+
* PostgreSQL
* Maven

### Setup

1. Clone the repository

```bash
git clone https://github.com/ezhang123/social-feed.git
cd social-feed
```

2. Configure the database in `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/socialfeed
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Run the application

```bash
./mvnw spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## API Endpoints

### Posts

| Method | Endpoint      | Description        |
| ------ | ------------- | ------------------ |
| GET    | `/posts`      | Retrieve all posts |
| POST   | `/posts`      | Create a post      |
| PUT    | `/posts/{id}` | Update a post      |
| DELETE | `/posts/{id}` | Delete a post      |

### Accounts

| Method | Endpoint | Description           |
| ------ | -------- | --------------------- |
| GET    | `/users` | Retrieve all accounts |
| POST   | `/users` | Create an account     |

## Future Improvements

* JWT authentication with Spring Security
* Pagination and sorting
* Search functionality
* Docker deployment
* Cloud deployment
