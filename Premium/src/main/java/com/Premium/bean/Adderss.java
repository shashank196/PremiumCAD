package com.Premium.bean;

import lombok.Data;

@Data
public class Adderss {
	
	private Integer addressId;
	
	private String streetAddress;

	private String city;
	
	private String state;
	
	private String country;

	public Adderss(String street_address, String city, String state, String country) {
		super();
		this.streetAddress = street_address;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}
