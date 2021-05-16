package com.Premium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Premium.dao.ClientRepository;

@RestController
public class AdminController {
	
	@Autowired
	private ClientRepository client;
	
	@GetMapping("/test")
	public void TestingMethod() {
		System.out.println("hello");
		client.findAll();
	}
	
}
