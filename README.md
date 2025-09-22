# 🏪 Storefront Commerce App

A **modern commerce application** built with **Spring Boot** (backend) and an upcoming **Angular frontend**.  
This project aims to provide a lightweight, containerized solution for managing products, orders, and customers — making it easy to extend for real-world use cases.

---

## 🚀 Features (Backend)
- **Spring Boot REST API** – well-structured and scalable
- **Product Management** – create, update, list, and delete products
- **Order Handling** – placeholder endpoints for checkout and order history
- **Customer Support** – user accounts and basic CRUD operations (future)
- **Database Ready** – works with PostgreSQL/MySQL (configurable)
- **Docker Support** – easily build and run the app in containers

---

## 📦 Tech Stack
- **Backend:** Spring Boot, Spring Data JPA, Spring Web  
- **Database:** PostgreSQL (default), but can be swapped  
- **Containerization:** Docker & Docker Compose  
- **Frontend:** Angular (in progress)  

---

## 🛠️ Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/storefront-commerce.git
```

### 2️⃣ Update application.yml (or application.properties) with your database credentials:
```bash
cd storefront-commerce
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/storefront
    username: postgres
    password: password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```
