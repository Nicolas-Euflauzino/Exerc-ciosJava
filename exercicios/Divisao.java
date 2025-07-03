package exercicios;

import java.util.Scanner;
public class Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Operação divisória");
		System.out.println("Digite o valor a ser dividido:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o divisor agora:");
		int numero2 = sc.nextInt();
		
		int resultado = numero1 / numero2;
		System.out.println("O resultado da divisão é:" + resultado);
	}
}
