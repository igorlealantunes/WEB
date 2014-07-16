package lp3.controller;

import java.util.List;

import lp3.data.memoria.DAOVeiculo;
import lp3.model.Veiculo;

public class VeiculoController {

	private List<Veiculo> listVeiculos;
	private DAOVeiculo DAOVeiculo;
	
	
	public VeiculoController() {
		DAOVeiculo = new DAOVeiculo();
	}
	
	public List<Veiculo> getListVeiculos() {
		listVeiculos = DAOVeiculo.getList();
		return listVeiculos;
	}
}
