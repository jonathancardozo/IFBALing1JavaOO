package com.ifba.heranca;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente eu = new Cliente();
		eu.setNome("Jonathan");
		Funcionario fulano = new Funcionario();
		
		Veiculo celta = new Veiculo();
		celta.setValor(25000.0);
		
		Emprestimo meuEmprestimo = new Emprestimo();
		Seguro meuSeguro = new Seguro();
		meuSeguro.setVeiculo(celta);
		
		meuEmprestimo.setValor(1000);
		meuEmprestimo.setTaxa(0.1);
		meuEmprestimo.setContratante(eu);
		meuEmprestimo.setResponsavel(fulano);
		meuEmprestimo.setDataDeContratacao("24//05/2014");
		
		System.out.println("Valor do emprestimo: "+meuEmprestimo.getValor());
		meuEmprestimo.getContratante().getNome();
		
		System.out.println("Taxa Fixa: "+meuEmprestimo.calcularTaxa());
		System.out.println("Taxa de Seguro: "+meuSeguro.calcularTaxa());
	}

}
