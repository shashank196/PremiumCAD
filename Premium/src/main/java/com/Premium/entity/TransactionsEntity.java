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

@Entity
@Table(name = "Transactions")
@Data
public class TransactionsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transaction_id;
	
	@Column
	private Date end_date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "task_id", nullable = false)
	private TaskEntity task;
	
}
