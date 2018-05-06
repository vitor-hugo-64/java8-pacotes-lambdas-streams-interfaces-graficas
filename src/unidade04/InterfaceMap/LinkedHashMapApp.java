package unidade04.InterfaceMap;

import java.util.LinkedHashMap;

public class LinkedHashMapApp {
	
	public static void main(String[] args) {
		LinkedHashMap< Integer, String> mapa = new LinkedHashMap<>();
		
		mapa.put(4, "Vitor Hugo");
		mapa.put(2, "Brenda");
		mapa.put(3, "André");
		mapa.put(3, "Bruno");
		mapa.put(1, "Lair Balon");
		System.out.println(mapa);
	}

}
