# 📦 Inventory Management System

A simple Inventory Management System built using Spring Boot, JDBC, and PostgreSQL.

## Features

- Add Product
- Update Product Quantity
- Delete Product
- View All Products

## Technologies Used

- Java 17
- Spring Boot
- Spring JDBC
- PostgreSQL
- Maven
- Git & GitHub

## Database

```sql
CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    quantity INT,
    price DOUBLE PRECISION
);
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /products | Add Product |
| GET | /products | View All Products |
| PUT | /products/{id}?quantity=20 | Update Quantity |
| DELETE | /products/{id} | Delete Product |

## Run the Project

1. Clone the repository.
2. Configure PostgreSQL in `application.properties`.
3. Create the database and table.
4. Run `InventoryManagmentSystemApplication.java`.

## Author

**Priyanshi Jaiswal**

GitHub: https://github.com/priyanshiJaiswal1
