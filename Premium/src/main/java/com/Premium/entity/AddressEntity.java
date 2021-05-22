package com.Premium.entity;

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

@Data
@Entity
@Table(name = "Address")
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer location_id;
	
	@Column
	private String street_address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "region_id", nullable = false)
	private RegionEntity region;

}
