package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Cliente;

public class DAOCliente implements IDAO{
	
	private List<Object> clientes;
	
	public DAOCliente() {
		
		this.clientes = new Vector<Object>();
		
		Cliente cli1 = new Cliente("cliente1", "111");
		Cliente cli2 = new Cliente("cliente2", "222");
		Cliente cli3 = new Cliente("cliente3", "333");
		Cliente cli4 = new Cliente("cliente4", "444");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		clientes.add(cli4);
		
	}
	
	public List<Object> getList(){
		
		return this.clientes;
		
	}
	
	public boolean inserir(Object objeto) {
		
		Cliente cliente = (Cliente) objeto;
		
		boolean resultado = clientes.add(cliente);
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Object cli : clientes) {
			
			Cliente c = (Cliente) cli;
			
			if(c.getUsuario().equals(nome)) { 
				resultado = clientes.remove(c);
				break;
			}
			
		}
		
		return resultado;
		
	}
	
	public void alterar(String nome, Object objeto){
		
		Cliente clientenovo = (Cliente) objeto;
		
		for(Object cli : clientes) {
			
			Cliente c = (Cliente) cli;
			
			if(c.getUsuario().equalsIgnoreCase(nome))  {
				
				c.setUsuario(clientenovo.getUsuario());
				c.setSenha(clientenovo.getSenha());
				break;
				
			}
			
		}
				
	}	

}
