package com.contoso.cruddb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contoso.cruddb.entity.Employee;
import com.contoso.cruddb.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return service.addEmployee(employee);
	}
	
	@GetMapping("/emps")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	
}
