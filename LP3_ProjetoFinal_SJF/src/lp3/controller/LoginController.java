package lp3.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import lp3.data.memoria.DAOCliente;
import lp3.data.memoria.DAOAdministrador;
import lp3.model.Administrador;
import lp3.model.Cliente;


public class LoginController {

	private List<Cliente> listClientes;
	private List<Administrador> listAdministradores;

	
	private String login;
	private String senha;
	
	
	public LoginController() {		
		listClientes 		=  (new DAOCliente()).getList();
		listAdministradores =  (new DAOAdministrador()).getList();
	}
	

	public String getLogin() {
		return login;
	}
	
	public boolean hasSession() {
		if(login != null && senha != null)
			return true;
		else
			return false;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String verificaLogin() {
		
		for (Object cli : listClientes) {
			Cliente c = (Cliente) cli;
			if(login.equals(c.getUsuario()) && senha.equals(c.getSenha())) {
				return "TYPE_CLIENTE";
			}
		}
		
		for (Object adm : listAdministradores) {
			Administrador a = (Administrador) adm;
			if(login.equals(a.getUsuario()) && senha.equals(a.getSenha())) {
				return "TYPE_ADM";
			}
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, "Username or password incorrect", null));
		return "login incorrect";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
