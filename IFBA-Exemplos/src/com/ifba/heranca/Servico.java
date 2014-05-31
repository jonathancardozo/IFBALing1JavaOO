package com.ifba.heranca;

public class Servico {
	
	// Propriedades
	
	// Cliente
	private Cliente contratante;
	
	// Funcionario
	private Funcionario responsavel;
	
	// Data da Contratacao
	private String dataDeContratacao;
	
	// Métodos	
	// Getters	
	public Cliente getContratante(){
		return this.contratante;
	}	
	public Funcionario getResponsavel(){
		return this.responsavel;
	}	
	public String getDataDeContratacao(){
		return this.dataDeContratacao;
	}	
	// Setters
	public void setContratante(Cliente cliente){
		this.contratante = cliente;
	}	
	public void setResponsavel(Funcionario responsavel){
		this.responsavel = responsavel;
	}
	public void setDataDeContratacao(String dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}
	
	public double calcularTaxa(){
		return 10.0;
	}
	
	
}
