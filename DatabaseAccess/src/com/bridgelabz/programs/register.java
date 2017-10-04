package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in get!!!");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		int phno = Integer.parseInt(request.getParameter("phno"));
		//System.out.println(fname + "" + lname + "" + address + "" + phno);
		 response.setContentType("text/html");  
			PrintWriter out = response.getWriter();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("in try *********");
			String URL = "jdbc:mysql://localhost:3306/user";
			String USER = "root";
			String PASS = "root";

			Connection con = DriverManager.getConnection(URL, USER, PASS);
			String sql = "insert into registration values(?,?,?,?)";
			java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, fname);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, address);
			preparedStatement.setInt(4, phno);
			int a = preparedStatement.executeUpdate();
			System.out.println("number of updates  " + a);
			out.println("<body   text = black>");   // Dynamically created HTML form is started
		      out.println("<html><body bgcolor='cyan'><h1>welcome!!!\t" + fname +"\t"+ lname + "</h1><br></body></html>");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error!!");
		}

		System.out.println("out!!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
