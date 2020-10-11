package matriz;

import java.util.ArrayList;
import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {
		ArrayList<ArrayList<Double>> matriz = new ArrayList<ArrayList<Double>>();  //cria uma array de array do tipo double
		
		//1ª forma de adicionar elementos em uma das linhas
		ArrayList<Double> linha1 = new ArrayList<>();
		linha1.add(8.0);
		linha1.add(10.0);
		linha1.add(7.0);
		linha1.add(6.5);

		matriz.add(linha1);
		
		//2ª forma de adicionar elementos em uma das linhas
		ArrayList<Double> linha2 = new ArrayList<Double>(Arrays.asList(7.0, 9.0, 5.0, 4.0));
		
		ArrayList<Double> linha3 = new ArrayList<Double>(Arrays.asList(4.0, 8.0, 6.0, 9.0));
		
		matriz.add(linha2);
		matriz.add(linha3);
		
		System.out.println(matriz);
		
		//como encontrar um valor específico entre as linhas e colunas
		System.out.println(matriz.get(1).get(2)); //2 é o numero da linha, 3 a ultima "coluna"
		
		//alterando elemento na matriz
		matriz.get(1).set(2, 10.5); //sendo get(1) o numero da lista, 2 a posição do elemento, e 10,5 o novo valor que esse elemento vai receber
		System.out.println(matriz.get(1).get(2));
		
		for (int i = 0 ; i < matriz.size(); i++) {
			ArrayList<Double> linha = matriz.get(i);
			System.out.println(linha);
			//for (int j = 0; j < linha.size(); j++) {
			//	System.out.println(linha.get(j));}
			}
	}

}
