package com.cg.emp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.emp.bean.Employee;
import com.cg.emp.db.EmployeeDb;
import com.cg.emp.exception.EmployeeException;

public class EmployeeDao implements IEmployeeDao {

	HashMap<Integer,Employee> empMap=
			EmployeeDb.getEmpdb();
	@Override
	public Collection<Employee> getAllEmployee() throws EmployeeException {
		try{
		// TODO Auto-generated method stub
		return empMap.values();
		}catch(Exception e){
			throw new EmployeeException(e.getMessage());
			//catch the exception and re throw it in this layer. do not handle it over here.
		}
	}
	@Override
	public Employee getEmployeebyId(int id) throws EmployeeException {
		
		Employee emp=empMap.get(id);
		if(emp==null){
			throw new EmployeeException("Employee with id"+id+"does not exist in database");
		}
		return emp;
	}
	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		if(empMap.containsKey(emp.getId())){
			throw new EmployeeException("Employee with id"+emp.getId()+"already exist in the database");
			
		}
		empMap.put(emp.getId(), emp);
		return emp.getId();
	}
	@Override
	public int DeleteEmployee(int id) throws EmployeeException {
		if(!empMap.containsKey(id)){
			throw new EmployeeException("Employee with the ID"+id+"does not exist in database");
		}
		empMap.remove(id);
		return id;
	}
	@Override
	public List<Employee> GetEmployeeByDesig(String designation)
			throws EmployeeException {
		try{
			List<Employee> employees=empMap.values().stream()
					.filter(x->x.getDesignation().equals(designation)).collect(Collectors.toList());
			if(employees==null || employees.size()==0){
				throw new EmployeeException("Invalid designation, please enter a valid designation");
			}
		return employees;
		}catch(Exception e){
			throw new EmployeeException(e.getMessage());
		}
	}
	@Override
	public Employee findSeniorEmployee() throws EmployeeException {
		Optional<Employee> emp=empMap.values().stream().min((x,y)->x.getDoj().compareTo(y.getDoj()));
		return emp.get();
	}
	@Override
	public int updateEmployee(Employee emp) throws EmployeeException {
		try{
			empMap.replace(emp.getId(), emp);
			
		}catch(Exception e){
			throw new EmployeeException(e.getMessage());
		}
		return emp.getId();
	}

}
