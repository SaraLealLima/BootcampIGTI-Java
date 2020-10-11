package contadores;

import java.math.*;
import java.util.*;

public class Contadores {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, total;
		char statusAluno;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaractere.nextLine();
		
		System.out.printf("Digite um caractere para a situa��o do aluno (O -> OK; P -> Pend�ncia: )");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		
		System.out.print("Digite a frequ�ncia do aluno: ");
		frequencia = entradaNotas.nextDouble();
		
		
		total = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = total >= 70 && frequencia >= 0.75;
		
		
		System.out.printf("O(a) Aluno(a) %s obteve nota final %.2f e uma frequ�ncia de %.2f%% A situa��o do(a) aluno(a) � %c\n"
				+ "Aluno aprovado? %b", nomeAluno, total, frequencia*100, statusAluno, aprovado);
		
		
		
	}

}
