Voter Synchronization Hub
This project is a simple Voting and Address Management System developed using Java and Hibernate. It allows for the management of persons' data, their voting cards, and addresses. The system supports basic CRUD (Create, Read, Update, Delete) operations for person records.

Features
Insert a Person: Add a new person with their Aadhaar ID, name, voting card, and address.
View All Persons: Display a list of all persons with their Aadhaar, name, voting card, and address.
Update a Person: Update the details of an existing person, including Aadhaar ID, name, voting card, and address.
Delete a Person: Remove a person from the database using their Aadhaar ID.
Database Integration: Uses Hibernate ORM (Object-Relational Mapping) for database operations.
Technologies Used
Java: Core programming language.
Hibernate ORM: ORM framework for mapping Java objects to relational database tables.
MySQL: Database for storing the data.
Maven: Build tool for dependency management.
JPA (Java Persistence API): For managing relational data in Java.
Project Structure
Entities: Contains Person, Address, and VotingCard entities that represent the data models.
DAO (Data Access Object): Contains methods for interacting with the database to perform CRUD operations.
Service: Contains business logic.
Controller: Manages user input and coordinates between service and DAO layers.
Client: Main entry point that simulates a user interacting with the system via a command-line interface.
Setup
Prerequisites
Before running this project, ensure that you have the following installed:

JDK 11 or higher
MySQL Database
Maven
Installation
Clone the repository:
git clone https://github.com/SaurabhAndhale/voter-Sync-Hub.git
Key Topics Used in Your Project
Java Programming

Object-Oriented Programming (OOP)
Exception Handling
Hibernate ORM (Object-Relational Mapping)

Hibernate Configuration (hibernate.cfg.xml)
Entity Classes and Annotations (@Entity, @Id, @OneToOne, @ManyToOne, @JoinColumn)
CRUD Operations with Hibernate (Create, Read, Update, Delete)
JPA (Java Persistence API)

Entity Relationships: One-to-One, Many-to-One
Cascade Types (CascadeType.ALL, CascadeType.PERSIST, etc.)
Database Integration

MySQL Database
Database Schema Design (Tables for Person, VotingCard, Address)
Database Transactions with Hibernate
Session Management in Hibernate

SessionFactory and Session
Transaction Management in Hibernate (beginTransaction, commit, etc.)
Maven

Dependency Management
Project Build Automation
CRUD Operations

Performing Create, Read, Update, Delete on data entities.
Explanation of Key Directories and Files:
src/main/java/com/: Contains the main Java code for the project.

Client: Contains the Client.java file, which serves as the entry point for running the application. It simulates a user interacting with the system via a command-line interface.
controller: Contains the Controller.java class that manages user input and coordinates between the service and DAO layers.
dao: Contains the Dao.java class for database operations. It performs CRUD operations for entities like Person, VotingCard, and Address.
entity: Contains the entity classes that represent database tables.
Address.java: Represents the Address entity.
Person.java: Represents the Person entity.
VotingCard.java: Represents the VotingCard entity.
service: Contains the Service.java class that holds the business logic and interacts with the DAO layer to perform operations.
utility: Contains the Utility.java class, which helps in setting up Hibernate sessions and configuration.
src/main/resources/hibernate.cfg.xml: This is the Hibernate configuration file. It contains the database connection details and Hibernate settings necessary for the ORM framework to interact with the database.

pom.xml: The Maven configuration file for managing dependencies and project build. It defines the libraries needed for Hibernate, MySQL, and other necessary tools.

README.md: Project documentation where this file resides. It contains details about the project, features, setup instructions, etc.

Setup
Prerequisites
Before running this project, ensure that you have the following installed:

JDK 11 or higher
MySQL Database
Maven
CLI (Command Line Interface)
User Interaction through Console/Terminal
BufferedReader and Scanner for Input Handling
