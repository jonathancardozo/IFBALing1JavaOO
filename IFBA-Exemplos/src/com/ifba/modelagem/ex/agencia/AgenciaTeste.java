package com.ifba.modelagem.ex.agencia;

public class AgenciaTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agencia bb = new Agencia();
		Agencia bradesco = new Agencia();
		
		bb.nome = "Banco do Brasil";
		bb.numero = 7919;
		
		bradesco.nome = "Bradesco";
		bradesco.numero = 3515;
		
		System.out.println("Agencia: "+bb.nome);
		System.out.println("Numero: "+bb.numero);
		
		System.out.println("Agencia: "+bradesco.nome);
		System.out.println("Numero: "+bradesco.numero);
			
	}

}
