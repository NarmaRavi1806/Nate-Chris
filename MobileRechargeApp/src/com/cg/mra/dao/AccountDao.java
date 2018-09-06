package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeAppException;

public interface AccountDao {
	Account getAccountDetails(String mobileNo)throws MobileRechargeAppException;
	int rechargeAccount(String mobileNo,double rechargeAmount)throws MobileRechargeAppException;

}
