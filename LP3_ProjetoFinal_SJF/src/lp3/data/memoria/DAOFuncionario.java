package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Funcionario;

public class DAOFuncionario implements IDAO{
	
	private List<Object> funcionarios;
	private int id;
	
	public DAOFuncionario() {
		
		this.funcionarios = new Vector<Object>();
		this.id = 1;
		
		Funcionario func1 = new Funcionario("Funcionario A", 1000,"Mecanico");
		func1.setId(id++);
		Funcionario func2 = new Funcionario("Funcionario B", 2000,"Mecanico");
		func2.setId(id++);
		Funcionario func3 = new Funcionario("Funcionario C", 5000,"Gerente");
		func3.setId(id++);
		Funcionario func4 = new Funcionario("Funcionario D", 800,"Servicos Gerais");
		func4.setId(id++);
		
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		funcionarios.add(func4);
		
	}
	
	public List<Object> getList(){
		
		return this.funcionarios;
		
	}
	
	public boolean inserir(Object objeto) {
		
		Funcionario funcionario = (Funcionario) objeto;
		funcionario.setId(id++);
		boolean resultado =  funcionarios.add(funcionario);
		
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Object func: funcionarios) {
			
			Funcionario f = (Funcionario) func;
			
			if(f.getNome().equals(nome)) { 
				resultado = funcionarios.remove(f);
				break;
			}
		}
		
		return resultado;
		
	}
	
	public void alterar(String nomeantigo, Object objeto) {
		
		Funcionario funcionarionovo = (Funcionario) objeto;
		
		for(Object func: funcionarios) {
			
			Funcionario f = (Funcionario) func;
			
			if(f.getNome().equals(nomeantigo)) { 
				f.setNome(funcionarionovo.getNome());
				f.setSalario(funcionarionovo.getSalario());
				f.setFuncao(funcionarionovo.getFuncao());
				break;
			}
			
		}
		
	}

}
