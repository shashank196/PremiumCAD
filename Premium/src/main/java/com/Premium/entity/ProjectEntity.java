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
	private Integer project_id;
	
	@Column
	private String project_name;
	
	@Column
	private String project_description;
	
	@Column
	private Double project_price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id", nullable = false)
	private ClientEntity client;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id", nullable = false)
	private EmployeeEntity project_manager;
	
	@OneToMany
	private List<TaskEntity> tasks;

}
