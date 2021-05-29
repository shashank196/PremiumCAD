package com.Premium.bean;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Task {
	
	private Integer taskId;
	
	private TaskStatus currentStatus;
	
	private String taskDescription;
	
	private Date taskCreatedAt;
	
	private List<Updates> updates;
	
	private List<Comments> comments;
}
