package br.com.fiap.Aula7.dao;

import br.com.fiap.Aula7.entity.Clientes;

public interface ClientesDao {
	Clientes inserirCliente(Clientes cliente) throws Exception;
	Clientes buscarCliente(int id) throws Exception;
}
