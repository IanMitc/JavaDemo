package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		out.println("Welcome "+ name);
		
		// creating a form that have invisible text field
		out.println("<form action='Servlet2' method='get' >");
		out.println("<input type='hidden' name='uname' value='"+name+"' />");
		out.println("<input type='Submit' value='send' />");
		out.println("</form>");
	}

}
