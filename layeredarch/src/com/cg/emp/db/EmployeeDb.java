package com.cg.emp.db;

import java.time.LocalDate;
import java.util.HashMap;

import com.cg.emp.bean.Employee;

public class EmployeeDb {
	
	private static HashMap<Integer,Employee> empdb=new HashMap<>();
	//No setters should be created in database. only getters

	public static HashMap<Integer, Employee> getEmpdb() {
		return empdb;
	}
	static {
		empdb.put(1001, new Employee(101,"meena","Female",23,"Programmer","8856743300",
				LocalDate.of(2017, 04 ,23),30000));
		empdb.put(1002, new Employee(102,"mani","Male",30,"Manager","4637286517",
				LocalDate.of(2000, 11 ,11),56000));
		empdb.put(1003, new Employee(103,"sara","Female",29,"Team lead","6758493021",
				LocalDate.of(2011, 05 ,13),36000));
	}

}
