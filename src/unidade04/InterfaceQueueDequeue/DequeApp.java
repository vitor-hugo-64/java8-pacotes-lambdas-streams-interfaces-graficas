package unidade04.InterfaceQueueDequeue;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeApp {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> lista = new ArrayDeque<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.removeFirst();
		lista.removeLast();
		lista.addFirst("Rosa");
		lista.addLast("Azul");
		System.out.println(lista.peekFirst());
		System.out.println(lista.peekLast());
		System.out.println(lista);		
		
	}

}
