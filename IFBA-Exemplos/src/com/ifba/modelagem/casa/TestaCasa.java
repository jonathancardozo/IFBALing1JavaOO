package com.ifba.modelagem.casa;

public class TestaCasa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sem referencia
		new Casa();
		
		// Referencia
		Casa minhaCasa = new Casa();
		
		minhaCasa.informaNumero(1);
		minhaCasa.informaDono("Jonathan");
				
		System.out.println("Numero da Casa: "+minhaCasa.pedeNumero());
		System.out.println("Proprietário da Casa: "+minhaCasa.pedeProprietario());
		
		

	}

}
