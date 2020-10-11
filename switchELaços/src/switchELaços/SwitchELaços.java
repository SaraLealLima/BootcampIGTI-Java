package switchELaços;

import java.util.Scanner;

public class SwitchELaços {

	public static void main(String[] args) {
		
		//FOR
		int i = 0, j = 0;
		
		for (i = 0; i <= 10; i++) {
			System.out.printf("Tabuada do %d\n", i);
			for (j = 0; j <= 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
		
	}
}
