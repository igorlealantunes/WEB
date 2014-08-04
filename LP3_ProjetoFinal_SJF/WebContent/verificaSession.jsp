<%@page import="lp3.controller.LoginController"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
	
	<%
	
	List<String> s = Collections.list(session.getAttributeNames());
      
	if(session.getAttribute("loginController") != null) {	
	  	LoginController c = (LoginController) session.getAttribute("loginController");
		System.out.println(c.getLogin() + "  " +c.getSenha());
	  if ( !c.hasSession() )
	  {
		  
		  
			System.out.println(s.size());
		  	for(String st : s) {
				System.out.println(s);
		  }
		  	
		    session.invalidate();
		    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
		    rd.forward(request, response);
		    return;
				
	  } else {
		  
			System.out.println(s.size());
		  	for(String st : s) {
				System.out.println(s);
		  }
	  }
	} else {
			session.invalidate();
		    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
		    rd.forward(request, response);
		    return;
	}
	%>
</f:view>
</body>
</html>