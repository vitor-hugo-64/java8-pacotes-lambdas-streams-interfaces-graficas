package unidade04.InterfaceList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		Collections.sort(lista);
		System.out.println(lista);
	}
	
}
