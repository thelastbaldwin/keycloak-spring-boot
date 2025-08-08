# Keycloak Integration with Spring Boot 3

This project demonstrates how to secure a Spring Boot application using Keycloak, a powerful open-source Identity and Access Management tool.

## Features

- Custom authentication token
- Reading authentication token from Controller endpoint
- Secured endpoints based on keycloak client roles

## Prerequisites

- Java 24.0.0
- Maven 3.8.6
- Keycloak Server 24.0.0

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Installation

1. Clone the repository:
    ```bash
    git https://github.com/thelastbaldwin/keycloak-spring-boot.git
    ```
2. Navigate into the project directory:
    ```bash
    cd keycloak-spring-boot
    ```
3. Use Maven to build the project:
    ```bash
    mvn clean install
    ```
4. You can then run the Spring Boot application using:
    ```bash
    mvn spring-boot:run
    ```

I recommend just opening and running the project in IntelliJ.

### Keycloak Setup

1. Run the docker-compose file:
    ```bash
    docker-compose up -d
    ```
2. Navigate to [Keycloak Admin UI Console](http://localhost:9090 "Keycloak Admin UI Console")
3. Create a new Realm and name it ```Mealwurm```
4. Create a client named `mealwurm` with a clientId of `mealwurm`
5. Under capability config, turn on client authentication
6. Create client roles `user` and `admin`
7. Create users
6. Assign client roles to users. Be sure to filter by client.

## Usage

Copy the client_secret from the keycloak admin console under the meallwurm client and update the postman calls. Use the included postman collection to gain an access token. Use that auth token along with appropriate calls to
`/api/user` and `/api/admin` to see the effects of the security chain, JwtConverter and MealwurmAuthenticationToken

## License

This project is licensed under the MIT License - see the LICENSE.md file for details
