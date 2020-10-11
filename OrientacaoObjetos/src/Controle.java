import java.util.ArrayList;

import entidades.Aluno;
import entidades.Caminhao;
import entidades.Carro;
import entidades.Diretor;
import entidades.MeioLocomocao;
import entidades.Pessoa;
import entidades.Professor;

public class Controle {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Diretor> diretor = new ArrayList<>();
	private ArrayList<Professor> profesor = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	
	//primeiro builder default, tem que escrever tudo na mão
	public void iniciar() {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João Silva");
		aluno1.setCpf("1010101010");
		aluno1.setTelefone("(11)91821982");
		aluno1.setEndereco("Rua X");
		aluno1.setNumero("10");
		aluno1.setMatricula(1232323);
		
	//o segundo já com "parametros" determinados
		Aluno aluno2 = new Aluno("Maria Souza", "92839283923", "(11)73847384", "Rua Y", 66789943);
		
	//add na array
		alunos.add(aluno1);
		alunos.add(aluno2);
		
		Professor professor1 = new Professor();
		professor1.setNome("Henrique Souza");
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Genivaldo Silva");
		
		pessoas.add(aluno1);
		pessoas.add(professor1);
		pessoas.add(diretor1);
		
		System.out.println(aluno1.enderecoCompleto());
		System.out.println(aluno1.informaTipo());
		System.out.println(professor1.informaTipo());
		System.out.println(diretor1.informaTipo());
		
		aluno1.atualizarDadosPessoaisNome("Nome de Teste");
		aluno1.atualizarDadosPessoaisCpf("Nome de Teste2", "1235432");
		
		System.out.println(aluno1.getNome());
		
		//AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio()
		
		
		
		ArrayList<MeioLocomocao> lista = new ArrayList<MeioLocomocao>();
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		
		carro.acelerar();
		
		lista.add(carro);
		lista.add(caminhao);
		for (MeioLocomocao m : lista) {
			m.acelerar();
		}
		
	}
}
