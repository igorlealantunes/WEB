package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOFuncionario;
import lp3.data.memoria.DAOUsuario;
import lp3.model.Funcionario;

public class FuncionarioController {

	private List<Funcionario> listFuncionarios;
	private DAOFuncionario DAOFuncionario;
	
	
	public FuncionarioController() {
		DAOFuncionario = new DAOFuncionario();
	}
	
	public List<Funcionario> getListFuncionarios() {
		listFuncionarios = DAOFuncionario.getList();
		return listFuncionarios;
	}
}
