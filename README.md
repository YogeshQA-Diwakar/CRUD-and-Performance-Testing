# CRUD and Performance Testing

## Project Overview

This project demonstrates API functional testing and performance testing using the ReqRes API.

The project includes API automation using Rest Assured with TestNG and performance testing using Apache JMeter.

## Technologies and Tools Used

- Java 17
- Maven
- Rest Assured
- TestNG
- Log4j2
- Postman
- Apache JMeter 5.6.3
- Eclipse IDE
- Git and GitHub

## API Under Test

ReqRes API

Base URL:

https://reqres.in

## API Functional Testing

### GET Users

Endpoint:

GET /api/users?page=2

Validations performed:

- Send GET request
- Validate HTTP status code 200
- Display response body
- Log request execution and response details using Log4j2

Test class:

`GETUsers.java`

### POST User

Endpoint:

POST /api/users

Validations performed:

- Send POST request with JSON request body
- Validate HTTP status code 201
- Display response body
- Validate successful user creation

Test class:

`POSTUsers.java`

## Performance Testing

Performance testing is implemented using Apache JMeter 5.6.3.

JMeter test plan:

`performance/ReqRes-Load-Test.jmx`

The project includes practice with:

- Load Testing
- Stress Testing
- Spike Testing
- Summary Report
- Aggregate Report
- View Results Tree

## Project Structure

```text
CRUDOperations
├── src
│   ├── main
│   │   └── java
│   └── test
│       ├── java
│       │   └── CRUDOperations
│       │       ├── GETUsers.java
│       │       └── POSTUsers.java
│       └── resources
│           └── log4j2.xml
├── performance
│   └── ReqRes-Load-Test.jmx
├── pom.xml
├── .gitignore
└── README.md

Test Execution
The API automation tests can be executed as TestNG tests from Eclipse.
Expected status codes:
- GET Users: 200 OK
- POST User: 201 Created
Learning Objective
This project was developed as part of hands-on practice in:
- REST API testing
- API automation using Rest Assured
- TestNG assertions
- Logging using Log4j2
- Postman API testing
- JMeter performance testing
- Git and GitHub version control
Author
Yogesh Diwakar
QA / Software Testing
