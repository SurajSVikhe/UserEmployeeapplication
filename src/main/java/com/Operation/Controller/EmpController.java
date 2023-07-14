package com.Operation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Operation.Service.ServiceI;
import com.Operation.Service.ServiceImpl;
import com.Operation.pojo.Employee;

@Controller
public class EmpController {

	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping("/welcome")
	public String LoadFram() {
		return "Registration";
	}
	
	@PostMapping("/reg")
	public String UserRegistration(Employee employee, Model model) {
		System.out.println("controller layer method");
		System.out.println(employee);
		 Long saveEmployee = serviceImpl.SaveEmployee(employee);

		model.addAttribute("ID", saveEmployee);
		return "usersuccess";

	}
	
	@GetMapping("/login")
	public String preLogin() {
		return "login";

	}
	
	@GetMapping("/log")
	public String Loginckeck(Employee employee) {
		System.out.println(employee);
		Boolean loginckeckservicelayer = serviceImpl.Loginckeckservicelayer(employee);

		if (loginckeckservicelayer) {
			return "loginsuccess";
		} else
			return "loginFail";

	}
	
	@GetMapping("/getAllData")
	public String getAllData(Model model) {// for display on front end use model
		List<Employee> allData = serviceImpl.getAllEmpData();
		model.addAttribute("list", allData);
		return "getAllData";

	}


}
