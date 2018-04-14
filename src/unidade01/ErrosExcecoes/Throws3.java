package unidade01.ErrosExcecoes;

import java.util.Scanner;

public class Throws3 {
	
	public static void dividir( int v1, int v2)  throws ArithmeticException { // aqui na função é usado para tratar o erro quando for chamada a função
		
		System.out.println( v1 / v2);

	}
	
	public static void main(String[] args) throws DivisaoPorZero {
		
		Scanner entrada  = new Scanner(System.in);
		int v1 = entrada.nextInt();
		int v2 = entrada.nextInt();
		try {
			dividir( v1, v2); // caso a divisão seja por 0 vai gerar erro
		} catch (ArithmeticException e) {
			throw new DivisaoPorZero(); // aqui é uma exceção criado pelo programador, isso é útil para personalizar um tratamento de erro
		}
	}

}
