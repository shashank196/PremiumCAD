package com.Premium.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Premium.entity.TransactionsEntity;

@Repository
public interface TransactionRepsitory extends JpaRepository<TransactionsEntity, Integer>{

}
