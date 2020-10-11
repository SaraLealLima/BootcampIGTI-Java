package filas;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//adicionando elementos na fila
		fila.add("Pessoa 1");
		fila.add("Pessoa 2");
		fila.add("Pessoa 3");
		fila.add("Pessoa 4");
		fila.add("Pessoa 5");
		
		System.out.println(fila);
		
		//removendo elementos da fila
		System.out.println("Elemento removido: " + fila.remove());  //vai sempre remover o primeiro a chegar
		//assim como numa fila, o primeiro dela é o primeiro a ser atendido, o mesmo ocorre para filas em java
		
		//verificar primeiro elemento da fila
		System.out.println(fila.peek());
		
		//verifica se existe elemento especifico na fila
		System.out.println(fila.contains("Pessoa 3"));
		
		//verificar tamanho da fila
		System.out.println("Tamanho: " + fila.size());
		
		//verifica se a fila está vazia. Se sim, retorna true
		System.out.println(fila.isEmpty());
		
		//limpa a fila
		//fila.clear();
	}

}
