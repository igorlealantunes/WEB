package lp3.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import lp3.data.memoria.DAOUsuario;
import lp3.model.Usuario;

public class UsuarioController {

	private List<Usuario> listUsuarios;
	private DAOUsuario DAOUsuario;
	private Usuario usuario;
	private String nome;
	
	public UsuarioController() {
		DAOUsuario = new DAOUsuario();
		usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getListUsuarios() {
		listUsuarios = DAOUsuario.getList();
		return listUsuarios;
	}
	public String addUsuario() {
		DAOUsuario.inserir(usuario);
		return "";
	}	
	public String delUsuario() {		
		DAOUsuario.remover(nome);
		return "";	
	}
	public String alteraUsuario() {
			
		String result = DAOUsuario.alterar(nome, usuario);		
		String message = "User "+nome+" changed successfully!";
		
		if(result.endsWith("notFound")) {
			message = "User not found";		
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
		
		return result;	
	}
	
}
