package com.pst.rdcrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pst.rdcrms.entity.DistrictEntity;

@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Integer>{

	public List<DistrictEntity> findDistrictByStateId(int stateId);
}
