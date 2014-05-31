package com.ifba.exemplos;

import java.util.Scanner;

public class Soma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		
		//scanf("%d",&variavel);
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite N1:");
		n1 = scanner.nextInt();
		
		System.out.println("Digite N2:");
		n2 = scanner.nextInt();
		
		int resultado = n1 + n2;
		
		System.out.println("Resultado da Soma:"+resultado);	

	}

}

