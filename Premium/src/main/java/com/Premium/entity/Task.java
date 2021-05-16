package com.Premium.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "Task")
@Data
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long task_id;
	
	@ManyToOne
	@JoinColumn(name = "status_flow_id")
	private StatusFlow currentStatus;
	
	@Column
	@NonNull
	private String task_description;
	
	@Column
	private Date task_created_at;
	
	@ManyToOne
	@JoinColumn(name = "project_id", nullable = false)
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee assigned_to;
	
	@OneToMany
	private List<Files> files_attached;
	
	
	
}
