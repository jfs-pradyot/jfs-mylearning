package com.odessey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.repository.OdesseyRepository;

@Service("odesseymissionservice")
public class OdesseyMissionService implements OdesseyService {
	@Autowired
	private OdesseyRepository odesseyRepository;
	
	
//	//setter-based injection
//	@Autowired
//	public void setOdesseyRepository(OdesseyRepository odesseyRepository) {
//		this.odesseyRepository = odesseyRepository;
//	}



	public List<Mission> getMissionDetails(){
		return odesseyRepository.fetchMissionDetails();
	}



	@Override
	public List<Astronaut> getAstronautDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
