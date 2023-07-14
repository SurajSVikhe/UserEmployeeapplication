package com.Operation.Service;

import java.util.List;

import com.Operation.pojo.Employee;

public interface ServiceI {

	public Long SaveEmployee(Employee employee);
	public Boolean Loginckeckservicelayer(Employee user);
	public List<Employee> getAllEmpData();
	
	
}
