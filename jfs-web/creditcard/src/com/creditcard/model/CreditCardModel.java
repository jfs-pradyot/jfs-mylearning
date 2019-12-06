package com.creditcard.model;

import java.util.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

public class CreditCardModel {
	
	public CreditCardModel(int cardNumber, String cardHolderName, String cardType
			) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		
	}
	private int cardNumber;
	private String cardHolderName;
	private String cardType;

	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CreditCardModel [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", cardType="
				+ cardType + "]";
	}
	
	

}
