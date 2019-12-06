package com.mywebmvc.webcontrollers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mywebmvc.models.LoginModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("Name");
		String password=req.getParameter("Password");
		
		LoginModel model=new LoginModel();
		model.setName(name);
		model.setPassword(password);
		
		boolean status=model.validate();
		if(status==true){
//			PrintWriter writer=resp.getWriter();
//			writer.print("Login Successful");
			System.out.println("login successful");
			RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/login-success.jsp");
		
			rd.forward(req, resp);
		}
		else{
			System.out.println("login is not successful");
			RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/login-error.jsp");
			rd.forward(req, resp);
		}
		
	}
}
