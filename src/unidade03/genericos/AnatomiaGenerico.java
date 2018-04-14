package unidade03.genericos;

public class AnatomiaGenerico {
	
	public static void main(String[] args) {
		ExemploGenerics2< Integer, String> generico = new ExemploGenerics2<>( 88, "Vitor Hugo");
		generico.showType();
	}

}
