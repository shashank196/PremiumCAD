package com.Premium.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Project {
	
	private Integer projectId;
	
	private String projectName;
	
	private String projectDescription;
	
	private Double projectPrice;
	
	private Employee projectManager;
	
	private List<Task> tasks;
	
}
