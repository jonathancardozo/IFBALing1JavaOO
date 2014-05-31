package com.ifba.modelagem.cartaocredito;

public class TesteCartao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cartao cartao = new Cartao();
		cartao.numero = 1;
		
		// Objeto Cliente
		Cliente cliente = new Cliente();
		cliente.nome = "Jonathan";
		
		// Objeto Bandeira
		Bandeira mastercard = new Bandeira();
		mastercard.codigo = 1;
		mastercard.nome = "Mastercard";
		
		Bandeira visa = new Bandeira();
		visa.codigo = 2;
		visa.nome = "Visa";
		
		// Acesso Direto ao Objeto Bandeira
		System.out.println("Nome da Bandeira: "+mastercard.nome);
		
		// Relações
		cartao.cliente = cliente; // Agregação
		cartao.bandeira = visa; // Agregação
		
		// Acesso indireto
		System.out.println(cartao.bandeira.nome);		
		
		// Acesso indireto
		System.out.println(cartao.cliente.nome);
		
		// Alterando indiretamente
		cartao.cliente.nome = "Jonathan Cardozo";
		
		// Novamente
		System.out.println(cartao.cliente.nome);
		

	}

}
