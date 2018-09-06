package com.cg.eis.service;

public class EmployeeService implements IEmployeeService {
	@Override
	public String Insurancescheme(long salary,String designation){
		// TODO Auto-generated method stub
		
		
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

}

