package com.Premium.entity;

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
@Table(name = "Files")
@Data
public class FilesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fileId;
	
	@Column
	private String filePath;
	
	@Column
	private String fileName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "taskId", nullable = false)
	private TaskEntity task;
	
}
