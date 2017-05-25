package CadastroClientes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.Aula6.dao.DaoCliente;
import br.com.fiap.Aula6.dao.DaoPedidos;
import br.com.fiap.Aula6.entity.Cliente;
import br.com.fiap.Aula6.entity.Pedido;

public class CadastroClientes {

	public static void main(String[] args) {

		try {

			System.out.println("Cadastrando Cliente ...");

			DaoCliente clientes = new DaoCliente();
			DaoPedidos pedidos = new DaoPedidos();

			List<Pedido> pedidosCliente = new ArrayList<>();

			Cliente cliente = new Cliente("João", "j@jose.com", pedidosCliente);
			cliente = clientes.incluirCliente(cliente);

			pedidosCliente.add(new Pedido(cliente.getId(), new Date(), "Materiais Gerais", 2000));
			pedidosCliente.add(new Pedido(cliente.getId(), new Date(), "Materiais Papelaria", 4520));

			for (Pedido pedido : pedidosCliente) {
				pedido = pedidos.incluirPedido(pedido);
			}

			System.out.println("Cadastrando Cliente Finalizado!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}