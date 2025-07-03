package metodos;

public class Exemplo06Metodo {
	static int calculoSoma(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int z = calculoSoma(5, 3);
		System.out.println(z);
		z = calculoSoma(5, 5);
		System.out.println(z);
	}
}
