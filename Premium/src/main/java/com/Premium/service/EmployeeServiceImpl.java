package com.Premium.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Premium.bean.Employee;
import com.Premium.bean.Location;
import com.Premium.dao.EmployeeRepository;
import com.Premium.entity.AddressEntity;
import com.Premium.entity.EmployeeEntity;
import com.Premium.entity.RegionEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void addEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setContact_number(employee.getContact_number());
		employeeEntity.setEmail_id(employee.getEmail_id());
		employeeEntity.setName(employee.getName());
		AddressEntity addressEntity = new AddressEntity();
		RegionEntity regionEntity = new RegionEntity();
		regionEntity.setCity(employee.getAddress().getCity());
		regionEntity.setCountry(employee.getAddress().getCountry());
		regionEntity.setState(employee.getAddress().getState());
		addressEntity.setRegion(regionEntity);
		addressEntity.setStreet_address(employee.getAddress().getStreet_address());
		employeeEntity.setAddress(addressEntity);
		employeeRepository.save(employeeEntity);
		
	}

	@Override
	public Employee getEmployee(String email_id) {
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		List<EmployeeEntity> employeeEntities =  employeeRepository.findAll();
		List<Employee> employees = new ArrayList<Employee>();
		
		for (Employee employee : employees) {
			Employee emp = new Employee();
			
		}
		
		return employees;
	}

	@Override
	public void updateEmployeeContact(int employee_id, String contact_number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeAddress(int employee_id, Location location) {
		// TODO Auto-generated method stub
		
	}

}
