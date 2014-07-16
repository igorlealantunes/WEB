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
	
	private static int TYPE_CLIENTE = 1;
	private static int TYPE_ADM = 2;
	
	public LoginController() {		
		listClientes 		= (LinkedList<Cliente>) (List) (new DAOCliente()).getList();
		listAdministradores = (LinkedList<Administrador>) (List) (new DAOAdministrador()).getList();
	}
	
	public int verificaLogin(String login, String password) {
		
		for (Cliente c : listClientes) {
			if(login.equals(c.getUsuario()) && password.equals(c.getSenha())) {
				return TYPE_CLIENTE;
			}
		}
		
		for (Administrador a : listAdministradores) {
			if(login.equals(a.getUsuario()) && password.equals(a.getSenha())) {
				return TYPE_ADM;
			}
		}
		
		throw new NotImplementedException();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
