package com.odessey.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.service.OdesseyService;

public class Application {

	
	private static Mission missionDetails;
	private  static void viewMissionDetails() throws SQLException{
		
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService=(OdesseyService)applicationcontext.getBean("odesseymissionservice");
		System.out.println("Viewing Missions of Odessey");
		List<Mission> viewMissionList=new ArrayList<Mission>();
		viewMissionList=odesseyService.getMissionDetails();
		
		//Displaying the records
		
		viewMissionList.forEach(System.out::println);
		
	}
	
	private  static void viewAstronautDetails(){
		System.out.println("Viewing Missions of Astronauts");
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService=(OdesseyService)applicationcontext.getBean("odesseyastronautservice");
		
		List<Astronaut> viewAstronautList=new ArrayList<Astronaut>();
		viewAstronautList=odesseyService.getAstronautDetails();
		
		//Displaying the records
		
		viewAstronautList.forEach(System.out::println);
		
	}
	
	private static void saveMissionDetails() throws SQLException{
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService=(OdesseyService)applicationcontext.getBean("odesseymissionservice");
	odesseyService.saveMissionDetailsService(missionDetails);
	}
	
	public static void main(String[] args) throws SQLException {
		saveMissionDetails();
//		viewMissionDetails();
//		viewAstronautDetails();
	}
}
