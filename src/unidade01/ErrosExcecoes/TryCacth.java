package unidade01.ErrosExcecoes;

public class TryCacth {
	
	public static void main(String[] args) {
		int i = 0;
		String frases[] = { "um", "dois", "tres"};
		while(i < 4){ // nesse caso irá gerar um erro pois irá procurar um indice que não existe no array
			try{ // caso não gere erro ira fazer executar o try
				System.out.println(frases[i]);
			} catch(ArrayIndexOutOfBoundsException e) { // caso gere erro irá executar o cacth
				System.out.println("Erro de acesso ao vetor");
			}
			i++;
		}
	}

}
