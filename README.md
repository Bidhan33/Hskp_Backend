# 🏨 Hotel Booking and Management System

A comprehensive hotel booking and management system built with **Spring Boot**, featuring secure authentication, room management, and booking functionality.

---

## 📖 Overview
This backend application provides a complete hotel booking solution where users can browse available rooms, make reservations, and manage their bookings.  
Administrators have full control over room management and can oversee all bookings in the system.

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
   https://hskp-backend-git-hskp-app.2.rahtiapp.fi/swagger-ui/index.html

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

## 📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

   
   
