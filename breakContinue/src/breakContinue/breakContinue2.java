package breakContinue;

import java.util.Scanner;

public class breakContinue2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contador = 0;
		
		do {
			System.out.println("Digite numeros positivos ou zero para sair");
			numero = entrada.nextInt();
			
			if (numero == 18)
				continue;  //caso o n digitado seja 18, o continue vai pular o restando do if e voltar para o inicio do Do
			
			somatorio = somatorio + numero;
		
		} while (numero > 0);
		System.out.printf("O somatorio é %d", somatorio);
	}

}
