package lp3.controller;
import java.io.IOException;
import java.util.Collections;

import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class LogFilter implements Filter {
 
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
 
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session =  request.getSession(false);
        
        List<String> sd = Collections.list(request.getAttributeNames());
        if(sd.size() == 0) {
        	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		    rd.forward(request, res);
		    
        }
        
        
        if(session.getAttribute("loginController") != null) {	
    	  	LoginController c = (LoginController) session.getAttribute("loginController");
    		System.out.println(c.getLogin() + "  " +c.getSenha());
    	  if ( !c.hasSession() )
    	  {
    		  
    		  List<String> s = Collections.list(session.getAttributeNames());
    			System.out.println(s.size());
    		  	for(String st : s) {
    				System.out.println(s);
    		  }
    		  	
    		    session.invalidate();
    		    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
    		    rd.forward(request, res);
    		    
    				
    	  } else {
    		  
    		  List<String> s = Collections.list(session.getAttributeNames());
    			System.out.println(s.size());
    		  	for(String st : s) {
    				System.out.println(s);
    		  }
    	  }
    	} else {
    			session.invalidate();
    		    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
    		    rd.forward(request, res);
    		    
    	}
         
        chain.doFilter(req, res);
    }
    public void init(FilterConfig config) throws ServletException {
         
        //Get init parameter
        String testParam = config.getInitParameter("test-param");
         
        //Print the init parameter
        System.out.println("Test Param: " + testParam);
    }
    public void destroy() {
        //add code to release any resource
    }
}