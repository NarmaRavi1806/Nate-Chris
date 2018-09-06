package com.cg.emp.ui;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.cg.emp.bean.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.service.Employeeservice;
import com.cg.emp.service.IEmployeeservice;

public class Client {
	Scanner sc=new Scanner(System.in);
	IEmployeeservice service = new Employeeservice();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c=new Client();
		String op="";
		while(true){
			System.out.println("1. Display All Employees");
			System.out.println("2. Add an Employee");
			System.out.println("3. Delete an Employee");
			System.out.println("4. Update an Employee");
			System.out.println("5.Display Employee by Id");
			System.out.println("6. Display Employee by Designation");
			System.out.println("7. Display the Most Senior Employee");
			System.out.println("8.Exit");
			System.out.println("Enter your Choice");
			op=c.sc.nextLine();
			switch(op){
			case "1":
				c.displayAllEmployees();
				
				break;
			case "2":
				c.AddEmployee();
				
				break;
			case "3":
				c.DeleteEmployee();
				
				break;
			case "4":
				c.employeeUpdation();
				break;
			case "5":
				c.displayEmployeebyId();
				
				break;
			case "6":
				c.displayEmpByDesignation();
				
				break;
			case "7":
				c.findSenior();
				
				break;
			case "8":
				System.exit(0);
				break;
				default:
					System.out.println("Select option from 1 to 8");
					break;
			}
			
		}

	}
	public void displayAllEmployees(){
		try {
			Collection<Employee> employees=
					service.getAllEmployee();
			employees.forEach(System.out::println);
		} catch (EmployeeException e) {
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
		//always try to handle the exception in the user interface.
		
	}
	public void displayEmployeebyId(){
		System.out.println("Enter the Employee Id:");
		int id= Integer.parseInt(sc.nextLine());
		try {
			Employee emp =service.getEmployeebyId(id);
			System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
		
	}
	public void AddEmployee(){
		Employee emp=new Employee();
		System.out.println("Enter Employee Id:");
		emp.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Employee name:");
		emp.setName(sc.nextLine());
		System.out.println("Enter the gender:");
		emp.setGender(sc.nextLine());
		System.out.println("Enter the Age:");
		emp.setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the mobile number:");
		emp.setMobile(sc.nextLine());
		System.out.println("Enter the designation:");
		emp.setDesignation(sc.nextLine());
		System.out.println("Enter the salary:");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		emp.setDoj(LocalDate.now());
		try {
			boolean result=service.validateEmployee(emp);
			if(result){
			int ret=service.addEmployee(emp);
			System.out.println("Employee with Id "+ret+" added to database");
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
	}
	
	private void DeleteEmployee(){
		System.out.println("Enter Employee id to be deleted:");
		int id=Integer.parseInt(sc.nextLine());
		try {
			int result=service.DeleteEmployee(id);
			System.out.println("Employee with id"+id+"deleted from the database");
		} catch (EmployeeException e) {
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
	}
	
	private void displayEmpByDesignation(){
		System.out.println("Enter the Designation:");
		String desig=sc.nextLine();
		try {
			List<Employee> employees= service.GetEmployeeByDesig(desig);
			employees.forEach(System.out::println);
		} catch (EmployeeException e) {
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
		
	}
	
	private void findSenior(){
		try {
			Employee emp= service.findSeniorEmployee();
			System.out.println(emp);
		} catch (EmployeeException e) {
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
	}
	
	private void employeeUpdation(){
		System.out.println("Enter Employee Id:");
		int id=Integer.parseInt(sc.nextLine());
		try {
			Employee emp=service.getEmployeebyId(id);
			System.out.println("Employee current details");
			System.out.println(emp);
			System.out.println("Enter the Employee name:");
			emp.setName(sc.nextLine());
//			System.out.println("Enter the gender:");
//			emp.setGender(sc.nextLine());
			System.out.println("Enter the Age:");
			emp.setAge(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the mobile number:");
			emp.setMobile(sc.nextLine());
			System.out.println("Enter the designation:");
			emp.setDesignation(sc.nextLine());
			System.out.println("Enter the salary:");
			emp.setSalary(Double.parseDouble(sc.nextLine()));
			boolean b=service.validateEmployee(emp);
			if(b){
				int ret=service.updateEmployee(emp);
				System.out.println("Employee with id"+ret+"successfully updated");
				System.out.println(emp);
			}
		} catch (EmployeeException e) {
			System.out.println();
			System.err.println("An error occured:"+e.getMessage());
			System.out.println();
		}
	}
	

}
