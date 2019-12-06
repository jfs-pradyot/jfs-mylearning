package com.springdemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springdemo.model.PlanetDetails;
@Repository("oraclerepository")
public class OracleRepository implements OdesseyRepository {
public List<PlanetDetails> getplanetdetails() {
		
		List<PlanetDetails> planetdetails=new ArrayList<PlanetDetails>();
		
		PlanetDetails planetDetailobj=new PlanetDetails();
		planetDetailobj.setPlanetId("P01");
		planetDetailobj.setPlanetname("Saturn");
		planetdetails.add(planetDetailobj);
		
		return planetdetails;
	}

}
