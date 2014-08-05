package lp3.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import lp3.data.memoria.DAOFuncionario;
import lp3.model.Funcionario;

public class FuncionarioController {

	private List<Funcionario> listFuncionarios;
	private Funcionario funcionario;
	private DAOFuncionario DAOFuncionario;
	private String nome;
	
	public FuncionarioController() {
		DAOFuncionario = new DAOFuncionario();
		funcionario = new Funcionario();	
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getListFuncionarios() {
		listFuncionarios = DAOFuncionario.getList();
		return listFuncionarios;
	}
	
	public String addFuncionario() {
		boolean result = DAOFuncionario.inserir(funcionario);
		
		String message = "Employer "+funcionario.getNome()+" added successfully!";
		
		if(result == false) {
			message = "Erro, try again";		
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
		
		this.funcionario = new Funcionario();
		
		return "";
	}
	public String delFuncionario() {		
		boolean result = DAOFuncionario.remover(nome);
		
		String message = "Employer "+nome+" deleted successfully!";
		
		if(result == false) {
			message = "User not found";		
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
		
		this.nome = "";
		return "";		
	}
	public String alteraFuncionario() {		
		String result = DAOFuncionario.alterar(nome, funcionario);
		
		String message = "Employer "+nome+" changed successfully!";
		
		if(result.endsWith("notFound")) {
			message = "Employer not found";		
		}
		
		FacesContext.getCurrentInstance().addMessage(null, 
			       new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
		
		this.funcionario = new Funcionario();
		this.nome = "";
		
		return result;	
	}
}
