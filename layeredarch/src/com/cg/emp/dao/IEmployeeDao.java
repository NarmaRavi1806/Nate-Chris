package com.cg.emp.dao;

import java.util.Collection;
import java.util.List;

import com.cg.emp.bean.Employee;
import com.cg.emp.exception.EmployeeException;

public interface IEmployeeDao {
	
	Collection<Employee> getAllEmployee() throws EmployeeException;
	Employee getEmployeebyId(int id) throws EmployeeException;
	int addEmployee(Employee emp) throws EmployeeException;
	int DeleteEmployee(int id)throws EmployeeException;
	List<Employee> GetEmployeeByDesig(String designation) throws EmployeeException;
	Employee findSeniorEmployee()throws EmployeeException;
	int updateEmployee(Employee emp)throws EmployeeException;

}
