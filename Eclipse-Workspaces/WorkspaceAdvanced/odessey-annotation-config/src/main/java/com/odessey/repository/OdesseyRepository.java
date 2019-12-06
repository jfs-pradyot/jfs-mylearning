package com.odessey.repository;

import java.util.List;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

public interface OdesseyRepository {
	public List<Mission> fetchMissionDetails();
	public List<Astronaut> fetchAstronautDetails();
}
