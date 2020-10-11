package condicionais;

import java.util.*;

public class Condicionais {
	
	

	public static void main(String[] args) {
		
		double n1, n2, n3, total, media, frequencia;
		String situacao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();

		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();

		total = n1 + n2 + n3;
		media = total / 3;
		
		System.out.println("Digite a frequência do aluno: ");
		frequencia = entrada.nextDouble();
		
		if (total >= 70 && frequencia >= 0.75) {
			if (total >= 90)
				situacao = "Aprovado com conceito A";
			else if (total >= 80 && total < 90)
				situacao = "Aprovado com conceito B";
			else
				situacao = "Aprovado com conceito C";
			}
		else if (total >= 40 && total < 70 && frequencia >= 0.75)
			situacao = "Recuperação";
		else
			situacao = "Reprovado";
		
		System.out.printf("O aluno obteve nota total %.2f e média por avaliação de %.2f. A frequência foi de %.2f%%.\n"
				+ "Com isso o aluno está %s", total, media, frequencia*100, situacao);
	}

}
