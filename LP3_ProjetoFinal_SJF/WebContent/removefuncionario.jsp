<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

	<f:view>
		<h:form id="form-cadastro" styleClass="form-horizontal">
		
			<div class="form-group">
				<label for="inputnome" class="col-sm-2 control-label">Nome</label>
				<h:inputText styleClass="form-control" id="inputnome" required="true" value="#{funcionarioController.nome}"></h:inputText>
			</div>
		
			<h:commandButton styleClass="btn btn-danger" value="Remover" action="#{funcionarioController.delFuncionario}"/>
			<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
		</h:form>
	</f:view>