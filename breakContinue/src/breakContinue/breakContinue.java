package breakContinue;

import java.util.Scanner;

public class breakContinue {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o número desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.println("Digite o número desejado: ");
			numero = entrada.nextInt();
			
			if (numero == 18) 
				break;   //caso o n digitado for 18, o break vai sair do while, assim como se tivesse sido digitado 0
		}
		System.out.printf("O somatorio foi %d.", somatorio);
	}

}
