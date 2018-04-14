package unidade03.genericos;

public class UsoGenereico {
	
	public static void main(String[] args) {
		
		// aqui é instanciado primeiro um generico do tipo int
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType();
		
		// aqui é instanciado um genérico do tipo String
		ExemploGenerics<String> sob = new ExemploGenerics<>("Vitor Hugo");
		sob.showType();
		
	}

}
