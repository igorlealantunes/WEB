<%@page import="lp3.controller.VerificaSession"%>
<%@page import="lp3.model.Veiculo"%>
<%@page import="lp3.controller.VeiculoController"%>
<%@page import="java.util.List"%> 
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>


<% 

VerificaSession.verify(request, response, session);

%>

<% VeiculoController bean = (VeiculoController) getServletContext().getAttribute("veiculoController"); %>
<% if(bean == null) { %>
<% bean = new VeiculoController(); %>
<% getServletContext().setAttribute("veiculoController", bean); %>
<% } %>

<% List<Veiculo> lista = bean.getListVeiculos(); %>

[

<% for(Veiculo v: lista ) { %>

	{

	"placa" : "<%= v.getPlaca()  %>",
	"modelo" : "<%= v.getModelo()  %>",
	"marca" : "<%= v.getMarca() %>",
	"ano" : "<%= v.getAno() %>",
	"tipo" : "<%= v.getTipo() %>"
	
	}
	
	<% if ((lista.indexOf(v) + 1) != lista.size()) {%>
	,
	<%} %>
	
<% } %>
	
]