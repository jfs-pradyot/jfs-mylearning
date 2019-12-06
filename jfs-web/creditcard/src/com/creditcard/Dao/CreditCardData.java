package com.creditcard.Dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.creditcard.model.CreditCardModel;

public interface CreditCardData {
	
	public int fetchCreditCardNumber();
	public String fetchCreditCardHolderName();
	public String fetchCreditCardType();
	public ArrayList<CreditCardModel> fetchCreditCardDetails() throws  Exception;

}
