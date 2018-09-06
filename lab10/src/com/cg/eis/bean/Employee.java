package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.*;

import java.util.Scanner;

public class Employee {
	
	public int id;
	public String name;
	public long salary;
	public String designation;
	public String insuranceScheme;
	
	
	public void user()
	{
Scanner sd= new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		name=sd.nextLine();
		
		System.out.println("Enter the Employee Id: ");
		id=sd.nextInt();
		
		System.out.println("Enter the salary:");
		salary=sd.nextLong();
		
		System.out.println("Enter the Designation:");
		designation=sd.next();
		
		
	}
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("Employee name:"+name);
		System.out.println("Employee Id:"+id);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee Designation:"+designation);
		System.out.println("Employee insuranceScheme:"+insuranceScheme);
		
		
	}

	public Employee() {
		super();
		
	}

	public Employee(String name, int id, long salary, String designation)throws EmployeeException {
		super();
		this.id = id;
		this.name = name;
		if(salary<3000){
			throw new EmployeeException("The salary entered is less than 3000");
		}
		this.salary = salary;
		this.designation = designation;
		
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) throws EmployeeException {
		if(salary<3000){
			throw new EmployeeException("The salary entered is less than 3000");
		}
		this.salary = salary;
	}

	

}

