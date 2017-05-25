package br.com.fiap.Aula6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;



public class App {

	private static Connection con;
	private static Statement stm;
	private static PreparedStatement ps;
	
	private static String url = "jdbc:mysql://localhost:3306/vendas";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			con = DriverManager.getConnection(url, "root", "fiap");
			stm = con.createStatement();
			
//			String nome = "Guilherme";
//			String email = "gui@gmail.com";
//			String sql = "INSERT INTO CLIENTES (NOME, EMAIL) VALUES(?,?)";
//			stm.execute("INSERT INTO CLIENTES (NOME, EMAIL) VALUES('"+nome+"','"+email+"')");
//			ps = con.prepareStatement(sql);
//			ps.setString(1, nome);
//			ps.setString(2, email);
			
			ResultSet rs = stm.executeQuery("SELECT * FROM CLIENTES");
			while(rs.next()){
				System.out.println(rs.getString("nome"));
			}
			
//			ps.execute();
			stm.close();
			con.close();
//			ps.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
