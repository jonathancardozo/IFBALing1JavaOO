package com.ifba.construtores.cartao;

public class Bandeira {
	
	// Propriedades ou Campos	
	int codigo;
	String nome; // Mastercard / VISA
	
	// Construtor
	/* Exercício
	 * Crie o método construtor aqui 
	 * Ele deve exigir o SOMENTE o nome da bandeira
	 * */
	// Resposta
	Bandeira(String nome){
		this.nome = nome;
	}	
	
	/*
	 * Exercício
	 * Sobrecarga de Construtores
	 * Crie outro construtor que recebe também o codigo da bandeira.
	 */
	// Resposta
	Bandeira(String nome, int codigo){
		this(nome);
		this.codigo = codigo;
	}
	
	
	
	
}
