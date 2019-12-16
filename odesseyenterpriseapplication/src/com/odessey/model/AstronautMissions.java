package com.odessey.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AstronautMissions {
	@Column
	
	private String firstMission;
	@Column
	private String latestMission;
	@Column
	private String nextMission;
	@Column
	private String nextMissionDate;

	public String getFirstMission() {
		return firstMission;
	}

	public void setFirtsMission(String firstMission) {
		this.firstMission = firstMission;
	}

	public String getLatestMission() {
		return latestMission;
	}

	public void setLatestMission(String latestMission) {
		this.latestMission = latestMission;
	}

	public String getNextMission() {
		return nextMission;
	}

	public void setNextMission(String nextMission) {
		this.nextMission = nextMission;
	}

	public String getNextMissionDate() {
		return nextMissionDate;
	}

	public void setNextMissionDate(String nextMissionDate) {
		this.nextMissionDate = nextMissionDate;
	}

	@Override
	public String toString() {
		return "AstronautMissions [firstMission=" + firstMission
				+ ", latestMission=" + latestMission + ", nextMission=" + nextMission + ", nextMissionDate="
				+ nextMissionDate + "]";
	}

}
