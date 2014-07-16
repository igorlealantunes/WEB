package lp3.data;

import java.util.List;

public interface IDAO {
	
	public List<Object> getList();
	public boolean inserir(Object objeto);
	public boolean remover(String nome);
	public void alterar(String nome, Object objeto);

}
