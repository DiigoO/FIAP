package br.com.fiap.Aula7.dao;

import java.util.List;

import br.com.fiap.Aula7.entity.Pedidos;

public interface PedidosDao {
	void incluirPedido(Pedidos pedido) throws Exception;
	List<Pedidos> listarPedidos(int idCliente) throws Exception;
}