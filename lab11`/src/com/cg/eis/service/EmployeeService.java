package com.cg.eis.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.cg.Department;
import com.cg.Employee;



public class EmployeeService {
	HashMap<Integer,Employee> empdata=com.cg.eis.db.EmployeeDB.getEmployeeMap();
	Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService c=new EmployeeService();
		String option=null;
		while(true) {
			System.out.println("1. Add an Employee");
//			System.out.println("2. View Employee By InsuranceScheme");
//			System.out.println("3. Delete Employee");
//			System.out.println("4. Sort Employees By Salary");
			System.out.println("2. Exit");
			System.out.println("Enter your Choice");
			
	}
		

}
	private void addEmployee() {
		Employee emp=new Employee();
		Department dep=new Department();
		System.out.println("Enter Employee Id");
		/*String empId=scan.nextLine();
		int id=Integer.parseInt(empId);
		emp.setId(id);*/
		emp.setEmpId(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter First Name");
		emp.setFirstname(scan.nextLine());
		System.out.println("Enter Last Name");
		emp.setLastname(scan.nextLine());
		System.out.println("Enter emailId");
		emp.setEmailId(scan.nextLine());
		System.out.println("Enter Phone number");
		emp.setPhoneno(scan.nextLine());
		System.out.println("Enter Designation");
		emp.setDesignation(scan.nextLine());
		System.out.println("Enter Salary");
		emp.setSalary(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter the joining Date");
		emp.setNow(LocalDate.of(2016,04,23));
		System.out.println("Enter the Department Id");
		dep.setDeptId(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter Department name");
		dep.setDeptname(scan.nextLine());
		System.out.println("Enter manager Id");
		dep.setManagerId(Integer.parseInt(scan.nextLine()));
		
		//int empId=empService.addEmployee(emp);
		//System.out.println("Employee with Id "+empId+" added to the database");
	}
	}
