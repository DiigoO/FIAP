package br.com.fiap.Aula4_1;

import java.time.LocalDate;

public class Cliente {
	
	private String nome;
	private int idade;
	private boolean isAtivo;
	private boolean isInativo;
	private LocalDate dataUltimaCompra;
	
	public Cliente(String nome, int idade,LocalDate dataUltimaCompra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataUltimaCompra = dataUltimaCompra;
	}
	
	public boolean isInativo() {
		return isInativo;
	}

	public void setInativo(boolean isInativo) {
		this.isInativo = isInativo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public LocalDate getDataUltimaCompra() {
		return dataUltimaCompra;
	}
	public void setDataUltimaCompra(LocalDate dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", isAtivo=" + isAtivo + ", isInativo=" + isInativo
				+ ", dataUltimaCompra=" + dataUltimaCompra + "]";
	}

}
