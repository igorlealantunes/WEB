<%@page import="lp3.model.Usuario"%>
<%@page import="lp3.controller.UsuarioController"%>
<%@page import="java.util.List"%> 
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>


<% UsuarioController bean = (UsuarioController) getServletContext().getAttribute("usuarioController"); %>
<% if (bean == null)  { %>
<%	bean = new UsuarioController(); %> 
<%	getServletContext().setAttribute("usuarioController", bean); %>
<%  } %>
<% List<Usuario> lista = bean.getListUsuarios(); %>

[

<% for(Usuario u: lista ) { %>

	{

	"nome" : "<%= u.getNome()  %>",
	"sexo" : "<%= u.getSexo()  %>",
	"nacionalidade" : "<%= u.getNacionalidade()  %>"
	
	}
	
	<%if ((lista.indexOf(u) + 1) != lista.size()) { %>
		,
			
	<%} %>
	
<% } %>

]
