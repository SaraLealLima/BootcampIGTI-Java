package arrays;

import java.util.*;

public class arrays {

	public static void main(String[] args) {
		
		// tipo[] nome = new tipo[tamanho];
		
		int[] numeros = new int[5];
		int total = 0, i = 0;
		Scanner ent = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.printf("digite o %dº numero: ", i+1); // i+1 pra nao aparecer 0º posição
			numeros[i] = ent.nextInt();
			total = total + numeros[i];
			System.out.printf("Total parcial: %d\n", total);
		}
		
		
		
		/*
		System.out.println("digite o primeiro numero");
		numeros[0] = ent.nextInt();
		
		System.out.println("digite o segundo numero");
		numeros[1] = ent.nextInt();
		
		System.out.println("digite o terceiro numero");
		numeros[2] = ent.nextInt();
		
		System.out.println("digite o quarto numero");
		numeros[3] = ent.nextInt();
		
		System.out.println("digite o quinto numero");
		numeros[4] = ent.nextInt();
		
		numeros[0] = 10;
		numeros[1] = 15;
		numeros[2] = 13;
		numeros[3] = 1;
		numeros[4] = 7;
		*/
		
				
		System.out.printf("O valor total é: %d", total);
	}

}
