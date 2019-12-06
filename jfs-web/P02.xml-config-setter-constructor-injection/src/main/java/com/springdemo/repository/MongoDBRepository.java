package com.springdemo.repository;

import java.util.ArrayList;
import java.util.List;

import com.springdemo.model.PlanetDetails;

public class MongoDBRepository implements OdesseyRepository {

	@Override
	public List<PlanetDetails> getplanetdetails() {
		
		List<PlanetDetails> planetdetails=new ArrayList<PlanetDetails>();
		
		PlanetDetails planetDetailobj=new PlanetDetails();
		planetDetailobj.setPlanetId("P01");
		planetDetailobj.setPlanetname("Jupiter");
		planetdetails.add(planetDetailobj);
		PlanetDetails planetDetailobj1=new PlanetDetails();
		planetDetailobj1.setPlanetId("P03");
		planetDetailobj1.setPlanetname("BlueRing");
		planetdetails.add(planetDetailobj1);
		
		return planetdetails;
	}

}
