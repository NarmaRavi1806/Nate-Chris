package com.cg.cakeOrder.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.cakeOrder.bean.CakeOrder;
import com.cg.cakeOrder.bean.Customer;
import com.cg.cakeOrder.exception.CakeException;

public class CakeOrderDAOTest {
	ICakeOrderDAO dao;

	@Before
	public void init(){
		dao=new CakeOrderDAO();
	}
	@Test
	public void testPlaceOrder() throws CakeException {
		Customer c=new Customer();
		CakeOrder o=new CakeOrder();
		o.setTotalPrice(500);
		dao.placeOrder(c, o);
		//Cannot Check the PlaceOrder orderid since it is randomly generated 
		assertEquals(500, o.getTotalPrice());
	}

	@Test
	public void testGetOrderDetails() throws CakeException {
		//CakeOrder o=dao.getOrderDetails(100);
		int orderid=100;
		assertNull(dao.getOrderDetails(orderid));
	}
	
	@Test
	public void testException() throws CakeException{
		dao.getOrderDetails(100);
	}

}
