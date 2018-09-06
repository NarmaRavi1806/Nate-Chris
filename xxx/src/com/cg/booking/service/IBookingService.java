package com.cg.booking.service;

import com.cg.booking.bean.Request;
import com.cg.booking.exception.BookingException;

public interface IBookingService {
	
	int addRequest(Request request)throws BookingException;
	boolean validateRequet(Request request)throws BookingException;
	Request getRequestbyId(int id) throws BookingException;

}
