package com.ifba.construtores.cartao;
/**
 * Classe que demonstra a implemetação de Construtores
 * Todo cartão precisa de um número e de um dono
 * @author Jonathan
 */
public class Cartao {
	
	// Propriedades ou Campos
	int numero;
	Cliente cliente;
	// Bandeira Aqui
	Bandeira bandeira;
	
	/*
	 * Método Construtor
	 * ! - Deve ter o mesmo nome da classe
	 * Será executado quando o operador new for usado
	 */
	Cartao(int numero){
		this.numero = numero;
	}
	
	/*
	 * Sobrecarga de Construtores
	 * Dar opções de inicialização da classe
	 * ! - Deve ter o mesmo nome do construtor
	 * ! - Deve ter parametros diferentes do construtor
	 * */
	Cartao(int numero, Cliente cliente){
		this(numero);
		this.cliente = cliente;
	}
	
	// Resposta	
	Cartao(int numero, Cliente cliente, Bandeira bandeira){
		this(numero,cliente);
		this.bandeira = bandeira;
	}
	
}
