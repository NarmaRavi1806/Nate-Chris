package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.service.*;
import com.cg.eis.bean.*;
import com.cg.eis.exception.EmployeeException;

@SuppressWarnings("unused")
public class Userinput {
	
	

	public static void main(String[] args)throws EmployeeException {
		// TODO Auto-generated method stub

		
		Employee u=new Employee();
		
		u.user();
		try{
			u=new Employee(u.name,u.id,u.salary,u.designation);
			throw new EmployeeException("Exception");
		}catch(EmployeeException e2){
			System.out.println("Exception"+e2);
			u.salary=3000;
		}
		EmployeeService e1=new IEmployeeService();
		u.insuranceScheme=e1.Insurancescheme(u.salary, u.designation);
		u.display();
		//System.out.println("Employee Details");
		//System.out.println("Employee name:"+u.name);
		//System.out.println("Employee Id:"+u.id);
		//System.out.println("Employee salary:"+u.salary);
		//System.out.println("Employee Designation:"+u.designation);
		//System.out.println("Employee insuranceScheme:"+u.insuranceScheme);
		
		
		
		

	}
	

}
