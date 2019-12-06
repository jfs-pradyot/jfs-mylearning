package com.odessey.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

@Repository("odesseyrepositoryoracle")
public class OdesseyRepositoryOracle implements OdesseyRepository {

	public List<Mission> fetchMissionDetails() throws SQLException {

		// 1. Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 2. Get the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "localuser",
				"localuser");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Execute the query
		ResultSet resultset = statement.executeQuery("select * from mission");
		System.out.println("mission table");
		// 5. Display the results
		List<Mission> missionDetailList = new ArrayList<Mission>();
		while (resultset.next()) {

			Mission missionChandrayan = new Mission();

			missionChandrayan.setMissionID(resultset.getString(1));
			missionChandrayan.setMissionName(resultset.getString(2));
			missionChandrayan.setSpaceCraft(resultset.getString(3));
			missionChandrayan.setStatus(resultset.getString(4));
			missionChandrayan.setAgency(resultset.getString(5));
			missionDetailList.add(missionChandrayan);

		}

		try {
			resultset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6. Close the connection
		return missionDetailList;
	}

	@Override
	public void setMissionDetails(Mission missionDetails) throws SQLException {

		List<Mission> saveMissionDetails = new ArrayList<Mission>();
		Mission missionDetails1 = new Mission();

		missionDetails1.setMissionID("M05");
		missionDetails1.setMissionName("andromeda");
		missionDetails1.setSpaceCraft("explore");
		missionDetails1.setStatus("transit");
		missionDetails1.setAgency("USSR");
		saveMissionDetails.add(missionDetails1);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 2. Get the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "localuser",
				"localuser");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Execute the query
		int rowsAffected = statement.executeUpdate("insert into mission values('" + missionDetails1.getMissionID()
				+ "','" + missionDetails1.getMissionName() + "','" + missionDetails1.getSpaceCraft() + "','"
				+ missionDetails1.getAgency()+ "','" +  missionDetails1.getStatus() + "') ");

		// 5. Display the results
		System.out.println("Inserted : " + rowsAffected + " missionDetail(s)!");
		statement.close();
		connection.close();
		// 6. Close the connection
	}

	public List<Astronaut> fetchAstronautDetails() {
		List<Astronaut> astronautDetailList = new ArrayList<Astronaut>();
		Astronaut missionChandrayan = new Astronaut();
		missionChandrayan.setAstronautId("A05");
		missionChandrayan.setAstronautName("Rakesh");
		missionChandrayan.setAstronautGender("Male");
		missionChandrayan.setAstronautCountry("India");

		astronautDetailList.add(missionChandrayan);
		return astronautDetailList;

	}

}
