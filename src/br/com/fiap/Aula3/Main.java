package br.com.fiap.Aula3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Rodrigo", "Souza", "44193060845", LocalDate.of(1994, 04, 01), LocalDate.now());
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Guilherme", "Rodrigues", "441930640845",LocalDate.of(1994, 04, 01), LocalDate.now());
		
		contaPoupanca1.deposita(8000);
		
		try {
			contaPoupanca1.saque(3000);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(contaPoupanca1);
		
	}

}
