package contadores;

import java.math.*;

public class Contadores2 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, total;
		String nomeAluno;
		char statusAluno;
		boolean aprovado;
		
		nomeAluno = "Ana Paula da Silva Couto";
		statusAluno = 'M';
		
		nota1 = 20;
		nota2 = 25;
		nota3 = 30;
		nota4 = 5;
		
		frequencia = 0.80;
		
		total = nota1 + nota2 + nota3 + nota4;
		
		aprovado = total >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c \n"
				+ "Aluno aprovado? %b", nomeAluno, total, frequencia*100, statusAluno, aprovado);
		//para que o % repesente ele mesmo, escreva-o duas vezes, assim ele nao será confundido com um coringa. %%
		

	}

}
