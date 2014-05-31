package com.ifba.exemplos;

public class Estruturas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Estruturas de Controle
		
		// Tipo Seleção (bifurcações)
		
		// IF
		if(true){ // Condição ou pergunta booleano
			System.out.println("É true, mano.");
		}
		
		boolean val = false;
		if(val){
			System.out.println("É true, mano.");
		}			
		
		// IF ELSE
		val = false;
		if(val){
			System.out.println("[IF-ELSE] É true, mano.");
		} else {
			System.out.println("[IF-ELSE] É false, mano.");
		}
		
		// IF ELSE-IF
		int meuInt = 9;
		if(meuInt > 10){
			System.out.println("[IF-ELSE-IF] Maior que 10.");
		} else if(meuInt < 10) {
			System.out.println("[IF-ELSE-IF] Maior ou igual a 10.");
		} else {
			System.out.println("[IF-ELSE-IF] Nenhum deles.");
		}
		
		// SWITCH CASE
		int menu = 1;
		switch(menu){
			case 0:
				System.out.println("[SWITCH] Escolheu 0.");
				break;
			case 1:
				System.out.println("[SWITCH] Escolheu 1.");
				break;
			case 2:
				System.out.println("[SWITCH] Escolheu 2.");
				break;
			default:
				System.out.println("[SWITCH] Nenhuma das opções.");
				break;
		}
		
		// Tipo Repetição (loops, rotatórias)
		
		// While
		int i = 0;
		while(i < 10){
			System.out.println("Loop: "+i);
			i++;
		}
		
		// Do While
		i = 0;
		do {
			System.out.println("Loop: "+i);
			i++;
		} while(i < 1);
		
		// FOR
		for(i = 0; i <= 10; i++){
			System.out.println("[FOR] Loop: "+i);
		}
		
	}

}
