# Hibernate HQL Student Data Project

## Overview
This project is a simple Hibernate application that demonstrates the use of Hibernate Query Language (HQL) to store and retrieve student data. The project stores 50 students' data into a MySQL database, including fields such as roll number, name, and marks. The marks are randomly generated with values up to 100.

## Technologies Used
- Java
- Hibernate ORM
- MySQL Workbench
- Maven

## Project Structure
- **Student.java**: A POJO class representing the `Student` entity with fields for `rollno`, `name`, and `marks`.
- **hibernate.cfg.xml**: Configuration file for Hibernate settings, including database connection details and mapping resources.
- **pom.xml**: Maven configuration file for managing project dependencies.
- **Main.java**: The main class where student data is inserted and HQL queries are executed to retrieve the data.

## Prerequisites
- JDK 8 or above
- Maven
- MySQL Workbench
- Hibernate Core library

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
