package com.myservletproject.sessionmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RespectBinding;

@WebServlet(name="SessionExampleServlet", 
value="/path",
initParams={@WebInitParam(name="welcomemessage",value="Hi, How are you today")})
public class ServletsSession extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		PrintWriter writer=resp.getWriter();
		writer.print("<h1>Hello, User</h1>");
		
		
		
		HttpSession session=req.getSession();
		Object productinCart=session.getAttribute("Products");
		System.out.println(productinCart);
		if(productinCart==null){
			session.setAttribute("Products", 1);
	System.out.println("Products in cart"+session.getAttribute("Products"));
		}
			else {
				Integer count=(Integer)session.getAttribute("Products")+1;
				session.setAttribute("Products", count);
				System.out.println("Products"+count);
			}
		}	
	}

