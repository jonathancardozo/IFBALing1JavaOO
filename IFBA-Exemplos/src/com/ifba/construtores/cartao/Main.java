package com.ifba.construtores.cartao;

public class Main {
	
	public static void main(String[] args) {
		
		// Cria objeto do tipo Cliente
		// Errado
		// Cliente novoCliente = new Cliente();
		
		// Certo - Passando os parametros exigidos
		Cliente novoCliente = new Cliente("Jonathan Cardozo");
		System.out.println("novoCliente: "+novoCliente.nome);
		
		// Cria objeto do tipo Cartao
		// Errado
		//Cartao novoCartao = new Cartao();
		
		// Certo - Passando os parametros exigidos
		Cartao novoCartao = new Cartao(12345);
				
		// Sobrecarga de construtores
		Cartao outroNovoCartao = new Cartao(123,novoCliente);
		
		/*
		 * Exercício
		 * Faça com que seus objetos do tipo Cartao exigam a
		 * relação com um objeto do tipo Bandeira na inicialização
		 * */
		// Resposta
		Bandeira novaBandeira = new Bandeira("Visa", 123);
		Cartao novoCartaoExercicio = new Cartao(123,novoCliente,novaBandeira);
				
	}

}
