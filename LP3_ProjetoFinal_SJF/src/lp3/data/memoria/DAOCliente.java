package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Cliente;

public class DAOCliente implements IDAO<Cliente>{
	
	private List<Cliente> clientes;
	
	public DAOCliente() {
		
		this.clientes = new Vector<Cliente>();
		
		Cliente cli1 = new Cliente("cliente1", "111");
		Cliente cli2 = new Cliente("cliente2", "222");
		Cliente cli3 = new Cliente("cliente3", "333");
		Cliente cli4 = new Cliente("cliente4", "444");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		clientes.add(cli4);
		
	}
	
	public List<Cliente> getList(){
		
		return this.clientes;
		
	}
	
	public boolean inserir(Cliente cliente) {
		
		boolean resultado = clientes.add(cliente);
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Cliente c : clientes) {
			
			if(c.getUsuario().equals(nome)) { 
				resultado = clientes.remove(c);
				break;
			}
			
		}
		
		return resultado;
		
	}
	
	public String alterar(String nome, Cliente clientenovo){
		String result = "notFound";
		for(Cliente c : clientes) {

			if(c.getUsuario().equalsIgnoreCase(nome))  {
				
				c.setUsuario(clientenovo.getUsuario());
				c.setSenha(clientenovo.getSenha());
				result = "found";
				break;
				
			}
			
		}
		return result;	
	}	

}
