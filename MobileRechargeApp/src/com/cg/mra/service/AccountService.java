package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeAppException;

public interface AccountService {
	
	Account getAccountDetails(String mobileNo)throws MobileRechargeAppException;
	int rechargeAccount(String mobileNo,double rechargeAmount)throws MobileRechargeAppException;
	boolean validateRecharge(Account account)throws MobileRechargeAppException;


}
