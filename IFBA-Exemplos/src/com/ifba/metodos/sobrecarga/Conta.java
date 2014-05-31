package com.ifba.metodos.sobrecarga;

public class Conta {
	
	double saldo;
	double limite;
	
	void imprimeExtrato(int dias){
		// Emite extrato
		// Precisa da quantidade de dias
		System.out.println("Imprime extrato para " + dias + " dias.");
	}	
	
	// Sobrecarga (Overload)
	// Faz a mesma coisa mas para 15 dias
	void imprimeExtrato(){
		this.imprimeExtrato(15);
	}

}
