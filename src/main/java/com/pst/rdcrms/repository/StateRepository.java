package com.pst.rdcrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pst.rdcrms.entity.StateEntity;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Integer>{
	
	public List<StateEntity> findStateByCountryId(int countryId);

}
