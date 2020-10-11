package praticaIntegrada;

import java.util.Scanner;

public class PraticaIntegrada {
	
	public static void main(String[] args) {
		
		Scanner entChar = new Scanner(System.in);
		Scanner entNum = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000];
		int i = 0;
		int somatorio = 0, contaPares = 0;
		double media = 0;
				
				
		do {
			System.out.printf("Menu de opções.\n"
					+ "D - para digitar novos números\n"
					+ "Z - para apresentar somatório dos números\n"
					+ "V - para visualizar todos os números digitados\n"
					+ "P - para quantidade de números digitados\n"
					+ "M - para a média simples dos números digitados\n"
					+ "Q - para a quantidade de pares\n"
					+ "S - para sair do programa");
			
			operacao = entChar.nextLine().charAt(0);
			
			switch (operacao ) {
			case 'D':
				System.out.println("Digite o número desejado: ");
				numeros[i] = entNum.nextInt();
				i++;
				break;
			case 'Z':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				System.out.printf("O somatorio dos números é: %d\n", somatorio);
				break;
			case 'V':
				for (int j = 0; j < i; j++) {
					System.out.printf("%d\n", numeros[j]);
				}	
				break;
			case 'P':
				System.out.printf("Foram digitados %d numeros\n", i);
				break;
			case 'M':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				media = somatorio / (i);
				System.out.printf("A media dos npumeros é: %.2f \n", media);
				break;
			case 'Q':
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 == 0)
						contaPares = contaPares + 1;
				}
				System.out.printf("Quantidade de números pares: %d\n", contaPares);
				break;
			case 'S':
				break;
			default:
				System.out.println("Opção inválida");
			
			}
			
		} while (operacao != 'S');
		
		System.out.printf("Fim da execução");
		
 }
}