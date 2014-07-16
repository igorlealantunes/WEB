<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script language="javascript" src="//code.jquery.com/jquery-1.10.2.js"></script>
<script language="javascript" src="js/menu_cliente.js"></script>
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
						<li class="restrito"> Cadastro de Usuários </li>
						<li class="restrito"> Cadastro de Veículos </li>
						<li class="restrito"> Cadastro de Funcionários </li>
						
					</ul>
				</li>
				<li id="restrito">Editar
					<ul>	
						<li class="restrito"> Alteração de Usuários </li>  
						<li class="restrito"> Alteração de Veículos </li>  
						<li class="restrito"> Alteração de Funcionários </li>
						
					</ul>
				</li>
				<li id="restrito">Remover
					<ul>	
						<li class="restrito"> Remoção de Usuários </li> 
						<li class="restrito"> Remoção de Veículos </li>
						<li class="restrito"> Remoção de Funcionários </li>
						
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
	
	</div>
	
	</f:view>
	</body>
</html>