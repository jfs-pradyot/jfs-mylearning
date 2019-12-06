package com.springdemo.service;

import java.util.List;

import com.springdemo.model.PlanetDetails;
import com.springdemo.repository.MongoDBRepository;
import com.springdemo.repository.OdesseyRepository;

public class OdesseyServiceImp implements OdesseyService {
	private OdesseyRepository odesseyRepository=new MongoDBRepository();
	@Override
	public List<PlanetDetails> getPlanetDetailsService() {
		
		//getplanetdetails() mthod returns a list, so we can directly 
		// return List.
		return odesseyRepository.getplanetdetails();
	}

}
