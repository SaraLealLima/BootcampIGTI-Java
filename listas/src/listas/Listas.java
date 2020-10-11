package listas;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>(); //para criar uma array de strings
		
		// ADICIONANDO ELEMENTOS
		carros.add("Uno");  //.add adiciona elementos na array
		carros.add("Gol");
		carros.add("Palio");
		
		carros.add(1, "Sandero"); //adiciona num �ndice espec�fico
		carros.add("Gol");
		
		// VERIFICA A EXISTENCIA DE ELEMENTO NO ARRAY
		if (carros.contains("Corolla")) {  //.contains mostra se existe algum elemento no array
			System.out.println("Corolla existe no array");  //.contains retorna true ou false
		} else {
			System.out.println("Corolla n�o existe no array");
		}
		
		// ALTERA��O OU ATUALIZA��O DE ELEMENTO
		carros.set(0, "Novo Uno");  // .set altera o elemento em um �ndice
		
		//RETORNA O �NDICE DA PRIMEIRA E ULTIMA OCORRENCIA DO ELEMENTO
		int primeiraPosicaoGol = carros.indexOf("Gol");  //.indexOf mostra em qual �ndice o elemento est�. Se tiver elemento repetido, ele vai mostrar o �ndice apenas do primeiro que aparece na array
		System.out.println(primeiraPosicaoGol);
		
		int ultimaPosicaoGol = carros.lastIndexOf("Gol");
		System.out.println(ultimaPosicaoGol);
		
		int ultimaPosicaoCorolla = carros.lastIndexOf("Gol");
		System.out.println(ultimaPosicaoCorolla); // vai retornar -1 quando n�o exisitir o elemento
		
		
		//SIZE RETORNA O TAMANHO DO ARRAY
		for (int i = 0; i < carros.size(); i++) {  //um for para printar todos os elementos da array
			System.out.println(carros.get(i)); // get retorna o elemento do �ndice informado (i)
		}
		
		carros.remove(2);  //.remove remove um �ndice
		
		System.out.println("remo��o");
		for (int i = 0; i < carros.size(); i++) {  //um for para printar todos os elementos da array, agora que usamos .remove
			System.out.println(carros.get(i));
		}
		
		// carros.clear(); // .clear remove todos os elementos do array
		// System.out.println(carros);
	}

}
