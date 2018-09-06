package com.cg.cakeOrder.dao;

import java.util.HashMap;

import java.util.Map;
import java.util.Random;

import com.cg.cakeOrder.bean.CakeOrder;
import com.cg.cakeOrder.bean.Customer;
import com.cg.cakeOrder.exception.CakeException;

/**
 * Class name : CakeOrderDAO
 * Interface Implemented : ICakeOrderDAO
 * No. of Methods : 2
 * 
 * Name of the Methods : placeOrder, getOrderDetails
 * Purpose : DataAccess operation for cake Ordering App
 * 
 * Author : Narmatha
 * Date of Creation : 10-July-2018
 * 
 * Last Modification Date : 11-July-2018
 *
 */
public class CakeOrderDAO implements ICakeOrderDAO {

	// map for orderid as key and Cake order as value
	Map<Integer, CakeOrder> CakeMap = new HashMap<>();
	// map for customerid as key and customer object as value
	Map<Integer, Customer> customerMap = new HashMap<>();
	Random rand = new Random();

	/**
	 * Name of Method : placeOrder
	 * parameters Expected : Customer object and Cake Order
	 * Return type : int, orderid
	 * Author : Narmatha
	 * Date of Creation : 10-July-2018
	 * Purpose : Update The Order details in the map
	 */
	@Override
	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeException {
		try{
		int customerid = rand.nextInt(1000);
		customer.setCustomerId(customerid);
		cake.setCustomerId(customerid);
		
		customerMap.put(customer.getCustomerId(), customer);

		int orderId = rand.nextInt(1000);
		cake.setOrderId(orderId);
		CakeMap.put(cake.getOrderId(), cake);

		return cake.getOrderId();
		}catch(Exception e){
			throw new CakeException(e.getMessage());
		}
	}

	@Override
	public CakeOrder getOrderDetails(int orderid) throws CakeException {

		CakeOrder cak = CakeMap.get(orderid);
		if (orderid == 0) {
			throw new CakeException("Request with orderid" + orderid
					+ "does not exist");
		}
		return cak;
	}

}
