package com.Premium.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.Premium.entity.StatusFlowEntity;

import lombok.Data;

@Component
@Data
public class Updates {

	private Date statusChangedAt;
	
	private StatusFlowEntity statusChange;
	
	private Task task;
	
	private Employee employee;
}
