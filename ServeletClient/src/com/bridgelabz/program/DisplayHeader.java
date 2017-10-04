package com.bridgelabz.program;
import javax.servlet.*;
import javax.servlet.http.* ;
import java.io.* ;
import java.util.*;
public class DisplayHeader extends HttpServlet   
{
  public void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException  
  {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    
    Enumeration e = req.getHeaderNames();       // gets all headers information
 
    out.println("<H3>Following are the Headers coming from the Client<BR></H3>");
 
    out.println("<table border=2 bordercolor=blue>");
 
    out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");
 
    while(e.hasMoreElements())
    {
      String name = (String) e.nextElement();
      String value = req.getHeader(name);       // gets each header information separately
      out.println("<tr><th>"+name + "</th><th>" + value + "</th></tr>");
    }
    out.println("</table>");			
    out.close();
  }
}