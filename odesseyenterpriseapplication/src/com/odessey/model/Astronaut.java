package com.odessey.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

@Entity
public class Astronaut {
	@Id
	private String astronautId;
	@Column
	private String astronautName;
	@Column
	private String astronautGender;
	@Column
	private String astronautCountry;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List <AstronautMissions> astronautMissions=new ArrayList<AstronautMissions>(); 
	
	
	
	public List<AstronautMissions> getAstronautMissions() {
		return astronautMissions;
	}
	public void setAstronautMissions(List<AstronautMissions> astronautMissions) {
		this.astronautMissions = astronautMissions;
	}
	public String getAstronautId() {
		return astronautId;
	}
	public void setAstronautId(String astronautId) {
		this.astronautId = astronautId;
	}
	@Override
	public String toString() {
		return "Astronaut [astronautId=" + astronautId + ", astronautName=" + astronautName + ", astronautGender="
				+ astronautGender + ", astronautCountry=" + astronautCountry + "]";
	}
	public String getAstronautName() {
		return astronautName;
	}
	public void setAstronautName(String astronautName) {
		this.astronautName = astronautName;
	}
	public String getAstronautGender() {
		return astronautGender;
	}
	public void setAstronautGender(String astronautGender) {
		this.astronautGender = astronautGender;
	}
	public String getAstronautCountry() {
		return astronautCountry;
	}
	public void setAstronautCountry(String astronautCountry) {
		this.astronautCountry = astronautCountry;
	}
	
	
}
