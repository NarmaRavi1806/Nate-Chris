package com.cg.booking.exception;

@SuppressWarnings("serial")
public class BookingException extends Exception{
	
	public BookingException(){
		super();
	}
	
	public BookingException(String message){
		super(message);
	}

}
