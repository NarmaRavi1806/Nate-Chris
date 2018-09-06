package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.IEmployeeService;

public class Lab10_3 {


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
		IEmployeeService e1=new EmployeeService();
		u.insuranceScheme=e1.Insurancescheme(u.salary, u.designation);
		u.display();

	}
	

}

