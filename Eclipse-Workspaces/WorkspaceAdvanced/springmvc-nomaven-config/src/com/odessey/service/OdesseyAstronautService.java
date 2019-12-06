package com.odessey.service;

import java.util.List;

import javax.sound.sampled.AudioInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.repository.OdesseyRepository;
@Service("odesseyastronautservice")
public class OdesseyAstronautService implements OdesseyService {
	
	@Autowired
	private OdesseyRepository odesseyRepository;
	
//	Constructor Based Injection
//	@Autowired
//	public OdesseyAstronautService(OdesseyRepository odesseyRepository){
//		this.odesseyRepository=odesseyRepository;
//		
//	}
	
	public List<Astronaut> getAstronautDetails(){
		return odesseyRepository.fetchAstronautDetails();
	}

	@Override
	public List<Mission> getMissionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
