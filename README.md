# 🏨 Hotel Booking and Management System

A comprehensive hotel booking and management system built with **Spring Boot**, featuring secure authentication, room management, and booking functionality.

---

## 📖 Overview
The Hotel Booking and Management System is a backend application built with Spring Boot that provides a complete solution for managing hotel operations such as user registration, authentication, room management, and booking reservations. The system is designed with role-based access control, ensuring that administrators and regular users have different levels of permissions. Authentication and authorization are handled using JWT (JSON Web Tokens), providing secure access to the API endpoints.

The backend communicates with a MongoDB database, which stores all the application data including user information, room details, and booking records. The service layer handles the core business logic, while RESTful controllers expose endpoints for client interaction. The application is fully containerized using Docker, enabling easy portability and deployment. For production deployment, the project was hosted on CSC Rahti, a Kubernetes-based cloud platform, where the Docker image was built and deployed to run in a scalable and managed environment.

This setup ensures that the system is not only secure and modular but also easily deployable and scalable for real-world use cases, making it suitable as a foundation for hotel management solutions.

---

## 🚀 Features
- **User Authentication & Authorization** – Secure JWT-based authentication system  
- **Room Management** – Complete CRUD operations for hotel rooms  
- **Booking System** – Real-time room booking with confirmation codes  
- **User Management** – Profile management and booking history  
- **Admin Dashboard** – Administrative control over rooms, bookings, and users  
- **API Documentation** – Interactive Swagger UI for easy testing and exploration  

---

## 🛠️ Technology Stack
- **Framework**: Spring Boot  
- **Database**: MongoDB  
- **Authentication**: JWT (JSON Web Token)  
- **Documentation**: Swagger UI  
- **Deployment**: Docker + CSC Rahti.fi  
- **Security**: Spring Security with role-based access control  

---

## 📋 Prerequisites
- Java 11 or higher  
- Maven 3.6+  
- MongoDB instance  
- Docker (for containerized deployment)  

---

## 🔧 Installation & Setup

### Local Development

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd hotel-booking-system

2. **Configure MongoDB**

    Update application.properties with your MongoDB connection string

3. **Install Dependencies**
    ```bash
      mvn clean install

4. **Run the application**
    ```bash
       mvn spring-boot:run

## Rahti.fi Deployment
The application is deployed on CSC Rahti.fi using the provided Dockerfile for easy and efficient cloud deployment.

## 🔐 Authentication & Security
The system implements a robust JWT-based authentication mechanism:

- Token Generation: Secure JWT tokens for user sessions
- Role-based Access: Different access levels for users and administrators
- Protected Endpoints: Most endpoints require valid authentication tokens
- Spring Security: Comprehensive security configuration for API protection

## 📚 API Documentation and Testing with Swagger UI
   [https://hskp-backend-git-hskp-app.2.rahtiapp.fi/swagger-ui/index.html](https://backend-programming-project-backend-123-14.2.rahtiapp.fi/swagger-ui/index.html)

 ## 🎯 User Roles & Permissions
**Regular Users**

 - Browse available rooms
 - Make room bookings
 - View and manage their bookings
 - Update profile information

**Administrators**

  - All user permissions
 - Add, update, and delete rooms
 - View all bookings and users
 - Cancel any booking
 - Delete users

## 🚀 Deployment
 The application is containerized using Docker and deployed on CSC Rahti.fi platform, ensuring:

- Scalability: Easy horizontal scaling
- Reliability: Robust cloud infrastructure
- Efficiency: Optimized resource utilization
- Maintainability: Simple deployment and updates

## DataBase Schema Diagram 
<img width="563" height="597" alt="image" src="https://github.com/user-attachments/assets/b4989d57-af1a-4b5e-b310-25d86e1f0b36" />

## 📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

   
   
