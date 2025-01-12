# Product Management API
# Overview
The Product Management API is a backend application built with Java and Spring Boot. It is designed to manage a catalog of products and their associated categories. The API supports functionalities such as listing, creating, updating, and deleting products, as well as sorting and filtering based on various criteria. It also includes authentication and authorization using Spring Security.

This API is a critical part of a web-based product management application, with the frontend built in Angular and the database hosted in PostgreSQL. The entire stack is containerized using Docker to ensure portability and ease of deployment.

# Features
Manage Products:
Add, edit, delete, and list products.
Store product details such as name, description, price, availability, and category.
Automatically link products to hierarchical categories.

Sorting and Filtering:
Retrieve products sorted by name, price, or other attributes.
Filter products by category, availability, or custom criteria.

Category Management:
Categories are stored hierarchically, enabling full category paths for products.
Categories can be preloaded directly into the database.

Secure Access:
User authentication with Spring Security.
Includes a predefined superuser with administrative privileges.

Containerized Deployment:
Dockerized API for seamless deployment.
Integration with a PostgreSQL database and Angular-based frontend.

# Technology Stack
Backend Framework: Spring Boot (Spring MVC, Spring Data JPA, Spring Security)
Frontend: Angular (interacts with this API)
Database: PostgreSQL
Containerization: Docker

# API Endpoints
Products
GET /api/products: Retrieve a list of products with optional sorting and filtering.
POST /api/products: Add a new product.
PUT /api/products/{id}: Update an existing product.
DELETE /api/products/{id}: Delete a product by ID.
Categories
Preloaded Data: Categories can be inserted directly into the database for hierarchical structuring.

# Setup Instructions
Clone the Repository:
git clone https://github.com/your-repo/product-management-api.git
cd product-management-api

Build the Application:
mvn clean package
Run with Docker Compose: Ensure Docker and Docker Compose are installed, then execute:
docker-compose up --build

# Access the API:
The API will be available at http://localhost:8080/api/products.
