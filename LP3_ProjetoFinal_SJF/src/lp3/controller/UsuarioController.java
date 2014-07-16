package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOUsuario;
import lp3.model.Usuario;

public class UsuarioController {

	private List<Usuario> listUsuarios;
	private DAOUsuario DAOUsuario;
	
	
	public UsuarioController() {
		DAOUsuario = new DAOUsuario();
	}
	
	public List<Usuario> getListUsuarios() {
		listUsuarios = DAOUsuario.getList();
		return listUsuarios;
	}
	
	
}
