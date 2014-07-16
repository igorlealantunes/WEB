package lp3.model;

public class Cliente {
	
	private String usuario;
	private String senha;
	
	public Cliente() {
		
		
	}
	
	public Cliente(String usuario, String senha) {
		
		super();
		this.usuario = usuario;
		this.senha = senha;
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String login() {
		String action = null;
        
        if ( usuario.equalsIgnoreCase("cliente") && senha.equalsIgnoreCase("123") )
            action = "loginPass";
        else
            action = "loginFail";
        
        return action;
	}
}
