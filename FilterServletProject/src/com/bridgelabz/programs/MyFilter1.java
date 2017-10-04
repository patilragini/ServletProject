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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class MyFilter1
 */

public class MyFilter1 implements Filter {

	/**
	 * Default constructor.
	 */
	public MyFilter1() {
		System.out.println("in myfilter1");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter1 executing...");
		//String ipAddress = request.getRemoteAddr();
		// Log the IP address
		//System.out.println("IP " + ipAddress );
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter1 initialized...");
	}

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter1 Destroyed");
	}

}
