package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.MobileRechargeAppException;

/**
 * 
 *Class name : AccountServiceImpl
 *Implemented Interface : AccountService
 * No. of Methods : 5
 * 
 * Name of the Methods : getAccountDetails,rechargeAccount,
 * Purpose : Getting values and Display operation for Mobile Recharge Application
 * 
 * Author : Narmatha
 * Date of Creation : 11-July-2018
 * 
 * Last Modification Date : 11-July-2018
 *
 */

public class AccountServiceImpl implements AccountService {
	
	AccountDao accountDao =new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo)
			throws MobileRechargeAppException {
		
		return accountDao.getAccountDetails(mobileNo);
	}
	

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount)
			throws MobileRechargeAppException {
		
		
		
		return accountDao.rechargeAccount(mobileNo, rechargeAmount);
	}
	
	@Override
	public boolean validateRecharge(Account account)
			throws MobileRechargeAppException {
		if(validateMobileNo(account.getMobileNo()) && validateRechargeAmount(account.getAccountBalance())){
			return true;
		}
		return false;
	}
	
	
	private boolean validateMobileNo(String mobileNo)throws MobileRechargeAppException{
		
		if (!mobileNo.matches("\\d{10}")){
			throw new MobileRechargeAppException("Mobile Number Should consist of 10 digits");
		}
		return true;
		
	}
	
	private boolean validateRechargeAmount(double rechargeAmount)throws MobileRechargeAppException{
		if(rechargeAmount<100){
			throw new MobileRechargeAppException("Entered amount Should be greater than 100");
		}
		return true;
	}

	
	
}
