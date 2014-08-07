<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

	<f:view>
		<h:form id="form-cadastro" styleClass="form-horizontal">
		
			<div class="form-group">
				<label for="inputnome" class="col-sm-2 control-label">Nome</label>
				<h:inputText styleClass="form-control" id="inputnome" required="true" value="#{usuarioController.usuario.nome}"></h:inputText>
			</div>
			<div class="form-group">	
				<label for="inputnacionalidade" class="col-sm-2 control-label" >Nacionalidade</label>
				<h:inputText styleClass="form-control" id="inputnacionalidade" required="true" value="#{usuarioController.usuario.nacionalidade}"></h:inputText>
			</div>
			<div class="form-group">
				<h:selectOneMenu styleClass="form-control" value="#{usuarioController.usuario.sexo}">
					<f:selectItem itemValue="Masculino" itemLabel="Masculino"/>
					<f:selectItem itemValue="Feminino" itemLabel="Feminino"/>
				</h:selectOneMenu> 
			</div>
			<h:commandButton styleClass="btn btn-success" value="Cadastrar" action="#{usuarioController.addUsuario}"/>
			<h:messages layout="table" style="color:red;margin:8px;"></h:messages>
			
		</h:form>
	</f:view>