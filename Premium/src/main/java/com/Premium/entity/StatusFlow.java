package com.Premium.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "status_flow")
@Data
public class StatusFlow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer status_flow_id;
	
	@ManyToOne
	@JoinColumn(name = "status_from", nullable = false)
	private WorkStatusFrom status_from;
	
	@ManyToOne
	@JoinColumn(name = "status_to", nullable = false)
	private WorkStatusTo status_to;
	
}
