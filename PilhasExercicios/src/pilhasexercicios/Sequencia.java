package pilhasexercicios;

import java.util.Scanner;
import java.util.Stack;

public class Sequencia {
	private Scanner scanner = new Scanner(System.in);
	
	private String mostrarMenu() {
		System.out.println("Digite a sequencia para verificação ou digite sair para encerrar");
		return scanner.nextLine();
	}
	public void iniciar() {
		//sequencias validas: () - [] - ([]) - [()]
		//sequencias invalidas: ( - (] - ([)) - ]]
		
		String sequencia = mostrarMenu();
		while (!sequencia.equals("sair")) {
			Stack<String> stack = new Stack<>();
			boolean isSequenciaOk = true;
			for (int i = 0; i < sequencia.length(); i++) {
				if (!isSequenciaOk ) {
					break;
				}
				char c = sequencia.charAt(i);
				
				switch (c ) {
				case ')':
					if (stack.isEmpty()) {
						System.out.println("Sequencia invalida!");
						sequencia = mostrarMenu();
						isSequenciaOk = false;
					} else {
						String elemento = stack.pop();
						if (!elemento.equals("(")) {
							System.out.println("Sequencia inválida");
							sequencia = mostrarMenu();
							isSequenciaOk = false;
						}
					}
					break;
				case ']':
					if (stack.isEmpty()) {
						System.out.println("Sequencia invalida!");
						sequencia = mostrarMenu();
						isSequenciaOk = false;
					} else {
						String elemento = stack.pop();
						if (!elemento.equals("[")) {
							System.out.println("Sequencia invalida!");
							sequencia = mostrarMenu();
							isSequenciaOk = false;
						}
					}
						
					break;
					default:
						stack.push(String.valueOf(c));
				}
			}
			if (stack.isEmpty()) {
				System.out.println("A sequencia está correta");
			} else {
				System.out.println("Sequencia inválida");
			}
			sequencia = mostrarMenu();
		}

	}	
}