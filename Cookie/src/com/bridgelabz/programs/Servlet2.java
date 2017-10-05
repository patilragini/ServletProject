package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet(value = "/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			System.out.println("in servlet 2 !!!");
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();		
			Cookie[] ck = request.getCookies();
			response.addCookie(ck[0]);

			out.print("<h1>Hello<h1> " + "<h2> cookie value = " + ck[0].getValue() + "</h2>");
			out.print("<h2> cookie name = " + ck[0].getName() + "</h2>");		
			out.print("<form action='logout' method='get'>");
			out.print("<input type='submit' value='logout'>");
			out.print("</form>");
		

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}