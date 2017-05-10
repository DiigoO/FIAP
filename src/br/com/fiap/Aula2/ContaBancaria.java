package br.com.fiap.Aula2;
public class ContaBancaria {
	protected double saldo;
	private double taxaBancaria = 1;
	
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
		return taxaBancaria * dias + (meses * 30);
	}
}