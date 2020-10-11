package pacotinho;

import java.util.Scanner;

public class Menu {
	
	private Scanner scanner = new Scanner(System.in);
	
	public String mostrarMenu() {
		String menu = "";
		menu += "Digite o comando desejado:  \n";
		menu += "1 - Cadastrar Funcionário \n";
		menu += "2 - Imprimir Contracheque \n";
		menu += "3 - Sair \n";
		
		System.out.println(menu);
		return scanner.nextLine();
	}
	
	public void 
}
