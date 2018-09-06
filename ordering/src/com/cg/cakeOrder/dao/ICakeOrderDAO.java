package com.cg.cakeOrder.dao;

import com.cg.cakeOrder.bean.CakeOrder;
import com.cg.cakeOrder.bean.Customer;
import com.cg.cakeOrder.exception.CakeException;

public interface ICakeOrderDAO {

	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeException;

	public CakeOrder getOrderDetails(int orderid) throws CakeException;

}
