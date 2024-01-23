package com.spring.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spiring.aop.service.EmployeeService;
import com.spring.aop.model.Employee;


@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/add/employee")
	public Employee addEmployee(@RequestParam(name = "name") String name, @RequestParam(name = "id") String id) {
		return employeeService.createEmployee(name, id);
	}
}
