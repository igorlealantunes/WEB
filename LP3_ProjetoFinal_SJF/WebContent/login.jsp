<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/estilo.css" />

<title>Login</title>

</head>
<body>

	

	<div class="jumbotron">

		<h1 id="titulo">Locadora de Veículos</h1>

	</div>
	
	<div id="stripes" class="panel panel-default">
	  	<div class="panel-body">
	  
		</div>
	</div>
		
	<div id="conteudo" class="row">
	
		<div id="imagem" class="col-md-1">
	
			<img src="img/car_icon.png" class="img-responsive"
				alt="Responsive image">
	
		</div>


		<div id="form-login" class="col-md-1">
			<f:view>
				<h:form styleClass="form-signin">

					<h2 class="form-signin-heading">Login</h2>

					<div class="form-group">
						<label for="login">UserID</label>
						<h:inputText id="login" styleClass="form-control"
							value="#{loginController.login}" required="true" />
					</div>
					<div class="form-group">
						<label for="senha">Password</label>
						<h:inputSecret id="senha" styleClass="form-control"
							value="#{loginController.senha}" required="true" />
					</div>
					
					
					<h:commandButton  id="btlogin" styleClass="btn btn-lg btn-success btn-block"
						value="Login" action="#{loginController.verificaLogin}" />
					<h:messages layout="table" style="color:red;margin:8px;"></h:messages>

				</h:form>
			</f:view>

		</div>
		
	</div>

</body>
</html>
