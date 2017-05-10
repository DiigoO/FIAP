package br.com.fiap.Aula2;

public class ContaEspecial extends ContaBancaria{
	
	@Override
	public void saque(double valor){
		saldo -= valor * 0.1;
	}
	
	@Override
	public void deposita(double valor){
		saldo += valor * 0.1;
	}

}
