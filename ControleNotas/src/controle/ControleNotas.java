package controle;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Materia;
import entidades.Nota;
import entidades.Professor;
import interfaces.ControlesBasicos;

public class ControleNotas implements ControlesBasicos {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Materia> materias = new ArrayList<>();
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Digite o comando desejado: \n");
		sb.append("1 - ver alunos \n");
		sb.append("2 - ver matérias \n");
		sb.append("3 - inserir aluno \n");
		sb.append("4 - inserir nota \n");
		sb.append("5 - excluir nota \n");
		sb.append("6 - consultar notas \n");
		sb.append("0 - sair \n");
		sb.append("");
		
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
	
	public void iniciar() {
		iniciarProfessorMateria();
		String opcao = mostrarMenu();
		while (!opcao.equals("0")) {
			switch (opcao) {
			case "1":
				System.out.println(alunos);
				opcao = mostrarMenu();
				break;
				
			case "2":
				System.out.println(materias);
				opcao = mostrarMenu();
				break;
				
			case "3":
				System.out.println("Digite o nome do aluno");
				String nome = scanner.nextLine();
				System.out.println("Digite a matricula do aluno: ");
				Integer matricula = Integer.parseInt(scanner.nextLine());
				
				Aluno aluno = new Aluno(nome, matricula);
				alunos.add(aluno);
				
				System.out.println(alunos);
				
				opcao = mostrarMenu();
				break;
				
			case "4":
				inserir();
				opcao = mostrarMenu();
				break;
				
			case "5":
				excluir();
				opcao = mostrarMenu();
				break;
				
			case "6":
				consultar();
				opcao = mostrarMenu();
				break;
			}
			
		}
	}
	
	public void inserir() {
		System.out.println("Digite o indice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o indice da materia: ");
		Integer indiceMateria = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite a nota: ");
		Double valorNota = Double.parseDouble(scanner.nextLine());
		
		Nota nota = new Nota();
		nota.setNota(valorNota);
		nota.setMateria(materias.get(indiceMateria));
		
		alunos.get(indiceAluno).getNotas().add(nota);
		System.out.println(alunos.get(indiceAluno).getNotas());
	}
	
	public void excluir() {
		System.out.println("Digite o indice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o indice da nota que deseja excluir:");
		int indiceNota = Integer.parseInt(scanner.nextLine());
		
		alunos.get(indiceAluno).getNotas().remove(indiceNota);
	}
	
	public void consultar() {
		System.out.println("Digite o indice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println(alunos.get(indiceAluno).getNotas());
	}
	
	private void iniciarProfessorMateria() {
		Professor professor1 = new Professor();
		professor1.setNome("Beatriz Melo");

		Materia materia1 = new Materia();
		materia1.setNome("Portugues");
		materia1.setProfessor(professor1);
		
		Professor professor2 = new Professor();
		professor1.setNome("Jorge Silva");

		Materia materia2 = new Materia();
		materia2.setNome("Matematica");
		materia2.setProfessor(professor2);

		Professor professor3 = new Professor();
		professor3.setNome("Maria Santos");

		Materia materia3 = new Materia();
		materia3.setNome("Geografia");
		materia3.setProfessor(professor3);

		Professor professor4 = new Professor();
		professor1.setNome("Everaldo Moisés");

		Materia materia4 = new Materia();
		materia4.setNome("Historia");
		materia4.setProfessor(professor4);
		
		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);
	}
}
