package br.com.fiap.Aula2;
public class Pessoa
{
	private String nome;
	private String cpf;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return cpf;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", getCpf()=" + getCpf() + ", getNome()=" + getNome()
				+ ", getCPF()=" + getCPF() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}