package br.com.fiap.Aula1;

public class ex1 {

	public static void main(String[] args) {
		int n = 12;
		String m = "";
		while (n > 0) {
			m = n % 2 + m;
			n /= 2;
		}
		System.out.println(m);
	}

}
