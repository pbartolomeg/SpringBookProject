# Spring Boot REST API – Book System

This is a simple **Spring Boot REST API** for managing books. It allows users to **retrieve, add, find, and remove books by ID**. The books are initially loaded using a **mock data class** with 5 books by default.

## Features
- Get a list of all books
- Find a book by ID
- Add a new book
- Remove a book by ID
- Built using **Spring Boot**

## Technologies Used
- **Java 17+**
- **Spring Boot (Spring Web)**
- **Maven**
- **Mock Data Loader** (preloaded books)


## 🛠 Setup & Run
### 1.Clone the Repository
```sh
git clone https://github.com/pbartolomeg/SpringBookProject.git
cd SpringBookProject


2. Build & Run the Application

Open your IDE and run it.


3. API Endpoints
Method	Endpoint	Description
GET	/api//books	Get all books
GET	/api/books/{id}	Get a book by ID
POST	/api//books	Add a new book
DELETE	/api/books/{id}	Remove a book by ID


Example GET Request:

curl -X GET http://localhost:8080/books

Example JSON Request for Adding a Book

{
  "id": 6,
  "title": "New Book Title",
  "author": "John Doe"
} 
