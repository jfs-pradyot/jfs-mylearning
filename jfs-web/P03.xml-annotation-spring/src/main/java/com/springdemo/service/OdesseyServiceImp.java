package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.model.PlanetDetails;
import com.springdemo.repository.OdesseyRepository;
@Service("serviceImp")
public class OdesseyServiceImp implements OdesseyService {
//	private OdesseyRepository odesseyRepository=new MongoDBRepository();
	
	//check which class has implemented it and if it is a component inject it
	
	@Autowired
	private OdesseyRepository odesseyRepository;
	
	
//	public void setOdesseyRepository(OdesseyRepository odesseyRepository) {
//		this.odesseyRepository = odesseyRepository;
//	}


	@Override
	public List<PlanetDetails> getPlanetDetailsService() {
		
		//getplanetdetails() mthod returns a list, so we can directly 
		// return List.
		return odesseyRepository.getplanetdetails();
	}

}
