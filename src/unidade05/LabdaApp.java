package unidade05;
import java.util.Arrays;
import java.util.List;


public class LabdaApp {
	
	static int numero; // para se usar variaveis dentro de espressões lambda ela podem ser declaradas como atributo de ojeto statico ou local
	int numero2;
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList( 1, 2, 3, 4);
		
		LabdaApp app = new LabdaApp(); // aqui se instancia um novo objeto lambda
		
		integers.forEach( (Integer x) -> System.out.println(x));
		
		integers.forEach( x ->
		{
			numero = 10; // para usar o atributo de objeto ness formato é necessário ser statico
			app.numero2 = x + numero;
			System.out.println(app.numero2); // para usar variavel local é necessário usar o objeto app para acessar o atributo
		});
		
	}

}
