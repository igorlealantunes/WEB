package lp3.data;

import java.util.List;

import lp3.model.Veiculo;

public interface IDAOVeiculo {
	
	public List<Veiculo> listarVeiculos();
	public boolean inserirVeiculo(Veiculo veiculo);
	public boolean removerVeiculo(String placa);
	public void alterarVeiculo(String placaantigo, Veiculo novoveiculo);

}
