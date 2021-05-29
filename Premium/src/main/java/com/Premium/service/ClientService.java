package com.Premium.service;

import java.util.List;

import com.Premium.bean.Client;

public interface ClientService {

	public void addClient(Client client);
	
	public Client getClient(int client_id);
	
	public List<Client> getClients();
	
	public void updateClient(int client_id, Client client);
	
}
