package com.Premium.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Premium.entity.FilesEntity;

@Repository
public interface FilesRepository extends JpaRepository<FilesEntity, Integer>{

}
