package com.ifba.metodos.sobrecarga;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		
		// Duas opções de sintaxe
		
		// Primeira declaracao
		minhaConta.imprimeExtrato(30);
		
		// Sobrecarga - valor padrao
		minhaConta.imprimeExtrato();
		
		
		
		

	}

}
