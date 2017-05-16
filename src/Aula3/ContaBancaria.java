package Aula3;

import java.time.LocalDate;

public class ContaBancaria {
	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected LocalDate dataNascimento;
	protected LocalDate dataCriacao;
	
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	private double taxaBancaria = 1;
		
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataNascimento, LocalDate dataCriacao) {
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
		this.dataCriacao = dataCriacao;
		this.dataNascimento = dataNascimento;
	}
	
	public void saque(double valor) throws Exception{
		saldo-=valor;
	}
	
	public void deposita(double valor){
		saldo+=valor;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public double getTaxaBancaria(){
		return taxaBancaria;
	}
	
	public double getTaxaBancaria(int dias){
		return taxaBancaria*dias;
	}
	
	public double getTaxaBancaria(int dias, int meses){
		return taxaBancaria * dias + (meses * 30 * taxaBancaria);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", nomeCliente=" + nomeCliente + ", endCliente=" + endCliente
				+ ", cpfCliente=" + cpfCliente + ", dataNascimento=" + dataNascimento + ", dataCriacao=" + dataCriacao
				+ ", taxaBancaria=" + taxaBancaria + "]";
	}
	
}