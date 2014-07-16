package lp3.controller;

import java.util.List;

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
	
}
