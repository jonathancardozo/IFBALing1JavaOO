package com.ifba.modelagem.banco;

public class Conta {
	
	/*
	 * Contas: numero, digito, cliente, saldo, agencia.
	 */
	
	/* 
	 * Abstração X Orientação
	 * Informações X Propriedades 
	 */
	
	int agencia;
	int numero;
	int digito;
	String cliente;
	double saldo;
	
	/* 
	 * Abstração X Orientação
	 * Processos X Métodos 
	 * saldo, saque, deposito, transfencia.
	 */
	
	// Retorna saldo da conta
	public double pegaSaldo(){
		return this.saldo;
	}
	

}
