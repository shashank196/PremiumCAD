package com.Premium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Premium.bean.Employee;
import com.Premium.service.EmployeeService;

@RestController("")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public void AddEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> GetEmployees(String name) {
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
	
	@DeleteMapping("/employee/{id}")
	public void DeleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/employee/{id}")
	public void UpdateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id, employee);
	}
	
}
