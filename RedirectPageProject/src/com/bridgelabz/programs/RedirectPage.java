package com.bridgelabz.programs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/RedirectPage")
public class RedirectPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// other method to redirect
		// System.out.println("in get");
		// String site = "https://www.w3schools.com";
		// response.setHeader("Location", site);
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// System.out.println("redirected site" + site);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String site = "https://www.w3schools.com";
		response.sendRedirect(site);
		System.out.println("inpost!!!");
	}
}