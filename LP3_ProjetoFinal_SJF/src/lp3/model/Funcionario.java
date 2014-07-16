package lp3.model;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	private String funcao;
	
	public Funcionario() {
		
		
	}
	
	public Funcionario(String nome, double salario, String funcao) {
		
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}