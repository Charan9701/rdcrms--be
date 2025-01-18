package com.pst.rdcrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pst.rdcrms.entity.CountryEntity;
import com.pst.rdcrms.entity.DistrictEntity;
import com.pst.rdcrms.entity.MandalEntity;
import com.pst.rdcrms.entity.StateEntity;
import com.pst.rdcrms.entity.VillageEntity;
import com.pst.rdcrms.repository.CountryRepository;
import com.pst.rdcrms.repository.DistrictRepository;
import com.pst.rdcrms.repository.MandalRepository;
import com.pst.rdcrms.repository.StateRepository;
import com.pst.rdcrms.repository.VillageRepository;

@Service
public class RevenueService {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	StateRepository stateRepository;

	@Autowired
	DistrictRepository districtRepository;

	@Autowired
	MandalRepository mandalRepository;

	@Autowired
	VillageRepository villageRepository;

	public List<CountryEntity> getAllCountries() {
		return countryRepository.findAll();
	}

	public List<StateEntity> getAllStates() {
		return stateRepository.findAll();
	}

	public List<StateEntity> getStatesInfoByCountryId(int countryId){
		return stateRepository.findStateByCountryId(countryId);
	}

	public List<DistrictEntity> getAllDistricts() {
		return districtRepository.findAll();
	}

	public List<DistrictEntity> getDistictsInfoByStateId(int stateId) {
		return districtRepository.findDistrictByStateId(stateId);
	}

	public List<MandalEntity> getAllMandals() {
		return mandalRepository.findAll();
	}

	public List<MandalEntity> getMandalsInfoByDistrictId(int districtId) {
		return mandalRepository.findMandalsByDistrictId(districtId);
	}

	public List<VillageEntity> getAllVillages() {
		return villageRepository.findAll();
	}

	public List<VillageEntity> getVillagesInfoByMandalId(int mandalId) {
		return villageRepository.findVillageByMandalId(mandalId);
	}
}
