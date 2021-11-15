package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet State Management - Cookies</title>");		
		out.println("</head>");
		out.println("<body>");
		
		// get cookies
		Cookie[] cookies = request.getCookies();
		boolean flag = false;
		String name  ="";
		if(cookies == null) {
			out.println("<h1>you are a new user go to home page and submit your name</h1>");
			return;
		}else {
			for(Cookie c: cookies) {
				String tname = c.getName();
				if(tname.equals("user_name")) {
					flag = true;
					name = c.getValue();
				}
			}			
		}
		
		if(flag) {
			out.println("<h1>Hello "+name+", Welcome back to my web site</h1>");
		}
		
		out.println("</body>");
		out.println("</html>");
		
	}

}
