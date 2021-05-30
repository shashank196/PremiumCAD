package com.Premium.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "workStatusFrom")
@Data
public class WorkStatusFromEntity {

	@Id
	@Column(name  = "statusFrom")
	private String statusFrom;	
	
}