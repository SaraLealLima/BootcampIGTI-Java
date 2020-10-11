package pacotinho;

import java.util.ArrayList;

public class ListaDeFuncionarios {
	private ArrayList<Funcionario> listaDeFuncionario = new ArrayList<Funcionario>();
	

	// imprimir a lista
	public void imprimirLista() {
		System.out.println(this.listaDeFuncionario);
	}
	
	// cadastrar funcion�rio
	public void cadastrarFuncionario(String nome, Double salario) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setSalario(salario);
		this.listaDeFuncionario.add(funcionario);
	}
	
	// pegar funcionario pelo �ndice
	public Funcionario selecionarFuncionario(int indice) {
		return listaDeFuncionario.get(indice);
	}
}
