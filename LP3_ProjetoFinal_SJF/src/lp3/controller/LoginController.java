package lp3.controller;

import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import lp3.data.memoria.DAOCliente;
import lp3.data.memoria.DAOAdministrador;
import lp3.model.Administrador;
import lp3.model.Cliente;


public class LoginController {

	private LinkedList<Cliente> listClientes;
	private LinkedList<Administrador> listAdministradores;

	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
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

	public LoginController() {		
		listClientes 		= (LinkedList<Cliente>) (List) (new DAOCliente()).getList();
		listAdministradores = (LinkedList<Administrador>) (List) (new DAOAdministrador()).getList();
	}
	
	public String verificaLogin() {
		
		for (Cliente c : listClientes) {
			if(login.equals(c.getUsuario()) && senha.equals(c.getSenha())) {
				return "TYPE_CLIENTE";
			}
		}
		
		for (Administrador a : listAdministradores) {
			if(login.equals(a.getUsuario()) && senha.equals(a.getSenha())) {
				return "TYPE_ADM";
			}
		}
		
		throw new NotImplementedException();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
