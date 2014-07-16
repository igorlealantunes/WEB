package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Administrador;;

public class DAOAdministrador implements IDAO<Administrador>{
	
	private List<Administrador> adms;
	
	public DAOAdministrador() {
		
		this.adms = new Vector<Administrador>();
		
		Administrador adm1 = new Administrador("adm1", "111");
		Administrador adm2 = new Administrador("adm2", "222");
		Administrador adm3 = new Administrador("adm3", "333");
		Administrador adm4 = new Administrador("adm4", "444");
		
		adms.add(adm1);
		adms.add(adm2);
		adms.add(adm3);
		adms.add(adm4);
		
	}
	
	public List<Administrador> getList(){
		
		return this.adms;
		
	}
	
	public boolean inserir(Administrador adm) {
				
		boolean resultado = adms.add(adm);
		return resultado;
		
	}
	
	public boolean remover(String nome) {
		
		boolean resultado = false;
		
		for(Administrador a : adms) {
			
			if(a.getUsuario().equals(nome)) { 
				resultado = adms.remove(a);
				break;
			}
			
		}
		
		return resultado;
		
	}
	
	public String alterar(String nome, Administrador admnovo){
		String result = "notFound";
		
		for(Administrador a : adms) {
			
			if(a.getUsuario().equalsIgnoreCase(nome))  {
				
				a.setUsuario(admnovo.getUsuario());
				a.setSenha(admnovo.getSenha());
				result = "found";
				break;
				
			}
			
		}
		return result;
				
	}	

}
