package com.cg.eis.service;

import java.util.Scanner;





import com.cg.eis.bean.*;


public class IEmployeeService implements EmployeeService {

	@Override
	public String Insurancescheme(long salary,String designation){
		// TODO Auto-generated method stub
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the salary :");
		ed.salary = sc.nextLong();
		Scanner sb= new Scanner(System.in);
		System.out.println("Enter the Designation: ");
		ed.designation=sb.nextLine();*/
		//String s="System Associate";
		//String s1="Programmer";
		//String s2="Manager";
		//String s3="Clerk";
		
		
		if(salary>5000 || salary<20000 && designation.equalsIgnoreCase("SystemAssociate") )
		{
			//String s="System Associate";
			//if(ed.designation.equalsIgnoreCase(s))
			
			return InsuranceschemeC();
			
		}
		if(salary>20000 || salary<40000 && designation.equalsIgnoreCase("Programmer") )
		{
			//String s1="Programmer";
			//if(ed.designation.equalsIgnoreCase(s1))
			
				return InsuranceschemeB();
			
		}
		if(salary>=40000 && designation.equalsIgnoreCase("Manager") )
		{
			//String s2="Manager";
			//if(designation.equals(s2))
			
			return InsuranceschemeA();
			
		}
		if(salary<5000 && designation.equalsIgnoreCase("Clerk"))
		{
			//String s3="Clerk";
			//if(designation.equals(s3))
			
			return NoInsurancescheme();
			
		}
		return null;
		
		
		}

	@Override
	public String InsuranceschemeA() {
		// TODO Auto-generated method stub
		String SchemeA="Insurance SchemeA";
		return SchemeA;
		
	}

	@Override
	public String InsuranceschemeB() {
		// TODO Auto-generated method stub
		String SchemeB="Insurance SchemeB";
		return SchemeB;
	}

	@Override
	public String InsuranceschemeC() {
		// TODO Auto-generated method stub
		String SchemeC="Insurance SchemeC";
		return SchemeC;
	}

	@Override
	public String NoInsurancescheme() {
		// TODO Auto-generated method stub
		String NoScheme="No Insurance Scheme";
		return NoScheme;
	}

	
		
		
		
/*blic static void main(String[] args) {
	// TODO Auto-generated method stub
	EmployeeService es= new IEmployeeService();
	ed.Insurancescheme=es.Insurancescheme(ed.salary, ed.designation);

}*/
}


