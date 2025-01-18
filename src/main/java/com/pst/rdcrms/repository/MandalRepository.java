package com.pst.rdcrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pst.rdcrms.entity.MandalEntity;

@Repository
public interface MandalRepository extends JpaRepository<MandalEntity, Integer>{

	public List<MandalEntity> findMandalsByDistrictId(int districtId);
}
