package com.cg.eis.db;

import java.util.HashMap;

import com.cg.Employee;



public class EmployeeDB {
	private static HashMap<Integer,Employee> employeeMap= new HashMap<>();
	public static HashMap<Integer,Employee> getEmployeeMap(){
		return employeeMap;
	}

}
