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
@Table(name = "statusFlow")
@Data
public class StatusFlowEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer statusFlowId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "statusFrom", nullable = false)
	private WorkStatusFromEntity statusFrom;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "statusTo", nullable = false)
	private WorkStatusToEntity statusTo;
	
}
