package unidade02.streamsEntradaSaida;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerFormatter {
	
	static Scanner a = new Scanner(System.in);
	static Formatter b = new Formatter(System.out);
	
	public static void main(String[] args) {
		// System.out.println("Informe um número: ");
		// float numero = a.nextFloat();
		// b.format("Numero = %.2f", numero);
		
		try {
			Scanner entrada = new Scanner(new FileReader("C:\\Users\\vitor hugo.LIBERATO_ADM\\eclipse-workspace\\SegundaDisciplina\\src\\unidade02\\streamsEntradaSaida\\numeros.txt"));
			String valor;
			double soma = 0;
			while(entrada.hasNext()) {
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);
			}
			entrada.close();
			JOptionPane.showMessageDialog( null, "A soma dos valores é: " + soma);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
