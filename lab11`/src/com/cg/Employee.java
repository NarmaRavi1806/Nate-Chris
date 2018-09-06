package com.cg;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
	
	public String firstname;
	public String lastname;
	int empId;
	String phoneno,emailId,designation;
	int managerId;
	double salary;
	LocalDate now= LocalDate.now();
	Department d=new Department();
	
	
//	public Employee(String firstname, String lastname, int empId,
//			String phoneno, String emailId, String designation, int managerId,
//			double salary, LocalDate now) {
//		super();
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.empId = empId;
//		this.phoneno = phoneno;
//		this.emailId = emailId;
//		this.designation = designation;
//		this.managerId = managerId;
//		this.salary = salary;
//		this.now = now;
//	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getNow() {
		return now;
	}
	public void setNow(LocalDate now) {
		this.now = now;
	}
	public static void duration(LocalDate date,LocalDate now)
	{
		Period period=Period.between(date, now);
		System.out.println("Days:"+period.getDays());
		System.out.println("Month:"+period.getMonths());
		System.out.println("Years:"+period.getYears());
	}
	public Employee(){
		
	}
	

}
