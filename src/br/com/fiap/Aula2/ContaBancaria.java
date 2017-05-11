package br.com.fiap.Aula2;
public class ContaBancaria {
	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
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

	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public void saque(double valor){
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
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", nomeCliente=" + nomeCliente + ", endCliente=" + endCliente
				+ ", cpfCliente=" + cpfCliente + ", taxaBancaria=" + taxaBancaria + "]";
	}	
}