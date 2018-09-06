

package com.cg.employee.service;

import java.util.*;

import com.cg.employee.db.EmployeeDB;
import com.cg.employee.bean.Employee;

public class EmployeeService implements IEmployeeService{
	
	HashMap<Integer,Employee> empdata=EmployeeDB.getEmployeeMap();
	

	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		double sal=emp.getSalary();
		String desig=emp.getDesignation();
		
		if(sal>5000 || sal<20000 && desig.equals("System Associate")){
			emp.setInsuranceScheme("Scheme C");
		}
		else if(sal>20000 || sal<40000 && desig.equals("Programmer")){
			emp.setInsuranceScheme("Scheme B");
		}
		else if(sal>=40000 && desig.equals("Manager")){
			emp.setInsuranceScheme("Scheme A");
		}
		else if(sal<5000 && desig.equals("Clerk")){
			emp.setInsuranceScheme("no Scheme");
		}
		empdata.put(emp.getId(), emp);
		return emp.getId();
	}
	
	public Collection<Employee> getEmployeeByInsurance(String insurance){
		ArrayList<Employee> employees=new ArrayList<>();
		for(Employee emp : empdata.values()){
			if(emp.getInsuranceScheme().equals(insurance)){
				employees.add(emp);
			}
		}
		return employees;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp=empdata.remove(id);
		if(emp != null){
			return true;
		}else
		{		return false;
		
		}
	}

	@Override
	public Collection<Employee> sortBySalary() {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employees=new ArrayList<>();
		Collection<Employee> emps=empdata.values();
		
		for (Employee employee : emps) {
			employees.add(employee);
			//System.out.println(employees);
		}
		employees.sort(new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.salary>o2.salary){
					return 1;
				}
				else if(o1.salary<o2.salary){
					return -1;
				}
				else{
				return 0;
				}
			}
			
		});
		return employees;
	}

	
	
	

}
