package exercicios;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Esse programa calcula a área do circulo");
		System.out.println("Digite o valor do raio do circulo:");
		float raio = sc.nextFloat();

		double resultado = (raio * raio) * Math.PI;
		System.out.println("A área do circulo de raio" + raio + " é de : " + resultado);
	}
}
