package unidade03.genericos.HierarquiaDeClasses;

import java.util.ArrayList;
import java.awt.List;

public class GenericsApp {
	
	public static void main(String[] args) {
		
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
		Rectangle ret = lista.get(0); // n�o vai deixar retornar o valor da lista, mesmo sabendo que � do mesmo tipo que a vari�vel. Isso tudo por quest�es de seguran�a
		
		List<?> ls = lista; // isso � poss�vel, pois ponto de interroga��o � superclasse de qualquer gen�rico 
		
	}

}
