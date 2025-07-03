package exercicios;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Operação de multiplicação");
		System.out.println("Digite o primeiro número a ser multiplicado:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo número a ser multiplicado:");
		int numero2 = sc.nextInt();

		int resultado = numero1 * numero2;
		System.out.println("O resultado da multiplicação é:" + resultado);
	}

}
