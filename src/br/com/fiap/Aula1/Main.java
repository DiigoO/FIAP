package br.com.fiap.Aula1;

import br.com.fiap.Aula2.Funcionario;

public class Main {

	public static void main(String[] args) {
		/*System.out.println("Olá Mundo!");
		Aluno aluno = new Aluno(10, "Rodrigo");
		System.out.println(aluno);*/
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rodrigo");
		funcionario.setSalario(10000);
		funcionario.setCpf("44655898745");
		
		System.out.println(funcionario);
		
	}

}
