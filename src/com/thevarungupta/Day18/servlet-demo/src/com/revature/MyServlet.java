package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class MyServlet implements Servlet {

	ServletConfig config = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Servlet is initialized");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service called....");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html></body>");
		pw.print("<h1>Welcome to servlet </h1>");
		pw.print("</body></html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
		
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "Servlet created by admin";
	}


}
