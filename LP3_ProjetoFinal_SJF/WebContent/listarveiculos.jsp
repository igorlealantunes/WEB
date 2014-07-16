<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
<f:view>


		<div id="conteudo-menu">
		
		<div id="topo-menu">
		
			<p>Projeto LP3 - Parte 2</p>
		</div>

		<div id="menu">
			
			<ul>
				<li>Cadastrar
					<ul>	
						<a href="cadastrousuario.jsp"> <li> Cadastro de Usu�rios </li> </a>
						<a href="cadastroveiculo.jsp"> <li> Cadastro de Ve�culos </li> </a>
						<a href="cadastrofuncionario.jsp"> <li> Cadastro de Funcion�rios </li> </a>
						
					</ul>
				</li>
				<li>Editar
					<ul>	
						<a href="alterausuario.jsp"> <li> Altera��o de Usu�rios </li>  </a>
						<a href="alteraveiculo.jsp"> <li> Altera��o de Ve�culos </li>  </a>
						<a href="alterafuncionario.jsp"> <li> Altera��o de Funcion�rios </li>  </a>
						
					</ul>
				</li>
				<li>Remover
					<ul>	
						<a href="removeusuario.jsp"> <li> Remo��o de Usu�rios </li> </a>
						<a href="removeveiculo.jsp"> <li> Remo��o de Ve�culos </li> </a>
						<a href="removefuncionario.jsp"> <li> Remo��o de Funcion�rios </li> </a>
						
					</ul>
				</li>
				
				<li>Listar
					<ul>	
						<a href="listarusuarios.jsp"> <li> Listagem Usu�rios </li> </a>
						<a href="listarveiculos.jsp"> <li> Listagem de Ve�culos </li> </a>
						<a href="listarfuncionarios.jsp"> <li> Listagem de Funcion�rios </li> </a>
												
					</ul>
				</li>
			</ul>
		</div>		
		
<div id="interacao-menu">

	
	<h:dataTable value="#{veiculoController.listVeiculos}" var="veiculos" border="1">
		<h:column>
	        <f:facet name="header">
	            <h:outputText value="Modelo" />
	        </f:facet>
	        <h:outputText value="#{veiculos.modelo}" />
	    </h:column>
	    
	    <h:column>
	        <f:facet name="header">
	            <h:outputText value="Marca" />
	        </f:facet>
	        <h:outputText value="#{veiculos.marca}" />
	    </h:column>
	    
	     <h:column>
	        <f:facet name="header">
	            <h:outputText value="Ano" />
	        </f:facet>
	        <h:outputText value="#{veiculos.ano}" />
	    </h:column>
	    
	    <h:column>
	        <f:facet name="header">
	            <h:outputText value="Placa" />
	        </f:facet>
	        <h:outputText value="#{veiculos.placa}" />
	    </h:column>
	    
	</h:dataTable>

</div>
</div>
</f:view>
</body>
</html>