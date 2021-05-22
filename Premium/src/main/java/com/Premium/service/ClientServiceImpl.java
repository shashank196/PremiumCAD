package com.Premium.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Premium.bean.Client;
import com.Premium.bean.Location;

@Service
public class ClientServiceImpl implements ClientService{

	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getClient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClientContact(int client_id, String contact_number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClientAddress(int client_id, Location location) {
		// TODO Auto-generated method stub
		
	}

}
