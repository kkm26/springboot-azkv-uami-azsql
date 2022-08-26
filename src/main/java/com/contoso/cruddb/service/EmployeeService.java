package com.contoso.cruddb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contoso.cruddb.entity.Employee;
import com.contoso.cruddb.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
		
	}
	
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
}
