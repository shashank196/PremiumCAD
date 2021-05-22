package com.Premium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Premium.bean.Employee;
import com.Premium.service.EmployeeService;

@RestController("")
public class AdminController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public void AddEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@GetMapping("employee/{name}")
	public void GetEmployees(String name) {
		
	}

	@PostMapping("/client")
	public void AddClient() {
		
	}
	
	@GetMapping("client/{name}")
	public void GetClients(String name) {
		
	}
	
	@PostMapping("/project")
	public void AddProject() {
		
	}
	
	@GetMapping("project/{name}")
	public void GetProjects(String name) {
		
	}
	
	@PostMapping("/task")
	public void AddTask() {
		
	}
	
	@GetMapping("task/{name}")
	public void GetTasks(String name) {
		
	}
	
}
