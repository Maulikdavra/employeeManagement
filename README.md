# employeeManagement
"EmployeeManagement" is a streamlined Spring Boot application designed for effective management of employee data. This back-end application supports a complete set of CRUD operations - Create, Read, Update, and Delete. Leveraging the power of RESTful APIs, the application can be tested and interacted with through tools like Postman.

To get started with the project, clone the repository and import it into your favorite IDE. The project is structured as a Maven project and can be easily managed and configured through the provided pom.xml.

Prerequisites

The project uses MySQL as the database server. Make sure to have MySQL server installed and running. The MySQL Workbench tool can be used to interact with the database server and test the application.

The application is built using the following technologies:

Spring Boot 3.1.0
Spring Data JPA
Spring Web
MySQL Connector/J
Project Lombok
Spring Boot Test
Ensure that you have Java 20 installed to run the application.

Database Setup

Scripts for setting up the database are included within the project. You can run these scripts on your MySQL server to setup the required tables and relations for the application to function properly.

Usage

You can perform CRUD operations on the Employee entity. Use Postman or any other API testing tool to send HTTP requests to the application.

Documentation

A detailed explanation of the Hibernate-JPA annotation mappings used in the project (@JoinColumn, inverseJoinColumn, etc.) for one-to-one and one-to-many relationships can be found in the included PDF document.

Remember to replace the placeholders with actual commands or paths wherever necessary. This includes the cloning command, running the application, and sending HTTP requests.




