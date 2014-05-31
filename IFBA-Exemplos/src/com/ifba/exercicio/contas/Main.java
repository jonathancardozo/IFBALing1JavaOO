package com.ifba.exercicio.contas;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		minhaConta.setLimite(50.00);
		minhaConta.geraExtrato();
		System.out.println(minhaConta.pegaSaldo());
		
	}

}
