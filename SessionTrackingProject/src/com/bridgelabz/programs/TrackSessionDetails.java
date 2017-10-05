package com.bridgelabz.programs;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TrackSessionDetails
 */
@WebServlet("/TrackSessionDetails")
public class TrackSessionDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Create a session object if it is already not created.
		HttpSession session = request.getSession(true);

		// Get session creation time.
		Date createTime = new Date(session.getCreationTime());

		// Get last access time of this web page.
		Date lastAccessTime = new Date(session.getLastAccessedTime());

		String title = "\t\t\t\tWelcome Back to my website";
		int visitCount = 0;
		String visitCountKey = new String("visitCount");
		String userIDKey = new String("abc123");
		String userID = new String("ABCD");

		// Check if this is new comer on your web page.
		if (session.isNew()) {
			title = "\t\t\t\tWelcome to my website";
			System.out.println(title);
			session.setAttribute(userIDKey, userID);
		} else {
			System.out.println(title);
			visitCount = (Integer) session.getAttribute(visitCountKey);
			System.out.println(visitCount);
			visitCount = visitCount + 1;			
		}
		session.setAttribute(visitCountKey, visitCount);

		
		System.out.println("createTime : " + createTime + "\nlastAccess :" + lastAccessTime);
		System.out.println("visitCount:  " + visitCount);
		System.out.println("userIDKey:  " + userIDKey + "\nuserID: " + userID);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
