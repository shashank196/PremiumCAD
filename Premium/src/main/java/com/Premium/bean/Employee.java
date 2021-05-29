package com.Premium.bean;

import lombok.Data;

@Data
public class Employee {

	private Integer employeeId;

	private String name;

	private String contactNumber;

	private String emailId;

	private Adderss address;

	public Employee(Integer employee_id, String name, String contact_number, String email_id, Adderss address) {
		super();
		this.employeeId = employee_id;
		this.name = name;
		this.contactNumber = contact_number;
		this.emailId = email_id;
		this.address = address;
	}
}
