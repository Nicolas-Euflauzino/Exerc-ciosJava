package metodos;

public class Exercicio08Metodo {
	public static void main(String[] args) {
		int resultado = sum(5, 10);
		System.out.println(resultado);
	}

	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 1);
		} else {
			return end;
		}
	}
}
