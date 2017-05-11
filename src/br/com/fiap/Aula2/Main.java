package br.com.fiap.Aula2;

import br.com.fiap.Aula2.Funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rodrigo");
		funcionario.setSalario(10000);
		funcionario.setCpf("44655898745");
		System.out.println(funcionario);
		
		ContaEspecial contaEspecial = new ContaEspecial("Rodrigo", "Souza", "44515544544");
		contaEspecial.deposita(400_000);
		System.out.println(contaEspecial.saldo);
		contaEspecial.saque(20);
		System.out.println(contaEspecial.getSaldo());
		
		System.out.println(contaEspecial.getTaxaBancaria(10,2));
		System.out.println(contaEspecial);
		System.out.println(Classificacao.BAIXO.isCompatible(contaEspecial));
		System.out.println(Classificacao.MEDIO.isCompatible(contaEspecial));
		System.out.println(Classificacao.POTENCIAL.isCompatible(contaEspecial));
	
	}

}
