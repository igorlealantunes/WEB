package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOFuncionario;
import lp3.model.Funcionario;

public class FuncionarioController {

	private List<Funcionario> listFuncionarios;
	private Funcionario funcionario;
	
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

	private DAOFuncionario DAOFuncionario;
	
	public String addFuncionario() {
		DAOFuncionario.inserir(funcionario);
		return "";
	}
	
	
	public List<Funcionario> getListFuncionarios() {
		listFuncionarios = DAOFuncionario.getList();
		return listFuncionarios;
	}
}
