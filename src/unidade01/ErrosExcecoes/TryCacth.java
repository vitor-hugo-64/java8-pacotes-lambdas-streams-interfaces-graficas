package unidade01.ErrosExcecoes;

public class TryCacth {
	
	public static void main(String[] args) {
		int i = 0;
		String frases[] = { "um", "dois", "tres"};
		while(i < 4){ // nesse caso ir� gerar um erro pois ir� procurar um indice que n�o existe no array
			try{ // caso n�o gere erro ira fazer executar o try
				System.out.println(frases[i]);
			} catch(ArrayIndexOutOfBoundsException e) { // caso gere erro ir� executar o cacth
				System.out.println("Erro de acesso ao vetor");
			}
			i++;
		}
	}

}
