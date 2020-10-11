package projetoAula2_1;

public class projetoAula2_1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		
        // Manipulando dados primitivos
		
		int nota = 10;
		char tipoAluno = 'A';
		double horasCursadas = 5.30;
		boolean aprovado = true;
		
		System.out.println("Nota do aluno: " + nota);
		System.out.println("Aluno tipo: " + tipoAluno);
		System.out.println("O aluno cursou " + horasCursadas + " horas");
		System.out.println("Aluno aprovado? " + aprovado);
		
		
		//Mudando os valores das variaveis. N�o precisa declarar de novo o tipo primitivo delas.
		nota = 4;
		tipoAluno = 'D';
		horasCursadas = 2;
		aprovado = false;
		
		System.out.println("Nota do aluno: " + nota);
		System.out.println("Aluno tipo: " + tipoAluno);
		System.out.println("O aluno cursou " + horasCursadas + " horas");
		System.out.println("Aluno aprovado? " + aprovado);
		
		
		//Trabalhando com String
		String nome = "Juliano Ferreira de Guimar�es";
		String endereco = "Rua Bonifacil de Almeida, 103";
		String complemento = "Apartamento 67, Bloco 2", cidade = "Campinas", estado = "SP";
		/*quando uma string � declarada numa linha, todas as outras variaveis dessa linha podem seguir s� com seus
		nomes, pois vai estar subetendido que tamb�m ser�o Strings (ex: cidade e estado)
		Strings s� podem ser usadas com aspas duplas "", aspas simples '' s�o apenas para char
		*/
		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(complemento);
		System.out.println(cidade);
		System.out.println(estado);
		
		//variaveis podem ser declaradas assim, na mesma linha:
		String nome1, nome2;
		nome1 = "Paulo Alencar";
		nome2 = "C�lia Sampaio Abreu";
		
		System.out.println(nome1);
		System.out.println(nome2);
		
		int tamanhoDoNome1 = nome1.length(), tamanhoDoNome2 = nome2.length();
		System.out.println("A variavel tem: " + tamanhoDoNome1 + " caracteres");
		System.out.println("A variavel tem: " + tamanhoDoNome2 + " caracteres");
		
		int totalCaracteres = tamanhoDoNome1 + tamanhoDoNome2;
		System.out.println("As duas vari�veis tem " + totalCaracteres + " caracteres");
		
		//Concatena��o
		String nomesConcatenados = nome1.concat(nome2);
		System.out.println(nomesConcatenados);
		
		//Substituir caractere
		String nome3 = "Am�lia Alberta Amancia da Silva";
		String nomeSemA = nome3.replace('a', 'o'); //troca o 'a' do nome3 por 'o'
		System.out.println(nomeSemA);
		
		/*printf e seus c�digos
		 
		%s   -     String
		%d   -     int
		%.2f -     float ou double, sendo o n�mero q vc definir o numero de casas decimais
		%b   -     boolean
		%c   -     char
		
		*/
		String meuNome = "Sara";
		int minhaIdade = 21;
		double minhaAltura = 1.58;
		System.out.printf("Meu nome � %s, tenho %d anos e minha altura � %.2f", meuNome, minhaIdade, minhaAltura);
		//no Java � preciso apontar logo em seguida qual variavel vai substituir os codigos de %
		// Usa-se \n para quebrar a linha.
		System.out.printf("\nO nome � %s. \nA idade � %d. \nA altura � %.2f", meuNome, minhaIdade, minhaAltura);
	}

}
