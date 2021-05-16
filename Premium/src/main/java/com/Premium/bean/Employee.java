package com.Premium.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {

	private Integer employee_id;
	
	private String name;
	
	private String contact_number;
	
	private String email_id;
	
	private Location address;
}
