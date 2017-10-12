/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1-10-2017
 *@purpose simple my filter program
 ******************************************************************************/
package com.bridgelabz.programs;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter(value="/MyFilter" )
public class MyFilter implements Filter {

    	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("filter destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	      System.out.println("do filter!!! by annotations " );  
	         
	       chain.doFilter(request,response); 
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter initilized");
	}

}
