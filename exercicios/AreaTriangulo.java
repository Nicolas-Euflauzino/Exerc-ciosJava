package exercicios;

import java.util.Scanner;

public class AreaTriangulo {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Esse programa calcula a �rea do tri�ngulo:");
	System.out.println("Digite a base do tri�ngulo:");
	float base = sc.nextFloat();
	System.out.println("Digite a altura do tri�ngulo:");
	float altura = sc.nextFloat();
	
	double resultado = (base*altura)/2;
	System.out.println("A �rea ");
	
}
}
