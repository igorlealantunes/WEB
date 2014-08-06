<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<%@ include file="verificaSession.jsp" %>
	<f:view>
		<h:form id="form-cadastro" styleClass="form-horizontal">
		
			<div class="form-group">
				<label for="inputmarca" class="col-sm-2 control-label">Marca</label>
				<h:inputText styleClass="form-control" id="inputmarca" required="true" value="#{veiculoController.veiculo.marca}" ></h:inputText>
			</div>
			<div class="form-group">	
				<label for="inputmodelo" class="col-sm-2 control-label" >Modelo</label>
				<h:inputText styleClass="form-control" id="inputmodelo" required="true" value="#{veiculoController.veiculo.modelo}"></h:inputText> </td>
			</div>
			<div class="form-group">	
				<label for="inputano" class="col-sm-2 control-label" >Ano</label>
				<h:inputText styleClass="form-control" id="inputano" required="true" value="#{veiculoController.veiculo.ano}"></h:inputText> </td>
			</div>
			<div class="form-group">	
				<label for="inputplaca" class="col-sm-2 control-label" >Placa</label>
				<h:inputText styleClass="form-control" id="inputplaca" required="true" value="#{veiculoController.veiculo.placa}"></h:inputText> </td>
			</div>
			<div class="form-group">
				<h:selectOneMenu styleClass="form-control" value="#{veiculoController.veiculo.tipo}">
					<f:selectItem itemValue="Carro" itemLabel="Carro"/>
					<f:selectItem itemValue="Motocicleta" itemLabel="Motocicleta"/>
				</h:selectOneMenu> 
			</div>
			<h:commandButton styleClass="btn btn-success" value="Cadastrar" action="#{veiculoController.addVeiculo}"/> </td>
			<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
			
		</h:form>
	</f:view>
