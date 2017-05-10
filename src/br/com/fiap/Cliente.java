package br.com.fiap;

public class Cliente {

	private String numeroRg,numeroCPF,endereço,nome;

	public Cliente(String numeroRg, String numeroCPF, String endereço, String nome) {
		this(numeroRg);
		this.numeroCPF = numeroCPF;
		this.endereço = endereço;
		this.nome = nome;
	}
	
	public Cliente(String numeroRg){
		this();
		this.numeroRg = numeroRg;
	}
	
	public Cliente(){
	}
}
