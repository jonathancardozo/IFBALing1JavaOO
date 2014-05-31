package com.ifba.heranca;

public class Emprestimo extends Servico {
	// Propriedades
	// valor
	private double valor;
	// taxa
	private double taxa;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularTaxa(){
		return (super.calcularTaxa() + this.valor) * 0.15;
	}
	
}
