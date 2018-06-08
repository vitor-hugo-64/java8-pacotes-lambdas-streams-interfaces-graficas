package unidade05.Sintaxe;

public class CalculadoraV2 {
	
	public static void main(String[] args) {
		
		CalculadoraV2 objeto = new CalculadoraV2();
		IMath somar = ( a, b) -> a + b;
		IMath subtrair = ( a, b) -> a - b;
		IMath multiplicar = ( a, b) -> a * b;;
		IMath dividir = ( a, b) -> a / b;
		IMath exponenciacao = ( a, b) -> Math.pow( a, b);
		IMath radiacao = ( a, b) -> Math.pow( a, 1/b);
		
		System.out.println(objeto.execOperacao( 5, 3, somar));
		System.out.println(objeto.execOperacao( 5, 3, subtrair));
		System.out.println(objeto.execOperacao( 5, 5, multiplicar));
		System.out.println(objeto.execOperacao( 10, 2, dividir));
		System.out.println(objeto.execOperacao( 5, 3, somar));
		System.out.println(objeto.execOperacao( 5, 3, exponenciacao));
		System.out.println(objeto.execOperacao( 5, 3, radiacao));
	}
	
	public double execOperacao(double a, double b, IMath op){
		return op.operacao( a, b);
	}
}
