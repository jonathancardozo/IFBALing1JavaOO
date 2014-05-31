package com.ifba.metodos.pessoa;

/**
 * Main Pessoa
 * @author Jonathan
 * Programa que exemplifica m�todos
 */

public class Main {

	public static void main(String[] args) {
		
		// Uma Pessoa
		Pessoa eu = new Pessoa();
		eu.nome = "Jonathan"; // Acesso direto
		eu.idade = 18; // Acesso direto
		
		// Atrav�s dos m�todos
		eu.setNome("Jonathan Cardozo");
		eu.setIdade(28);
		
		// Recupera valores
		System.out.println(eu.getNome());
		System.out.println(eu.getIdade());
		eu.fazAniversario();
		System.out.println(eu.getIdade());
		System.out.println(eu.getFicha());
		
		

	}

}
