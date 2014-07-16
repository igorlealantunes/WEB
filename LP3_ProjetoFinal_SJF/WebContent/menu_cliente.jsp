<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
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
						<li> Cadastro de Usuários </li>
						<li> Cadastro de Veículos </li>
						<li> Cadastro de Funcionários </li>
						
					</ul>
				</li>
				<li>Editar
					<ul>	
						<li> Alteração de Usuários </li>  
						<li> Alteração de Veículos </li>  
						<li> Alteração de Funcionários </li>
						
					</ul>
				</li>
				<li>Remover
					<ul>	
						<li> Remoção de Usuários </li> 
						<li> Remoção de Veículos </li>
						<li> Remoção de Funcionários </li>
						
					</ul>
				</li>
				
				<li>Listar
					<ul>	
						<a href="listarusuarios.jsp"> <li> Listagem Usuários </li> </a>
						<a href="listarveiculos.jsp"> <li> Listagem de Veículos </li> </a>
						<a href="listarfuncionarios.jsp"> <li> Listagem de Funcionários </li> </a>
												
					</ul>
				</li>
			</ul>
		</div>		
		<div id="interacao-menu">
		</div>
	</div>
	
	</f:view>
	</body>
</html>