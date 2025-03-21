<div align="center">

<h1 align="center">User and Product Management System</h1>

<p align="center">
    <strong>This software is a backend for managing users and products</strong>
</p>

[![pt-BR](https://img.shields.io/badge/lang-pt--BR-green.svg)](./docs/README.pt-br.md)
[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)

</div>

## Table of Contents

- [Table of Contents](#table-of-contents)
- [About](#about)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
  - [Connect with me on LinkedIn](#connect-with-me-on-linkedin)
  - [Fork and clone the repository](#fork-and-clone-the-repository)
  - [Project Structure](#project-structure)
- [Build from Source](#build-from-source)
  - [Prerequisites](#prerequisites)
  - [Install Spring Tool Suite](#install-spring-tool-suite)
  - [Install MongoDB](#install-mongoDB)
  - [Install Java 21 LTS](#install-java-21-lts)
  - [Install Maven Dependencies](#install-maven-dependencies)
- [Running](#running)
- [API Usage Examples](#api-usage-examples)
- [License](#license)

## About
This project is a small social network application built using Java and **MongoDB**. It includes user, post creation, and commenting functionality. The application leverages **Spring Boot** for seamless integration and custom queries with **@query** for efficient data retrieval. This project showcases the use of a scalable, **non-relational database** in a **Java**. 

## Features

- CRUD operations
- Database Integration
- RESTful API
- Search by ID
- Simple query with @Query

## Technologies Used

- Spring Boot
- Spring Data JPA
- MongoDB
- Maven
- Apache Tomcat
- Java 21 LTS

## Contributing

### Connect with me on LinkedIn

Connect with me on [LinkedIn](https://www.linkedin.com/in/caiogomesbrayner).

### Fork and clone the repository

1. Fork the repository [(click here to fork now)](https://github.com/Caio-GBrayner/springboot-jpa)
2. Clone your fork `https://github.com/Caio-GBrayner/springboot-jpa.git`
3. Create a new branch
4. Push your commits
5. Submit a new Pull Request

### Project Structure

- src/main/config: Configuration tests
- src/main/domain: Contains the system entities.
- src/main/repository: Contains interfaces that extend `MongoRepository` for database access.
- src/main/dto/: Contains Data Transfer Objects (DTOs) used for transferring data between layers.
- src/main/resources/: Contains resource files, such as configuration properties and messages.
- src/main/resources/util: Utility classes or helper functions.
- src/main/resources/exceptions: Contains custom exception classes.
- src/main/services/: Contains service classes that implement business logic.
- src/main/service/exceptions: Contains exceptions specific to the service layer.

## Build from Source

### Prerequisites

- Java 21 LTS installed.
- Maven installed.
- MongoDB

### Install Spring Tool Suite

1. Download Spring Tool Suite [here](https://spring.io/tools).
2. Follow the installation instructions for your operating system.

## Install MongoDB

1. Checklist Windows:

- https://www.mongodb.com -> Download -> Community Server
- Download and install with the "Complete" option
- https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/ -> Set up the MongoDB environment
  - Create directory \data\db
  - Add to PATH: C:\Program Files\MongoDB\Server\3.6\bin (adjust for your version)
- Test in the terminal: 
```bash
mongod
```

2. Checklist for Mac:

- Install brew:
  - Go to https://brew.sh and execute the command provided on the first page.
- Install MongoDB:
  - Run: `brew install mongodb `
- Create the /data/db directory:
  - Run: `sudo mkdir -p /data/db`
- Grant access to the created directory:
  - Check your username: `whoami` (e.g., Roberto)
  - Run: `sudo chown -Rv Roberto /data/db`
- Test in Terminal:
  - Run: `mongod`

### Install Java 21 LTS

1. Download JDK 21 [here](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).
2. Configure the `JAVA_HOME` environment variable.

### Install Maven Dependencies

1. Run the following command in the project root:
```bash
mvn clean install
```
## Running

1. Run the project command:
```bash
  mvn spring-boot:run
```

## Api Usage Examples

1. http://localhost:8080/users

2. http://localhost:8080/posts

3. http://localhost:8080/users/{id}

4. http://localhost:8080/users/{id}/posts

5. http://localhost:8080/posts/{id}

6. http://localhost:8080/posts/titlesearch

7. http://localhost:8080/posts/fullsearch

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.