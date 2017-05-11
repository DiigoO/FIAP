package br.com.fiap.Aula2;
public class ContaPoupanca extends ContaBancaria implements Tributacao{
	private int diaAniversario;
	
	@Override
	public void saque(double valor){
		saldo-=valor-0.10;
	}
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	@Override
	public double calcularTributo() {
		// TODO Auto-generated method stub
		return 0*0.03;
	}
	
}