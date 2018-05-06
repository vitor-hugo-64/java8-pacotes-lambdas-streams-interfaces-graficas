package unidade04.InterfaceList;

import java.util.ArrayList;

public class NoteBook {
	
	static ArrayList<String> anotacoes;
	
	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar Pão");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro as 11:30");
		double tempoExecucao1 = System.currentTimeMillis(); // analisa o tempo que demorou pra executar o trecho de código
		for(int i = 0; i < 1000; i++){
			anotacoes.add("Texto"+i);
		}
		double tempoExecucao2 = System.currentTimeMillis(); // analisa o tempo que demorou pra executar o trecho de código
		System.out.println((tempoExecucao2 - tempoExecucao1) / 1000);
		System.out.println("Tempo que demorou pra execução");
		System.out.println(anotacoes);
		
	}

}
