package pilhas;

import java.util.Stack;

public class Pilhas {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//adicionando elementos na pilha
		stack.add("Livro 1");
		stack.add("Livro 2");
		stack.add("Livro 3");
		stack.add("Livro 4");
		stack.add("Livro 5");
		
		System.out.println(stack);
		
		//removendo elemento da pilha
		System.out.println("Elemento removido: " + stack.pop());  //remove o ultimo da pilha
		
		System.out.println(stack);
		
		//verificar elemento no topo da pilha. 
		System.out.println("Elemento verificado: " + stack.peek());  //o peek apenas verifica, sem remover, o ultimo elemento
	
		System.out.println(stack);
		
		//buscar elemento na pilha
		System.out.println(stack.search("Livro 1"));  //.search busca um elemento na pilha. Se não houver resultado, retorna -1
	
		//vrifica se a pilha está vazia
		System.out.println(stack.isEmpty());  // true se estiver vazia, false se não estiver vazia
	
	}

}
