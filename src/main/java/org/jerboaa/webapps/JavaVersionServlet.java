package org.jerboaa.webapps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JavaVersionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8517705203336165992L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<title>Java Version Servlet</title>");
		pw.println("<body>");
		pw.println("<p>");
		pw.println("Hi, Java Servlet World!");
		pw.println("</p>");
		pw.println("<p>");
		pw.println("You are using:");
		pw.println("</p>");
		pw.println("<pre>");
		pw.println(String.format("  java version \"%s\"", System.getProperty("java.version")));
		pw.println(String.format("  %s", System.getProperty("java.runtime.name")));
		pw.println(String.format("  %s (build %s, %s)", System.getProperty("java.vm.name"),
				                     System.getProperty("java.vm.version"), 
				                     System.getProperty("java.vm.info")));
		pw.println("  java home: " + System.getProperty("java.home"));
		pw.println("</pre>");	
		pw.println("</body>");
		pw.println("</html>");
	}

}
