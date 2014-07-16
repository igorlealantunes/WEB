package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOFuncionario;
import lp3.data.memoria.DAOUsuario;
import lp3.model.Funcionario;

public class FuncionarioController {

	private List<Funcionario> listFuncionarios;
	private Funcionario funcionario;
	private DAOFuncionario DAOFuncionario;
	private String nome;
	
	public FuncionarioController() {
		DAOFuncionario = new DAOFuncionario();
		funcionario = new Funcionario();	
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getListFuncionarios() {
		listFuncionarios = DAOFuncionario.getList();
		return listFuncionarios;
	}
	
	public String addFuncionario() {
		DAOFuncionario.inserir(funcionario);
		return "";
	}
	
	public String delFuncionario() {
		
		DAOFuncionario.remover(nome);
		return "";
		
	}
}
