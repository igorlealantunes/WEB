package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAO;
import lp3.model.Veiculo;

public class DAOVeiculo implements IDAO {
	
	private List<Object> veiculos;
	private int id;
	
	public DAOVeiculo() {
		
		this.veiculos = new Vector<Object>();
		this.id = 1;
		
		Veiculo veiculo1 = new Veiculo("Gol", "VW", "carro", 2000, "XXX-9090");
		veiculo1.setId(id++);
		Veiculo veiculo2 = new Veiculo("Uno", "Fiat", "carro", 1999, "DDD-5555");
		veiculo2.setId(id++);
		Veiculo veiculo3 = new Veiculo("Celta", "Chevrolet", "carro", 2010, "AAA-1010");
		veiculo3.setId(id++);
		
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		
	}
	
	public List<Object> getList() {
		
		return this.veiculos;
		
	}
	
	public boolean inserir(Object o) {
		
		Veiculo veiculo = (Veiculo) o;
		
		veiculo.setId(id++);
		boolean resultado = veiculos.add(veiculo);
		
		return resultado;
		
	}
	
	public boolean remover(String placa) {
		
		boolean resultado = false;
		
		for(Object vei : veiculos) {
			
			Veiculo v = (Veiculo) vei;
			
			if(v.getPlaca().equals(placa)) {
				
				resultado = veiculos.remove(v);
				break;
				
			}
			
		}
		
		return resultado;
		
	}
	
	public void alterar(String placaantigo, Object objeto) {
		
		Veiculo novoveiculo = (Veiculo) objeto;
		
		for(Object vei : veiculos) {
			
			Veiculo v = (Veiculo) vei;
			
			if(v.getPlaca().equals(placaantigo)) {
				
				v.setPlaca(novoveiculo.getPlaca());
				v.setAno(novoveiculo.getAno());
				v.setMarca(novoveiculo.getMarca());
				v.setModelo(novoveiculo.getModelo());
				v.setTipo(novoveiculo.getTipo());
				
				break;
				
			}
			
		}
	}

}
