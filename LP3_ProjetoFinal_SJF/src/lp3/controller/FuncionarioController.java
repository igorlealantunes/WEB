package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOFuncionario;
import lp3.data.memoria.DAOUsuario;
import lp3.model.Funcionario;

public class FuncionarioController {

	private List<Funcionario> listFuncionarios;
	private Funcionario funcionario;
	private DAOFuncionario DAOFuncionario;
	
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
	
	public List<Funcionario> getListFuncionarios() {
		listFuncionarios = DAOFuncionario.getList();
		return listFuncionarios;
	}
}
