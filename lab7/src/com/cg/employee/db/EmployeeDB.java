package com.cg.employee.db;
import java.util.*;
import com.cg.employee.bean.*;

public class EmployeeDB {
	private static HashMap<Integer,Employee> employeeMap= new HashMap<>();
	public static HashMap<Integer,Employee> getEmployeeMap(){
		return employeeMap;
	}

}
