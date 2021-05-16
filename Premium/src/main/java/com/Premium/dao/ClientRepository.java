package com.Premium.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Premium.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
	
}