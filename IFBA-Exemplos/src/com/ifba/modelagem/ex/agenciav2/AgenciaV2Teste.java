package com.ifba.modelagem.ex.agenciav2;

public class AgenciaV2Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Banco do Brasil
		Banco bb = new Banco();
		bb.nome = "Banco do Brasil";
		
		// Banco Bradesco
		Banco bradesco = new Banco();
		bradesco.nome = "Bradesco";
		
		// Agencia BB Euclides
		Agencia agBBEuclides = new Agencia();
		agBBEuclides.banco = bb;
		agBBEuclides.cidade = "Euclides da Cunha";
		agBBEuclides.numero = 7919;
		
		// Agencia BB Monte Santo
		Agencia agBBMonte = new Agencia();
		agBBMonte.banco = bb;
		agBBMonte.cidade = "Monte Santo";
		agBBMonte.numero = 8020;
		
		// Agencia Bradesco Euclides
		// ...
		// Agencia Bradesco Monte Santo
		// ...
		
		// Saida
		System.out.println("Agencia BB de Euclides da Cunha");
		System.out.println("Cidade: "+agBBEuclides.cidade);
		System.out.println("Numero: "+agBBEuclides.numero);
		System.out.println("Banco: "+agBBEuclides.banco.nome);
		
		System.out.println("Agencia BB de Monte Santo");
		System.out.println("Cidade: "+agBBMonte.cidade);
		System.out.println("Numero: "+agBBMonte.numero);
		System.out.println("Banco: "+agBBMonte.banco.nome);
		
		
		
		

	}

}
