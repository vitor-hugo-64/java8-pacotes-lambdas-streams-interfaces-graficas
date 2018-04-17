package unidade02.streamsEntradaSaida;

import java.io.FileInputStream;

// streams s�o recursosque servem pra entrada e sa�da de dados

public class StreamApp {
	
	public static void byteStream() throws Exception {
		// nesse caso esse stream ir� ler uma entrada de um arquivo de texto
		FileInputStream entrada = new FileInputStream("C:\\Users\\vitor hugo.LIBERATO_ADM\\eclipse-workspace\\SegundaDisciplina\\src\\unidade02\\streamsEntradaSaida\\dados.txt");
		int cont = 0;
		while((entrada.read()) != -1) { // nessa etapa ele ir� ler o arquivo que est� na vari�vel entrada e enquanto tiver caracteres pra ler ele vai entrar no while
			cont++;
		}
		System.out.println("N�mero de caracteres �: " + cont); // no final ele ir� printar o n�mero de caracteres no console
		entrada.close();
	}
	
	public static void caracterStream(char e) throws Exception {
		// nesse caso esse stream ir� ler uma entrada de um arquivo de texto
		FileInputStream entrada = new FileInputStream("C:\\Users\\vitor hugo.LIBERATO_ADM\\eclipse-workspace\\SegundaDisciplina\\src\\unidade02\\streamsEntradaSaida\\dados.txt");
		int cont = 0;
		int letra;
		while((letra = entrada.read()) != -1) { // nessa etapa ele ir� ler o arquivo que est� na vari�vel entrada e enquanto tiver caracteres pra ler ele vai armazenar a letra na variavel 'letra' entrar no while
			if (e == letra) {
				cont ++;
			}
		}
		System.out.println("N�mero de vezes que a letra informada foi encontrada foi: " + cont); // no final ele ir� printar o n�mero de caracteres no console
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
