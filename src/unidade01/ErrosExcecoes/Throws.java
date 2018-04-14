package unidade01.ErrosExcecoes;

public class Throws {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException { // throws servem para declarar exceções que podem acontecer no código, mas sem ter a necessidade de usar try catch
		// throws são bem uteis para declarar excecoes sem perder a legibilidade do código
		int i = 0;
		String frases[] = { "um", "dois", "tres"};
		while(i < 4){ // nesse caso irá gerar um erro pois irá procurar um indice que não existe no array
			System.out.println(frases[i]);
			i++;
		}
	}	

}
