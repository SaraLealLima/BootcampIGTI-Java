import java.util.ArrayList;

public class BuscaBinaria {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			lista.add(i);
		}
		
		System.out.println(lista);
		
		int elementoBuscado = 98;
		
		int inicio = 0;
		int fim = lista.size() - 1;
		
		Boolean elementoEncontrado = false;
		
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2; 
			
			if (lista.get(meio) < elementoBuscado) {
				inicio = meio + 1;
			} else if (lista.get(meio) > elementoBuscado) {
				fim = meio - 1;
			} else {
				System.out.println("Elemento encontrado no indice: " + meio);
				elementoEncontrado = true;
				break;
			}
		}
		
		if (!elementoEncontrado) {
			System.out.println("Elemento não encontrado");
		}
	}

}
