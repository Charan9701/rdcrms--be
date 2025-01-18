package com.pst.rdcrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pst.rdcrms.entity.CountryEntity;
import com.pst.rdcrms.entity.DistrictEntity;
import com.pst.rdcrms.entity.MandalEntity;
import com.pst.rdcrms.entity.StateEntity;
import com.pst.rdcrms.entity.VillageEntity;
import com.pst.rdcrms.service.RevenueService;

@RestController
@RequestMapping("/api/revenue")
@CrossOrigin(origins = "*")
public class RevenueController {
	
	@Autowired
	RevenueService revenueService;

	/**
	 * It returns all countries in the dataBase
	 **/
	@GetMapping("/countries")
	public List<CountryEntity> getCountries() {
		return revenueService.getAllCountries();
	}

	/**
	 * It returns all states in the dataBase
	 **/
	@GetMapping("/states")
	public List<StateEntity> getStates() {
		return revenueService.getAllStates();
	}
    
	/**
	 * It returns all states by the countryId in the dataBase
	 **/
	@GetMapping("/states/{countryId}")
    public List<StateEntity> getStateByCountryId(@PathVariable int countryId){
		return revenueService.getStatesInfoByCountryId(countryId);
	}
	/**
	 * It returns all districts in the dataBase
	 **/
	@GetMapping("/districts")
	public List<DistrictEntity> getDistricts() {
		return revenueService.getAllDistricts();
	}

	/**
	 * It returns all districts by the stateId in the dataBase
	 **/
	@GetMapping("/districts/{stateId}")
	public List<DistrictEntity> getDistrictsByStateId(@PathVariable int stateId) {
		return revenueService.getDistictsInfoByStateId(stateId);
	}

	/**
	 * It returns all mandals in the dataBase
	 **/
	@GetMapping("/mandals")
	public List<MandalEntity> getMandals() {
		return revenueService.getAllMandals();
	}

	/**
	 * It returns all mandals by the districtId in the dataBase
	 **/
	@GetMapping("/mandals/{districtId}")
	public List<MandalEntity> getMandalsByDistrictId(@PathVariable int districtId) {
		return revenueService.getMandalsInfoByDistrictId(districtId);
	}

	/**
	 * It returns all villages in the dataBase
	 **/
	@GetMapping("/villages")
	public List<VillageEntity> getVillages() {
		return revenueService.getAllVillages();
	}

	/**
	 * It returns all villages by the mandalId in the dataBase
	 **/
	@GetMapping("/villages/{mandalId}")
	public List<VillageEntity> getVillagesByMandalId(@PathVariable int mandalId) {
		return revenueService.getVillagesInfoByMandalId(mandalId);
	}

}
