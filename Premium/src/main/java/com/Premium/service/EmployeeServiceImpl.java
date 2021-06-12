package com.Premium.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Premium.bean.Employee;
import com.Premium.bean.Adderss;
import com.Premium.dao.EmployeeRepository;
import com.Premium.entity.AddressEntity;
import com.Premium.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void addEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		AddressEntity addressEntity = new AddressEntity();

		employeeEntity.setContactNumber(employee.getContactNumber());
		employeeEntity.setEmailId(employee.getEmailId());
		employeeEntity.setName(employee.getName());

		addressEntity.setStreetAddress(employee.getAddress().getStreetAddress());
		addressEntity.setCity(employee.getAddress().getCity());
		addressEntity.setState(employee.getAddress().getState());
		addressEntity.setCountry(employee.getAddress().getCountry());

		employeeEntity.setAddress(addressEntity);
		employeeRepository.save(employeeEntity);
	}

	@Override
	public Optional<EmployeeEntity> getEmployee(int employee_id) {
		Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(employee_id);
		return employeeEntity;
	}

	@Override
	public List<Employee> getEmployees() {
		List<EmployeeEntity> employeeEntities =  employeeRepository.findAll();
		List<Employee> employees = new ArrayList<Employee>();

		for (EmployeeEntity employeeEntity : employeeEntities) {
			Adderss address = new Adderss(employeeEntity.getAddress().getStreetAddress(), employeeEntity.getAddress().getCity(),
					employeeEntity.getAddress().getState(), employeeEntity.getAddress().getCountry());

			Employee employee = new Employee(employeeEntity.getEmployeeId(), employeeEntity.getName(), employeeEntity.getContactNumber(), 
					employeeEntity.getEmailId(), address);
			employees.add(employee);	
		}
		return employees;
	}


	@Override
	public void deleteEmployee(int employee_id) {
		Optional<EmployeeEntity> optional = getEmployee(employee_id);
		EmployeeEntity employeeEntity = optional.get();
		employeeEntity.setAddress(null);
		employeeRepository.delete(employeeEntity);
	}


	@Override
	public void updateEmployee(int employee_id, Employee employee) {
		Optional<EmployeeEntity> optional = getEmployee(employee_id);
		EmployeeEntity employeeEntity = optional.get();
		AddressEntity addressEntity = new AddressEntity();

		employeeEntity.setContactNumber(employee.getContactNumber());
		employeeEntity.setEmailId(employee.getEmailId());

		addressEntity.setStreetAddress(employee.getAddress().getStreetAddress());
		addressEntity.setCity(employee.getAddress().getCity());
		addressEntity.setState(employee.getAddress().getState());
		addressEntity.setCountry(employee.getAddress().getCountry());

		employeeEntity.setAddress(addressEntity);
		employeeRepository.save(employeeEntity);
	}


}
