package com.ifba.exemplos;

import java.util.Scanner;

public class ExArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int larg;
		int comp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Largura:");
		larg = sc.nextInt ();
		
		System.out.println("Digite o Comprimento:");
		comp = sc.nextInt ();
		
		int resultado = larg*comp;
		
		System.out.println("Area Total: "+resultado);
		

	}

}
