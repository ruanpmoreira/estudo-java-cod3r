package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String [] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ruan"); //Lança uma exceção se a fila estiver cheia
		fila.offer("Kathy"); //retorna false se a fila estiver cheia
		fila.add("Hikari");
		fila.offer("Maomao");
		fila.add("Carlos");
		fila.offer("Jorge");
		
		//Peek e Element obtem o próximo elemento da fila sem remover
		
		System.out.println(fila.peek()); // retorna null se a fila estiver vazia
		System.out.println(fila.element()); //Lança uma excelão se a fila estiver vazia
		
		//Poll e remove -> obtem o próximo elemento da fila e remove
		
		System.out.println(fila.poll()); //retorna false se a fila estiver  vazia
		System.out.println(fila.remove()); // Lança uma exeção se a fila estiver vazia
		System.out.println(fila.poll());
	}

}
