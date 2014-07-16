<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Cadastro de Usuários</title>
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
						<a href="cadastrousuario.jsp"> <li> Cadastro de Usuários </li> </a>
						<a href="cadastroveiculo.jsp"> <li> Cadastro de Veículos </li> </a>
						<a href="cadastrofuncionario.jsp"> <li> Cadastro de Funcionários </li> </a>
						
					</ul>
				</li>
				<li>Editar
					<ul>	
						<a href="alterausuario.jsp"> <li> Alteração de Usuários </li>  </a>
						<a href="alteraveiculo.jsp"> <li> Alteração de Veículos </li>  </a>
						<a href="alterafuncionario.jsp"> <li> Alteração de Funcionários </li>  </a>
						
					</ul>
				</li>
				<li>Remover
					<ul>	
						<a href="removeusuario.jsp"> <li> Remoção de Usuários </li> </a>
						<a href="removeveiculo.jsp"> <li> Remoção de Veículos </li> </a>
						<a href="removefuncionario.jsp"> <li> Remoção de Funcionários </li> </a>
						
					</ul>
				</li>
				
				<li>Listar
					<ul>	
						<a href="listarusuarios.jsp"> <li> Listagem Usuários </li> </a>
						<a href="listaroveiculo.jsp"> <li> Listagem de Veículos </li> </a>
						<a href="listarfuncionario.jsp"> <li> Listagem de Funcionários </li> </a>
												
					</ul>
				</li>
			</ul>
		</div>

<div id="interacao-menu">

	<h:form>
		<table>
			<tr>
				<td>Nome: </td> 
				<td><h:inputText required="true" value="#{usuarioController.usuario.nome}"></h:inputText></td>
			</tr>
			<tr>
				<td> Nacionalidade: </td> 
				<td><h:inputText required="true" value="#{usuarioController.usuario.nacionalidade}"></h:inputText> </td>
			</tr>
			<tr> 
				<td colspan="2">
					<h:selectOneMenu>
						<f:selectItem itemValue="Masculino" itemLabel="Masculino" value="#{usuarioController.usuario.sexo}"/>
						<f:selectItem itemValue="Feminino" itemLabel="Feminino" value="#{usuarioController.usuario.sexo}"/>
					</h:selectOneMenu> 
				</td>
			</tr>
			<tr>
				<td colspan="2"> <h:commandButton value="Cadastrar" action="#{usuarioController.addUsuario}"/> </td>
			</tr>
		</table>
		<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
	</h:form>

</div>
</div>

</f:view>
</body>
</html>
