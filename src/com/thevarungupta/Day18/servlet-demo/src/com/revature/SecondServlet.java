package com.revature;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service called...");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html></body>");
		pw.print("<h1>Welcome to servlet - second</h1>");
		pw.print("</body></html>");
	}

}
