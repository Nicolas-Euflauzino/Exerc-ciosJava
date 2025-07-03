package metodos;

public class Exemplo05Metodo {
	static float calculoSoma(int x, float y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(calculoSoma(5, 2));
		System.out.println(calculoSoma(5, 5));
		System.out.println(calculoSoma(10, -1));
		System.out.println(calculoSoma(1, 1.4f));
	}
}
