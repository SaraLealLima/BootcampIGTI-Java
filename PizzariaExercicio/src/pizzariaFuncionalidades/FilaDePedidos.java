package pizzariaFuncionalidades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDePedidos {

	/*
	 * - Fila de pedidos Permitir ao usu�rio armazenar uma fila com o nome dos
	 * clientes por ordem de chegada, de forma que o primeiro cliente a entrar na
	 * lista deve ser o primeiro a sair. Deve ser poss�vel inserir um nome na fila e
	 * remover o pr�ximo a ser atendido. Para inserir, basta pedir o nome do cliente
	 * que ir� entrar na fila, e, para remover, basta remover o pr�ximo a ser
	 * atendido e imprimir o nome dele no terminal.
	 */

	private Queue<String> filaDePedidos = new LinkedList<>();
	private Scanner scanner = new Scanner(System.in);

	// visualizar fila de pedidos
	public void verFilaDePedidos() {
		System.out.println(filaDePedidos);
	}

	// inserir Pedido na fila
	public void adicionarPedido() {
		System.out.println("Digite o nome do cliente para inclu�-lo na fila de pedidos: ");
		String pedido = scanner.nextLine();
		filaDePedidos.add(pedido);
	}

	// remover Pedido da fila
	public void removerPedido() {
		if (!filaDePedidos.isEmpty()) {
			System.out.println("Pedido pronto: " + filaDePedidos.remove());
		}
		if (filaDePedidos.isEmpty()) {
			System.out.println("A fila de pedidos est� vazia!");
		}
	}
}
