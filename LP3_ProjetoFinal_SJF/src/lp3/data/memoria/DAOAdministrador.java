package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Administrador;;

public class DAOAdministrador implements IDAO{
	
	private List<Object> adms;
	
	public DAOAdministrador() {
		
		this.adms = new Vector<Object>();
		
		Administrador adm1 = new Administrador("adm1", "111");
		Administrador adm2 = new Administrador("adm2", "222");
		Administrador adm3 = new Administrador("adm3", "333");
		Administrador adm4 = new Administrador("adm4", "444");
		
		adms.add(adm1);
		adms.add(adm2);
		adms.add(adm3);
		adms.add(adm4);
		
	}
	
	public List<Object> getList(){
		
		return this.adms;
		
	}
	
	public boolean inserir(Object objeto) {
		
		Administrador adm = (Administrador) objeto;
		
		boolean resultado = adms.add(adm);
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Object adm : adms) {
			
			Administrador a = (Administrador) adm;
			
			if(a.getUsuario().equals(nome)) { 
				resultado = adms.remove(a);
				break;
			}
			
		}
		
		return resultado;
		
	}
	
	public void alterar(String nome, Object objeto){
		
		Administrador admnovo = (Administrador) objeto;
		
		for(Object adm : adms) {
			
			Administrador a = (Administrador) adm;
			
			if(a.getUsuario().equalsIgnoreCase(nome))  {
				
				a.setUsuario(admnovo.getUsuario());
				a.setSenha(admnovo.getSenha());
				break;
				
			}
			
		}
				
	}	

}
