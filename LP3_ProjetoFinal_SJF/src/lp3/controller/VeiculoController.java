package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOVeiculo;
import lp3.model.Veiculo;

public class VeiculoController {

	private List<Veiculo> listVeiculos;
	private DAOVeiculo DAOVeiculo;
	private Veiculo veiculo;
	private String placa;
	
	public VeiculoController() {
		DAOVeiculo = new DAOVeiculo();
	}
	
	public List<Veiculo> getListVeiculos() {
		listVeiculos = DAOVeiculo.getList();
		return listVeiculos;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String addVeiculo() {
		DAOVeiculo.inserir(veiculo);
		return "";
	}
	
	public String delVeiculo() {
		
		DAOVeiculo.remover(placa);
		return "";
		
	}
	
}
