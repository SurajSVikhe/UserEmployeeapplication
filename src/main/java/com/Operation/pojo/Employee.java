package com.Operation.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Entity
@Data
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long empId;
	@Column(name="Emp_Name")
	private String empname;
	@Column(name="Emp_Email")
	private String EmpEmail;
	@Column(name="Emp_Salary")
	private Double empsalary;
}
