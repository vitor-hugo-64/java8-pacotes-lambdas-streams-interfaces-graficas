package unidade04.InterfaceMap;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LojaVirtual {
	
	static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();
	
	public static void main(String[] args) {
		
		// Criar os cursos disponiveis no site para venda
		Curso Java8 = new Curso( 1, "Java 8 Para web", 2000, Paths.get("/Java8"));
		Curso Oracle = new Curso( 2, "Oracle", 2500, Paths.get("/Oracle"));
		Curso CursoPHP7 = new Curso( 3, "Oracle 12c", 1500, Paths.get("/php7"));
		
		// Cadastrar os cursos do cliente
		
		// Criar lista de cursos de cliente
		
		// *** NÃO TERMINADO, NÃO INTENDI ISSO DIREITO *** //
		
		
		
	}

}
