package com.bridgelabz.program;

import java.io.*;
import java.text.SimpleDateFormat;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Locale;
import java.util.Date;

@WebServlet(value = "/getDetails")
public class getDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// how to change to india???
		java.util.Locale locale = request.getLocale();
		String language = locale.getLanguage();
		String country = locale.getCountry();
		Date date = new Date();
		System.out.println(
				"local:  " + locale + "\nlanguage: " + language + "\ncountry:  " + country + "\n");
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("" + ft.format(date));
	}
}