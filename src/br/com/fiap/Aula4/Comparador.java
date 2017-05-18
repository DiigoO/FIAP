package br.com.fiap.Aula4;

import java.util.Comparator;

public class Comparador implements Comparator<Cliente>{
	public int compare(Cliente cliente, Cliente outroCliente) {
		return cliente.getNome().
				compareTo(outroCliente.getNome());
	}
}