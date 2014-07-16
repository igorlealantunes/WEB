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
		
		<section id="conteudo-menu">
		
		<section id="topo-menu">
		
			<p>Projeto LP3 - Parte 1</p>
		</section>

		<section id="menu">
			
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
						<a href="listarusuario.jsp"> <li> Listagem Usuários </li> </a>
						<a href="listaroveiculo.jsp"> <li> Listagem de Veículos </li> </a>
						<a href="listarfuncionario.jsp"> <li> Listagem de Funcionários </li> </a>
												
					</ul>
				</li>
			</ul>
		</section>		
		<section id="interacao-menu">
		</section>
	</section>
	
	</f:view>
	</body>
</html>