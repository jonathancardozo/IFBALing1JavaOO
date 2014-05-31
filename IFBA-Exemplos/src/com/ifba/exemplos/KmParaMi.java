package com.ifba.exemplos;

import java.util.Scanner;

public class KmParaMi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double medida, resultado = 0;
		int tipo;
		Scanner sc = new Scanner(System.in);
		final double kmEmMi = 0.621371192; 
		
		System.out.println("Informa o tipo de medida (1 - km, 2 - mi):");
		tipo = sc.nextInt();
		System.out.println("Informa a medida:");
		medida = sc.nextFloat();
		
		if(tipo==1){
			// KM
			System.out.println("Medida em Quilometros: "+medida);
			
			resultado = medida * kmEmMi;
			
		} else if(tipo==2){
			// MI
			System.out.println("Medida em Milhas: "+medida);
			
			resultado = medida / kmEmMi;
		} else {
			System.out.println("Opção inválida");
		}
		
		if(resultado != 0){
			
			if(tipo==1){
				System.out.println("Resultado em Milhas: "+resultado);
			} else {
				System.out.println("Resultado em Quilometros: "+resultado);
			}
			
		}
		
		

	}

}
