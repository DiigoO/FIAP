package Aula3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends ContaBancaria {
	private int diaAniversario;
	
	@Override
	public void saque(double valor) throws Exception{
		if(saldo < valor + 0.10){
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}
		
		LocalDate agora = LocalDate.now();
		long anos = ChronoUnit.YEARS.between(dataCriacao, agora);
		if(anos < 1){
			saldo-=valor-0.10;
		}
	}
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataNascimento, LocalDate dataCriacao) {
		super(nomeCliente, endCliente, cpfCliente, dataNascimento, dataCriacao);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (cpfCliente == null) {
			if (other.cpfCliente != null)
				return false;
		} else if (!cpfCliente.equals(other.cpfCliente))
			return false;
		return true;
	}	
	
}