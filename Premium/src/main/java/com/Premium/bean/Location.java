package com.Premium.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Location {
	
	private String street_address;

	private String city;
	
	private String state;
	
	private String country;
	
}
