package exercicios;

import java.util.Scanner;
public class Sucessor {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Esse programa exibe o número sucessor");
	System.out.println("Digite um número para descobrir seu antecessor");
	int valor = sc.nextInt();
	
	int resultado = valor + 1;
	System.out.println("O sucessor de " + valor + " é: " + resultado);
}
}
