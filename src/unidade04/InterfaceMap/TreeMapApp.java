package unidade04.InterfaceMap;

import java.util.TreeMap;

public class TreeMapApp {
	
	public static void main(String[] args) {
		TreeMap< Integer, String> mapa = new TreeMap<>();
		
		mapa.put(4, "Vitor Hugo");
		mapa.put(2, "Brenda");
		mapa.put(3, "André");
		mapa.put(3, "Bruno");
		mapa.put(1, "Lair Balon");
		System.out.println(mapa); 
	}

}