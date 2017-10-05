<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
1.
<%
//date is variable
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
%>
Hello! <br><%= date %>
<br>2.
<%
    out.println("<br>date=="+date );
    out.println( "<BR>Your machine's address is " );
    out.println( request.getRemoteHost());
%>
<br>
3.
<TABLE BORDER=2>
<%
    for ( int i = 0; i < 5; i++ ) {
        %>        
        <!-- html display part -->
        <TR>
        <TD>Number</TD>
        <TD><%= i+1 %></TD>
        </TR>
        <%
    }
%>
</TABLE>
<br>
4.
<%!
    Date theDate = new Date();
    Date getDate()
    {
        System.out.println( "In getDate() method 2" );
        return theDate;
    }
%>
<br>
Hello!  The time is now <%= getDate() %>
</body>
</html>