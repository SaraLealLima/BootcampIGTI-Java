package filaAtendimento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaAtendimento {
	private Scanner scanner = new Scanner(System.in);
	private Queue<String> fila = new LinkedList<>();
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Digite o comando desejado: \n");
		sb.append("1 - Ver a fila \n");
		sb.append("2 - Adicionar pessoa na fila \n");
		sb.append("3 - Chamar proxima pessoa da fila \n");
		sb.append("4 - Limpar a fila \n");
		sb.append("5 - Sair \n");
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
	
	public void iniciar() {
		String opcao = mostrarMenu();
		while (!opcao.equals("5")) {
			switch (opcao) {
			case "1":
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "2":
				System.out.println("Digite o nome da pessoa para adicionar na fila");
				String item = scanner.nextLine();
				fila.add(item);
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "3":
				System.out.println("Pessoa chamada: " + fila.remove());
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "4":
				fila.clear();
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			default:
				System.out.println("Opção Inválida");
				opcao = mostrarMenu();
			}
		}
		
	}

}
