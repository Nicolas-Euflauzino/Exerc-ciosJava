package exercicios;

import java.util.Scanner;

public class Antecesor {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Este programa exibe o número antecessor do numero digitado");
	System.out.println("Digite um valor:");
	int valor = sc.nextInt();
	
	int resultado = valor - 1;
	System.out.println("O antecessor de " + valor + " é: " + resultado);
}
}
