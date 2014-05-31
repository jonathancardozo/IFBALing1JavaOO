package com.ifba.heranca;

public class Seguro extends Servico {
	// Propriedades
	
	// veiculo
	private Veiculo veiculo;
	
	// (double)valorDoSeguro
	private double valorDoSeguro;
	
	// (double)franquia
	private double franquia;

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public double calcularTaxa(){
		return (super.calcularTaxa() + this.veiculo.getValor()) * 0.15;
	}

	public double getValorDoSeguro() {
		return valorDoSeguro;
	}

	public void setValorDoSeguro(double valorDoSeguro) {
		this.valorDoSeguro = valorDoSeguro;
	}

	public double getFranquia() {
		return franquia;
	}

	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	
	
	
}
