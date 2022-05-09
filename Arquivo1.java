
import java.nio.file.*;

public class Arquivo1 {
	public static void main(String[]args) {
		//o parametro é o caminho do diretório 
		Path diretorio = Paths.get("url do diretório");
		//metodo para verificar diretório
		if(Files.isDirectory(diretorio)) {
			System.out.println("Diretorio existe");
		}else {
			System.out.println("Diretorio não existe");
		}
		
	}