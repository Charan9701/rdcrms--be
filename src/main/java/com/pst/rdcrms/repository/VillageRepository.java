package com.pst.rdcrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pst.rdcrms.entity.VillageEntity;

@Repository
public interface VillageRepository extends JpaRepository<VillageEntity, Integer> {
	
	public List<VillageEntity> findVillageByMandalId(int mandalId);

}
