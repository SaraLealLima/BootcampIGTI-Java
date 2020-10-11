package trabalhoPratico1_2;

import java.util.Scanner;

public class TrabalhoPratico1_2 {

	public static void main(String[] args) {
	
		int n1 = 0, n2 = 0, aux = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de n1: ");
		n1 = entrada.nextInt();
		n2 = 30;
		
		if (n1 == 20)
			aux = n1 * 5;
		else if (n1 > 20)
			aux = n1 * (10 - 4);
		else
			aux = n2;
		System.out.printf("O valor da variavel aux é %d.", aux);
		
		
	}

}
