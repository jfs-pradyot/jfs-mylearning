package com.odessey.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.repository.OdesseyRepository;

@Service("odesseymissionservice")
public class OdesseyMissionService implements OdesseyService {
	@Autowired
	private OdesseyRepository odesseyRepository;
	
	@Transactional
	public List<Mission> getMissionDetails(){
		return odesseyRepository.fetchMissionDetails();
	}



//	@Override
//	public List<Astronaut> getAstronautDetails() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
////	@Override
////	public void updateMissionDetails(Mission missionDetails) {
////		 odesseyRepository.updateMissionDetails(missionDetails);
////		
////	}
////
////
//
//	@Override
//	public void updateAstronautDetails(Astronaut astronautDetails) {
//		
//		
//	}
//	
	
	
	
	
	
	
}
