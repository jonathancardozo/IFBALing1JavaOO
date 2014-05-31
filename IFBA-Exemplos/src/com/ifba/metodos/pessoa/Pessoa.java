package com.ifba.metodos.pessoa;

/**
 * Pessoa
 * @author Jonathan
 * Modelo de uma pessoa para ajudar o entendimento de métodos
 */

public class Pessoa {
	
	// Propriedades
	String nome; 
	int idade;
	
	// Métodos = Funções em OO	
	
	/**
	 * setNome
	 * void - sem retorno
	 */
	// set - prefixo comum para metodos de inserção
	void setNome(String novoNome){
		
		// Altera propriedade nome
		this.nome = novoNome;
		
	}
	
	/**
	 * setIdade
	 */
	void setIdade(int novaIdade){
		
		// Altera propriedade idade
		this.idade = novaIdade;
	}
	
	/**
	 * getNome
	 * Retorna valores (String)
	 * Sem parametros
	 */
	// get - prefixo comum para retorno de valores
	String getNome(){
		return this.nome;
	}
	
	/**
	 * getIdade
	 */
	int getIdade(){
		return this.idade;
	}
	
	// Faz coisas inteligentes
	
	/**
	 * fazAniversario
	 * Método sem parametros
	 */
	void fazAniversario(){
		this.idade++;
	}
	
	/**
	 * getFicha
	 */
	String getFicha(){
		
		String ficha = "Ficha Completa\n";
		ficha += "Nome: " + this.getNome() + "\n";
		ficha += "Idade: " + this.getIdade();
		
		return ficha;
	}

}
