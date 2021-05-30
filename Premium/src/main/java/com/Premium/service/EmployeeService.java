package com.Premium.service;

import java.util.List;
import java.util.Optional;

import com.Premium.bean.Employee;
import com.Premium.entity.EmployeeEntity;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public Optional<EmployeeEntity> getEmployee(int employee_id);
	
	public List<Employee> getEmployees();
	
	public void updateEmployee(int employee_id, Employee employee);
	
	public void deleteEmployee(int employee_id);
}
