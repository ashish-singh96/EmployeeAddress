# Employee and Address Management System
This project provides a simple Employee and Address Management System API, allowing you to perform CRUD operations on employees and addresses.<br>

### Technologies Used
Java<br>
Spring Boot<br>
Spring Data JPA<br>
Spring Web<br>


### Prerequisites
Java Development Kit (JDK) 11 or higher<br>
Maven or Gradle (build tools)<br>


### Employee Endpoints
GET /employees: Retrieve all employees<br>
GET /employees/{id}: Retrieve an employee by ID<br>
POST /employees: Create a new employee<br>
PUT /employees/{id}: Update an employee by ID<br>
DELETE /employees/{id}: Delete an employee by ID<br>
### Address Endpoints
GET /addresses: Retrieve all addresses<br>
GET /addresses/{id}: Retrieve an address by ID<br>
POST /addresses: Create a new address<br>
PUT /addresses/{id}: Update an address by ID<br>
DELETE /addresses/{id}: Delete an address by ID<br>

### Project Description:

The Employee and Address Management System is a Java-based application built using the Spring Boot framework. It provides a RESTful API for managing employees and their associated addresses. The project aims to streamline the process of creating, updating, retrieving, and deleting employee and address records.<br>

The system consists of two main entities: Employee and Address. The Employee entity represents an employee with attributes such as an ID, first name, last name, and an associated Address object. The Address entity represents the address details of an employee, including attributes like an ID, street, city, state, and zipcode.<br>

The API offers various endpoints to interact with the system. The Employee endpoints allow users to retrieve a list of all employees, get an employee by their ID, create a new employee, update an existing employee, and delete an employee by their ID. The Address endpoints provide similar functionality for managing address records.<br>

The project utilizes Spring Data JPA for data persistence, allowing seamless interaction with a database. The API follows RESTful principles and responds with JSON data for easy integration with other systems or client applications.<br>



