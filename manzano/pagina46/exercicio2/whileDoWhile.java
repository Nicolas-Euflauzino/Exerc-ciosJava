package manzano.pagina46.exercicio2;


public class whileDoWhile {
public static void main(String[] args) {
	int soma, contador;
	
	soma = 0;
	contador = 1;
	
	while (contador < 101) {
		soma = soma + contador;
		contador++;
	}
	
	System.out.printf("A soma dos 100 primeiros números inteiros é: %d", soma);
}
}
