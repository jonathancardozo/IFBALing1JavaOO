package com.ifba.encapsulamento;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario joao = new Funcionario(724.0);
		
		// Imprime salario (acesso direto)
		//System.out.println("Salario de Joao: "+joao.salario);
		
		// Acesso direto e irresponsavel
		// joao.salario = 10000;
		
		// Acesso direto a metodo auxiliar
		// Quero saber de quanto seria meu aumento
		//System.out.println("Quanto sera o aumento? "+joao.calculaAumento());		
		
		// Imprime salario
		//System.out.println("Salario de Joao: "+joao.salario);
		
		// Encapsulamento
		
		// Interface
		System.out.println("Salario de Joao: "+joao.getSalario());
		joao.aumentarSalario();
		
		// Imprime salario
		System.out.println("Salario de Joao: "+joao.getSalario());
		

	}

}
