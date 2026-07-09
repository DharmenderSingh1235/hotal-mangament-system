CREATE DATABASE HotelManagement;

USE HotelManagement;

CREATE TABLE Customers(

customer_id INT PRIMARY KEY,

customer_name VARCHAR(100),

phone VARCHAR(15),

email VARCHAR(100)

);

CREATE TABLE Rooms(

room_no INT PRIMARY KEY,

room_type VARCHAR(50),

price DOUBLE,

status VARCHAR(20)

);

CREATE TABLE Bookings(

booking_id INT PRIMARY KEY AUTO_INCREMENT,

customer_id INT,

room_no INT,

check_in DATE,

check_out DATE,

FOREIGN KEY(customer_id)

REFERENCES Customers(customer_id),

FOREIGN KEY(room_no)

REFERENCES Rooms(room_no)

);

CREATE TABLE Bills(

bill_id INT PRIMARY KEY AUTO_INCREMENT,

booking_id INT,

total DOUBLE,

payment_status VARCHAR(20),

FOREIGN KEY(booking_id)

REFERENCES Bookings(booking_id)

);