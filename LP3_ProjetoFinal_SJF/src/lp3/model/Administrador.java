package lp3.model;

public class Administrador {

	private String usuario;
	private String senha;

	
	
	public Administrador() {
		
		
	}
	
	public Administrador(String usuario, String senha) {
		
		super();
		this.usuario = usuario;
		this.senha = senha;
		
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}
	
}
