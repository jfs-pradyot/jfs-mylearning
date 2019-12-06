package com.odessey.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
//@Repository("odesseyrepositorymysql")
public class OdesseyRepositoryMySql implements OdesseyRepository {
	public List<Mission> fetchMissionDetails(){
		return null;
		
	}
	
	
	public List<Astronaut> fetchAstronautDetails(){
		return null;
		
	}


	@Override
	public void setMissionDetails(Mission missionDetails) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
