package com.Operation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Operation.Dao.DaoI;
import com.Operation.pojo.Employee;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private DaoI daoI;

	@Override
	public Long SaveEmployee(Employee employee) {
		System.out.println("service layer method");
		System.out.println(employee);
		Long saveEmployee = daoI.SaveEmployee(employee);
		return saveEmployee;
	}
	
	@Override
	public Boolean Loginckeckservicelayer(Employee employee) {
		List<Employee> alldata = daoI.getAlldata();

		for (Employee employee1 : alldata) {
			if (employee1.getEmpname().equals(employee.getEmpname())
					&& employee.getEmpEmail().equals(employee.getEmpEmail())) {

				return true;
			}
		}
		return false;
	}
	

	@Override
	public List<Employee> getAllEmpData() {
		List<Employee> alldata = daoI.getAlldata();

		return alldata;
	}

	

}
