package com.cg.cakeOrder.service;

import com.cg.cakeOrder.bean.CakeOrder;
import com.cg.cakeOrder.bean.Customer;
import com.cg.cakeOrder.exception.CakeException;

public interface ICakeOrderService {
	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeException;

	public CakeOrder getOrderDetails(int orderid) throws CakeException;

	public boolean validateRequest(Customer customer) throws CakeException;

	public double getPrice(String type) throws CakeException;
}
