package br.com.fiap.Aula4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Rodrigo", true, 23, LocalDate.now()));
		clientes.add(new Cliente("Thiago", true, 23, LocalDate.now()));
		clientes.add(new Cliente("Rodrigo", true, 23, LocalDate.now()));
		clientes.add(new Cliente("Rodrigo", true, 23, LocalDate.now()));
		clientes.add(new Cliente("Rodrigo", true, 23, LocalDate.now()));


		
		
	}

}
