package com.Premium.entity;

import javax.persistence.CascadeType;
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
public class StatusFlowEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer status_flow_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_from", nullable = false)
	private WorkStatusFromEntity status_from;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_to", nullable = false)
	private WorkStatusToEntity status_to;
	
}
