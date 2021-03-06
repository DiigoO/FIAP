package br.com.fiap.Aula4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {

	private String numeroRg,numeroCPF,enderešo,nome;
	private int identificador;
	private boolean ativo;
	private int idade;
	private LocalDate dataPrimeiraCompra;
	
	

//	public Cliente(String numeroRg, String numeroCPF, String enderešo, String nome, int identificador, boolean ativo,
//			int idade, LocalDateTime dataPrimeiraCompra) {
//		super();
//		this.numeroRg = numeroRg;
//		this.numeroCPF = numeroCPF;
//		this.enderešo = enderešo;
//		this.nome = nome;
//		this.identificador = identificador;
//		this.ativo = ativo;
//		this.idade = idade;
//		this.dataPrimeiraCompra = dataPrimeiraCompra;
//	}
//
//	public Cliente(int identificador, String nome) {
//		// TODO Auto-generated constructor stub
//		this.identificador = identificador;
//		this.nome = nome;
//	}

	public Cliente(String nome, boolean ativo, int idade, LocalDate dataPrimeiraCompra) {
		super();
		this.nome = nome;
		this.ativo = ativo;
		this.idade = idade;
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}


	public String getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public LocalDate getDataPrimeiraCompra() {
		return dataPrimeiraCompra;
	}

	public void setDataPrimeiraCompra(LocalDate dataPrimeiraCompra) {
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}

	@Override
	public String toString() {
		return "Cliente [numeroRg=" + numeroRg + ", numeroCPF=" + numeroCPF + ", enderešo=" + enderešo + ", nome="
				+ nome + ", identificador=" + identificador + "]";
	}
	
}
