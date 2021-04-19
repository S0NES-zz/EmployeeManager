package com.vinicius.springboot.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.springboot.exception.UserNotFoundException;
import com.vinicius.springboot.model.Employee;
import com.vinicius.springboot.resources.EmployeeResources;


@Service
@Transactional
public class EmployeeService {

	@Autowired
	private final EmployeeResources employeeResources;
	
	public EmployeeService(EmployeeResources employeeRepo) {
		this.employeeResources = employeeRepo;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeResources.save(employee);
	}
	public List<Employee> findAllEmployees(){
		return employeeResources.findAll();
	}
	public Employee updateEmployee(Employee employee) {
		return employeeResources.save(employee);
	}
	public Employee findEmployeeById(Long id) {
		return employeeResources.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	public void deleteEmployee(Long id) {
		employeeResources.deleteEmployeeById(id);
	}
}
