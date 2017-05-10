package br.com.fiap.Aula2;

import br.com.fiap.Aula2.Funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rodrigo");
		funcionario.setSalario(10000);
		funcionario.setCpf("44655898745");
		
		System.out.println(funcionario);
		
	}

}
