package com.Premium.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Premium.entity.UpdatesEntity;

@Repository
public interface UpdatesRepository extends JpaRepository<UpdatesEntity, Integer>{

}
