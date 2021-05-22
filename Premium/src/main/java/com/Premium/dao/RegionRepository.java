package com.Premium.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Premium.entity.RegionEntity;

@Repository
public interface RegionRepository extends JpaRepository<RegionEntity, Integer>{

}
