package com.cg.eis.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.eis.exception.EmployeeException;

public class ExceptionCheckTest {
	Employee e;
	
	@Before
	public void init(){
		e=new Employee();
	}

	@Test(expected=EmployeeException.class)
	public void testSetSalary() throws EmployeeException {
		e.setSalary(2000);
		
	}

}
