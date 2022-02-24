package com.rowdy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class ValidatingLogin extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();

		String name = req.getParameter("uname");
		String password = req.getParameter("upass");

		if (password.equals("Rowdy123")) {

			out.print("<h1>Login Succcesfully</h1>");
			out.print("<h2>Welcome " + name + "</h2>");

			out.print("<a href='http://localhost:8081/ServletsProgram/ValidatingLogin.html'>Logout</a>");
		} else {
			out.print("<b>Invalid Login, Try Again</b>");
		}

	}

}
