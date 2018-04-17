package unidade02.streamsEntradaSaida;

import java.io.FileInputStream;

// streams são recursosque servem pra entrada e saída de dados

public class StreamApp {
	
	public static void byteStream() throws Exception {
		// nesse caso esse stream irá ler uma entrada de um arquivo de texto
		FileInputStream entrada = new FileInputStream("C:\\Users\\vitor hugo.LIBERATO_ADM\\eclipse-workspace\\SegundaDisciplina\\src\\unidade02\\streamsEntradaSaida\\dados.txt");
		int cont = 0;
		while((entrada.read()) != -1) { // nessa etapa ele irá ler o arquivo que está na variável entrada e enquanto tiver caracteres pra ler ele vai entrar no while
			cont++;
		}
		System.out.println("Número de caracteres é: " + cont); // no final ele irá printar o número de caracteres no console
		entrada.close();
	}
	
	public static void caracterStream(char e) throws Exception {
		// nesse caso esse stream irá ler uma entrada de um arquivo de texto
		FileInputStream entrada = new FileInputStream("C:\\Users\\vitor hugo.LIBERATO_ADM\\eclipse-workspace\\SegundaDisciplina\\src\\unidade02\\streamsEntradaSaida\\dados.txt");
		int cont = 0;
		int letra;
		while((letra = entrada.read()) != -1) { // nessa etapa ele irá ler o arquivo que está na variável entrada e enquanto tiver caracteres pra ler ele vai armazenar a letra na variavel 'letra' entrar no while
			if (e == letra) {
				cont ++;
			}
		}
		System.out.println("Número de vezes que a letra informada foi encontrada foi: " + cont); // no final ele irá printar o número de caracteres no console
		entrada.close();
	}
	
	public static void main(String[] args) {
		try{
			byteStream();
			System.out.println("Informe a letra que deseja fazer o rastreamento: ");
			char letra = (char) System.in.read();
			caracterStream(letra);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
