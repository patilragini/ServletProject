package com.bridgelabz.program;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(value="/Headers")
public class Headers extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	public Headers ()
	{
		System.out.println("servelet object created");
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("in do get");
	PrintWriter out = res.getWriter();		
	StringBuffer sb = req.getRequestURL();
	System.out.println(sb);
	String localName=req.getLocalName();
	out.println("<html><body bgcolor='cyan' text = black>" +sb+"<br>local name:"+localName+ "</body></html>");
   	out.close();
	}	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		System.out.println("in dopost");
		doGet(req,res);
		
	}
}