package com.odessey.service;

import java.sql.SQLException;
import java.util.List;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

public interface OdesseyService {
	public List<Mission> getMissionDetails() throws SQLException;
	
	public List<Astronaut> getAstronautDetails();
	public void saveMissionDetailsService(Mission missionDetails) throws SQLException;

}
