<%@page import="lp3.controller.VerificaSession"%>
<%@page import="lp3.model.Funcionario"%>
<%@page import="lp3.controller.FuncionarioController"%>
<%@page import="java.util.List"%> 
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<% 

VerificaSession.verify(request, response, session);

%>


<% FuncionarioController bean = (FuncionarioController) getServletContext().getAttribute("funcionarioController"); %>
<% if(bean == null) { %>
<% bean = new FuncionarioController(); %>
<% getServletContext().setAttribute("funcionarioController", bean); %>
<% } %>

<% List<Funcionario> lista = bean.getListFuncionarios(); %>

[

<% for(Funcionario f: lista ) { %>

	{

	"nome" : "<%= f.getNome()  %>",
	"funcao" : "<%= f.getFuncao()  %>",
	"salario" : "<%= f.getSalario() %>"
	
	}
	
	<% if ((lista.indexOf(f) + 1) != lista.size()) {%>
	,
	<%} %>
	
<% } %>
	
]