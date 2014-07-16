package lp3.data;

import java.util.List;

import lp3.model.Usuario;

public interface IDAOUsuario {
	
	public List<Usuario> listarUsuarios();
	public boolean inserirUsuario(Usuario usuario);
	public boolean removerUsuario(String nome);
	public void alterarUsuario(String nomeantigo, Usuario usuarionovo);

}
