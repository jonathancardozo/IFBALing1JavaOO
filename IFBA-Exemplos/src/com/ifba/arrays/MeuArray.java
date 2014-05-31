package com.ifba.arrays;

public class MeuArray {
	
	public static void main(String[] args) {		
		
		// Array ou Vetor de Numeros
		int[] numeros = new int[100];
		
		/*
		 * int - tipos de dados
		 * [] - indica que é um array
		 * numeros - referência
		 * new - inicializador
		 * 100 - tamanho, nesse array cabem 100 numeros
		 * numeracao de 0 a 99
		 */
		
		// Atribuindo valores
		numeros[0] = 136;
		// [] indica vetor
		// 0 - seleciona o indice 0
		// 111 - inteiro que será armazenado
		numeros[99] = 17;
		
		
		// Outras formas de inicialização
		int[] numeros2 = new int[]{1,2};
		int[] numeros3 = {1,2};
		
		// Recuperando ou acessando valores do vetor
		int indiceZero = numeros[0];
		// Onde 0 é o indice desejado;
		int indiceNoventaENove = numeros[99];
		
		// Diretamente
		System.out.println(indiceZero);
		System.out.println(indiceNoventaENove);
		System.out.println(numeros[0]);
		System.out.println(numeros[99]);
		
		// Percorrendo
		// Tamanho vetor.length
		for(int i = 0; i < numeros.length; i++){
			// i representara o indice atualizado
			System.out.println("indice:"+i+"; valor:"+numeros[i]);
		}
		
		/**
		 * Crie um array vazio de tamanho 100
		 * e o preencha programaticamente.
		 * O valor de cada indice será o índice multiplicado por 2.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int[] numerosEx = new int[100];
		for(int i = 0; i < numerosEx.length; i++){
			numerosEx[i] = i * 2;
		}
		for(int i = 0; i < numerosEx.length; i++){
			System.out.println("indice:"+i+"; valor:"+numerosEx[i]);
		}
		
	}

}
