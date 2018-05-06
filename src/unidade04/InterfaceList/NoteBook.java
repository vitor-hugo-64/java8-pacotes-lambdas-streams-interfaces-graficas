package unidade04.InterfaceList;

import java.util.ArrayList;

public class NoteBook {
	
	static ArrayList<String> anotacoes;
	
	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar P�o");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro as 11:30");
		double tempoExecucao1 = System.currentTimeMillis(); // analisa o tempo que demorou pra executar o trecho de c�digo
		for(int i = 0; i < 1000; i++){
			anotacoes.add("Texto"+i);
		}
		double tempoExecucao2 = System.currentTimeMillis(); // analisa o tempo que demorou pra executar o trecho de c�digo
		System.out.println((tempoExecucao2 - tempoExecucao1) / 1000);
		System.out.println("Tempo que demorou pra execu��o");
		System.out.println(anotacoes);
		
	}

}
