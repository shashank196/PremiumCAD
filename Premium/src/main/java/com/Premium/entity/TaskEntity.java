package com.Premium.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
public class TaskEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;
	
	@ManyToOne
	@JoinColumn(name = "statusFlowId")
	private StatusFlowEntity currentStatus;
	
	@Column
	@NonNull
	private String taskDescription;
	
	@Column
	private Date taskCreated_at;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectId", nullable = false)
	private ProjectEntity project;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeId", nullable = false)
	private EmployeeEntity assignedTo;
	
	@OneToMany
	private List<FilesEntity> filesAttached;
	
	@OneToMany
	private List<UpdatesEntity> updates;
	
	@OneToMany
	private List<CommentsEntity> comments;
	
}
