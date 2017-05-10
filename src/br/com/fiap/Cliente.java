package br.com.fiap;

public class Cliente {

	private String numeroRg,numeroCPF,endere�o,nome;

	public Cliente(String numeroRg, String numeroCPF, String endere�o, String nome) {
		this(numeroRg);
		this.numeroCPF = numeroCPF;
		this.endere�o = endere�o;
		this.nome = nome;
	}
	
	public Cliente(String numeroRg){
		this();
		this.numeroRg = numeroRg;
	}
	
	public Cliente(){
	}
}
