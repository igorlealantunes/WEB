package lp3.model;

public class Usuario {
	
	private int id;
	private String nome;
	private String sexo;
	private String nacionalidade;
	
	public Usuario() {
		
		
	}
	
	public Usuario(String nome, String sexo, String nacionalidade ) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
