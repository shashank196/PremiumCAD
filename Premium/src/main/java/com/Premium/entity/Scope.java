package com.Premium.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "Scope")
public class Scope {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer scope_id;
	
	@Column
	@NonNull
	private String name;
	
	@Column
	private String description;
}
