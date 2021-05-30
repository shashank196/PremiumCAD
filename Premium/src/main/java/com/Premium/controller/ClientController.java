package com.Premium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Premium.bean.Client;
import com.Premium.service.ClientService;

public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping("/client")
	public void AddClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	@GetMapping("/client")
	public List<Client> GetClients(String name) {
		List<Client> clients = clientService.getClients();
		return clients;
	}
		
	@PutMapping("/client/{id}")
	public void UpdateClient(@PathVariable("id") int id, @RequestBody Client client) {
		clientService.updateClient(id, client);
	}
}
