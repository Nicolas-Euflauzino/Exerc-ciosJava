package manzano.pagina46.exercicio1;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int numero, i, multiplicacao;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número para descobrir a tabuada dele:");
numero = read.nextInt();

i = 1;

while (i < 11) {
	
	multiplicacao = i * numero;
	System.out.printf("%d x %d = %d%n", numero, i, multiplicacao);
	
	i++;
	
	read.close();
}
	}
}