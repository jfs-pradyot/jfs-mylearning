package com.servlet.configuration;

import java.io.IOException;

import javax.jws.soap.InitParam;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/InitParamAnno",
		initParams = {@WebInitParam(name="randomNumber", value="345")})
public class InitParamAnno extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		loadInitParam();
		
		}

		public void loadInitParam() {
			//Method 1
//			System.out.println(getInitParameter("randomNumber"));
			
			//Method 2
			ServletConfig servletConfig = getServletConfig();
			System.out.println(servletConfig.getInitParameter("randomNumber"));
		}
}
