package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Usuario;

public class DAOUsuario implements IDAO{
	
	private List<Object> usuarios;
	private int id;
	
	public DAOUsuario() {
		
		this.usuarios = new Vector<Object>();
		this.id = 1;
		
		Usuario user1 = new Usuario("Usuario A", "Masculino", "Brasileiro");
		user1.setId(id++);
		Usuario user2 = new Usuario("Usuario B", "Feminino", "Brasileiro");
		user2.setId(id++);
		Usuario user3 = new Usuario("Usuario C", "Masculino", "Brasileiro");
		user3.setId(id++);
		Usuario user4 = new Usuario("Usuario D", "Masculino", "Brasileiro");
		user4.setId(id++);
		Usuario user5 = new Usuario("Usuario E", "Feminino", "Brasileiro");
		user5.setId(id++);
		
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		usuarios.add(user5);
		
	}
	
	public List<Object> getList(){
		
		return this.usuarios;
		
	}
	
	public boolean inserir(Object objeto) {
		
		Usuario usuario = (Usuario) objeto;
		usuario.setId(id++);
		boolean resultado =  usuarios.add(usuario);
		
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Object user: usuarios) {
			
			Usuario u = (Usuario) user;
			
			if(u.getNome().equals(nome)) { 
				resultado = usuarios.remove(u);
				break;
			}
		}
		
		return resultado;
		
	}
	
	public void alterar(String nomeantigo, Object objeto) {
		
		Usuario usuario = (Usuario) objeto;
		
		for(Object user: usuarios) {
			
			Usuario u = (Usuario) user;
			
			if(u.getNome().equals(nomeantigo)) { 
				u.setNome(usuario.getNome());
				u.setSexo(usuario.getSexo());
				u.setNacionalidade(usuario.getNacionalidade());
				break;
			}
			
		}
		
	}

}
