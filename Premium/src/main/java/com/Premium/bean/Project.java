package com.Premium.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Project {
	
	private Integer project_id;
	
	private String project_name;
	
	private String project_description;
	
	private Double project_price;
	
	private Employee project_manager;
	
	private List<Task> tasks;
	
}
