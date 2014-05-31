package com.ifba.exercicio.contas;

public class Conta {
		
	// Propriedades
	int numero;
	Cliente cliente;
	double saldo;
	double limite;
	
	// Metodos
	void setLimite(double limite){
		
		this.limite = limite;
		
	}
	
	// Retorna saldo
	double pegaSaldo(){
		
		return this.saldo;
		
	}
	
	void geraExtrato(){
		
		String extrato = "== Extrato ==\n";
		extrato += "Saldo: "+this.saldo+"\n";
		extrato += "Limite: "+this.limite+"\n";
		// Numero da conta
		// Nome do cliente
		// Limite 
		extrato += "=============";
		System.out.println(extrato);
	}
	
	
	
	void setCliente(Cliente cliente){
		
		this.cliente = cliente;
		
	}
	
}
