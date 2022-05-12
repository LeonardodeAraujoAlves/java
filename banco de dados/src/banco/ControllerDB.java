package banco;

import java.sql.*;

public class ControllerDB {

	public static void inserir(String nome, String matricula) {
		try {
			
			String sqlQuery = "insert into alunos values(?,?,?)";
			PreparedStatement pst = connection.conectar().prepareStatement(sqlQuery);
			
			pst.setString(1, "0");
			pst.setString(2, nome);
			pst.setString(3, matricula);
			
			pst.executeUpdate();
			
			System.out.println("Registro relizado");
		}catch(SQLException ex) {
			System.out.println("Erro:\n" + ex);
		}
	}
	
	public static void buscar() {
		
	}
	
	public static void alterar() {
		
	}
	
	public static void eliminar() {
		
	}
	
	public static void mostrarTodos() {
		
	}
	
	
}
