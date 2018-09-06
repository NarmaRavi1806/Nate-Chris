package com.cg.cakeOrder.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.cg.cakeOrder.bean.CakeOrder;
import com.cg.cakeOrder.bean.Customer;
import com.cg.cakeOrder.dao.CakeOrderDAO;
import com.cg.cakeOrder.dao.ICakeOrderDAO;
import com.cg.cakeOrder.exception.CakeException;

public class CakeOrderService implements ICakeOrderService {

	ICakeOrderDAO order = new CakeOrderDAO();

	@Override
	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeException {

		return order.placeOrder(customer, cake);
	}

	@Override
	public CakeOrder getOrderDetails(int orderid) throws CakeException {

		return order.getOrderDetails(orderid);
	}

	@Override
	public boolean validateRequest(Customer customer) throws CakeException {
		if (validatePhone(customer.getPhone())) {
			return true;
		}
		return false;
	}

	private boolean validatePhone(String phone) throws CakeException {

		if (!phone.matches("\\d{10}")) {
			throw new CakeException(
					"Phone number should contain only 10 digits");
		}

		return true;
	}

	@Override
	public double getPrice(String type) throws CakeException {
		FileInputStream in = null;
		// double price=0;
		try {

			in = new FileInputStream(
					"D:/152859_narmatha/OCA8/ordering/src/com/cg/cakeOrder/ui/price.properties");
			Properties p = new Properties();
			p.load(in);
			String cakeType = p.getProperty(type);
			double price = 0;
			if (cakeType != null) {
				price = 500 + Double.parseDouble(cakeType);
			} else {
				throw new CakeException(
						"The Cake Type you entered is not available");
			}
			return price;

		} catch (FileNotFoundException e) {
			throw new CakeException(e.getMessage());
		} catch (IOException e) {
			throw new CakeException(e.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				throw new CakeException(e.getMessage());
			}
		}

	}

}
