package com.odessey.repository;

import java.sql.SQLException;
import java.util.List;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

public interface OdesseyRepository {
	public List<Mission> fetchMissionDetails()throws SQLException;
	public List<Astronaut> fetchAstronautDetails();
//	public void setMissionDetails(Object obj) throws SQLException;
	void setMissionDetails(Mission missionDetails) throws SQLException;
}
