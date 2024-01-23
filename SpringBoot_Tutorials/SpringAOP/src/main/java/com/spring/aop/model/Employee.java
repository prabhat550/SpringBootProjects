package com.spring.aop.model;

public class Employee {

	private String empId;
	private String name;

	public Employee() {
		super();
	}

	public Employee(String empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
