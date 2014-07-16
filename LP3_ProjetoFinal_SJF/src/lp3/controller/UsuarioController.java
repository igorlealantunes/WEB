package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOUsuario;
import lp3.model.Usuario;

public class UsuarioController {

	private List<Usuario> listUsuarios;
	private DAOUsuario DAOUsuario;
	private Usuario usuario;
	
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

	public List<Usuario> getListUsuarios() {
		listUsuarios = DAOUsuario.getList();
		return listUsuarios;
	}
	public String addUsuario() {
		DAOUsuario.inserir(usuario);
		return "";
	}
	
	
}
