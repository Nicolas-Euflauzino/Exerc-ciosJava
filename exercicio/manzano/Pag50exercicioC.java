package exercicio.manzano;

import java.math.BigInteger;
public class Pag50exercicioC {
	public static void main(String[] args) {
	
	//BigInteger bi = new BigInteger("9999999999999999999999999999");
	BigInteger somatorio = BigInteger.ZERO;	
	BigInteger proximoQuadro = BigInteger.ONE;
	BigInteger primeiroQuadro = BigInteger.ONE;
	BigInteger segundoQuadro = BigInteger.ONE;
	
	//int segundoQuadro;
	 proximoQuadro = primeiroQuadro;
	int contador = 1;
	
	do {
		System.out.printf("%n Quadrante %d = %d %n", contador, proximoQuadro);
	segundoQuadro = primeiroQuadro.multiply(BigInteger.valueOf(2));
	proximoQuadro = proximoQuadro.add(segundoQuadro);
	primeiroQuadro = segundoQuadro;
	somatorio = somatorio.add(proximoQuadro);
	contador++;
	} while (contador < 10);
	}
}
