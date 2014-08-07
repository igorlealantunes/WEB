<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
	 <link rel="stylesheet" type="text/css" href="css/estilo.css"/>
	<script language="javascript" src="//code.jquery.com/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/menu.js"></script>
	<title>Locadora de Veículos</title>
	
</head>
	<body>
	<%@ include file="verificaSession.jsp" %>
		<f:view>
		
		<!-- INÍCIO MENU -->
		<nav id="menu" class="navbar navbar-default navbar-inverse" role="navigation">
		
		  <div class="container-fluid">
		    
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <img id="logo" src="img/car_icon.png" alt="..." class="navbar-brand img-rounded">
		    </div>
		
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        
		        <li class="dropdown">
				
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">
				    	Cadastrar <span class="caret"></span>
				    </a>
					<ul class="dropdown-menu">
				    	<li> <a id="cadastrousuario" href="#">Cadastro de Usuários</a> </li>
				    	<li> <a id="cadastroveiculo"  href="#">Cadastro de Veículos</a> </li>
				    	<li> <a id="cadastrofuncionario" href="#">Cadastro de Funcionários</a> </li>
				    </ul>
				    
				</li>
				
				<li class="dropdown">
				
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">
				    	Editar <span class="caret"></span>
				    </a>
					<ul class="dropdown-menu">
				    	<li> <a id="alterausuario" href="#">Alteração de Usuários</a> </li>
				    	<li> <a id="alteraveiculo" href="#">Alteração de Veículos</a> </li>
				    	<li> <a id="alterafuncionario" href="#">Alteração de Funcionários</a> </li>
				    	
				    </ul>
				    
				</li>
				
				<li class="dropdown">
				
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">
				    	Remover <span class="caret"></span>
				    </a>
					<ul class="dropdown-menu">
				    	<li> <a id="removeusuario" href="#">Remoção de Usuários</a> </li>
				    	<li> <a id="removeveiculo" href="#">Remoção de Veículos</a> </li>
				    	<li> <a id="removefuncionario" href="#">Remoção de Funcionários</a> </li>
				    	
				    </ul>
				    
				</li>
				
				<li class="dropdown">
				
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">
				    	Listar <span class="caret"></span>
				    </a>
					<ul class="dropdown-menu">
						
				    	<li> <a id="listarusuario" href="#">Listagem de Usuários</a> </li>
				    	<li> <a id="listarveiculo" href="#">Listagem de Veículos</a> </li>
				    	<li> <a id="listarfuncionario" href="#">Listagem de Funcionários</a> </li>
				    	
				    </ul>
				    
				</li>
				
		      </ul>
		      
		      <ul id="logoff" class="nav navbar-nav navbar-right">
		        <li><a id="logoff" href="#">Logoff</a></li>
		      </ul>
		      
		      
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		<div id="stripes" class="panel panel-default">
		  	<div class="panel-body">
		  
			</div>
		</div>
		<!-- FIM MENU -->
		
		<!-- INÍCIO CORPO -->

		<div id="corpo">
		
		
		</div>
		
		<!-- FIM CORPO -->
	</f:view>
	</body>
</html>