package com.cg.mra.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.mra.beans.Account;

public class AccountDaoImplTest {
	
	@Before
	public void init(){
		Account acc= new Account();
	}

	@Test
	public void testRechargeAccount() {
		AccountDao accountDao = new AccountDaoImpl();
		assertNotNull(accountDao);
		
	}

}
