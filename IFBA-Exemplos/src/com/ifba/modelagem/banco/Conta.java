package com.ifba.modelagem.banco;

public class Conta {
	
	/*
	 * Contas: numero, digito, cliente, saldo, agencia.
	 */
	
	/* 
	 * Abstra��o X Orienta��o
	 * Informa��es X Propriedades 
	 */
	
	int agencia;
	int numero;
	int digito;
	String cliente;
	double saldo;
	
	/* 
	 * Abstra��o X Orienta��o
	 * Processos X M�todos 
	 * saldo, saque, deposito, transfencia.
	 */
	
	// Retorna saldo da conta
	public double pegaSaldo(){
		return this.saldo;
	}
	

}
