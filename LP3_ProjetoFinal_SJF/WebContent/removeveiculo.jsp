<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<%@ include file="verificaSession.jsp" %>
	<f:view>
		<h:form id="form-cadastro" styleClass="form-horizontal">
		
			<div class="form-group">
				<label for="inputplaca" class="col-sm-2 control-label">Placa</label>
				<h:inputText styleClass="form-control" id="inputplaca" required="true" value="#{veiculoController.placa}" ></h:inputText>
			</div>
			
			<h:commandButton styleClass="btn btn-danger" value="Remover" action="#{veiculoController.delVeiculo}"/> </td>
			<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
			
		</h:form>
	</f:view>
