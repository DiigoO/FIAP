package br.com.fiap.Aula6.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.Aula6.entity.Cliente;
import br.com.fiap.Aula6.entity.Pedido;

public class DaoCliente extends Dao{
	
	public Cliente incluirCliente(Cliente c) throws SQLException{
		abrirConexao();
		String sql ="INSERT INTO CLIENTES(NOME,EMAIL) VALUES(?,?)";
		ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getNome());
		ps.setString(2, c.getEmail());
		ps.execute();
		ps.close();
		
		sql = "SELECT LAST_INSERT_ID()";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		
		if(rs.next()){
			c.setId(rs.getInt("ID"));
		}
		
		fecharConexao();
		
		return c;
	}
	
	public Cliente buscarCliente(int id) throws SQLException{
		Cliente cliente = null;
		List<Pedido> pedidos = new ArrayList<>();
		
		abrirConexao();
		
		String sql = "SELECT IDPEDIDO, DATA, DESCRICAO, VALOR FROM PEDIDOS WHERE IDCLIENTE = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while (rs.next()) {
			Pedido p = new Pedido(id, rs.getDate("DATA"), rs.getString("DESCRICAO"), rs.getDouble("VALOR"));
			p.setId(rs.getInt("IDPEDIDO"));
			pedidos.add(p);
		}
		rs.close();
		ps.close();
		
		if (rs.first()) {
			cliente = new Cliente(rs.getString("NOME"), rs.getString("NOME"), pedidos);
			cliente.setId(id);
		}
		rs.close();
		ps.close();
		fecharConexao();
		
		return cliente;
	}

}
