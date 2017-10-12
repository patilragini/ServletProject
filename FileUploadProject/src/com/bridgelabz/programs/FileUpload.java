/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   3-10-2017
 *@purpose this servlet is taking file and storing in databse
 ******************************************************************************/
package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet(value="/FileUpload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;      
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 		          
		MultipartRequest multiPart=new MultipartRequest(request,"/home/bridgeit/Pictures/Wallpapers");  
		out.print("successfully uploaded!!!"+multiPart);  

	}

}
