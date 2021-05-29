package com.Premium.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "workStatusTo")
@Data
public class WorkStatusToEntity {

	@Id
	private String statusTo;	
	
}