package exercicios;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Esse programa calcula a área do quadrado");
		System.out.println("Digite o lado do quadrado:");
		float lado = sc.nextFloat();

		float resultado = lado * lado;
		System.out.println("A área do quadrado de lado " + lado + " é de: " + resultado + "cm²");
	}
}
