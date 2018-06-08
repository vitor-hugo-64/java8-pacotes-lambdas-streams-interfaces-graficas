package unidade05.Sintaxe;

public class Caculadora {

	public static void main(String[] args) {
		
		IMatematica obj = new IMatematica(){

			@Override
			public int somar(int a, int b) {
				return (a + b);
			}

			@Override
			public int subtrait(int a, int b) {
				return (a - b);
			}

			@Override
			public int multiplicar(int a, int b) {
				return (a * b);
			}

			@Override
			public int dividir(int a, int b) {
				return (a / b);
			}

			@Override
			public int exponenciacao(int a, int b) {
				return (int) Math.pow( a, b);
			}

			@Override
			public int radiciacao(int a, int b) {
				return (int) Math.pow( a, 1/b);
			}
			
		};
		
		System.out.println(obj.getClass());
		System.out.println(obj.somar(2, 1));
		System.out.println(obj.subtrait(2, 1));
		System.out.println(obj.multiplicar(2, 2));
		System.out.println(obj.dividir( 2, 2));

	}

}
