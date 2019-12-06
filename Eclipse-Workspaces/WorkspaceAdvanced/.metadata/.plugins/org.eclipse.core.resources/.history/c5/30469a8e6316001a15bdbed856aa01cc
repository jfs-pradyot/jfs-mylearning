package com.odessey.service;

import java.util.List;

import javax.sound.sampled.AudioInputStream;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.repository.OdesseyRepository;

public class OdesseyAstronautService implements OdesseyService {
	
	private OdesseyRepository odesseyRepository;
	
	//Constructor Based Injection
	public OdesseyAstronautService(OdesseyRepository odesseyRepository){
		this.odesseyRepository=odesseyRepository;
		
	}
	
	public List<Astronaut> getAstronautDetails(){
		return odesseyRepository.fetchAstronautDetails();
	}

	@Override
	public List<Mission> getMissionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
