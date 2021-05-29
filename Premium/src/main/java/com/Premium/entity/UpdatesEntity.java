package com.Premium.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Updates")
@Data
public class UpdatesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long updateId;
	
	@Column
	private Date statusChangedAt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "statusFlowId")
	private StatusFlowEntity status_change;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "taskId", nullable = false)
	private TaskEntity task;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeId", nullable = false)
	private EmployeeEntity employee;
	
}
