package br.com.fiap;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		Aluno aluno = new Aluno(10, "Rodrigo");
		System.out.println(aluno);

		int n = 12;
		String m = "";
		while (n > 0) {
			m = n % 2 + m;
			n /= 2;
		}
		System.out.println(m);
	}

}
