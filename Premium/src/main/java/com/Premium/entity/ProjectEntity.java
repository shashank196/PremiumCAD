package com.Premium.entity;

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

@Entity
@Table(name = "Project")
@Data
public class ProjectEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	
	@Column
	private String projectName;
	
	@Column
	private String projectDescription;
	
	@Column
	private Double projectPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clientId", nullable = false)
	private ClientEntity client;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeId", nullable = false)
	private EmployeeEntity projectManager;
	
	@OneToMany
	private List<TaskEntity> tasks;

}
