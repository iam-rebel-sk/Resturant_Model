
# User management System

The Spring User Management System is a web application designed to manage user information efficiently. It provides a set of endpoints for performing various user-related operations, such as adding users, retrieving user details, listing all users, updating user information, and deleting users. 


## Framework: Spring Boot

Spring Boot: Spring Boot is an excellent choice for building robust and scalable web applications. It simplifies the configuration and setup of a Spring-based project, making it easier to get started. It also provides a wide range of tools and libraries for building web applications, including Spring Web for handling HTTP requests and Spring Data JPA for database operations.

## Language: Java

Java: Java is a widely-used and well-established programming language, known for its reliability, performance, and extensive community support. Spring is primarily built for Java, and using Java ensures compatibility and access to a rich ecosystem of libraries and frameworks.

## Data Structer: List or Array for Storing Users

Use a data structure like a List or an Array to store user objects. Each user object can encapsulate the attributes you mentioned: UserId, Name, UserName, Address, and Phone Number. This allows you to maintain a collection of user records in memory.


## Data Flow

1.Data Input:
User data is input into the system via HTTP requests to specific endpoints.

2.Processing and Validation:
When a new user is added (user endpoint), the system processes and validates the incoming data, ensuring that it adheres to the expected format and constraints.

3.Data Storage:
Valid user data is stored in an in-memory data structure. 

4.Data Retrieval:
When a request is made to retrieve user information (user/{userid}), the system fetches the corresponding user data either from the in-memory data structure.

5.Listing All Users:
The getAllUser endpoint (user) retrieves and returns a list of all users stored in the system.

6.Data Updates:
To update user information, the system receives updated user data and applies the changes to the existing user record.

7.Data Deletion:
When a request to delete a user is received (user/{userid}), the system identifies the user by their UserId and removes their data from the data structure.

8.Response:
After each operation (add, retrieve, list, update, delete), the system sends an HTTP response to the client with the appropriate status code and data (e.g., user details, success message, or error message).


## Feedback

If you have any feedback, please reach out to me at iamrebelsk@gmial.com


## 🔗 Links
[![github](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/iamrebelsk12)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/%F0%9D%90%91%F0%9D%90%9E%F0%9D%90%9B%F0%9D%90%9E%F0%9D%90%A5-%F0%9D%90%92%F0%9D%90%A4-55814a1a4/)


