package com.Premium.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Client {
	
	private Integer id;

	private String client_name;
	
	private String contact_number;
	
	private String email_id;
	
	private Location location;
	
	private List<Project> projects;
}
