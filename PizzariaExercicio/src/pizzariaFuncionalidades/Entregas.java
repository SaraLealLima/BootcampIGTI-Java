package pizzariaFuncionalidades;

import java.util.Collections;
import java.util.Stack;

public class Entregas {

	/*
	 * - Organizar as entregas do motoboy O programa deve receber uma lista de
	 * n�meros, cada um representando a dist�ncia da casa do cliente para a pizzaria
	 * em km. O motoboy ir� entregar os pedidos de acordo com a dist�ncia, os mais
	 * pr�ximos ser�o entregues primeiro. Por isso, o programa deve retornar uma
	 * pilha, com os pedidos que ir�o sair primeiro, no topo. O programa deve ainda
	 * permitir que esses itens sejam desempilhados, at� que a pilha esteja vazia.
	 */

	Stack<Integer> pilhaPizza = new Stack<>();
	

	public void organizarEntregas() {
		pilhaPizza.add(6);
		pilhaPizza.add(9);
		pilhaPizza.add(2);
		pilhaPizza.add(4);
		//pilhaPizza.add(3);
		//pilhaPizza.add(7);
		//pilhaPizza.add(1);
		//pilhaPizza.add(8);
		//pilhaPizza.add(4);
		//pilhaPizza.add(6);
		System.out.println(pilhaPizza);
		
		Collections.sort(pilhaPizza);
		Collections.reverse(pilhaPizza);
		System.out.println(pilhaPizza);
	}
	
	/*
	public void organizarEntregas() {
		Collections.sort(pilhaPizza);
		Collections.reverse(pilhaPizza);
		System.out.println(pilhaPizza);
	}
	*/
	
	public void entregarPizza() {
		if (!pilhaPizza.isEmpty()) {
		System.out.println("Pizza entregue a " + pilhaPizza.pop() + "km da pizzaria");
		}
		System.out.println("Ainda falta entregar as pizzas dos kms: " + pilhaPizza);
		if (pilhaPizza.isEmpty()) {
			System.out.println("Foram entregues todas as pizzas! Lindo demais!");
		}
	}
}