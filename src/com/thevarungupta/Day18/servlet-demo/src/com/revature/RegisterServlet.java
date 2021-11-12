package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to Register Servlet<h1>");
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		
		out.println("Hello "+ name+ ", my email is "+ email);
	}

}
