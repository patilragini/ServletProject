package com.bridgelabz.programs;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

@WebServlet(value ="/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in get logout!!!");
		javax.servlet.http.Cookie[] ck = request.getCookies();
		ck[0].setMaxAge(1);  
		PrintWriter out = response.getWriter();	
		response.addCookie(ck[0]);
		out.print("you are successfully logged out!");
		
        System.out.println("you are successfully logged out!");  ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("inpost logout");		
	}

}