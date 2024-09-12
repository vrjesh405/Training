package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/annotation")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("This is init method");
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Request
		String var1 = request.getParameter("var1");
		String var2 = request.getParameter("var2");
		String var3 = request.getParameter("var3");
		
		response.setContentType("text/html");
		
		//Response
		response.getWriter().append("Welcome "+var1+" "+var2+"!<br>").append("First name: "+var1+"<br>").append(" Last name: "+var2+"<br>").append(" Age: "+var3).close();
	}

	@Override
	public void destroy() {
		System.out.print("Ending");
	}
}
