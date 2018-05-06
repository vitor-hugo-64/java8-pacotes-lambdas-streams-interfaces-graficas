package unidade04.InterfaceMap;

import java.util.HashMap;

public class HashMapApp {
	
	public static void main(String[] args) {
		HashMap< Integer, String> mapa = new HashMap<>();
		
		mapa.put(1, "Vitor Hugo");
		mapa.put(2, "Brenda");
		mapa.put(3, "André");
		mapa.put(3, "Bruno");
		mapa.put(4, "Lair Balon");
		System.out.println(mapa);
	}

}
