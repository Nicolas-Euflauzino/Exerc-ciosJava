package metodos;

public class Exemplo07Metodo {
	static int calculoSoma(int x, int y) {
		return x + y;
	}

	static double calculoSoma(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int exemplo01 = calculoSoma(2, 3);
		System.out.println("Tipo int = " + exemplo01);
		double exemplo02 = calculoSoma(2.5, 3);
		System.out.println("Tipo double = " + exemplo02);
	}
}
