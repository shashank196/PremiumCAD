package com.Premium.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.Premium.entity.StatusFlowEntity;

import lombok.Data;

@Component
@Data
public class Updates {

	private Date status_changed_at;
	
	private StatusFlowEntity status_change;
	
	private Task task;
	
	private Employee employee;
}
