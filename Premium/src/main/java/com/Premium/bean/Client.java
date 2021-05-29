package com.Premium.bean;

import java.util.List;

import lombok.Data;

@Data
public class Client {
	
	private Integer clientId;
	
	private String clientName;
	
	private String contactNumber;
	
	private String emailId;
	
	private Adderss address;
	
	private List<Project> projects;
	
}