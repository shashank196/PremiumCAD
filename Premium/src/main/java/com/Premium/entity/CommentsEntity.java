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
import lombok.NonNull;

@Entity
@Table(name = "Comments")
@Data
public class CommentsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comment_id;
	
	@Column
	@NonNull
	private String comment_description;
	
	@Column
	private Date comment_created_at;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "task_id", nullable = false)
	private TaskEntity task;
	
}
