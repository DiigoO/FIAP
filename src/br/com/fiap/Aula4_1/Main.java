package br.com.fiap.Aula4_1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cliente> listaCliente = new ArrayList<>();
		
//		listaCliente.add(new Cliente());
		
		listaCliente.stream()
		.filter(c -> 
		Period.between(c.getDataUltimaCompra(),LocalDate.now()).getYears() >= 5)
		.forEach(c -> c.setInativo(true));
		
		Double idadeMedia = listaCliente.stream()
				.mapToInt(Cliente::getIdade)
				.average()
				.getAsDouble();
		
		int idadeMaxima = listaCliente.stream()
				.mapToInt(Cliente::getIdade)
				.max()
				.getAsInt();
		
		int idadeMinima = listaCliente.stream()
				.mapToInt(c -> c.getIdade())
				.min()
				.getAsInt();
		
		System.out.println("Idade media: " + idadeMedia);
		System.out.println("Idade minima: " + idadeMinima);
		System.out.println("Idade maxima: " + idadeMaxima);
		
	}

}
