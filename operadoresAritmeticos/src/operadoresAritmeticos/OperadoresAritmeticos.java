package operadoresAritmeticos;

import java.math.*;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// X^2 + 12x -13 = 0
		// 2x^2 - 16x -18 = 0
		
		double a, b, c;
		a = 1;
		b = 12;
		c = -13;
		
		double delta = 0;
		
		delta = (b * b) - (4 * a * c);
		System.out.printf("O valor de delta � %.2f\n", delta);
		
		double x_linha = 0;
		x_linha = (-b + Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x' � %.0f\n", x_linha);
				
		double x_duasLinhas = 0;
		x_duasLinhas = (-b - Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x' � %.0f", x_duasLinhas);
	}

}