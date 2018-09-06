package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeAppException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

/**
 * 
 *Class name : MainUI
 * No. of Methods : 2
 * 
 * Name of the Methods : getAccountDetails,rechargeAccount
 * Purpose : Getting values and Display operation for Mobile Recharge Application
 * 
 * Author : Narmatha
 * Date of Creation : 11-July-2018
 * 
 * Last Modification Date : 11-July-2018
 *
 */

public class MainUI {
	
	Scanner scan= new Scanner(System.in);
	AccountService accountservice = new AccountServiceImpl();

	public static void main(String[] args) {
		
		MainUI main=new MainUI();
		String option="";
		while(true){
			System.out.println("1) Account Balance Enquiry");
			System.out.println("2) Recharge Account");
			System.out.println("3) Exit");
			option = main.scan.nextLine();
			switch (option) {
			case "1":
				main.getAccountDetails();
				break;
			case "2":
				main.rechargeAccount();
				break;
			case "3":
				System.exit(0);
				break;

			default:
				System.out.println("Enter a valid option");
				break;
			}
		}

	}
	
	/**
	 * Name of Method : getAccountDetails
	 * Return type : void
	 * Author : Narmatha
	 * Date of Creation : 11-July-2018
	 * Purpose : To view the Account Details
	 */
	
	public void getAccountDetails(){
		
		System.out.print("Enter MobileNo : ");
		String mobileNo=scan.nextLine();
	
		try {
			Account acc = accountservice.getAccountDetails(mobileNo);
			System.out.println("Your Current Balance is : Rs."+acc.getAccountBalance());
		} catch (MobileRechargeAppException e) {
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}
		
	}
	
	/**
	 * Name of Method : rechargeAccount
	 * Return type : void
	 * Author : Narmatha
	 * Date of Creation : 11-July-2018
	 * Purpose : To Get the recharge Amount and add it to the Account Balance
	 */
	
	public void rechargeAccount(){
		Account acc=new Account();
		
		System.out.print("Enter MobileNo : ");
		acc.setMobileNo(scan.nextLine());
		try {
			 //acc = accountservice.getAccountDetails(acc.getMobileNo());
			boolean b= accountservice.validateRecharge(acc);
			acc = accountservice.getAccountDetails(acc.getMobileNo());
			if(b){
				System.out.println("Enter Recharge Amount : ");
				double rechargeAmount = Double.parseDouble(scan.nextLine());
				int finalRecharge = accountservice.rechargeAccount(acc.getMobileNo(), rechargeAmount) ;
				System.out.println("Your Account Recharged Successfully");
				System.out.println("Hello "+acc.getCustomerName()+",Available Balance is "+finalRecharge);
			}
		} catch (MobileRechargeAppException e) {
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}
	}

}
