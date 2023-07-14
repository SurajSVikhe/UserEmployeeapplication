package com.Operation.Dao;

import java.util.List;

import com.Operation.pojo.Employee;

public interface DaoI {

	public Long SaveEmployee(Employee employee);
	
	public  List<Employee> getAlldata();
}
