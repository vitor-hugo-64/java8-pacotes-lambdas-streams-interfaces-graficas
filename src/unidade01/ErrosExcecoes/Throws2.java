package unidade01.ErrosExcecoes;

import java.util.Scanner;

public class Throws2 {
	
	public static void dividir( int v1, int v2)  throws ArithmeticException { // aqui na fun��o � usado para tratar o erro quando for chamada a fun��o
		
		System.out.println( v1 / v2);

	}
	
	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		int v1 = entrada.nextInt();
		int v2 = entrada.nextInt();
		try {
			dividir( v1, v2); // caso a divis�o seja por 0 vai gerar erro
		} catch (ArithmeticException e) {
			System.out.println("Divis�o por 0");
		}
	}

}
