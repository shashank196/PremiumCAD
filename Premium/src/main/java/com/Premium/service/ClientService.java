package com.Premium.service;

import java.util.List;

import com.Premium.bean.Client;
import com.Premium.bean.Location;

public interface ClientService {

	public void addClient(Client client);
	
	public Client getClient(String name);
	
	public List<Client> getClients();
	
	public void updateClientContact(int client_id, String contact_number);
	
	public void updateClientAddress(int client_id, Location location);
	
}
