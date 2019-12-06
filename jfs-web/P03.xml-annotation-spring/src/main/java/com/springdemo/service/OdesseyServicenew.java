package com.springdemo.service;

import java.util.List;

import com.springdemo.model.PlanetDetails;
import com.springdemo.repository.OdesseyRepository;

public class OdesseyServicenew implements OdesseyService {
	private OdesseyRepository odesseyRepository=null;
	public OdesseyServicenew(OdesseyRepository odesseyRepository){
		this.odesseyRepository= odesseyRepository;
	}
	
	
	@Override
	public List<PlanetDetails> getPlanetDetailsService() {
		
		//getplanetdetails() mthod returns a list, so we can directly 
		// return List.
		return odesseyRepository.getplanetdetails();
	}

}
