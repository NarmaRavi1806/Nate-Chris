package com.cg.eis.service;
import com.cg.eis.bean.*;
public interface EmployeeService {
	public String Insurancescheme(long salary,String designation);
	public String InsuranceschemeA();
	public String InsuranceschemeB();
	public String InsuranceschemeC();
	public String NoInsurancescheme();


}




/*Salary	Designation	Insurance scheme
>5000 and < 20000	System Associate	Scheme C
>=20000 and <40000	Programmer	Scheme B
>=40000	Manager	Scheme A
<5000 	Clerk	No Scheme*/
