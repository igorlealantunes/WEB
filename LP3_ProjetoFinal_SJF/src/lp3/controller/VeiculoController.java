package lp3.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import lp3.data.memoria.DAOVeiculo;
import lp3.model.Veiculo;

public class VeiculoController {

	private List<Veiculo> listVeiculos;
	private DAOVeiculo DAOVeiculo;
	private Veiculo veiculo;
	private String placa;
	
	public VeiculoController() {
		DAOVeiculo = new DAOVeiculo();
		veiculo = new Veiculo();
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
		boolean result = DAOVeiculo.remover(placa);
		
		String message = "Vehicle "+placa+" deleted successfully!";
		
		if(result == false) {
			message = "User not found";		
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
		return "";
	}
	
	public String alteraVeiculo() {		
		String result = DAOVeiculo.alterar(placa, veiculo);
		
		String message = "Vehicle "+placa+" changed successfully!";
		
		if(result.endsWith("notFound")) {
			message = "User not found";		
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
		
		return result;	
	}
	
}
