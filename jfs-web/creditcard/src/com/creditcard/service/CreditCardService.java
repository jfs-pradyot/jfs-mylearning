package com.creditcard.service;

import java.util.ArrayList;

import com.creditcard.model.CreditCardModel;

public interface CreditCardService {
	
public int getCreditCardNumber();
public String getCreditCardHolderName();
public String getCreditCardType();
public ArrayList<CreditCardModel> getCreditCardDetails() throws Exception;


}
