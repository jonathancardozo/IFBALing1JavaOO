package com.ifba.metodos.sobrecarga.gerente;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente();
		gerente.salario = 1000;
		
		System.out.println("Salário: "+gerente.salario);
		
		gerente.aumentaSalario();
		
		System.out.println("Salário: "+gerente.salario);
		
		gerente.aumentaSalario(0.3);
		
		System.out.println("Salário: "+gerente.salario);
		
	}

}
