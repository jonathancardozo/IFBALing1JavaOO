package com.ifba.modelagem.banco;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Conta();
		new Conta();
		new Conta();
		
		Conta contaDelson = new Conta();
		System.out.println("Saldo: "+contaDelson.saldo);
		contaDelson.saldo = 100;		
		System.out.println("Saldo: "+contaDelson.saldo);

	}

}
