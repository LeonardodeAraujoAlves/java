package banco;

import java.util.Scanner;
import java.sql.*;


public class database {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int op = 0;
		
		String id = "";
		String nome = "";
		String matricula = "";
		
		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Inserir registro");
			System.out.println("2. Buscar registro");
			System.out.println("3. Alterar registro");
			System.out.println("4. Eliminar registro");
			System.out.println("5. Mostrar os registros");
			System.out.println("6. Sair");
			
			System.out.println("Opção");
			op = in.nextInt();
			in.nextLine();
			
			switch(op) {
				
			default:
					break;
			
			case 1:
				System.out.println("\n Registrar Aluno");
				
				System.out.println(" Nome:");
				nome = in.nextLine();
				
				System.out.println(" Matricula:");
				matricula = in.nextLine();
				
				ControllerDB.inserir(nome,matricula);
				break;
			
			case 2:
				System.out.println("\n Digite o id para buscar\n");
				id = in.nextLine();
				//ControllerDB.buscar(id);
				break;
			
			case 3:
				System.out.println("\nAlterar registro\n");
				id = in.nextLine();
				System.out.println("Novo nome");
				nome = in.nextLine();
				System.out.println("Nova matricula");
				matricula = in.nextLine();
				//ControllerDB.alterar(id,nome,matricula);
				break;
				
			case 4:
				System.out.println("\nDigite o id para eliminar\n");
				System.out.println("ID:");
				id = in.nextLine();
				//ControllerDB.eliminar(id);
				break;
				
			case 5:
				System.out.println("\nMostrar todos os registros\n");
				//ControllerDB.mostrarTodos();
			};
			
		}while(op != 6);
		
		
		//ControllerDB.inserir();
	}

	
}
