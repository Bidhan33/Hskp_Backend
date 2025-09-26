Hotel Booking and Management System
A comprehensive hotel booking and management system built with Spring Boot, featuring secure authentication, room management, and booking functionality.
🏨 Overview
This backend application provides a complete hotel booking solution where users can browse available rooms, make reservations, and manage their bookings. Administrators have full control over room management and can oversee all bookings in the system.
🚀 Features

User Authentication & Authorization - Secure JWT-based authentication system
Room Management - Complete CRUD operations for hotel rooms
Booking System - Real-time room booking with confirmation codes
User Management - Profile management and booking history
Admin Dashboard - Administrative control over rooms, bookings, and users
API Documentation - Interactive Swagger UI for easy testing and exploration

🛠️ Technology Stack

Framework: Spring Boot
Database: MongoDB
Authentication: JWT (JSON Web Token)
Documentation: Swagger UI
Deployment: Docker + CSC Rahti.fi
Security: Spring Security with role-based access control

📋 Prerequisites

Java 11 or higher
Maven 3.6+
MongoDB instance
Docker (for containerized deployment)

🔧 Installation & Setup
Local Development

Clone the repository

bash   git clone <repository-url>
   cd hotel-booking-system

Configure MongoDB

Update application.properties with your MongoDB connection string



properties   spring.data.mongodb.uri=mongodb://localhost:27017/hotel-booking

Install dependencies

bash   mvn clean install

Run the application

bash   mvn spring-boot:run
Docker Deployment

Build Docker image

bash   docker build -t hotel-booking-system .

Run with Docker

bash   docker run -p 8080:8080 hotel-booking-system
Rahti.fi Deployment
The application is deployed on CSC Rahti.fi using the provided Dockerfile for easy and efficient cloud deployment.
🔐 Authentication & Security
The system implements a robust JWT-based authentication mechanism:

Token Generation: Secure JWT tokens for user sessions
Role-based Access: Different access levels for users and administrators
Protected Endpoints: Most endpoints require valid authentication tokens
Spring Security: Comprehensive security configuration for API protection

📚 API Documentation
Room Management (/rooms)
MethodEndpointDescriptionAuth RequiredGET/rooms/allGet all rooms❌GET/rooms/all-available-roomsGet available rooms❌GET/rooms/room-by-id/{roomId}Get room by ID❌GET/rooms/typesGet room types❌GET/rooms/available-rooms-by-date-and-typeFilter rooms by date and type❌POST/rooms/addAdd new room✅ (Admin)PUT/rooms/update/{roomId}Update room details✅ (Admin)DELETE/rooms/delete/{roomId}Delete room✅ (Admin)
Booking Management (/bookings)
MethodEndpointDescriptionAuth RequiredPOST/bookings/book-room/{roomId}/{userId}Book a room✅GET/bookings/allGet all bookings✅ (Admin)GET/bookings/get-by-confirmation-code/{confirmationCode}Get booking by confirmation code✅DELETE/bookings/cancel/{bookingId}Cancel booking✅
User Management (/users)
MethodEndpointDescriptionAuth RequiredGET/users/allGet all users✅ (Admin)GET/users/get-by-id/{userId}Get user by ID✅GET/users/get-logged-in-profile-infoGet current user profile✅GET/users/get-user-bookings/{userId}Get user's bookings✅DELETE/users/delete/{userId}Delete user✅ (Admin)
Authentication (/auth)
MethodEndpointDescriptionAuth RequiredPOST/auth/registerUser registration❌POST/auth/loginUser login❌
🎯 User Roles & Permissions
Regular Users

Browse available rooms
Make room bookings
View and manage their bookings
Update profile information

Administrators

All user permissions
Add, update, and delete rooms
View all bookings and users
Cancel any booking
Delete users

🔍 Testing with Swagger UI
Access the interactive API documentation at:
http://localhost:8080/swagger-ui.html
The Swagger UI provides:

Complete API endpoint documentation
Interactive testing interface
Request/response examples
Authentication token input for protected endpoints


🚀 Deployment
The application is containerized using Docker and deployed on CSC Rahti.fi platform, ensuring:

Scalability: Easy horizontal scaling
Reliability: Robust cloud infrastructure
Efficiency: Optimized resource utilization
Maintainability: Simple deployment and updates

🤝 Contributing

Fork the repository
Create a feature branch (git checkout -b feature/new-feature)
Commit changes (git commit -am 'Add new feature')
Push to branch (git push origin feature/new-feature)
Create a Pull Request

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.
📞 Support
For support and questions, please contact the development team or create an issue in the repository.

Built with ❤️ using Spring Boot and MongoDB



<img width="741" height="745" alt="423243300-18a1e49b-d103-4433-9902-db08be20e7bb" src="https://github.com/user-attachments/assets/8a8939b6-5250-40e3-a41f-d499eeb48aea" />
