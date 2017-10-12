/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   2-10-2017
 *@purpose accept data from user and display url
 ******************************************************************************/
package com.bridgelabz.program;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

//@WebServlet(value="/Headers")
public class Headers extends HttpServlet {
	/**
	*/
	private static final long serialVersionUID = 1L;

	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do get");
		PrintWriter out = response.getWriter();
		StringBuffer stringBuffer = request.getRequestURL();
		System.out.println("Header: "+stringBuffer);
		String localName = request.getLocalName();
		out.println("<html><body bgcolor='cyan' text = black>" + stringBuffer + "<br>local name:" + localName + "</body></html>");
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do post");
		PrintWriter out = response.getWriter();
		StringBuffer stringBuffer = request.getRequestURL();
		System.out.println(stringBuffer);
		String localName = request.getLocalName();
		out.println("<html><body bgcolor='cyan' text = black>" + stringBuffer + "<br>local name:" + localName + "</body></html>");
		out.close();
	}
}