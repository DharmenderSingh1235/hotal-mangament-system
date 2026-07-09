function login(){

    let user=document.getElementById("username").value;
    let pass=document.getElementById("password").value;

    if(user==="admin" && pass==="1234"){
        alert("Admin Login Successful");
        window.location="dashboard.html";
    }
    else if(user==="customer" && pass==="1111"){
        alert("Customer Login Successful");
        window.location="booking.html";
    }
    else{
        alert("Invalid Username or Password");
    }
}
import java.util.ArrayList;

public class Dashboard {

    ArrayList<Room> rooms = new ArrayList<>();

    public void dashboard(){

        int booked = 0;

        for(Room r : rooms){

            if(r.booked)

                booked++;

        }

        System.out.println("Total Rooms : " + rooms.size());

        System.out.println("Booked Rooms : " + booked);

        System.out.println("Available Rooms : " + (rooms.size()-booked));

    }

}
public class Room {

    int roomNo;
    String roomType;
    double price;
    boolean booked;

    public Room(int roomNo,
                String roomType,
                double price){

        this.roomNo=roomNo;
        this.roomType=roomType;
        this.price=price;
        this.booked=false;
    }

}
import java.util.*;

public class RoomManagement {

    ArrayList<Room> rooms=new ArrayList<>();

    public void addRoom(Room room){

        rooms.add(room);

    }

    public void displayRooms(){

        for(Room room:rooms){

            System.out.println(

            room.roomNo+" "

            +room.roomType+" "

            +room.price

            );

        }

    }

}
public class Booking {

    String customerName;
    int roomNo;
    String status;

    public Booking(String customerName,
                   int roomNo){

        this.customerName=customerName;
        this.roomNo=roomNo;
        this.status="Booked";

    }

}
import java.util.*;

public class BookingManagement {

    Queue<Booking> bookings = new LinkedList<>();

    public void bookRoom(Booking booking){

        bookings.add(booking);

        System.out.println("Booking Successful");

    }

    public void displayBookings(){

        for(Booking booking : bookings){

            System.out.println(

            booking.customerName+

            " Room : "+booking.roomNo

            );

        }

    }

}
public class Customer {

    int id;
    String name;
    String phone;

    public Customer(int id,String name,String phone){

        this.id=id;
        this.name=name;
        this.phone=phone;

    }

}
import java.util.*;

public class CustomerManagement {

    HashMap<Integer,Customer> customers =
            new HashMap<>();

    public void addCustomer(Customer customer){

        customers.put(customer.id,customer);

    }

    public void searchCustomer(int id){

        if(customers.containsKey(id)){

            Customer c = customers.get(id);

            System.out.println("Name : "+c.name);
            System.out.println("Phone : "+c.phone);

        }
        else{

            System.out.println("Customer Not Found");

        }

    }

    public void displayCustomers(){

        for(Customer c:customers.values()){

            System.out.println(c.id+" "+c.name);

        }

    }

}
public class Bill {

    String customerName;
    int days;
    double roomPrice;
    double total;
    String paymentStatus;

    public Bill(String customerName,
                int days,
                double roomPrice){

        this.customerName=customerName;
        this.days=days;
        this.roomPrice=roomPrice;
        this.total=days*roomPrice;
        this.paymentStatus="Paid";

    }

}
import java.util.*;

public class BillingManagement {

    ArrayList<Bill> bills =
            new ArrayList<>();

    public void generateBill(Bill bill){

        bills.add(bill);

        System.out.println("Bill Generated");

    }

    public void displayBills(){

        for(Bill bill:bills){

            System.out.println(

            bill.customerName+

            " ₹"+bill.total+

            " "+bill.paymentStatus

            );

        }

    }

}
import java.util.*;

public class RevenueReport {

    ArrayList<Bill> bills = new ArrayList<>();

    public double calculateRevenue(){

        double total = 0;

        for(Bill bill : bills){

            total += bill.total;

        }

        return total;

    }

    public void report(){

        System.out.println("Total Revenue : ₹" + calculateRevenue());

    }

}
ArrayList<Room> rooms = new ArrayList<>();

HashMap<Integer,Customer> customers = new HashMap<>();

Queue<Booking> bookings = new LinkedList<>();

Stack<Booking> cancelledBookings = new Stack<>();

ArrayList<Bill> bills = new ArrayList<>();
package com.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelManagementApplication {

    public static void main(String[] args){

        SpringApplication.run(
                HotelManagementApplication.class,
                args
        );

    }

}
package com.hotel.controller;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/rooms")

public class RoomController {

    @GetMapping

    public String rooms(){

        return "Room API Working";

    }

}
package com.hotel.controller;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/customers")

public class CustomerController {

    @GetMapping

    public String customers(){

        return "Customer API Working";

    }

}
package com.hotel.controller;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/booking")

public class BookingController {

    @GetMapping

    public String booking(){

        return "Booking API Working";

    }

}
package com.hotel.controller;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/billing")

public class BillController {

    @GetMapping

    public String billing(){

        return "Billing API Working";

    }

}
ArrayList<Room> rooms = new ArrayList<>();

HashMap<Integer,Customer> customers = new HashMap<>();

Queue<Booking> bookings = new LinkedList<>();

Stack<Booking> cancelledBookings = new Stack<>();

ArrayList<Bill> bills = new ArrayList<>();
function payNow(){

alert("Payment Successful!");

}