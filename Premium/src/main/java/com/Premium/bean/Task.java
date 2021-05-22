package com.Premium.bean;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Task {
	
	private Integer task_id;
	
	private TaskStatus current_status;
	
	private String task_description;
	
	private Date task_created_at;
	
	private List<Updates> updates;
	
	private List<Comments> comments;
}
