package com.cg.employee.pl;

import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

import com.cg.employee.bean.Employee;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.IEmployeeService;

public class EmployeeServiceImpl {
	Scanner scan=new Scanner(System.in);
	IEmployeeService empService=new EmployeeService();
	public static void main(String[] args) {

		EmployeeServiceImpl c=new EmployeeServiceImpl();
		String option=null;
		while(true) {
			System.out.println("1. Add an Employee");
			System.out.println("2. View Employee By InsuranceScheme");
			System.out.println("3. Delete Employee");
			System.out.println("4. Sort Employees By Salary");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice");
			option=c.scan.nextLine();
			switch(option) {
			case "1":
				   c.addEmployee();
				   break;
			case "2":
				c.getEmployeeByInsurance();
				break;
			case "3":
				c.deleteEmployee();
				break;
			case "4":
				
				c.sortByEmployee();
				break;
			case "5":
				System.exit(0);
				default:
					System.out.println("Invalid option");
			}
		}

	}
	private void addEmployee() {
		Employee emp=new Employee();
		System.out.println("Enter Employee Id");
		/*String empId=scan.nextLine();
		int id=Integer.parseInt(empId);
		emp.setId(id);*/
		emp.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter Name");
		emp.setName(scan.nextLine());
		System.out.println("Enter Salary");
		emp.setSalary(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter Designation");
		emp.setDesignation(scan.nextLine());
		int empId=empService.addEmployee(emp);
		System.out.println("Employee with Id "+empId+" added to the database");
	}
	private void getEmployeeByInsurance() {
		System.out.println("Enter Insurance Scheme");
		String scheme=scan.nextLine();
		Collection<Employee> employees=
				empService.getEmployeeByInsurance(scheme);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	private void deleteEmployee() {
		System.out.println("Enter Employee id");
		int id=Integer.parseInt(scan.nextLine());
		boolean result=empService.deleteEmployee(id);
		if(result) {
			System.out.println("Employee with id "+id+" successfully deleted");
		}
		else {
			System.out.println("Employee with Id "+id+" does not exist in the database");
		}
	}
	
	private void sortByEmployee(){
		System.out.println();
		Collection<Employee> employee=empService.sortBySalary();
		for (Employee employee2 : employee) {
			
			System.out.println(employee2);
		}
	}
	

}
