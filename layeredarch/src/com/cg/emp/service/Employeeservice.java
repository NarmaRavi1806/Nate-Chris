package com.cg.emp.service;

import java.util.Collection;
import java.util.List;

import com.cg.emp.bean.Employee;
import com.cg.emp.dao.EmployeeDao;
import com.cg.emp.dao.IEmployeeDao;
import com.cg.emp.exception.EmployeeException;

public class Employeeservice implements IEmployeeservice {
	
	IEmployeeDao employeedao=new EmployeeDao();

	@Override
	public Collection<Employee> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		return employeedao.getAllEmployee();
	}

	@Override
	public Employee getEmployeebyId(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return employeedao.getEmployeebyId(id);
	}

	@Override
	public boolean validateEmployee(Employee emp) throws EmployeeException {
		if(validateName(emp.getName()) && validateMoblie(emp.getMobile())
				&& validateAge(emp.getAge()) ){
			return true;
		}
		return false;
	}
	
	
	private boolean validateName(String name) throws EmployeeException{
		if(name.isEmpty()|| name==null){
			throw new EmployeeException("Employee name cannot be empty");
		}
		else{
			if(!name.matches("[A-Z][A-Za-z]{3,}")){
				throw new EmployeeException("Name should start with a "
						+ "capital letter and should be only of alphabets");
			}
		}
		return true;
	}
	
	
	private boolean validateMoblie(String mobile) throws EmployeeException{
		if(!mobile.matches("\\d{10}")){
			throw new EmployeeException("Mobile number should contain 1o numbers");
		}
		return true;
	}
	
	private boolean validateAge(int age) throws EmployeeException{
		if(age>=18 && age<=60){
			return true;
		}else{
			throw new EmployeeException("Age should be between 18 and 60");
		}
	}

	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		return employeedao.addEmployee(emp);
	}

	@Override
	public int DeleteEmployee(int id) throws EmployeeException {
		
		return employeedao.DeleteEmployee(id);
	}

	@Override
	public List<Employee> GetEmployeeByDesig(String designation)
			throws EmployeeException {
		// TODO Auto-generated method stub
		return employeedao.GetEmployeeByDesig(designation);
	}

	@Override
	public Employee findSeniorEmployee() throws EmployeeException {
		
		return employeedao.findSeniorEmployee();
	}

	@Override
	public int updateEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		return employeedao.updateEmployee(emp);
	}
}
