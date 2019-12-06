package com.creditcard.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.creditcard.model.CreditCardModel;
import com.creditcard.service.CardService;
import com.creditcard.service.CreditCardService;

@WebServlet("/CreditCardServlet")
public class CreditCardServlet {
ArrayList<CreditCardModel> cardDetailsList;

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Exception{
	
CreditCardService creditcardservice=new CardService();

try {
	cardDetailsList = creditcardservice.getCreditCardDetails();
} catch (Exception e) {
	e.printStackTrace();
}

PrintWriter printWriter=resp.getWriter();
int arrayListSize=cardDetailsList.size();
for (int i = 0; i < arrayListSize; i++) {
	CreditCardModel cardModel = cardDetailsList.get(i);
	printWriter.println("<p>" + cardModel + "</p>");
}

}
}
