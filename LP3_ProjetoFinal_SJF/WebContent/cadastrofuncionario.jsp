<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

	<%@ include file="verificaSession.jsp" %>
	<f:view>
		<h:form id="form-cadastro" styleClass="form-horizontal">
		
			<div class="form-group">
				<label for="inputnome" class="col-sm-2 control-label">Nome</label>
				<h:inputText styleClass="form-control" id="inputnome" required="true" value="#{funcionarioController.funcionario.nome}"></h:inputText>
			</div>
			<div class="form-group">	
				<label for="inputsalario" class="col-sm-2 control-label" >Salário</label>
				<h:inputText styleClass="form-control" id="inputsalario" required="true" value="#{funcionarioController.funcionario.salario}"></h:inputText> </td>
			</div>
			<div class="form-group">	
				<label for="inputfuncao" class="col-sm-2 control-label" >Função</label>
				<h:inputText styleClass="form-control" id="inputfuncao" required="true" value="#{funcionarioController.funcionario.funcao}"></h:inputText> </td>
			</div>
			
			<h:commandButton styleClass="btn btn-success" value="Cadastrar" action="#{funcionarioController.addFuncionario}"/> </td>
			<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
			
		</h:form>
	</f:view>