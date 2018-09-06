package com.cg.mra.dao;

import java.util.HashMap;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeAppException;

/**
 * 
 *Class name : AccountDaoImpl
 * Interface Implemented : AccountDao
 * No. of Methods : 2
 * 
 * Name of the Methods : getAccountDetails,rechargeAccount
 * Purpose : Data Access operation for Mobile Recharge Application
 * 
 * Author : Narmatha
 * Date of Creation : 11-July-2018
 * 
 * Last Modification Date : 11-July-2018
 *
 */

public class AccountDaoImpl implements AccountDao {
	
	private static HashMap<String,Account> accountEntryMap=new HashMap<>();
	

	public static HashMap<String, Account> getAccountEntryMap() {
		return accountEntryMap;
	}
	
	static{
		accountEntryMap.put("9922943943", new Account("9922943943","Normal","Ravi",100));
		accountEntryMap.put("9932012345", new Account("9932012345","Previlage","Banu",300));
		accountEntryMap.put("9834391234", new Account("9834391234","Normal","Magi",500));
		accountEntryMap.put("9011227766", new Account("9011227766","Normal","Ria",200));
	}
	
	/**
	 * Name of Method : getAccountDetails
	 * parameters Expected : mobileNo
	 * Return type : String
	 * Author : Narmatha
	 * Date of Creation : 11-July-2018
	 * Purpose : To view the Account Details
	 */

	@Override
	public Account getAccountDetails(String mobileNo)throws MobileRechargeAppException {
		Account acc= accountEntryMap.get(mobileNo);
		
		if(acc==null){
			throw new MobileRechargeAppException("ERROR: Given Account Id Does Not Exists");
		}
		return acc;
	}
	
	/**
	 * Name of Method : rechargeAccount
	 * parameters Expected : mobileNo,rechargeAmount
	 * Return type : String, double
	 * Author : Narmatha
	 * Date of Creation : 11-July-2018
	 * Purpose : To recharge and update the balance in map
	 */

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount)throws MobileRechargeAppException {
		
		Account acc= accountEntryMap.get(mobileNo);
		if(acc!=null){
			
			acc.setAccountBalance(acc.getAccountBalance()+rechargeAmount);
		}else
		{
			throw new MobileRechargeAppException("ERROR: Cannot Recharge Account as Given Mobile No Does Not Exists");
		}
		return (int) acc.getAccountBalance();
	}

}
