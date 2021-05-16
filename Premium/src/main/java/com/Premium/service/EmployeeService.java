package com.Premium.service;

import java.util.List;

import com.Premium.bean.Employee;
import com.Premium.bean.Location;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public Employee getEmployee(String email_id);
	
	public List<Employee> getEmployees();
	
	public void updateEmployeeContact(int employee_id, String contact_number);
	
	public void updateEmployeeAddress(int employee_id, Location location);
}
