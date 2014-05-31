package com.ifba.exemplos;

public class Variaveis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Exemplo de Declaração de Variáveis		
		 */
		
		// Declaração da variável
		int numeroDaConta;
		double precoDoProduto;
		
		// Inicialização
		numeroDaConta = 1;
		precoDoProduto = 9.90;
		
		// Declaração + Inicialização
		int numeroDaAgencia = 3515;		
		
		// Tente o uso sem inicializar
		//int semInicializar;
		
		// Tentando declarar com o mesmo nome
		//int numeroDaConta = 2;
		
		System.out.println("Numero da Conta: "+numeroDaConta);
		System.out.println("Preço do Produto: "+precoDoProduto);
		System.out.println("Numero da Agência: "+numeroDaAgencia);
		//System.out.println("Variavel sem inicializar: "+semInicializar);

	}

}
