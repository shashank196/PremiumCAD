package com.Premium.entity;

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
@Table(name = "Files")
@Data
public class Files {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long file_id;
	
	@Column
	private String file_path;
	
	@Column
	private String file_name;
	
	@ManyToOne
	@JoinColumn(name = "task_id", nullable = false)
	private Task task;
	
}
