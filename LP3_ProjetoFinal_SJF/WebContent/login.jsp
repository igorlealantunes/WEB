<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <title>Login</title>
    </head>
    <body>
	    <div id="conteudo-login">
	    	
	    	<div id="topo-login">
		
				<p>Projeto LP3 - Parte 2</p>
				
			</div>
			
			<div id="form">
			<>
		        <f:view>
		            <h:form>
		                 UserID: <h:inputText value="#{loginController.login}" required="true" id="login"/>
		                <br/>Password: <h:inputSecret value="#{loginController.senha}" required="true" id="password"/>
		                <br/><h:commandButton value="Login" action="#{loginController.verificaLogin}"/>
		            </h:form>
		        </f:view>
		        
	        </div>
	        
	    </div>
    </body>
</html>