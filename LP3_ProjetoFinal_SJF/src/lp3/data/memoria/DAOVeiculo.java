package lp3.data.memoria;

import java.util.List;
import java.util.Vector;

import lp3.data.IDAOVeiculo;
import lp3.model.Veiculo;

public class DAOVeiculo implements IDAOVeiculo {
	
	private List<Veiculo> veiculos;
	private int id;
	
	public DAOVeiculo() {
		
		this.veiculos = new Vector<Veiculo>();
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
	
	public List<Veiculo> listarVeiculos() {
		
		return this.veiculos;
		
	}
	
	public boolean inserirVeiculo(Veiculo veiculo) {
		
		veiculo.setId(id++);
		boolean resultado = veiculos.add(veiculo);
		
		return resultado;
		
	}
	
	public boolean removerVeiculo(String placa) {
		
		boolean resultado = false;
		
		for(Veiculo v : veiculos) {
			
			if(v.getPlaca().equals(placa)) {
				
				resultado = veiculos.remove(v);
				break;
				
			}
			
		}
		
		return resultado;
		
	}
	
	public void alterarVeiculo(String placaantigo, Veiculo novoveiculo) {
		
		for(Veiculo v : veiculos) {
			
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
