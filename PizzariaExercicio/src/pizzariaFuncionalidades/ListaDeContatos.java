package pizzariaFuncionalidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeContatos {

	/*
	 * Lista de contatos Permitir ao usu�rio armazenar uma lista com o nome dos seus
	 * clientes, sendo poss�vel inserir, remover e consultar nomes nessa lista. Para
	 * inserir, basta pedir o nome do contato. Para remover, basta pedir o �ndice do
	 * contato a ser removido. Para consultar, basta imprimir a lista no console.
	 * 
	 */

	ArrayList<String> listaDeContatos = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);

	// consultar lista de contatos
	public void consultarListaDeContatos() {
		for (int i = 0; i < listaDeContatos.size(); i++) {
			System.out.printf("%d %s \n", i, listaDeContatos.get(i));
		}
	}

	// inserir contato numa lista
	public void inserirContato() {
		System.out.println("Digite o nome do novo contato: ");
		String contato = scanner.nextLine();
		listaDeContatos.add(contato);
	}

	// remover contato da lista
	public void removerContato() {
		System.out.println("Digite o n�mero do contato que deseja remover: ");
		int numeroContato = scanner.nextInt();
		listaDeContatos.remove(numeroContato);
	}

}
