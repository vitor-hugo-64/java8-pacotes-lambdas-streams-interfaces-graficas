package unidade01.ErrosExcecoes;

public class Throws {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException { // throws servem para declarar exce��es que podem acontecer no c�digo, mas sem ter a necessidade de usar try catch
		// throws s�o bem uteis para declarar excecoes sem perder a legibilidade do c�digo
		int i = 0;
		String frases[] = { "um", "dois", "tres"};
		while(i < 4){ // nesse caso ir� gerar um erro pois ir� procurar um indice que n�o existe no array
			System.out.println(frases[i]);
			i++;
		}
	}	

}
