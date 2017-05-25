package br.com.fiap.Aula6.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	protected Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	private String url = "jdbc::mysql://localhost:3306/vendas";
	
	protected void abrirConexao() throws SQLException{
		con = DriverManager.getConnection(url, "root", "fiap");
	}
	
	protected void fecharConexao() throws SQLException{
		con.close();
		if(ps != null) ps.close();
		if(rs != null) rs.close();
	}
	
}
