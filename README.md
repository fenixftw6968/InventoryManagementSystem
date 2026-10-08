# Inventory Management System

A backend **Inventory Management System** built using **Spring Boot, Spring Data JPA, PostgreSQL, and REST APIs**. The system provides APIs to manage products, categories, and suppliers while maintaining relationships between inventory entities.

## 🚀 Features

- Product management
  - Add products
  - Get all products
  - Get product by ID
  - Update product
  - Delete product

- Category management
  - Create categories
  - View categories
  - Update categories
  - Delete categories

- Supplier management
  - Add suppliers
  - View suppliers
  - Update suppliers
  - Delete suppliers

- Entity relationships using JPA
  - Product → Category
  - Product → Supplier

- RESTful API architecture
- PostgreSQL database integration
- Automatic database ID generation
- Layered backend architecture

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Access |
| Hibernate | ORM |
| PostgreSQL | Database |
| Maven | Dependency Management |
| REST API | Client-Server Communication |

## 📂 Project Structure

```text
src/
└── main/
    └── java/
        └── com.example.inventorySystem/
            ├── controller/
            │   ├── ProductController.java
            │   ├── CategoryController.java
            │   └── SupplierController.java
            │
            ├── entity/
            │   ├── Product.java
            │   ├── Category.java
            │   └── Supplier.java
            │
            ├── repository/
            │   ├── ProductRepository.java
            │   ├── CategoryRepository.java
            │   └── SupplierRepository.java
            │
            └── service/
                ├── ProductService.java
                ├── CategoryService.java
                └── SupplierService.java
```

## 🗄️ Database Design

The application uses **PostgreSQL** as the relational database.

### Product

```text
Product
----------------
id
name
price
category_id
supplier_id
```

### Category

```text
Category
----------------
id
name
```

### Supplier

```text
Supplier
----------------
id
name
contact
email
```

### Relationships

```text
Category
    │
    │ 1
    │
    │ *
 Product
    │
    │ *
    │
    │ 1
 Supplier
```

A product belongs to a category and can be associated with a supplier.

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/inventory-management-system.git
cd inventory-management-system
```

### 2. Configure PostgreSQL

Create a PostgreSQL database:

```sql
CREATE DATABASE inventory_db;
```

### 3. Configure Application Properties

Update:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/inventory_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
```

Replace the username and password with your PostgreSQL credentials.

### 4. Run the Application

Using Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## 🔗 API Endpoints

### Products

| Method | Endpoint | Description |
|---|---|---|
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get product by ID |
| POST | `/products` | Create a product |
| PUT | `/products/{id}` | Update a product |
| DELETE | `/products/{id}` | Delete a product |

### Categories

| Method | Endpoint | Description |
|---|---|---|
| GET | `/categories` | Get all categories |
| GET | `/categories/{id}` | Get category by ID |
| POST | `/categories` | Create a category |
| PUT | `/categories/{id}` | Update a category |
| DELETE | `/categories/{id}` | Delete a category |

### Suppliers

| Method | Endpoint | Description |
|---|---|---|
| GET | `/suppliers` | Get all suppliers |
| GET | `/suppliers/{id}` | Get supplier by ID |
| POST | `/suppliers` | Create a supplier |
| PUT | `/suppliers/{id}` | Update a supplier |
| DELETE | `/suppliers/{id}` | Delete a supplier |

> Endpoint paths may need to be adjusted according to the controller mappings in the project.

## 📌 Example API Request

### Create Product

```http
POST /products
Content-Type: application/json
```

```json
{
  "name": "Laptop",
  "price": 65000,
  "category": {
    "id": 1
  },
  "supplier": {
    "id": 1
  }
}
```

### Example Response

```json
{
  "id": 1,
  "name": "Laptop",
  "price": 65000,
  "category": {
    "id": 1,
    "name": "Electronics"
  },
  "supplier": {
    "id": 1,
    "name": "ABC Suppliers"
  }
}
```

## 🧪 Testing

Run the tests using Maven:

```bash
./mvnw test
```

On Windows:

```bash
mvnw.cmd test
```

## 🔮 Future Improvements

The project can be extended with:

- Spring Security authentication and authorization
- JWT-based authentication
- Role-based access control
- Inventory stock tracking
- Low-stock alerts
- Product search and filtering
- Pagination and sorting
- Supplier order management
- Transaction management
- Global exception handling
- DTO-based architecture
- API documentation using Swagger/OpenAPI
- Docker containerization
- Unit and integration testing
- Redis caching

## 🎯 Learning Objectives

This project demonstrates practical implementation of:

- Spring Boot
- REST API development
- Spring Data JPA
- Hibernate ORM
- PostgreSQL
- Entity relationships
- Repository pattern
- Layered architecture
- CRUD operations
- Backend application development

## 👨‍💻 Author

**Kartik Bhangale**

Built as a backend development project using the Spring Boot ecosystem.
