<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Cadastro de Usu�rios</title>
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
						<a href="listaroveiculo.jsp"> <li> Listagem de Ve�culos </li> </a>
						<a href="listarfuncionario.jsp"> <li> Listagem de Funcion�rios </li> </a>
												
					</ul>
				</li>
			</ul>
		</div>

<div id="interacao-menu">

	<h:form>
		<table>
			<tr>
				<td> Funcionario a ser editado </td> 
				<td><h:inputText required="true" value="#{funcionarioController.nome}"></h:inputText></td>
			</tr>
			
			<tr>
				<td>Novo Nome: </td> 
				<td><h:inputText required="true" value="#{funcionarioController.funcionario.nome}"></h:inputText></td>
			</tr>
			<tr>
				<td> Nova Fun��o: </td> 
				<td><h:inputText required="true" value="#{funcionarioController.funcionario.funcao}"></h:inputText> </td>
			</tr>
			<tr>
				<td> Novo Salario: </td> 
				<td><h:inputText required="true" value="#{funcionarioController.funcionario.salario}"></h:inputText> </td>
			</tr>
			
			<tr>
				<td colspan="2"> <h:commandButton value="Confirma" action="#{funcionarioController.alteraFuncionario}"/> </td>
				<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
			</tr>
		</table>
	</h:form>

</div>
</div>

</f:view>
</body>
</html>