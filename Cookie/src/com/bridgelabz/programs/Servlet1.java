/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1-10-2017
 *@purpose  accept name from user put in cookie and display on view cookie  
 ******************************************************************************/
package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(value = "/Servlet1")
public class Servlet1 extends HttpServlet {
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

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String name = request.getParameter("userName");
			out.print("Welcome " + name);

			Cookie cookie = new Cookie("uname", name);// creating cookie object
			System.out.println("servelet1 " + cookie.getValue());
			response.addCookie(cookie);// adding cookie in the response

			// creating submit button
			// out.print("<form action="+"Servlet2"+"method="+"post"+">");
			out.print("<form action='Servlet2' method='post'>");
			out.print("<input type='submit' value='view cookie details'>");
			out.print("</form>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		// System.out.println("out servlet1 !!!");
	}

}
