/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   3-10-2017
 *@purpose RedirectPage servlet is used to redirect to given location whrn  
 *			request is recived
 ******************************************************************************/
package com.bridgelabz.programs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(value = "/RedirectPage")
public class RedirectPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String site = "https://www.w3schools.com";
		response.sendRedirect(site);
		System.out.println("inpost!!!");
	}
}