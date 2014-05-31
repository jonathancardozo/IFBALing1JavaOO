package com.ifba.encapsulamento;

public class Funcionario {
	
	// Permitir o acesso direto não é aconselhavel
	private double salario;
	// geradores
	private String nome;
	
	/*
	 * Construtor
	 */
	Funcionario(double novoSalario){
		this.salario = novoSalario;
	}
		
	/*
	 * Metodo que aumenta o salario do funcionario
	 */
	// Deseja permitir o acesso externo a esse metodo?
	public void aumentarSalario(){
		this.salario = this.salario + this.calculaAumento();
	}
	
	/*
	 * Calcula Aumento
	 * Método auxiliar que calcula o aumento dado ao funcionario 
	 * */
	// Deseja permitir o acesso a esse metodo?
	private double calculaAumento(){
		double taxa = 0.1; // Taxa para aumento
		return this.salario * taxa;
	}
	
	/*
	 * Interface
	 * getSalario
	 * Devolve Salario do Funcionario
	 */
	public double getSalario(){
		return this.salario;
	}

}
