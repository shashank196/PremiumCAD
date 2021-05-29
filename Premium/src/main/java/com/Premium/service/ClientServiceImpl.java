package com.Premium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Premium.bean.Client;
import com.Premium.dao.ClientRepository;
import com.Premium.entity.AddressEntity;
import com.Premium.entity.ClientEntity;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public void addClient(Client client) {
		
		ClientEntity clientEntity = new ClientEntity();
		AddressEntity addressEntity = new AddressEntity();
		
		clientEntity.setContactNumber(client.getContactNumber());
		clientEntity.setEmailId(client.getEmailId());
		clientEntity.setClientName(client.getClientName());
		
		addressEntity.setStreetAddress(client.getAddress().getStreetAddress());
		addressEntity.setCity(client.getAddress().getCity());
		addressEntity.setState(client.getAddress().getState());
		addressEntity.setCountry(client.getAddress().getCountry());
		
		clientEntity.setAddress(addressEntity);
		clientRepository.save(clientEntity);
	
	}

	@Override
	public Client getClient(int client_id) {
		
		return null;
	}

	@Override
	public List<Client> getClients() {
		return null;
	}

	@Override
	public void updateClient(int client_id, Client client) {
		
	}

}
