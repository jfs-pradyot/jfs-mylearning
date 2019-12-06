package com.creditcard.service;

import java.util.ArrayList;

import com.creditcard.Dao.CreditCardData;
import com.creditcard.Dao.CreditCardDetails;
import com.creditcard.model.CreditCardModel;

public class CardService implements CreditCardService {

	@Override
	public int getCreditCardNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCreditCardHolderName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCreditCardType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CreditCardModel> getCreditCardDetails() throws Exception {
		CreditCardData creditCardData=new CreditCardDetails();
		
		return creditCardData.fetchCreditCardDetails();
	}

}
