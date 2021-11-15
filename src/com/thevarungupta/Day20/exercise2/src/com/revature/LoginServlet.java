package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("navbar.html").include(request, response);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// when user enter correct details
		if(username.equals("admin") && password.equals("123")) {
			out.println("You are successully logged In");
			out.println("<br>Welcome "+ username);
			
			Cookie cookie = new Cookie("username", username);
			response.addCookie(cookie);
		}else {
			out.println("Sorry! invalid details");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		out.close();
	}
	
}
