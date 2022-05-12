package banco;

import java.sql.*;

public class connection {

	public static Connection conectar() {
		
		try {
			
			String con = "jdbc:mysql://localhost/banco_curso?useTimezone=true&serverTimezone=UTC";
			String user = "";
			String pass = "";
			
		
			Connection conexao = DriverManager.getConnection(con ,user, pass);
			System.out.println("conectado");
			return conexao;
		
			}catch(SQLException ex) {
			return null;
		}
	}
	
}
