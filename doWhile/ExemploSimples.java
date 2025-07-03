package doWhile;

import java.util.Scanner;
public class ExemploSimples {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int contador = 1;
		
		do {
			System.out.println("Contador" + contador + "°");
			contador++;
		} while (contador < 6);
	}

}
