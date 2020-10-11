package desafio2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		String[] nomeCliente = new String[50];
		double[] valorCompra = new double[50];
		double mediaDasCompras = 0, valorMaiorCompra = 0, somaVendas = 0;
		String nomeClienteMaiorCompra = "";
		int i = 0, qtdCompras = 0;
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNumeros = new Scanner(System.in);
		System.out.println("Quantas compras serão informadas?");
		qtdCompras = entNumeros.nextInt();	
		for (i = 0; i < qtdCompras; i++) {
			System.out.printf("Digite o nome do cliente referente a %d compra:\n", i+1);
			nomeCliente[i] = entCaractere.nextLine();
			
			System.out.printf("Digite o valor comprado pelo cliente %s: \n", nomeCliente[i]);
			valorCompra[i] = entNumeros.nextDouble();
			
			if (valorCompra[i] > valorMaiorCompra) {
				valorMaiorCompra = valorCompra[i];
				nomeClienteMaiorCompra = nomeCliente[i];
			}
			somaVendas += valorCompra[i];
		}
		for (i = 0; i < qtdCompras; i++)
			System.out.printf("***\nID Compra: %d \nNome Cliente: %s \nValor da Compra: %.2f\n***\n", i+1, nomeCliente[i], valorCompra[i]);
		
		System.out.printf("A maior compra foi do cliente %s, no valor de %.2f\n", nomeClienteMaiorCompra,
				valorMaiorCompra);
	}

}
