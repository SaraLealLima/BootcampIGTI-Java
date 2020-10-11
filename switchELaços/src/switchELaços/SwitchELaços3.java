package switchELaços;

import java.util.Scanner;

public class SwitchELaços3 {

	public static void main(String[] args) {
		
		//WHILE
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contaNumeros = 0;
		
		while (saida != 'S') {
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Gostaria de sair? S ou N");
			saida = entrada.nextLine().charAt(0);
			somatorio = somatorio + numero;
			contaNumeros++;
		}
		System.out.printf("O somatorio é %d\n", somatorio);
		System.out.printf("Foram digitados %d numeros", contaNumeros);
	}

}
