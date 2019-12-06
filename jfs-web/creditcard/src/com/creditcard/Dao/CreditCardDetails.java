package com.creditcard.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.creditcard.model.CreditCardModel;


public class CreditCardDetails implements CreditCardData{

	@Override
	public int fetchCreditCardNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String fetchCreditCardHolderName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fetchCreditCardType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CreditCardModel> fetchCreditCardDetails() throws Exception {
		//1. Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//	2. Get the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsdb","root","mysql");
		//		3. Create the query
		Statement statement = connection.createStatement();
		//		4. Execute the query
		java.sql.ResultSet resultset = statement.executeQuery("select * from employee");
		//		5. Display the results
		ArrayList<CreditCardModel> creditCardModels = new ArrayList<CreditCardModel>();
		while(resultset.next()) {
			creditCardModels.add(new CreditCardModel(resultset.getInt(1), resultset.getString(2), resultset.getString(3)));
		}
		resultset.close();
		statement.close();
		connection.close();
//		6. Close the connection
		return creditCardModels;
	}

}
