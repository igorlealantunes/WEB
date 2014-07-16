package lp3.data;

import java.util.List;

public interface IDAO <T> {
	
	public List<T> getList();
	public boolean inserir(T objeto);
	public boolean remover(String nome);
	public String alterar(String nome, T objeto);

}
