package trabalhoPratico1_3;

import java.util.Scanner;

public class TrabalhoPratico1_3 {

	public static void main(String[] args) {
		double salarioFixo = 1500.00, comissao = 0.05, totalVendas = 0, salarioTotal = 0;
		double auxilioCreche = 350.00;
		Scanner entradatexto = new Scanner(System.in);
		Scanner entradaDouble = new Scanner(System.in);
		String nome;
		char possuiFilhos;
		
		System.out.println("Digite o nome do vendedor");
		nome = entradatexto.nextLine();
		
		System.out.println("O vendedor possui filhos (S - Sim; N - Não)?");
		possuiFilhos = entradatexto.nextLine().charAt(0);
		
		System.out.println("Digite o total de vendas do vendedor");
		totalVendas = entradaDouble.nextDouble();
		
		if (totalVendas >= 20000.00) {
			if (possuiFilhos == 'S' || possuiFilhos == 's')
				salarioTotal = salarioFixo + (totalVendas * comissao + auxilioCreche);
			else
				salarioTotal = salarioFixo + (totalVendas * comissao);
		}
		else {
			if (possuiFilhos == 'S' || possuiFilhos == 's')
				salarioTotal = salarioFixo + auxilioCreche;
			else
				salarioTotal = salarioFixo;
		}
		System.out.printf("O salario do(a) vendedor(a) %s é de: %.2f.", nome, salarioTotal);
		}
	}


