package com.ifba.exemplos;

public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Exemplo do uso de operadores
		 */		
		
		// Operadores Aritméticos
		
		// Soma (+)
		int soma = 2 + 2;		
		System.out.println("Soma 2 + 2 = " + soma);
		
		// Subtração (-)
		int sub = 10 - 5;
		System.out.println("Subtração 10 - 5 = " + sub);
		
		// Multiplicação (*)		
		int mult = 2 * 2;
		System.out.println("Multiplicação 2 * 2 = " + mult);
		
		// Divisão (/)
		int div = 4 / 2;
		System.out.println("Divisão 4 / 2 = " + div);
		
		// Módulo (%)
		int mod = 7 % 2;
		System.out.println("Módulo 7 % 2 = " + mod);
		System.out.println("Módulo 4 % 3 = " + (4 % 3));
		
		/* 
		 * Realize as seguintes operações e exiba o resultado no console
		 *  
		 */
		
		// 1) 10 + 20
		System.out.println(10+20);
		
		// 2) 2 + 2 - 2
		System.out.println(2+2-2);
		
		// 3) 4 * 10 - 10
		System.out.println(4*10-10);
		
		// 4) 10 / 5
		System.out.println(10/5);
		
		// 5) 10 / 2
		System.out.println(10/2);
		
		// 6) 3 modulo de 2
		System.out.println(3%2);
		
		// 7) 10 modulo de 3
		System.out.println(10%3);
		
		// 8) (10 + 20) * 1000 / 2
		System.out.println((10 + 20)*1000/2);
		
		// ++ Incremento
		int valor = 1;
		valor++; // 2
		valor++; // 3
		
		// -- Decremento
		valor--; // 2
		valor--; // 1
		
		// Atribuição
		
		// =
		int meuInt = 10;	
		
		// += Atribuição Aditiva
		meuInt += 20; // 30
					
		// -= Subtração composta
		meuInt -= 20; // 10
				
		// *= Multiplicação composta
		meuInt *= 2; // 20
		
		// /= Divisão composta
		meuInt /= 2; // 10
		
		// %= Módulo composto
		meuInt %= 2; // 0	
		
		// Relacional (buleano true ou false)
		
		meuInt = 0;
		int meuOutro = 0;
		
		// == Igualdade
		// meuInt == 0 -> true
		// meuInt == meuOutro -> true
		boolean resultado = (meuInt == meuOutro); // true		
		
		// != Diferença
		resultado = (meuInt != meuOutro); // false
		
		// <
		//( 1 < 2) -> true
		//( 2 < 1) -> false
		
		// <=
		//( 1 <= 2 ) -> true
		//( 1 <= 1) -> true
		//( 1 <= 0) -> false
		
		// >
		// (1 > 2) -> false
		// (2 > 1) -> true
		
		// >=
		// (1 >= 0) -> true
		// (1 >= 1) -> true
		// (1 >= 2) -> false		
		
		// Lógico
		
		// && (exigente)
		// (1 > 0 && 1 > 2) -> false
		// (1 > 0 && 2 < 1) -> false
		// (1 >= 1 && 2 < 2) -> false
		// (1 >= 1 && 1 <= 2) -> true
		
		// Encontre um valor entre 5 e 10
		// int x;
		// (x >= 1 && x <= 10)
		// (x > 0 && x < 11)
		
		// || (ou, relaxado)
		// (1 > 0 || 1 > 2) -> true
		// (1 > 0 || 2 < 1) -> true
		// (0 > 1 || 2 < 1) -> false
		// (1 > 0 || 0 < 1) -> true
		
		
		/* 
		 * Exercicios
		 * 
		 * 1) Acrescente 32000 ao valor atual de meuInt
		 * 2) Subtraia 1000 do valor atual de meuInt
		*/
		meuInt = 30;
		meuInt += 32000;
		System.out.println("meuInt acrescido 32000: " + meuInt);
		meuInt -= 1000;
		System.out.println("meuInt acrescido 1000: " + meuInt);
		
		int varUm = 0;
		int varDois = 0;
		System.out.println("varUm igual a varDois?");
		System.out.println(varUm == varDois);
		System.out.println("varUm diferente de varDois?");
		System.out.println(varUm != varDois);
		
		

	}

}
