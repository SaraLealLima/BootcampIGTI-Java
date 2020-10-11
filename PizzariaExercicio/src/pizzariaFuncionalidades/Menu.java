package pizzariaFuncionalidades;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);
	ListaDeContatos listaDeContatos = new ListaDeContatos();
	FilaDePedidos filaDePedidos = new FilaDePedidos();
	Entregas entregas = new Entregas();

	/*1- Consultar lista de contatos
	2- Inserir contato na lista de contatos
	3- Remover contato da lista de contatos
	4- Inserir pedido na fila
	5- Remover pedido da fila
	6- Organizar as entregas
	7- Desempilhar pedido
	8- Sair
	*/
	
	
	public void iniciar() {
		String comando = mostrarMenu();
		while (!comando.equals("8")) {
			processaComando(comando);
			comando = mostrarMenu();
		} 
		System.out.println("Você saiu, até a próxima");
		
	}
	
	public void processaComando(String comando) {
		switch (comando) {
		case "1":
			System.out.println("Mostra a lista de contatos");
			listaDeContatos.consultarListaDeContatos();
			break;
		case "2":
			System.out.println("Insere contato na lista de contato");
			listaDeContatos.inserirContato();
			listaDeContatos.consultarListaDeContatos();
			break;
		case "3":
			System.out.println("Remove contato da lista de contato");
			listaDeContatos.removerContato();
			listaDeContatos.consultarListaDeContatos();
			break;
		case "4":
			System.out.println("Insere pedido na fila");
			filaDePedidos.adicionarPedido();
			filaDePedidos.verFilaDePedidos();
			break;
		case "5":
			System.out.println("Remove pedido da fila");
			filaDePedidos.removerPedido();
			filaDePedidos.verFilaDePedidos();
			break;
		case "6":
			System.out.println("Organiza as entregas");
			entregas.organizarEntregas();
			break;
		case "7":
			System.out.println("Desempilhar pedido");
			entregas.entregarPizza();
			break;
		default:
			System.out.println("Opção inválida");
		}
	}
	

	public String mostrarMenu() {
		String menu = "";
		menu += "Digite o comando desejado:  \n";
		menu += "1 - Consultar lista de contatos \n";
		menu += "2 - Inserir contato na lista de contatos \n";
		menu += "3 - Remover contato da lista de contatos \n";
		menu += "4 - Inserir pedido na fila \n";
		menu += "5 - Remover pedido da fila \n";
		menu += "6 - Organizar as entregas \n";
		menu += "7 - Desempilhar pedido \n";
		menu += "8 - Sair \n";
		
		System.out.println(menu);
		return scanner.nextLine();
	}


}
