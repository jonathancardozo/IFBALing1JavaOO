package com.ifba.modelagem.casa;

public class Casa {
		
	// Propriedades
	int numero;
	String proprietario;
	String endereco;
	int quantosMoradores;
	int quantosComodos;
	boolean estaFechada;
	boolean temEnergia;
	boolean temAgua;
	
	// Métodos
	
	public void informaNumero(int numero){
		this.numero = numero;
	}
	
	public void informaDono(String nome){
		this.proprietario = nome;
	}
	
	public void informaEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public void informaQuantosMoradores(int n){
		this.quantosMoradores = n;
	}
	
	public void informaQuantosComodos(int n){
		this.quantosComodos = n;
	}
	
	public void informaSeEstaFechada(boolean b){
		this.estaFechada = b;
	}
	
	public void informaSeTemEnergia(boolean b){
		this.temEnergia = b;
	}
	
	public void informaSeTemAgua(boolean b){
		this.temAgua = b;
	}
	
	public int pedeNumero(){
		return this.numero;		
	}
	
	public String pedeProprietario(){
		return this.proprietario;
	}
	
	// ... continua
	
	

}
