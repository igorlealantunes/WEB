package lp3.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerificaSession {

	public static void verify(HttpServletRequest request, 
			HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		
		List<String> s = Collections.list( session.getAttributeNames() );
	      
		if(session.getAttribute("loginController") != null) {	
		  	LoginController c = (LoginController) session.getAttribute("loginController");
			
		  if ( !c.hasSession() )
		  {
			  
			    session.invalidate();
			    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			    rd.forward(request, response);
			    return;
					
		} 
		} else {
				session.invalidate();
			    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			    rd.forward(request, response);
			    return;
		}
	}
}
