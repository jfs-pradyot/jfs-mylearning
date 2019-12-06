package com.springdemo.model;

import org.omg.CORBA.PRIVATE_MEMBER;

public class PlanetDetails {
	private String planetId;
	private String planetname;
	public String getPlanetId() {
		return planetId;
	}
	public void setPlanetId(String planetId) {
		this.planetId = planetId;
	}
	public String getPlanetname() {
		return planetname;
	}
	public void setPlanetname(String planetname) {
		this.planetname = planetname;
	}
	@Override
	public String toString() {
		return "PlanetDetails [planetId=" + planetId + ", planetname=" + planetname + "]";
	}
	
	}
	

