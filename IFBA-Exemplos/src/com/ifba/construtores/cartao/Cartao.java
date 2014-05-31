package com.ifba.construtores.cartao;
/**
 * Classe que demonstra a implemeta��o de Construtores
 * Todo cart�o precisa de um n�mero e de um dono
 * @author Jonathan
 */
public class Cartao {
	
	// Propriedades ou Campos
	int numero;
	Cliente cliente;
	// Bandeira Aqui
	Bandeira bandeira;
	
	/*
	 * M�todo Construtor
	 * ! - Deve ter o mesmo nome da classe
	 * Ser� executado quando o operador new for usado
	 */
	Cartao(int numero){
		this.numero = numero;
	}
	
	/*
	 * Sobrecarga de Construtores
	 * Dar op��es de inicializa��o da classe
	 * ! - Deve ter o mesmo nome do construtor
	 * ! - Deve ter parametros diferentes do construtor
	 * */
	Cartao(int numero, Cliente cliente){
		this(numero);
		this.cliente = cliente;
	}
	
	// Resposta	
	Cartao(int numero, Cliente cliente, Bandeira bandeira){
		this(numero,cliente);
		this.bandeira = bandeira;
	}
	
}
