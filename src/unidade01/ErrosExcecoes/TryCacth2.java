package unidade01.ErrosExcecoes;

import java.io.IOException;

public class TryCacth2 {
	
	public static void main(String[] args) {
		byte bytes[] = new byte[10];
		System.out.println("Digite Algo");
		try {
			System.in.read(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n Eco: " + new String( bytes));
	}

}
