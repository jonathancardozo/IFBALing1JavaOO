package com.ifba.exemplos;

public class ExEstrelasWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		String estrelas = "";
		while(i < 5){
			estrelas += "*";
			System.out.println(estrelas);
			i++;
		}
		
		// Em FOR
		
		estrelas = "";
		for(int a=0; a < 5; a++){
			estrelas += "*";
			System.out.println(estrelas);
		}
		

	}

}
