package com.vinicius.springboot;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.vinicius.springboot.resources.EmployeeResources;
import com.vinicius.springboot.services.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
class EmployeecrmApiApplicationTests {
	
	@Mock
	EmployeeResources employeeResources;
	
	@InjectMocks
	EmployeeService employeeServices;

}
	