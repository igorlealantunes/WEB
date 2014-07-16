package lp3.data;

import java.util.List;

import lp3.model.Funcionario;

public interface IDAOFuncionario {
	
	public List<Funcionario> listarFuncionarios();
	public boolean inserirFuncionario(Funcionario funcionario);
	public boolean removerFuncionario(String nome);
	public void alterarFuncionario(String nomeantigo, Funcionario funcionarionovo);

}
