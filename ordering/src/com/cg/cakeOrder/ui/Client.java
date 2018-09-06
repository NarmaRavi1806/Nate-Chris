package com.cg.cakeOrder.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.cakeOrder.bean.CakeOrder;
import com.cg.cakeOrder.bean.Customer;
import com.cg.cakeOrder.exception.CakeException;
import com.cg.cakeOrder.service.CakeOrderService;
import com.cg.cakeOrder.service.ICakeOrderService;

public class Client {
	Scanner sc = new Scanner(System.in);
	ICakeOrderService service = new CakeOrderService();

	public static void main(String[] args) {
		Client c = new Client();
		String op = "";
		while (true) {
			System.out.println("1) Place Order");
			System.out.println("2) Display Order");
			System.out.println("3) Exit");
			System.out.println("Enter your choice");
			op = c.sc.nextLine();
			switch (op) {
			case "1":
				c.placeOrder();
				break;
			case "2":
				c.displayDetails();
				break;
			case "3":
				System.out.println("Thank You");
				System.exit(0);

				break;

			default:
				System.out.println("Please enter the valid option");
				break;

			}

		}
	}

	private void placeOrder() {
		Customer cc = new Customer();
		CakeOrder c2 = new CakeOrder();
		System.out.print("Enter the Name Of the Customer: ");
		cc.setCustName(sc.nextLine());
		System.out.print("Enter Customer Address: ");
		cc.setAddress(sc.nextLine());
		System.out.print("Enter customer phone number: ");
		cc.setPhone(sc.nextLine());
		System.out.print("Type of cake: ");
		String type = sc.nextLine();
		try {
			double price = service.getPrice(type);
			c2.setTotalPrice(price);
			System.out.println("Price: " + price);

			System.out.println("Order Date: " + LocalDate.now());
		} catch (CakeException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
		}

		try {
			boolean result = service.validateRequest(cc);
			if (result) {
				int ret = service.placeOrder(cc, c2);
				System.out.println("Cake order successfully placed with order Id " + ret);
			}
		} catch (CakeException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
		}

	}

	private void displayDetails() {

		System.out.println("Enter the OrderId:");
		int orderid = Integer.parseInt(sc.nextLine());
		try {
			CakeOrder c1 = service.getOrderDetails(orderid);
			System.out.println("OrderId: " + c1.getOrderId());
			System.out.println("CustomerId: " + c1.getCustomerId());
			System.out.println("Total Price:" + c1.getTotalPrice());
		} catch (CakeException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
		}
	}
}
