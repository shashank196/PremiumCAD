package com.Premium.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Premium.entity.CommentsEntity;

@Repository
public interface CommentsRepository extends JpaRepository<CommentsEntity, Integer>{

}
