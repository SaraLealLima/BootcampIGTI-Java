package listacompras;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
	private ArrayList<String> lista = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Digite o comando desejado:  \n");
		sb.append("1 - Ver a lista \n");
		sb.append("2 - Adicionar item na lista \n");
		sb.append("3 - Remover item da lista \n");
		sb.append("4 - Limpar lista \n");
		sb.append("5 - Sair");
		System.out.println(sb.toString());
		return scanner.nextLine();
	}
	
	private String mostrarMenu2() {
		String menu = "";
		menu += "Digite o comando desejado:  \n";
		menu += "1 - Ver a lista \n";
		menu += "2 - Adicionar item na lista \n";
		menu += "3 - Remover item da lista \n";
		menu += "4 - Limpar lista \n";
		menu += "5 - Sair";
		System.out.println(menu);
		return scanner.nextLine();
		
	}
	
	public void iniciar() {
		String opcao = mostrarMenu();
		while (!opcao.equals("5")){
			switch (opcao) {
			case "1":
				System.out.println(lista);
				opcao = mostrarMenu();
				break;
				
			case "2":
				System.out.println("Digite o item para adicionar na lista:");
				String item = scanner.nextLine();
				lista.add(item);
				System.out.println(lista);
				opcao = mostrarMenu();
				break;
				
			case "3":
				System.out.println("Digite o índice do item para remover da lista");
				int indice = Integer.valueOf(scanner.nextLine());
				lista.remove(indice);
				System.out.println(lista);
				opcao = mostrarMenu();
				break;
				
			case "4":
				lista.clear();
				System.out.println(lista);
				opcao = mostrarMenu();
				break;
		
			default:
				System.out.println("Opção inválida.");
				mostrarMenu();
				opcao = scanner.nextLine();
			}
		}
		scanner.close();
		System.out.println("Obrigada!");
	}
	
	
}
