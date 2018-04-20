package unidade03.genericos.HierarquiaDeClasses;

import java.util.ArrayList;
import java.awt.List;

public class GenericsApp {
	
	public static void main(String[] args) {
		
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
		Rectangle ret = lista.get(0); // não vai deixar retornar o valor da lista, mesmo sabendo que é do mesmo tipo que a variável. Isso tudo por questões de segurança
		
		List<?> ls = lista; // isso é possível, pois ponto de interrogação é superclasse de qualquer genérico 
		
	}

}
