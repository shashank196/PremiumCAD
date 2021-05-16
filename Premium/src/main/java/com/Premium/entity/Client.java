package com.Premium.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Clients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer client_id;
	
	@Column
	private String client_name;
	
	@Column
	private String contact_number;
	
	@Column
	private String email_id;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Address address;
	
	@OneToMany
	private List<Project> projects;
}
