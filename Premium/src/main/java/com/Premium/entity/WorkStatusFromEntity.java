package com.Premium.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "work_status_from")
@Data
public class WorkStatusFromEntity {

	@Id
	private String status_from;	
	
}