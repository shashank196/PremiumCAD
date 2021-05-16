package com.Premium.entity;

import java.util.Date;

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
public class Updates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long update_id;
	
	@Column
	private Date status_changed_at;
	
	@ManyToOne
	@JoinColumn(name = "status_flow_id")
	private StatusFlow status_change;
	
	@ManyToOne
	@JoinColumn(name = "task_id", nullable = false)
	private Task task;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;
	
}
