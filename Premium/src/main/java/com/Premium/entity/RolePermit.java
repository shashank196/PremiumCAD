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
@Table(name = "Role_Permission_Map")
@Data
public class RolePermit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Roles id_role;
	
	@ManyToOne
	@JoinColumn(name = "permission_id")
	private Permission id_permission;
	
}
