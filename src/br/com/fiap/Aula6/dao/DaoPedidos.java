package br.com.fiap.Aula6.dao;

import java.sql.Date;
import java.sql.SQLException;
import br.com.fiap.Aula6.entity.Pedido;

public class DaoPedidos extends Dao{

	public Pedido incluirPedido(Pedido pedido) throws SQLException {
		abrirConexao();
		
		String sql="INSERT INTO PEDIDOS (ID_CLIENTE,DATA,DESCRICAO,VALOR) VALUES (?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, pedido.getIdCliente());
		ps.setDate(2, new Date(pedido.getDate().getTime()));
		ps.setString(3, pedido.getDescricao());
		ps.setDouble(4, pedido.getValor());
		ps.execute();
		
		sql="SELECT LAST_INSERT_ID()";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		if (rs.next()){
			pedido.setId(rs.getInt(1));
		}
		fecharConexao();
		return pedido;
	}
	
	public Pedido buscarPedido(int id) throws SQLException{
		Pedido pedido = null;
		abrirConexao();
		
		String sql="SELECT ID_CLIENTE,DATA,DESCRICAO,VALOR FROM PEDIDOS WHERE ID=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		if (rs.next()){
			pedido=new Pedido(rs.getInt("ID_CLIENTE"), rs.getDate("DATA"),rs.getString("DESCRICAO"), rs.getDouble("VALOR"));
			pedido.setId(id);
		}
		
		fecharConexao();
		return pedido;
	}
	
}
