package br.com.fiap.Aula2;

public enum Classificacao{
	
	POTENCIAL(400_000,500_000),
	MEDIO(200_000,400_000),
	BAIXO(0,200_000);
	
	private double faixaInicial;
	private double faixaFinal;
	
	private Classificacao(double faixaInicial, double faixaFinal) {
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}

	public boolean isCompatible(ContaBancaria conta){
		if(conta.getSaldo() >= faixaInicial && conta.getSaldo() <= faixaFinal){
			return true;
		}else{
			return false;
		}
	}

}
