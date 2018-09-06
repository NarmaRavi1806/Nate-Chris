package com.cg.booking.dao;

import java.util.HashMap;
import java.util.Random;

import com.cg.booking.bean.Request;
import com.cg.booking.db.BookingDb;
import com.cg.booking.exception.BookingException;

public class BookingDao implements IBookingDao {
	
	static HashMap<Integer,Request> bookinMap
	=BookingDb.getRequestDb();
	Random rand=new Random();

	@Override
	public int addRequest(Request request) throws BookingException {
		int id=rand.nextInt(1000);
		request.setRequestId(id);
		bookinMap.put(request.getRequestId(), request);
		
		return request.getRequestId();
	}

	@Override
	public Request getRequestbyId(int id) throws BookingException {
		Request req= bookinMap.get(id);
		if(req==null){
			throw new BookingException("Request with id"+id+"does not exist");
		}
		return req;
	}

}
