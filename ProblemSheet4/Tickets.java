/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemsheet4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 20pt02
 */
abstract class PassengerTicket
{
    int seatNo;
    boolean seatAvailable;
    String seatStatus;
    String passengerName;
    String passengerGender;
    String departure;
    String destination;
    String departureDateTime;
    String issueDateTime;
    double totalPrice;
    
    public PassengerTicket()
    {
        seatNo = 0;
        seatAvailable = true;
        seatStatus = "Unknown";
        passengerName = "Unknown";
        passengerGender = "Unknown";
        departure = "Unknown";
        destination = "Unknown";
        departureDateTime = "yyyy/mm/dd HH:mm:ss";
        issueDateTime = "yyyy/mm/dd HH:mm:ss";
        totalPrice = 0;     
    }
    public abstract void setTotalPrice();
    public abstract String toString();
}

class BusTicket extends PassengerTicket
{
    int distance;
    double serviceCharge;
    
    public BusTicket()
    {
        distance = 2;
        serviceCharge = 2.5;
        setTotalPrice();
    }
    public BusTicket(int d, double s)
    {
        distance = d;
        serviceCharge = s;
        setTotalPrice();
    }
    public void setPassengerName(String name)
    {
        passengerName = name;
    }
    public void setPassengerGender(String gender)
    {
        passengerGender = gender;
    }
    public void setTotalPrice()
    {
        totalPrice = (distance*0.08) + serviceCharge;
    }
    public void setIssueDateTime(String date)
    {
        issueDateTime = date;
    }
    public String toString()
    {
        return "Seat No: " + seatNo + "\nSeat Availabilty: " + seatAvailable + 
               "\nSeat Status: " + seatStatus + "\nPassenger Name: " + passengerName +
                "\nPassenger Gender: " + passengerGender + "\nDeparture: " + departure +
                "\nDestination: " + destination + "\nDeparture Date and Time: " + departureDateTime + 
                "\nTicket issued on: " + issueDateTime + "\nTotal price: " + totalPrice + '\n';
    }
}

interface TicketOperations
{
    public boolean makeReservation(BusTicket ticket,String name,String gender,String d1, String d2);
    public boolean cancelReservation(BusTicket ticket);
    public boolean buyTicket(BusTicket ticket,String name,String gender);
    public boolean cancelTicketSold(BusTicket ticket);    
}

class Officer implements TicketOperations
{
    String name;
    String address;
    
    public Officer()
    {
        name = "Unknown";
        address = "Unknown";
    }
    public Officer(String n,String a)
    {
        name = n;
        address = a;
    }
    
    public boolean makeReservation(BusTicket ticket, String name,String gender,String d1,String d2)
    {
        ticket.passengerGender = gender;
        ticket.passengerName = name;
        ticket.seatAvailable = false;
        ticket.seatStatus = "RESERVED";
        ticket.departure = d1;
        ticket.destination = d2;
        DateFormat df = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }
    
    public boolean buyTicket(BusTicket ticket,String name,String gender)
    {
        ticket.passengerName = name;
        ticket.passengerGender = gender;
        ticket.seatAvailable = false;
        ticket.seatStatus = "SOLD";
        DateFormat df = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }
    
    public boolean cancelReservation(BusTicket ticket)
    {
        ticket.passengerName = "";
        ticket.passengerGender = "";
        ticket.departure = "";
        ticket.destination = "";
        ticket.seatAvailable = true;
        ticket.seatStatus = "AVAILABLE";
        ticket.issueDateTime = "yyyy/mm/dd HH:mm:ss";
        return true;
    }
    
    public boolean cancelTicketSold(BusTicket ticket)
    {
        ticket.passengerName = "";
        ticket.passengerGender = "";
        ticket.departure = "";
        ticket.destination = "";
        ticket.seatAvailable = true;
        ticket.seatStatus = "AVAILABLE";
        ticket.issueDateTime = "yyyy/mm/dd HH:mm:ss";
        return true;
    }
}


public class Tickets 
{
    public static void main(String[] args)
    {
        BusTicket T1 = new BusTicket(500,20);
        Officer O1 = new Officer();
        O1.makeReservation(T1,"Aishu","Female","Coimbatore","Sivakasi");
        System.out.println(T1);
        //O1.buyTicket(T1,"Aishu","Female");
        //System.out.println(T1);
    }
    
}
