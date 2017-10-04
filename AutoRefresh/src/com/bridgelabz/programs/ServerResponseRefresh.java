package com.bridgelabz.programs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
 
@WebServlet(value="/ServerResponseRefresh")
public class ServerResponseRefresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   // Method to handle GET method request.
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	   System.out.println("in do****************get");
   
      // Set refresh, autoload time as 1 seconds
      response.setIntHeader("Refresh", 1);
 
      // Set response content type
      response.setContentType("text/html");
 
      // Get current time
      Calendar calendar = new GregorianCalendar();
      String am_pm;
      int hour = calendar.get(Calendar.HOUR);
      int minute = calendar.get(Calendar.MINUTE);
      int second = calendar.get(Calendar.SECOND);
         
      if(calendar.get(Calendar.AM_PM) == 0)
         am_pm = "AM";
      else
         am_pm = "PM";
 
      String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
    
      PrintWriter out = response.getWriter();
      String title = "Auto Refresh ";
      
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

      out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n"+
         "<body bgcolor = \"blue\">\n" +
         "<h1 align = \"center\">" + title + "</h1>\n" +
         "<p>Current Time is: " + CT + "</p>\n"
      );
   }
   
   // Method to handle POST method request.
  /* public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      doGet(request, response);
      
   }*/
}