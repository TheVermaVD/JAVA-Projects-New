package com.rowdy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomePrakash extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String input=req.getParameter("username");
		PrintWriter out=resp.getWriter();
		
//		resp.setContentType("text/html");
		out.print("Welcome "+input);
		out.print("<h1> Welcome "+input+"</h1>");
	}

}
