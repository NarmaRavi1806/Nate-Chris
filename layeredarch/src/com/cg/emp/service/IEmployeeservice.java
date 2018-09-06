package com.cg.emp.service;

import java.util.Collection;
import java.util.List;

import com.cg.emp.bean.Employee;
import com.cg.emp.exception.EmployeeException;

public interface IEmployeeservice {
	
	Collection<Employee> getAllEmployee() throws EmployeeException;
	Employee getEmployeebyId(int id) throws EmployeeException;
	boolean validateEmployee(Employee emp) throws EmployeeException;
	int addEmployee(Employee emp) throws EmployeeException;
	int DeleteEmployee(int id)throws EmployeeException;
	List<Employee> GetEmployeeByDesig(String designation) throws EmployeeException;
	Employee findSeniorEmployee()throws EmployeeException;
	int updateEmployee(Employee emp)throws EmployeeException;

}
