# MockAPI-Integrator

A small mini-project demonstrating third-party API integration using [JSONPlaceholder](https://jsonplaceholder.typicode.com/), a free and reliable fake API for testing and prototyping. This project is built with **Spring Boot** and leverages tools like **Postman**, **IntelliJ IDEA**, and **Maven** to handle API requests and responses effectively.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
- [Testing with Postman](#testing-with-postman)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
`mockAPI-integrator` is a lightweight Spring Boot application designed to integrate and interact with the JSONPlaceholder API. It serves as a practical example of consuming third-party APIs, handling HTTP requests (GET, POST, etc.), and processing JSON responses. The project is ideal for developers learning API integration or prototyping small applications.

## Features
- Fetch data from JSONPlaceholder API (e.g., posts, users, comments).
- Perform CRUD operations using Spring Boot REST controllers.
- Handle JSON responses and map them to Java objects.
- Test API endpoints seamlessly with Postman.

## Technologies Used
- **Spring Boot**: Backend framework for building RESTful APIs.
- **Maven**: Dependency management and build tool.
- **IntelliJ IDEA**: Integrated Development Environment (IDE).
- **Postman**: API testing and debugging tool.
- **JSONPlaceholder**: Free fake API for prototyping (https://jsonplaceholder.typicode.com/).

## Prerequisites
Before running the project, ensure you have the following installed:
- Java JDK 11 or higher
- Maven 3.6+
- IntelliJ IDEA (or any preferred IDE)
- Postman (for testing)
- Git (to clone the repository)

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone https://github.com/AtharvaKakade/mockAPI-integrator.git
   cd mockAPI-integrator
   ```

2. **Build the Project**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   - Open the project in IntelliJ IDEA and run the `MockApiIntegratorApplication` class.
   - Alternatively, use the terminal:
     ```bash
     mvn spring-boot:run
     ```
   - The application will start on `http://localhost:8080`.

4. **Verify the Setup**
   - Open your browser or Postman and test the endpoints (see [API Endpoints](#api-endpoints) below).

## API Endpoints
The project integrates with JSONPlaceholder and exposes the following example endpoints (customize as per your implementation):

| Method | Endpoint                  | Description                          | JSONPlaceholder Source             |
|--------|---------------------------|--------------------------------------|------------------------------------|
| GET    | `/api/getPosts`             | Fetch all posts                      | `https://jsonplaceholder.typicode.com/posts` |
| GET    | `/api//getPostById/{id}`    | Fetch a post by ID                   | `https://jsonplaceholder.typicode.com/posts/{id}` |
| POST   | `/api/insertPost`           | Create a new post (mock response)    | `https://jsonplaceholder.typicode.com/posts` |
| PUT    | `/api/users`                | UPDATE Post                          | `https://jsonplaceholder.typicode.com/posts/1` |
| DELETE | `/api/deletePost/{id}`      | DELETE Post                          | `https://jsonplaceholder.typicode.com/posts/1` |

*Note*: Update this section based on the specific endpoints you've implemented.

## Testing with Postman
1. Launch Postman.
2. Use the following base URL: `http://localhost:8080`.
3. Test the endpoints:
   - **GET**: `http://localhost:8080/api/posts`
   - **POST**: `http://localhost:8080/api/posts` with a JSON body like:
     ```json
     {
       "title": "Test Post",
       "body": "This is a test post.",
       "userId": 1
     }
     ```
4. Verify the responses match the JSONPlaceholder API structure.

## Contributing
Contributions are welcome! Feel free to:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m "Add feature"`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
