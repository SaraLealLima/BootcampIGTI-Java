package desafio2;

import java.io.*;
import java.util.Scanner;

public class Desafio2_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNros = 0;
		char continuar = 'S';
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %dº números: \n", contaNros+1);
			numeros[contaNros] = entrada.nextInt();
			contaNros++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números? (S - Sim. N - Não)");
			continuar = entrada.nextLine().charAt(0);
		}
		try {
			FileWriter arq = new FileWriter("C:\\Users\\Sara\\Documents\\desafio2.txt");
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for (int i = 0; i < contaNros; i++ ) {
				if (numeros[i] % 2 == 0 && numeros[i] > 10)
					gravarArquivo.printf("%d%n", numeros[i]);
			}
			arq.close();
			gravarArquivo.close();
			System.out.println("Programa Finalizado");
		} 
		catch (IOException e) {
			System.err.println("Erro gravando dados: " + e.getMessage());
		}
		
		
	}

}
