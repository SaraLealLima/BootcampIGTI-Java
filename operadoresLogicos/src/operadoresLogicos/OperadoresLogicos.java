package operadoresLogicos;

import java.math.*;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean ult3EmprestQuitadosPrazo, rendaComprovada, cliente10Estrelas, restricaoCredito;
		
		ult3EmprestQuitadosPrazo = true;
		rendaComprovada = true;
		cliente10Estrelas = true;
		restricaoCredito = false;
		
		boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && rendaComprovada || cliente10Estrelas) && !restricaoCredito;
		System.out.printf("Emprestimo concedido? \n%b", concederEmprestimo);
	
	
	}
	

}
