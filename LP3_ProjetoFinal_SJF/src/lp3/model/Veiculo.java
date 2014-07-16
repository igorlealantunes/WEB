package lp3.model;

public class Veiculo {
	
	private int id;
	private String modelo;
	private String marca;
	private String tipo;
	private int ano;
	private String placa;
	
	public Veiculo() {
		
		
	}
	
	public Veiculo(String modelo, String marca, String tipo, int ano, String placa) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.tipo = tipo;
		this.ano = ano;
		this.placa = placa;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
