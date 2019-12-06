package com.servlet.configuration;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ServletConfiguration"
,value="/ServletConfiguration")
public class ServletConfigurationXML extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	loadInitParam();
	loadContextParam();
	}

	public void loadInitParam() {
		//Method 1
//		System.out.println(getInitParameter("randomNumber"));
		
		//Method 2
		ServletConfig servletConfig = getServletConfig();
		System.out.println(servletConfig.getInitParameter("randomNumber"));
	}
	
	public void loadContextParam()
	{
		ServletContext servletContext=getServletContext(); 
		System.out.print(servletContext.getInitParameter("message"));
	}
}
