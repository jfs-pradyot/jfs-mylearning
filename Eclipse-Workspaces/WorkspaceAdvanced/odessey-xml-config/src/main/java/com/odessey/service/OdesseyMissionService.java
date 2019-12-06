package com.odessey.service;

import java.util.List;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.repository.OdesseyRepository;


public class OdesseyMissionService implements OdesseyService {
	private OdesseyRepository odesseyRepository;
	
	
	//setter-based injection
	public void setOdesseyRepository(OdesseyRepository odesseyRepository) {
		this.odesseyRepository = odesseyRepository;
	}



	public List<Mission> getMissionDetails(){
		return odesseyRepository.fetchMissionDetails();
	}



	@Override
	public List<Astronaut> getAstronautDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
