package com.rowdy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTwoNumber extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		
		{
		
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		
		int c=a+b;
		
		PrintWriter out=resp.getWriter();
		out.print("Addition Is= "+c);
			
		}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	
	{
	
	int a=Integer.parseInt(req.getParameter("n1"));
	int b=Integer.parseInt(req.getParameter("n2"));
	
	int c=a+b;
	
	PrintWriter out=resp.getWriter();
	out.print("Addition Is= "+c);
		
	}
}
