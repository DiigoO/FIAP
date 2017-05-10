package br.com.fiap.Aula2;
public class ContaPoupanca extends ContaBancaria {
	private int diaAniversario;
	
	@Override
	public void saque(double valor)
	{
		saldo-=valor-0.10;
	}
}