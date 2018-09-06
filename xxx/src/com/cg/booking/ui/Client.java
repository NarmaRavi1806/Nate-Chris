package com.cg.booking.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.booking.bean.Request;
import com.cg.booking.exception.BookingException;
import com.cg.booking.service.BookingService;
import com.cg.booking.service.IBookingService;

public class Client {
	Scanner sc=new Scanner(System.in);
	IBookingService bookingservice=new BookingService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******BookingApp******");
		Client c=new Client();
		String op="";
		while(true){
			System.out.println("1. Raise a Cab request");
			System.out.println("2. View Cab request Status");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			op=c.sc.nextLine();
			switch (op) {
			case "1":
				c.addRequest();
				break;
			case "2":
				c.displayRequest();
				break;
			case "3":
				System.exit(0);
				
				break;

			default:
				System.out.println("Please enter the valid option");
				break;
			}
		}

	}
	private void addRequest(){
		Request req=new Request();
		System.out.println("Enter customer name:");
		req.setCustomerName(sc.nextLine());
		System.out.println("Enter phone:");
		req.setPhone(sc.nextLine());
		System.out.println("Enter pickup Address:");
		req.setAddrOfPickup(sc.nextLine());
		System.out.println("Enter Pincode:");
		req.setPincode(sc.nextLine());
		req.setRequestStatus("Not Accepted");
		req.setDateOfRequest(LocalDate.now());
		try {
			boolean res=bookingservice.validateRequet(req);
			if(res){
				int ret=bookingservice.addRequest(req);
				System.out.println("Request with the id"+ret+"added successfully");
			}
		} catch (BookingException e) {
			// TODO Auto-generated catch block
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
		}
	}
	
	private void displayRequest(){
		System.out.println("Enter Request Id:");
		int id=Integer.parseInt(sc.nextLine());
		try {
			Request req=bookingservice.getRequestbyId(id);
			System.out.println("Customer name: "+req.getCustomerName());
			System.out.println("Request Status: "+req.getRequestStatus());
			System.out.println("Cab number: "+req.getCabNumber());
			System.out.println("Request date: "+req.getDateOfRequest());
			System.out.println("Pickup Address: "+req.getAddrOfPickup());
		} catch (BookingException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
		}
		
	}

}
