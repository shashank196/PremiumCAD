package com.Premium.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "work_status_to")
@Data
public class WorkStatusTo {

	@Id
	private String status_to;	
	
}