package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Funcionario;

public class DAOFuncionario implements IDAO<Funcionario>{
	
	private List<Funcionario> funcionarios;
	private int id;
	
	public DAOFuncionario() {
		
		this.funcionarios = new Vector<Funcionario>();
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
	
	public List<Funcionario> getList(){
		
		return this.funcionarios;
		
	}
	
	public boolean inserir(Funcionario funcionario) {
		
		funcionario.setId(id++);
		boolean resultado =  funcionarios.add(funcionario);
		
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Funcionario f: funcionarios) {		
		
			if(f.getNome().equals(nome)) { 
				resultado = funcionarios.remove(f);
				break;
			}
		}
		
		return resultado;
		
	}
	
	public void alterar(String nomeantigo, Funcionario funcionarionovo) {
		

		for(Funcionario f: funcionarios) {
			
			
			if(f.getNome().equals(nomeantigo)) { 
				f.setNome(funcionarionovo.getNome());
				f.setSalario(funcionarionovo.getSalario());
				f.setFuncao(funcionarionovo.getFuncao());
				break;
			}
			
		}
		
	}

}
